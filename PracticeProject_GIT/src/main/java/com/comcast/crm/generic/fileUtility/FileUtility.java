package com.comcast.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./configAppData/Vtiger_CommonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);

		return value;

	}
}
