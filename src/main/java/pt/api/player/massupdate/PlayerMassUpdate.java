package pt.api.player.massupdate;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;


public class PlayerMassUpdate  extends MethodBase{

	public static final PlayerMassUpdateResponse call(String baseUrl, PlayerMassUpdateRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/massUpdate/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerMassUpdateResponse response = new PlayerMassUpdateResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
