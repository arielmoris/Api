package pt.api.report.playergames;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerGames extends MethodBase{
	public static final PlayerGamesResponse call(String baseUrl, PlayerGamesRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "customreport/getdata/reportname/PlayerGames";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerGamesResponse response = new PlayerGamesResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
