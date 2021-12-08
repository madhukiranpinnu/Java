package JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDEmo {
public static void main(String [] args) throws IOException, ParseException {
	JSONParser jparser=new JSONParser();
	FileReader freader=new FileReader(".\\JSONFILES\\example.json");
	Object object=jparser.parse(freader);
	JSONObject jobject=(JSONObject)object;
	String College=(String) jobject.get("college");
	System.out.println(College);
	JSONArray array=(JSONArray)jobject.get("students");
	for(int i=0;i<array.size();i++) {
		JSONObject students=(JSONObject)array.get(i);
	   String id= (String) students.get("id");
	   String name=(String) students.get("name");
	   String salary=(String) students.get("salary");
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(salary);

	}
}
}

