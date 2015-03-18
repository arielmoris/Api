package pt.api.player.resetfailedlogin;

import pt.api.bean.ResponseBase;

public class PlayerResetFailedLoginResponse extends ResponseBase{
	private PlayerResetFailedLoginResult result;

	public PlayerResetFailedLoginResult getResult() {
		return result;
	}

	public void setResult(PlayerResetFailedLoginResult result) {
		this.result = result;
	}
	
	
}
