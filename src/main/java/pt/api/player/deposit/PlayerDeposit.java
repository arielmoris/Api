package pt.api.player.deposit;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerDeposit extends MethodBase {
	
	public static final PlayerDepositResponse call(String baseUrl, PlayerDepositRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/deposit/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerDepositResponse response = new PlayerDepositResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
