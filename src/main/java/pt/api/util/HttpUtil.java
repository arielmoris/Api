package pt.api.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import pt.api.bean.ResponseWrapper;

public class HttpUtil {
	
	private Map<String, String> headers;
	
	public ResponseWrapper sendPost(String url){
		Logger logger = new Logger();
		try {
			logger.Log_Data("Sending post request to "+URLDecoder.decode(url));
		} catch (Exception e1) {}

		ResponseWrapper response = new ResponseWrapper();
		int code = Constants.ResponseCode.SUCCESS;
		String message = "Success";
		String obj = "";
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);
		if(headers != null){
			Iterator<Entry<String, String>> entries = headers.entrySet().iterator();
			while(entries.hasNext()){
				Entry<String, String> entry = entries.next();
				post.setHeader(entry.getKey(), entry.getValue());
			}
		}
		try {
			HttpResponse httpResponse = httpClient.execute(post);
			obj = "";
			if(httpResponse.getStatusLine().getStatusCode() == 200){
				BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));

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
			}else{
				code	 = httpResponse.getStatusLine().getStatusCode();
				message	 = httpResponse.getStatusLine().getReasonPhrase();
			}
		} catch (Exception e) {
			logger.Log_Error(e);
			code = Constants.ResponseCode.FAILED;
			message = "Try again later.";
		} finally{
			post.releaseConnection();
			httpClient.getConnectionManager().shutdown();
		}
		
		response.setCode(code);
		response.setMessage(message);
		response.setObj(obj);
		
		logger.Log_Data("Leaving sendPost :"+response.toString());
		return response;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	
	
}
