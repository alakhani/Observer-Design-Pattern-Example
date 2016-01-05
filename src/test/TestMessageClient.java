package test;

import notificationSystem.MessageClient;
import notificationSystem.MessageRoom;
/*
 * Author: Aamin Lakhani
 * Sample project to illustrate the Observer pattern through a simple message broadcast system example. 
 */
public class TestMessageClient {

	public static void main (String args[]) {
		
		MessageClient client1 = new MessageClient("1");
		MessageClient client2 = new MessageClient("2");
		
		MessageRoom newNotifcationSystem = new MessageRoom();
		newNotifcationSystem.addObserver(client1);
		newNotifcationSystem.addObserver(client2);
		newNotifcationSystem.setNewMessage("New Message 1 Set");
		newNotifcationSystem.setNewMessage("New Message 2 Set");
	}
}
