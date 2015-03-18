package pt.api.player.checktransaction;

import pt.api.bean.MethodBase;

public class PlayerCheckTransaction extends MethodBase{
	private static String uri = "player/checktransaction/";
	
	public static final PlayerCheckTransactionResponse call(String baseUrl, PlayerCheckTransactionRequest request, String entityKey) throws Exception{
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerCheckTransactionResponse response = new PlayerCheckTransactionResponse();
		response = processSend(response, uri, entityKey);
		
		return response;
	}
}
