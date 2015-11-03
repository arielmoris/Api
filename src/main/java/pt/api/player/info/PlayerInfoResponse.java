package pt.api.player.info;

import pt.api.bean.ResponseBase;

public class PlayerInfoResponse extends ResponseBase{
	private PlayerInfoResult result;

	public PlayerInfoResult getResult() {
		return result;
	}

	public void setResult(PlayerInfoResult result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Response [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
