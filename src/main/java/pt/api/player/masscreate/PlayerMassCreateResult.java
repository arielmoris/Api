package pt.api.player.masscreate;

public class PlayerMassCreateResult {
	
	public PlayerMassCreateResult() {
		super();
		this.playername = new String();
		this.create = new PlayerMassCreateCreate();
		this.deposit = new PlayerMassCreateDeposit();
	}
	
	private String playername;
	private PlayerMassCreateCreate create;
	private PlayerMassCreateDeposit deposit;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public PlayerMassCreateCreate getCreate() {
		return create;
	}
	public void setCreate(PlayerMassCreateCreate create) {
		this.create = create;
	}
	public PlayerMassCreateDeposit getDeposit() {
		return deposit;
	}
	public void setDeposit(PlayerMassCreateDeposit deposit) {
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		return "PlayerMassCreateResult [playername=" + playername + ", create="
				+ create + ", deposit=" + deposit + "]";
	}
	
}
