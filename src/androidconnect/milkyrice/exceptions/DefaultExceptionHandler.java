package androidconnect.milkyrice.exceptions;

import android.app.Activity;
import androidconnect.milkyrice.common.MilkyRiceConstants;

/***
 * DefaultExceptionHandler
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public class DefaultExceptionHandler implements Thread.UncaughtExceptionHandler {

	private Activity internalActivity;
	private ExceptionOutputType outputType;

	public DefaultExceptionHandler(ExceptionOutputType outputType, Activity internalActivity) {
		this.outputType = outputType;
		this.internalActivity = internalActivity;
	}

	@Override
	public void uncaughtException(Thread thread, Throwable ex) {

		String message = ex.getMessage() + MilkyRiceConstants.SEPARATOR + ex.getStackTrace().toString();
		
		ExceptionWriter writer = new FileExceptionWriter(); // Default Exception Writer
		switch (this.outputType) {
		case EMAIL:
			writer = new MailExceptionWriter();
			break;
		case FILE:
			writer = new FileExceptionWriter();
			break;
		case NOTIFICATION:
			writer = new NotificationExceptionWriter();
			writer.setInternalActivity(internalActivity);
			break;
		}

		writer.write(message);
	}

	public void setOutputType(ExceptionOutputType outputType) {
		this.outputType = outputType;
	}

	public ExceptionOutputType getOutputType() {
		return outputType;
	}

	public void setInternalActivity(Activity internalActivity) {
		this.internalActivity = internalActivity;
	}

	public Activity getInternalActivity() {
		return internalActivity;
	}

}
