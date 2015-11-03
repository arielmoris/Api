package pt.api.player.masslogout;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerMassLogout extends MethodBase{

	public static final PlayerMassLogoutResponse call(String baseUrl, PlayerMassLogoutRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/masslogout";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerMassLogoutResponse response = new PlayerMassLogoutResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
