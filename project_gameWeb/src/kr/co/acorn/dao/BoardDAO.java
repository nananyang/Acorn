package kr.co.acorn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import kr.co.acorn.dto.BoardDTO;

@Repository
public class BoardDAO {
	
	@Autowired
    @Qualifier("SqlSessionTemplate")
	SqlSession ss;
	
	public List<BoardDTO> selectAll(int mno){
		return ss.selectList("kr.co.acorn.board.selectAll",mno);
	}
	
	public BoardDTO selectOne(int cno) {
		return ss.selectOne("kr.co.acorn.board.selectOne", cno);
	}
	
	public void insertOne(BoardDTO dto) {
		ss.insert("kr.co.acorn.board.insertOne", dto);
	}
	
	public void modifyOne(BoardDTO dto) {
		ss.update("kr.co.acorn.board.updateOne",dto);
	}
	
	public void hits(int cno) {
		ss.update("kr.co.acorn.board.updateHits",cno);
	}
	
	public void good(int cno) {
		ss.update("kr.co.acorn.board.updateGood",cno);
	}
	
	public void bad(int cno) {
		ss.update("kr.co.acorn.board.updateBad",cno);
	}
	
	public void dropOne(int cno) {
		ss.delete("kr.co.acorn.board.deleteOne",cno);
	}
	
	
}
