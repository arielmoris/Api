package pt.api.player.logoutplayer;

import pt.api.bean.MethodBase;

public class LogoutPlayer extends MethodBase {
	private static String uri = "player/logout/";

	public static final LogoutPlayerResponse call(String baseUrl, LogoutPlayerRequest request, String entityKey)
			throws Exception {
		uri = baseUrl + uri;
		uri = generateUri(request, uri);
		LogoutPlayerResponse response = new LogoutPlayerResponse();
		response = processSend(response, uri, entityKey);
		return response;
	}
}
