package androidconnect.milkyrice.exceptions;

public enum ExceptionOutputType {

	FILE, 
	NOTIFICATION, 
	EMAIL;

	@Override
	public String toString() {
		String s = super.toString();
		return s.substring(0, 1) + s.substring(1).toLowerCase();
	}

}
