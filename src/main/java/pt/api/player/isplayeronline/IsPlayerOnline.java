package pt.api.player.isplayeronline;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class IsPlayerOnline extends MethodBase{

	public static final IsPlayerOnlineResponse call(String baseUrl, IsPlayerOnlineRequest request, String entityKey, ConnectionProperties props) throws Exception{
		String uri = "player/online/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		IsPlayerOnlineResponse response = new IsPlayerOnlineResponse();
		response = processSend(response, uri, entityKey, props);
		return response;
	}	
}
