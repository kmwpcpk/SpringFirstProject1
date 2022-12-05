package board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    MVCBoardDAO mvcBoardDAO;

    @Override
    public int insertBoard(MVCBoardVO vo) {
        return mvcBoardDAO.insertBoard(vo);
    }

    @Override
    public int deleteBoard(int seq) {
        return mvcBoardDAO.deleteBoard(seq);
    }

    @Override
    public int updateBoard(MVCBoardVO vo) {
        return mvcBoardDAO.updateBoard(vo);
    }

    @Override
    public MVCBoardVO getBoard(int seq) {
        return mvcBoardDAO.getBoard(seq);
    }

    @Override
    public List<MVCBoardVO> getBoardList() {
        return mvcBoardDAO.getBoardList();
    }
}
