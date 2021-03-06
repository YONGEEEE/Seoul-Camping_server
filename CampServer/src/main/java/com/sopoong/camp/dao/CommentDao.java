package com.sopoong.camp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopoong.camp.mapper.CampMapper;
import com.sopoong.camp.vo.Comment;

@Repository
public class CommentDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	public List<Comment> listComment(String camp) {
		List<Comment> result = sqlSession.getMapper(CampMapper.class).listComment(camp);
		return result;
	}


	public int addComment(Comment cm) {
		return sqlSession.getMapper(CampMapper.class).addComment(cm);
	}
	
	public int delComment(Comment cm) {
		return sqlSession.getMapper(CampMapper.class).delComment(cm);
	}
}
