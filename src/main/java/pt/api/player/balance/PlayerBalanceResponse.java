package pt.api.player.balance;

import pt.api.bean.ResponseBase;

public class PlayerBalanceResponse extends ResponseBase{
	private PlayerBalanceResult result;
	
	public PlayerBalanceResult getResult() {
		return result;
	}
	public void setResult(PlayerBalanceResult result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Response [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
