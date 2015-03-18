package pt.api.player.list;

import pt.api.bean.MethodBase;

public class PlayerList extends MethodBase{
	private static String uri = "player/list/";

	public static final PlayerListResponse call(String baseUrl, PlayerListRequest request, String entityKey)
			throws Exception {
		uri = baseUrl + uri;
		uri = generateUri(request, uri);
		PlayerListResponse response = new PlayerListResponse();
		response = processSend(response, uri, entityKey);
		return response;
	}
}
