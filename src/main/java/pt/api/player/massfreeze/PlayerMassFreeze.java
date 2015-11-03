package pt.api.player.massfreeze;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Date;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;
import pt.api.bean.RequestBase;
import pt.api.util.DateDeserializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PlayerMassFreeze extends MethodBase{
	
	public static final PlayerMassFreezeResponse call(String baseUrl, PlayerMassFreezeRequest request, String entityKey, ConnectionProperties props) throws Exception{
		String uri = "player/massFreeze/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerMassFreezeResponse response = new PlayerMassFreezeResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
	
	
	public static  <T extends RequestBase> String generateUri(T request, String uri){
		Field[] fields = request.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		StringBuilder uriBuilder = new StringBuilder(uri);
		String params = "";
		for(Field field : fields){
			String name = field.getName();
			String getterName =  "get"+ name.substring(0,1).toUpperCase() + name.substring(1);
			
			try {
				Method method = request.getClass().getMethod(getterName);
				Object valueObject = method.invoke(request);
				if(name.equalsIgnoreCase("params")){
					Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
					params = gson.toJson(valueObject);
				}else{
					if(valueObject != null && !valueObject.equals("")){
						try {
							valueObject = URLEncoder.encode(valueObject.toString(), "UTF-8");
						} catch (UnsupportedEncodingException e) {
							logger.Log_Error(e);
						}
						
						if(name.charAt(0) == '_'){
							name = name.substring(1);
						}
						
						if(uriBuilder.append(sb).charAt(uriBuilder.length()-1) == '/'){
							sb.append(name).append("/").append(valueObject);
						}else{
							sb.append("/").append(name).append("/").append(valueObject);
						}
						
					}
				}
			} catch (NoSuchMethodException e) {
				logger.Log_Error(e);
			} catch (SecurityException e) {
				logger.Log_Error(e);
			} catch (IllegalAccessException e) {
				logger.Log_Error(e);
			} catch (IllegalArgumentException e) {
				logger.Log_Error(e);
			} catch (InvocationTargetException e) {
				logger.Log_Error(e);
			}
		}
		if(params!=null && !params.equals("")){
			if(uriBuilder.append(sb).charAt(uriBuilder.length()-1) == '/'){
				sb.append("params/").append(params);
			}else{
				sb.append("/params/").append(params);
			}
		}
		
		uriBuilder = null;
		String str = sb.toString() ;
		
		uri+=str;
		return uri;
	}
}
