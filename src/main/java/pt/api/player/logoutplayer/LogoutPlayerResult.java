package pt.api.player.logoutplayer;

public class LogoutPlayerResult {
	
	public LogoutPlayerResult() {
		this.result = new String();
	}

	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "LogoutPlayerResult [result=" + result + "]";
	}
	
}
