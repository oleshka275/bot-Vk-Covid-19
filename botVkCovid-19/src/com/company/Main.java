package com.company;

import java.io.IOException;

import com.petersamokhin.bots.sdk.clients.Group;
import com.petersamokhin.bots.sdk.objects.Message;

public class Main extends Parser {
	
	public static void main(String args[]){
		Group group = new Group(189762760,TOKEN);
	    
		group.onSimpleTextMessage(message ->
		     {
				try {
					new Message()
					     .from(group)
					     .to(message.authorId())
					     .text(covidInformation())
					     .send();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		);
	}	 
}
