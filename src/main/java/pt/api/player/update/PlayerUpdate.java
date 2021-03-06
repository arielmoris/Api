package pt.api.player.update;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerUpdate extends MethodBase{
	
	
	public static final PlayerUpdateResponse call(String baseUrl, PlayerUpdateRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/update/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerUpdateResponse response = new PlayerUpdateResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
			
}