package com.example;

import java.util.List;

public interface BoardService {
    public int insertBoard(MVCBoardVO vo);
    public int deleteBoard(int seq);
    public int updateBoard(MVCBoardVO vo);
    public MVCBoardVO getBoard(int seq);
    public List<MVCBoardVO> getBoardList();

}
