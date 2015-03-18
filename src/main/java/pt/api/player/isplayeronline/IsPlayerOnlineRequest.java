package pt.api.player.isplayeronline;

import pt.api.bean.RequestBase;

public class IsPlayerOnlineRequest extends RequestBase{
	private String playername;

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}
}
