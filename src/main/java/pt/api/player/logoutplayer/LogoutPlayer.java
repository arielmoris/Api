package pt.api.player.logoutplayer;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.MethodBase;

public class LogoutPlayer extends MethodBase {

	public static final LogoutPlayerResponse call(String baseUrl, LogoutPlayerRequest request, String entityKey, ConnectionProperties props)
			throws Exception {
		
		String uri = "player/logout/";
		
		uri = baseUrl + uri;
		uri = generateUri(request, uri);
		LogoutPlayerResponse response = new LogoutPlayerResponse();
		response = processSend(response, uri, entityKey, props);
		return response;
	}
}
