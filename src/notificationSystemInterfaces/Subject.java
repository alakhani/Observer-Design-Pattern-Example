package notificationSystemInterfaces;

/*
 * Author: Aamin Lakhani
 * 
 *  A subject interface that is implemented by the client sending new updates
 */
public interface Subject {

	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObservers();
}
