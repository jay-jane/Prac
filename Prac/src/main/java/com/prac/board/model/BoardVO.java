package com.prac.board.model;

import java.sql.Timestamp;

public class BoardVO {
	private int bno;
	private String id;
	private String title;
	private String content;
	private Timestamp date;
	
	public BoardVO() {
	}

	public BoardVO(int bno, String id, String title, String content, Timestamp date) {
		super();
		this.bno = bno;
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
