package pt.api.player.create;

import pt.api.bean.ResponseBase;

public class PlayerCreateResponse extends ResponseBase{
	private PlayerCreateResult result;
	
	public PlayerCreateResult getResult() {
		return result;
	}


	public void setResult(PlayerCreateResult result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "Response [result=" + result + "]";
	}
	
	
}
