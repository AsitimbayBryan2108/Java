package com.chat.domain;


public class Mensaje {
	private int id;
	private int idFrom;
	private int idTo;
	private String date = "";
	private String content = "";
	
	public Mensaje() {
		
	}
	
	public Mensaje(int idFrom, int idChat, String content, String date) {
		this(0, idFrom, idChat, content, date);
	}
	
	public Mensaje(int id, int idFrom, int idTo, String content, String date) {
		super();
		this.id = id;
		this.idFrom = idFrom;
		this.idTo = idTo;
		this.date = date;
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int get_idFrom() {
		return idFrom;
	}
	
	public void set_idFrom(int idChat) {
		this.idFrom = idChat;
	}
	
	public int get_idTo() {
		return idTo;
	}
	
	public void set_idTo(int idChat) {
		this.idTo = idChat;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content +  ", date=" + date + "]";
	}
}
