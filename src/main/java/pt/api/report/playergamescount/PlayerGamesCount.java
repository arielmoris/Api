package pt.api.report.playergamescount;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerGamesCount extends MethodBase{
	
	public static final PlayerGamesCountResponse call(String baseUrl, PlayerGamesCountRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "customreport/getdata/reportname/PlayerGamesCount";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerGamesCountResponse response = new PlayerGamesCountResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
