package kr.co.acorn.dto;

public class BoardDTO {
	private int cno;
	private String title;
	private String writer;
	private int hits;
	private int good;
	private int bad;
	private String contents;
	private String regdate;
	private int mno;

	public BoardDTO() {
	}

	public BoardDTO(int cno, String title, String writer, int hits, int good, int bad, String contents, String regdate,
			int mno) {
		super();
		this.cno = cno;
		this.title = title;
		this.writer = writer;
		this.hits = hits;
		this.good = good;
		this.bad = bad;
		this.contents = contents;
		this.regdate = regdate;
		this.mno = mno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
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

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

}
