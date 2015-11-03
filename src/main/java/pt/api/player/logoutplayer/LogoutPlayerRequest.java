package pt.api.player.logoutplayer;

import pt.api.bean.RequestBase;

public class LogoutPlayerRequest extends RequestBase{
	private String playername;

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	@Override
	public String toString() {
		return "LogoutPlayerRequest [playername=" + playername + "]";
	}
	
	
}
