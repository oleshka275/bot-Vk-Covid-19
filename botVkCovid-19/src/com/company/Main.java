package com.company;

import java.io.IOException;

import com.petersamokhin.bots.sdk.clients.Group;
import com.petersamokhin.bots.sdk.objects.Message;

public class Main extends Parser {
	
	public static void main(String args[]){
		Group group = new Group(189762760, "230862fce32fe4fd64b00730eae5073688460df00a51c620f0abfe3fd7357fff2037f01defba5aea7ed81");
	    
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