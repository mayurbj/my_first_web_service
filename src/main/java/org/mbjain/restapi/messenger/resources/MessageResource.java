package org.mbjain.restapi.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mbjain.restapi.messenger.model.Message;
import org.mbjain.restapi.messenger.service.MessageService;

// problem statment : Call your webservice method and return a response.
// 1. Map the resource URL/endpoint here for example:  http://localhost:8080/webapi/messenger/messages
@Path("/messages")
public class MessageResource {

	// 4. creating an object of my webservice
	MessageService messageService = new MessageService();

	// 2. Map the HTTP type to the methods 
	@GET
	// 3. Define the response format for the REST API Request. 
	@Produces(MediaType.APPLICATION_XML)
	// 5. defining a method which in turn calls my webservice's method
	// 6. Now if you access this /messages resources from your browser will get an error. You need to Tell JAXB to do the.. 
	// .. conversion of Message (mj:which is plain old java object) to XML. for which you need to add the @XmlRootElement  annotation in Message
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

	// @GET
	// @Produces(MediaType.TEXT_PLAIN)
	// public String getMessages(){
	// return "Hello World";
	// }

}
