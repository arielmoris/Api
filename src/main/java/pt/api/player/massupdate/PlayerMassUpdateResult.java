package pt.api.player.massupdate;

public class PlayerMassUpdateResult {
	
	
	public PlayerMassUpdateResult() {
		super();
		this.playername = new String();
		this.update = new PlayerMassUpdateUpdate();
	}
	
	private String playername;
	private PlayerMassUpdateUpdate update;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public PlayerMassUpdateUpdate getUpdate() {
		return update;
	}
	public void setUpdate(PlayerMassUpdateUpdate update) {
		this.update = update;
	}
	@Override
	public String toString() {
		return "PlayerMassUpdateResult [playername=" + playername + ", update="
				+ update + "]";
	}
}
