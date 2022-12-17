package com.example;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MVCBoardDAO {

    @Autowired
    SqlSession sqlSession;

    public int insertBoard(MVCBoardVO vo){
        int result = sqlSession.insert("MVCBoard.insertBoard", vo);
        return result;
    }

    public int deleteBoard(int seq){
        int result = sqlSession.delete("MVCBoard.deleteBoard", seq);
        return result;
    }

    public int updateBoard(MVCBoardVO vo){
        int result = sqlSession.update("MVCBoard.updateBoard", vo);
        return result;
    }

    class BoardRowMapper implements RowMapper<MVCBoardVO>{

        @Override
        public MVCBoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            MVCBoardVO vo = new MVCBoardVO();
            vo.setSeq(rs.getInt("seq"));
            vo.setTitle(rs.getString("title"));
            vo.setContent(rs.getString("content"));
            vo.setWriter(rs.getString("writer"));
            vo.setCategory(rs.getString("category"));
            vo.setTitle(rs.getString("rc"));
            vo.setTitle(rs.getString("response"));
            vo.setTitle(rs.getString("team"));
            vo.setRegdate(rs.getDate("regdate"));

            return vo;
        }

    }

    public MVCBoardVO getBoard(int seq){
        MVCBoardVO one = sqlSession.selectOne("MVCBoard.getBoard", seq);
        return one;
    }

    public List<MVCBoardVO> getBoardList(){
        List<MVCBoardVO> list = sqlSession.selectList("MVCBoard.getBoardList");
        return list;
    }
}

