package pt.api.player.massfreeze;

public class PlayerMassFreezeParam {
	private String playername;

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	@Override
	public String toString() {
		return "PlayerMassFreezeParam [playername=" + playername + "]";
	}
	
}
