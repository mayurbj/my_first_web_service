package org.mbjain.restapi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

// problem statement: need a model that represents an instance of the message of our messenger service.
// 8. telling JAXB that Message is my root element for the xml response. For rest of the fields in the class , it will automatically create XML tags.
@XmlRootElement
public class Message {
	
	private long id ;   //1. every message will have a id to uniquely identify the message
	private String text;  //2. the message itself
	private Date created;   //3. the date on which the message was created
	private String author ;  // 4. who created the message
	
	//5. create the getters and setter for all the fields. 
	
	//7. we also need a no arg constructor which helps in xml and json conversion
	public Message(){
		
	}
	
	// 6. create a constructor so that we can create a message with all the above fields
	public Message(long id, String message, String author) { 
		
		this.id = id; 
		this.text = message;
		this.author = author;
		this.created = new Date();
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

	

}
