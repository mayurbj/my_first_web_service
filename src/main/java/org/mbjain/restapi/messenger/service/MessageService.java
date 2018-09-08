package org.mbjain.restapi.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.mbjain.restapi.messenger.model.Message;

//problem statement: we need a service which can connect to a database and retrieve a list of messages requested by.. 
//.. the user of the web service.
public class MessageService {
	
	//1. return a list of messages (hardcoded)
	public List<Message> getAllMessages(){
		
		//2. make sure there is a no arg constructor in the Message class -> Always. 
		//3. now to create Message you can have a constructor in Message class .. 
		// .. that can allow the user to create a message 
		// Note: this is hardcoded messages for demo purpose. But you can retrieve the messages from database.. 
		// in real world.
		Message m1 = new Message(1L, "Hello World!", "Mayur");
		Message m2 = new Message(2L, "Hello Jersey!", "Mayur");
		List<Message> messages = new ArrayList<Message>();
		messages.add(m1);
		messages.add(m2);
		return messages;
		
	}

}
