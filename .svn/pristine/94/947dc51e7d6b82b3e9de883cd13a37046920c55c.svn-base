package pt.api.player.masscreate;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerMassCreate extends MethodBase{
	
	
	public static final PlayerMassCreateResponse call(String baseUrl, PlayerMassCreateRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/massCreate/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerMassCreateResponse response = new PlayerMassCreateResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
	
	
	
}
