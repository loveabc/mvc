package com.spring.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author 0100060928
 * ��ȡ�����ļ�
 */
public class ReadProperties {
	private static Properties properties=null;
	static {
		properties=new Properties();
		try {
			InputStream is=ReadProperties.class.getClassLoader().getResourceAsStream("face.properties");
			properties.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Properties getProperties() {
		return properties;
	}

}
