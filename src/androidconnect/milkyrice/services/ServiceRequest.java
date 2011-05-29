package androidconnect.milkyrice.services;

/***
 * ServiceRequest
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public class ServiceRequest {
	
	private ServiceMessage message;

	private void setMessage(ServiceMessage message) {
		this.message = message;
	}

	private ServiceMessage getMessage() {
		return message;
	}
	
}
