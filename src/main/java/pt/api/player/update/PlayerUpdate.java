package pt.api.player.update;

import pt.api.bean.MethodBase;

public class PlayerUpdate extends MethodBase{
	
	
	private static String uri = "player/update/";
	
	public static final PlayerUpdateResponse call(String baseUrl, PlayerUpdateRequest request, String entityKey) throws Exception{
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerUpdateResponse response = new PlayerUpdateResponse();
		response = processSend(response, uri, entityKey);
		
		return response;
	}
			
}