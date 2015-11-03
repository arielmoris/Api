package pt.api.player.info;

public class PlayerInfoCREFERER {
	
	public PlayerInfoCREFERER() {
		super();
		BRAND = new String();
	}

	private String BRAND;

	public String getBRAND() {
		return BRAND;
	}

	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}

	@Override
	public String toString() {
		return "PlayerInfoCRferer [BRAND=" + BRAND + "]";
	}
	
	
}
