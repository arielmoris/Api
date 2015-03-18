package pt.api.player.withdraw;

import pt.api.bean.MethodBase;


public class PlayerWithdraw extends MethodBase{
	
	private static String uri = "player/withdraw/";
	
	public static final PlayerWithdrawResponse call(String baseUrl, PlayerWithdrawRequest request, String entityKey) throws Exception{
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		PlayerWithdrawResponse response = new PlayerWithdrawResponse();
		response = processSend(response, uri, entityKey);
		return response;
	}	
}
