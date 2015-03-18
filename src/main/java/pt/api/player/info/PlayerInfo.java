package pt.api.player.info;

import pt.api.bean.MethodBase;
public class PlayerInfo extends MethodBase{
	
	private static String uri = "player/info/";
	
	public static final PlayerInfoResponse call(String baseUrl, PlayerInfoRequest request, String entityKey) throws Exception{
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerInfoResponse response = new PlayerInfoResponse();
		response = processSend(response, uri, entityKey);
		
		return response;
	}
}
