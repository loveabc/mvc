package com.spring.util;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * @author 0100060928 Í¼Æ¬±àÂë
 */
public class ImageEncoder {

	/**
	 * 
	 * @param bytes
	 * @return
	 */
	public static String toBase64Image(byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}

}
