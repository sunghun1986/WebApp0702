package com.and.model.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.and.mybatis.MybatisConfigManager;

public class NoticeDAO {
	MybatisConfigManager manager = MybatisConfigManager.getInstance();
	
	//CRUD
	public List selectAll() {
		
		List list = null;
		SqlSession sqlSession = manager.getSqlSession();
		list = sqlSession.selectList("Notice.selectAll");
		System.out.println("DAO에서의 리스트"+list.size());
		manager.closeSession(sqlSession);
		return list;
		
	}
	
	public Notice select(int notice_id) {
		Notice notice = null;
		SqlSession sqlSession = manager.getSqlSession();
		notice = sqlSession.selectOne("Notice.select", notice_id);
		manager.closeSession(sqlSession);
		return notice;
	}
	
	public int insert(Notice notice) {
		int result = 0;
		SqlSession sqlSession = manager.getSqlSession();
		result = sqlSession.insert("Notice.insert",notice);
		sqlSession.commit();
		manager.closeSession(sqlSession);
		return result;
	}
	
	public int update(Notice notice) {
		int result = 0;
		SqlSession sqlSession = manager.getSqlSession();
		result = sqlSession.update("Notice.update",notice);
		sqlSession.commit();
		manager.closeSession(sqlSession);
		return result;
	}
	
	public int delete(int notice_id) {
		int result = 0;
		SqlSession sqlSession = manager.getSqlSession();
		result = sqlSession.delete("Notice.delete",notice_id);
		sqlSession.commit();
		manager.closeSession(sqlSession);
		return result;
	}
	
}















