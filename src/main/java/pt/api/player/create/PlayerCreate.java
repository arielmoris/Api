package pt.api.player.create;


import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerCreate extends MethodBase {

	
	public static final PlayerCreateResponse call(String baseUrl, PlayerCreateRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/create/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerCreateResponse response = new PlayerCreateResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
