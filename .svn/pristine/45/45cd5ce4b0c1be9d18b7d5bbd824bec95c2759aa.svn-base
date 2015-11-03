package pt.api.report.playersaccountstats;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayersAccountStats extends MethodBase{
	
	public static final PlayersAccountStatsResponse call(String baseUrl, PlayersAccountStatsRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "customreport/getdata/reportname/PlayersAccountStats";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayersAccountStatsResponse response = new PlayersAccountStatsResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
