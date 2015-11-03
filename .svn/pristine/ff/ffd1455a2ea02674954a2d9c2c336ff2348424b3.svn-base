package pt.api.player.masswithdraw;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerMassWithdraw extends MethodBase{

	public static final PlayerMassWithdrawResponse call(String baseUrl, PlayerMassWithdrawRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "player/massWithdraw/";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerMassWithdrawResponse response = new PlayerMassWithdrawResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
