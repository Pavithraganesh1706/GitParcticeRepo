package com.comcast.crm.generic.fileUtility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
   
	public String getDataFromJSON(String key) throws IOException, ParseException {
		FileReader file=new FileReader("G:\\DDT\\jsoncommonData.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(file);
		JSONObject map= (JSONObject)obj;
		String value = map.get(key).toString();
		return value;
		
	}
}
