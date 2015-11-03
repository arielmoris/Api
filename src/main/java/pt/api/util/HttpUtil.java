package pt.api.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.ResponseWrapper;

public class HttpUtil {
	
	private Map<String, String> headers;
	private ConnectionProperties connectionProperties;
	
	public ResponseWrapper sendPost(String url){
		Logger logger = new Logger();
		try {
			logger.Log_Data("Sending post request to "+url);
		} catch (Exception e1) {}

		ResponseWrapper response = new ResponseWrapper();
		int code = Constants.ResponseCode.SUCCESS;
		String message = "Success";
		String obj = "";
		
		HttpsURLConnection conn = null;
		try {
			SSLSocketFactory ssf = null;
			if(connectionProperties != null){
				KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
				FileInputStream is = new FileInputStream(new File(connectionProperties.getKeyStore()));
				keystore.load(is, connectionProperties.getKeyStorePassword().toCharArray());
				
				KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
				kmf.init(keystore, connectionProperties.getKeyStorePassword().toCharArray());
				
				TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				tmf.init(keystore);
				
				SSLContext sslContext = SSLContext.getInstance("TLS");
				sslContext.init(kmf.getKeyManagers(), null, null);
				ssf = sslContext.getSocketFactory();
				
				is.close();
			}
			
			/*if(connectionProperties != null){
				logger.Log_Data("[Key store : "+connectionProperties.getKeyStore()+", Password : "+connectionProperties.getKeyStorePassword()+"]");
				System.setProperty("javax.net.ssl.keyStore", connectionProperties.getKeyStore());
	            System.setProperty("javax.net.ssl.keyStorePassword", connectionProperties.getKeyStorePassword());
			}
			ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();*/
			
			if(ssf == null){
				ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
			}
			
			
			URL uri = new URL(url);
			conn = (HttpsURLConnection) uri.openConnection();
			conn.setSSLSocketFactory(ssf);
			conn.setReadTimeout(60000);
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			
			if(headers != null){
				Iterator<Entry<String, String>> entries = headers.entrySet().iterator();
				while(entries.hasNext()){
					Entry<String, String> entry = entries.next();
					logger.Log_Data(entry.getKey()+" => "+entry.getValue());
					conn.setRequestProperty(entry.getKey(), entry.getValue());
				}
			}
		
			conn.connect();
			int responseCode = conn.getResponseCode();
			String responseMessage = conn.getResponseMessage();
			obj = "";
			if(responseCode == 200){
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

				StringBuffer strBuffer = new StringBuffer();
				char[] cBuff = new char[1];

				while((br.read(cBuff, 0, 1)) != -1){
					strBuffer.append(cBuff[0]);
				}
				obj = strBuffer.toString();
				if(obj == null || obj.equals("")){ 
					code = Constants.ResponseCode.FAILED;
					message = "No response.";
				}
				
				br.close();
			}else{
				code	 = responseCode;
				message	 = responseMessage;
			}
		} catch (Exception e) {
			logger.Log_Error(e);
			code = Constants.ResponseCode.FAILED;
			message = "Try again later.";
		} finally{
			if(conn != null){
				conn.disconnect();
			}
		}
		
		response.setCode(code);
		response.setMessage(message);
		response.setObj(obj);
		
		try {
			logger.Log_Data("Leaving sendPost :"+response.toString());
		} catch (Exception e) {}
		return response;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public ConnectionProperties getConnectionProperties() {
		return connectionProperties;
	}

	public void setConnectionProperties(ConnectionProperties connectionProperties) {
		this.connectionProperties = connectionProperties;
	}
}
