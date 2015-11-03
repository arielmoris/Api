package pt.api.report.gamestats;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class GameStats extends MethodBase{
	
	public static final GameStatsResponse call(String baseUrl, GameStatsRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "customreport/getdata/reportname/GameStats";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		GameStatsResponse response = new GameStatsResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
	
}
