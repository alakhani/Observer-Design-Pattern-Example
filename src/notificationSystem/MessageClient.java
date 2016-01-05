package notificationSystem;

import notificationSystemInterfaces.Observer;

/*
 * Author: Aamin Lakhani
 * 
 * Clinets watching the MessageRoom for new updates
 */
public class MessageClient implements Observer {
	
	private String clientId;
	
	public MessageClient(String clientId) {
		this.clientId = clientId;
	}
	
	public String getClientId() {
		return this.clientId;
	}
	
	@Override
	public void updateNewMessage(String message) {
		System.out.println("Cliient id "+clientId + " has a new message :" + message);
	}

}
