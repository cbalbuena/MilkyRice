package androidconnect.milkyrice.exceptions;

import android.app.Activity;

public interface ExceptionWriter {

	void write(String message);
	void setInternalActivity(Activity internalActivity);
}
