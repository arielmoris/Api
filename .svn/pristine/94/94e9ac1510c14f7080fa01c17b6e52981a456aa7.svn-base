package pt.api.report.playerstats;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerStats extends MethodBase{
	public static final PlayerStatsResponse call(String baseUrl, PlayerStatsRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "customreport/getdata/reportname/PlayerStats";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerStatsResponse response = new PlayerStatsResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
