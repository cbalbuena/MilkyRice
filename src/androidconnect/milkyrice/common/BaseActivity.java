package androidconnect.milkyrice.common;

import android.app.Activity;
import androidconnect.milkyrice.exceptions.DefaultExceptionHandler;
import androidconnect.milkyrice.exceptions.ExceptionOutputType;


public class BaseActivity extends Activity {

	public BaseActivity()
	{
		DefaultExceptionHandler handler  = new DefaultExceptionHandler (ExceptionOutputType.FILE, this);
		Thread.setDefaultUncaughtExceptionHandler(handler);
	}
	
}
