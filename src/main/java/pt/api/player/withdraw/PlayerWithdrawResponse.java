package pt.api.player.withdraw;

import pt.api.bean.ResponseBase;

public class PlayerWithdrawResponse extends ResponseBase {
	private PlayerWithdrawResult result;

	public PlayerWithdrawResult getResult() {
		return result;
	}

	public void setResult(PlayerWithdrawResult result) {
		this.result = result;
	}
}
