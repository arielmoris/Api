package pt.api.player.resetfailedlogin;

import pt.api.bean.RequestBase;

public class PlayerResetFailedLoginRequest extends RequestBase{

	private String playername;

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

}
