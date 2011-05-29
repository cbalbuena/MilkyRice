package androidconnect.milkyrice.parser;

import com.google.gson.Gson;

/***
 * ServiceMessage
 * @author carlosbalbuena
 * History
 * 		2011.05.29 Initial Version
 */
public class JSonParser<T> {

	public T parse(String jsonString)
	{
		Gson gson = new Gson();
		T newObject = null;//gson.fromJson(jsonString, T);
		
		return newObject;
		
	}
	
}
