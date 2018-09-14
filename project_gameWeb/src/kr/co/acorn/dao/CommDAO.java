package kr.co.acorn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import kr.co.acorn.dto.CommDTO;

@Repository
public class CommDAO {

   @Autowired
   @Qualifier("SqlSessionTemplate")
   SqlSession ss;
   
   public void setSs(SqlSession ss) {
      this.ss = ss;
   }
   
   public List<CommDTO> selectAll(){
      return ss.selectList("kr.co.acorn.comm.seletAll");
   }
   
   public List<CommDTO> selectOne(CommDTO dto) {
	   return ss.selectList("kr.co.acorn.comm.selectOne",dto);
   }
   
   public void insertOne(CommDTO dto) {
	    ss.insert("kr.co.acorn.comm.insertOne",dto);
   }
   
   public void insertChild(CommDTO dto) {
	   ss.insert("kr.co.acorn.comm.insertChild",dto);
   }
   
   public void modifyOne(CommDTO dto) {
	   ss.update("kr.co.acorn.comm.updateOne",dto);
   }
   
   public void modifyGood(int cmno) {
	   ss.update("kr.co.acorn.comm.updateGood",cmno);
   }
   
   public void modifyBad(int cmno) {
	   ss.update("kr.co.acorn.comm.updateBad",cmno);
   }
   
   public void deleteOne(int cmno) {
	   ss.delete("kr.co.acorn.comm.deleteOne",cmno);
   }
   
}