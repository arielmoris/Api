package pt.api.player.balance;

import pt.api.bean.RequestBase;

public class PlayerBalanceRequest extends RequestBase {
	private String playername;

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}


}
