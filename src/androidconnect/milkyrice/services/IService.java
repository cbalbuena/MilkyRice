package androidconnect.milkyrice.services;

/***
 * IService
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public interface IService {
	
	ServiceResponse invoke(ServiceRequest request);
}
