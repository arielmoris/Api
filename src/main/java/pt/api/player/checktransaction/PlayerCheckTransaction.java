package pt.api.player.checktransaction;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerCheckTransaction extends MethodBase{

	public static final PlayerCheckTransactionResponse call(String baseUrl, PlayerCheckTransactionRequest request, String entityKey, ConnectionProperties props) throws Exception{
		String uri = "player/checktransaction/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerCheckTransactionResponse response = new PlayerCheckTransactionResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
