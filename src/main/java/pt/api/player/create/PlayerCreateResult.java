package pt.api.player.create;

public class PlayerCreateResult {
	private String result;
	private String playerName;
	
	
	public PlayerCreateResult() {
		super();
		this.result = new String();
		this.playerName = new String();
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "Result [result=" + result + ", playerName=" + playerName + "]";
	}
	
}
