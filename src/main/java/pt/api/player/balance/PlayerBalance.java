package pt.api.player.balance;

import pt.api.bean.MethodBase;

public class PlayerBalance extends MethodBase{
	private static String uri = "player/balance/";
	
	public static final PlayerBalanceResponse call(String baseUrl, PlayerBalanceRequest request, String entityKey) throws Exception{
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerBalanceResponse response = new PlayerBalanceResponse();
		response = processSend(response, uri, entityKey);
		
		return response;
	}
	


}
