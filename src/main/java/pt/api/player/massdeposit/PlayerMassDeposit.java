package pt.api.player.massdeposit;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;


public class PlayerMassDeposit extends MethodBase{

	public static final PlayerMassDepositResponse call(String baseUrl, PlayerMassDepositRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/massDeposit/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerMassDepositResponse response = new PlayerMassDepositResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
	
}
