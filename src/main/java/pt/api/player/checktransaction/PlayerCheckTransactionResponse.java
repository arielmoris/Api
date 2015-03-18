package pt.api.player.checktransaction;

import pt.api.bean.ResponseBase;

public class PlayerCheckTransactionResponse extends ResponseBase{
	private PlayerCheckTransactionResult result;

	public PlayerCheckTransactionResult getResult() {
		return result;
	}

	public void setResult(PlayerCheckTransactionResult result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Response [result=" + result + "]";
	}
	
}
