package pt.api.report.playertransactions;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class PlayerTransactions extends MethodBase{
	public static final PlayerTransactionsResponse call(String baseUrl, PlayerTransactionsRequest request, String entityKey, ConnectionProperties props) throws Exception{
		
		String uri = "customreport/getdata/reportname/PlayerTransactions";
		
		uri = baseUrl+uri;
		uri = generateUri(request, uri);
		
		PlayerTransactionsResponse response = new PlayerTransactionsResponse();
		response = processSend(response, uri, entityKey, props);
		
		return response;
	}
}
