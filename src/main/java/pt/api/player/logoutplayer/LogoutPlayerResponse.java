package pt.api.player.logoutplayer;

import pt.api.bean.ResponseBase;

public class LogoutPlayerResponse extends ResponseBase{
	private LogoutPlayerResult result;

	public LogoutPlayerResult getResult() {
		return result;
	}

	public void setResult(LogoutPlayerResult result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "LogoutPlayerResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
