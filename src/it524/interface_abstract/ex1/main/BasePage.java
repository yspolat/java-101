package it524.interface_abstract.ex1.main;

import java.util.Date;

public abstract class BasePage implements Displayable{

	private String content;
	private String header;
	private Date date;
	
	
	
	
	public BasePage(String content, String header, Date date) {
		
		this.content = content;
		this.header = header;
		this.date = date;
	}
	@Override
	public String toString() {
		return "BasePage [content=" + content + ", header=" + header + ", date=" + date + "]";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
}
