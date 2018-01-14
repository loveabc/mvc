package com.spring.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class SendHttp {

	public String sendHttp(String base64Image) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;

		Properties properties = ReadProperties.getProperties();
		String apiKeyValue = properties.getProperty("api_key");
		String apiSecretValue = properties.getProperty("api_secret");
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		NameValuePair apiKey = new BasicNameValuePair("api_key", apiKeyValue);
		NameValuePair apiSecret = new BasicNameValuePair("api_secret",
				apiSecretValue);
		NameValuePair imageBase64 = new BasicNameValuePair("image_base64",
				base64Image);
		params.add(apiKey);
		params.add(apiSecret);
		params.add(imageBase64);
		String value = "";
		try {
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params,
					"UTF-8");
			String url = properties.getProperty("url");
			HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(entity);
			response = httpClient.execute(httpPost);
			HttpEntity httpEntity = response.getEntity();
			value = EntityUtils.toString(httpEntity);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (httpClient != null) {
						httpClient.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		return value;
	}
}
