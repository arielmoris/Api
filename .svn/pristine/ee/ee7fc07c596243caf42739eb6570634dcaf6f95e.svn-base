package pt.api.player.deposit;

import pt.api.bean.MethodBase;

public class PlayerDeposit extends MethodBase {
	private static String uri = "player/deposit/";
	
	public static final PlayerDepositResponse call(String baseUrl, PlayerDepositRequest request, String entityKey) throws Exception{
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerDepositResponse response = new PlayerDepositResponse();
		response = processSend(response, uri, entityKey);
		
		return response;
	}
}
