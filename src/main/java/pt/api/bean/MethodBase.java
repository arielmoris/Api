package pt.api.bean;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import pt.api.util.Constants;
import pt.api.util.DateDeserializer;
import pt.api.util.HttpUtil;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class MethodBase{
	
	public static <T extends ResponseBase> T processSend(T response, String url, String entityKey){
		Class<?> clazz = response.getClass();
		
		HttpUtil httpUtil = new HttpUtil();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("X_ENTITY_KEY", entityKey);
		httpUtil.setHeaders(headers);
		ResponseWrapper responseWrapper = httpUtil.sendPost(url);
		
		if(responseWrapper.getCode() == Constants.ResponseCode.SUCCESS){
			Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
			response = (T) gson.fromJson(responseWrapper.getObj(), clazz);
		}else{
			response.setErrorcode(Constants.ResponseCode.FAILED);
			response.setError(responseWrapper.getMessage());
		}
		
		if(response == null){
			try {
				response = (T) clazz.newInstance();
			} catch (Exception e) {}
		}
		
		return response;
	}
	
	public static  <T extends RequestBase> String generateUri(T request, String uri){
		Field[] fields = request.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		for(Field field : fields){
			String name = field.getName();
			String getterName =  "get"+ name.substring(0,1).toUpperCase() + name.substring(1);
			
			try {
				Method method = request.getClass().getMethod(getterName);
				Object valueObject = method.invoke(request);
				if(valueObject != null && !valueObject.equals("")){
					if(name.charAt(0) == '_'){
						name = name.substring(1);
					}
					sb.append(name).append("/").append(valueObject).append("/");
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			
		}
		String str = sb.toString() ;
		
		try {
			str = URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		uri+=str;
		return uri;
	}
	
}
