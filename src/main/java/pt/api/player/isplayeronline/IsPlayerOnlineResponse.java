package pt.api.player.isplayeronline;

import pt.api.bean.ResponseBase;

public class IsPlayerOnlineResponse extends ResponseBase{
	private IsPlayerOnlineResult result;
	
	public IsPlayerOnlineResult getResult() {
		return result;
	}
	public void setResult(IsPlayerOnlineResult result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "IsPlayerOnlineResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
