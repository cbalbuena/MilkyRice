package androidconnect.milkyrice.exceptions;

import java.io.File;

import android.app.Activity;
import androidconnect.milkyrice.common.MilkyRiceConstants;
import androidconnect.milkyrice.common.PropertyFileReader;
import androidconnect.milkyrice.common.StringFileWriter;

/***
 * FileExceptionWriter
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public class FileExceptionWriter implements ExceptionWriter {

	@Override
	public void write(String message) {

		PropertyFileReader propertyFileReader = new PropertyFileReader();
		String path = propertyFileReader
				.getProperty(MilkyRiceConstants.LOGPATH_PROPS);
		String pathTotal = path + MilkyRiceConstants.BACKSLASH
				+ MilkyRiceConstants.LOGFILENAME;
		File logFile = new File(pathTotal);

		
		try {
			StringFileWriter.setContents(logFile, message);

		} catch (Exception e) {

		}

	}

	@Override
	public void setInternalActivity(Activity internalActivity) {
		// TODO Auto-generated method stub
		
	}

}
