package pt.api.player.update;

public class PlayerUpdateResult {
	
	
	public PlayerUpdateResult() {
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
		return "Result [result=" + result + "]";
	}
	
}
