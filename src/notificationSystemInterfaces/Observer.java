package notificationSystemInterfaces;

/*
 * Author: Aamin Lakhani
 * 
 *  An observer interface that is implemented by the client watching for new updates
 */
public interface Observer {

	public void updateNewMessage(String message);
}
