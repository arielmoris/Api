package pt.api.player.resetfailedlogin;

public class PlayerResetFailedLoginResult {
	
	
	public PlayerResetFailedLoginResult() {
		super();
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
		return "PlayerResetFailedLoginResult [result=" + result + "]";
	}
	
	
}
