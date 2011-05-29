package androidconnect.milkyrice.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/***
 * PropertyFileReader
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public class PropertyFileReader {

	public String getProperty(String propertyName)
	{
		String propertyValue = "";
		
		// Read properties file.
		Properties properties = new Properties();
		try {
		    properties.load(new FileInputStream("default.properties"));
		    
		    propertyValue = properties.get(propertyName).toString();		    
		} catch (IOException e) {
		}
		catch (Exception e)
		{
			 propertyValue = "";
		}
		
		return  propertyValue;
		
	}
	
}
