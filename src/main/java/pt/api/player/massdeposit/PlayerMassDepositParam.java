package pt.api.player.massdeposit;

import java.math.BigDecimal;

public class PlayerMassDepositParam {
	private String playername;
	private BigDecimal amount;
	
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PlayerMassDepositParam [playername=" + playername + ", amount="
				+ amount + "]";
	}
	
	
}
