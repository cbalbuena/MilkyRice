package androidconnect.milkyrice.services;

/***
 * ServiceResponse
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public class ServiceResponse {

	private IServiceResult result;

	private void setResult(IServiceResult result) {
		this.result = result;
	}

	private IServiceResult getResult() {
		return result;
	}
	
}
