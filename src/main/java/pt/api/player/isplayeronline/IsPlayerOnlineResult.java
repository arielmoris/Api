package pt.api.player.isplayeronline;

public class IsPlayerOnlineResult {
	
	
	public IsPlayerOnlineResult(String result) {
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
		return "IsPlayerOnlineResult [result=" + result + "]";
	}
	
	
}
