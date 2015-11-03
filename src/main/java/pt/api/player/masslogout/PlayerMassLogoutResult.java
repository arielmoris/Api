package pt.api.player.masslogout;

public class PlayerMassLogoutResult {
	
	
	public PlayerMassLogoutResult() {
		super();
		this.playername = new String();
		this.logout = new PlayerMassLogoutLogout();
	}
	private String playername;
	private PlayerMassLogoutLogout logout;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public PlayerMassLogoutLogout getLogout() {
		return logout;
	}
	public void setLogout(PlayerMassLogoutLogout logout) {
		this.logout = logout;
	}
	@Override
	public String toString() {
		return "PlayerMassLogoutResult [playername=" + playername + ", logout="
				+ logout + "]";
	}
	
	
}
