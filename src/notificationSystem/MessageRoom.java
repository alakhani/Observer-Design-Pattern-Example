package notificationSystem;

import java.util.ArrayList;

import notificationSystemInterfaces.Observer;
import notificationSystemInterfaces.Subject;

/*
 * Author: Aamin Lakhani
 * 
 *  A MessageRoom that is actually the subject. Any change to this class variable is broadcasted to its observers
 */
public class MessageRoom implements Subject{

	public ArrayList<Observer> observers = new ArrayList<Observer>();
	
	private String newMessage;
	
	public MessageRoom() {
		
	}
	
	public String getNewMessage() {
		return this.newMessage;
	}
	
	public void setNewMessage(String newMessage) {
		this.newMessage = newMessage;
		notifyObservers();
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.updateNewMessage(newMessage);
		}
		
	}

}
