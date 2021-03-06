package pt.api.player.withdraw;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;


public class PlayerWithdraw extends MethodBase{
	
	public static final PlayerWithdrawResponse call(String baseUrl, PlayerWithdrawRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/withdraw/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		PlayerWithdrawResponse response = new PlayerWithdrawResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}	
}
