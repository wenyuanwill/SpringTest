package org.william.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="message")
public class Message implements Serializable{

	private int id;
	private String message;
	private String author;
	
	public Message() {
		super();
	}

	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	@XmlElement
	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
