package pt.api.entity.generatekey;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class GenerateKey extends MethodBase{
	
	public static final GenerateKeyResponse call(String baseUrl, GenerateKeyRequest request, ConnectionProperties props) throws Exception{
		String uri = "entity/generatekey/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		GenerateKeyResponse response = new GenerateKeyResponse();
		response = processSend(response, uri, null, props);
		
		return response;
	}
}
