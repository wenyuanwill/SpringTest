package org.william.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.william.beans.Message;

@Path("/MessageService")
public class MessageService {

	@GET
	@Path("/messages/{param}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessageById(@PathParam("param") String msg){
		List<Message> myList = new ArrayList<Message>();
		try{
			int myId = Integer.parseInt(msg);
			for(int i = 0; i<10; i++){
				Message tmpMessage = new Message(i,"This is message number "+i, "William");
				myList.add(tmpMessage);
				if(myId == i){
					return tmpMessage;
				}
			}
			return new Message(-1,"Message does not exist","N/A");
		}
		catch(NumberFormatException e)
		{		
			System.err.println("NumberFormatException: " + e.getMessage());
		}
		return new Message(-1,"Incorrect argument","N/A");
	}
}
