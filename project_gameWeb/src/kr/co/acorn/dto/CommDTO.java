package kr.co.acorn.dto;

public class CommDTO {
		private int cno;
		private String writer;
		private String contents;
		private int good;
		private int bad;
		private int parent;
		private int cmno;
		private String regdate;
		public CommDTO() {}
		
		public CommDTO(int cno, String writer, String contents, int good, int bad, int parent, int cmno,
				String regdate) {
			super();
			this.cno = cno;
			this.writer = writer;
			this.contents = contents;
			this.good = good;
			this.bad = bad;
			this.parent = parent;
			this.cmno = cmno;
			this.regdate = regdate;
		}
		public int getCno() {
			return cno;
		}
		public void setCno(int cno) {
			this.cno = cno;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getContents() {
			return contents;
		}
		public void setContents(String contents) {
			this.contents = contents;
		}
		public int getGood() {
			return good;
		}
		public void setGood(int good) {
			this.good = good;
		}
		public int getBad() {
			return bad;
		}
		public void setBad(int bad) {
			this.bad = bad;
		}
		public int getParent() {
			return parent;
		}
		public void setParent(int parent) {
			this.parent = parent;
		}
		public int getCmno() {
			return cmno;
		}
		public void setCmno(int cmno) {
			this.cmno = cmno;
		}
		public String getRegdate() {
			return regdate;
		}
		public void setRegdate(String regdate) {
			this.regdate = regdate;
		}
		
		
		
}
