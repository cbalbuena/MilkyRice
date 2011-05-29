package androidconnect.milkyrice.services;

/***
 * IServiceResult
 * 
 * @author carlosbalbuena 
 * History 
 * 	2011.05.29 Initial Version
 */
public interface IServiceResult {

	public enum Result {
		SUCCESS, ERROR, WARNING; // ; is required here.

		@Override
		public String toString() {
			String s = super.toString();
			return s.substring(0, 1) + s.substring(1).toLowerCase();
		}
	}

}
