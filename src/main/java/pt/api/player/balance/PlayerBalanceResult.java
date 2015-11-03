package pt.api.player.balance;

import java.math.BigDecimal;

public class PlayerBalanceResult {
	private String playername;
	private BigDecimal bonusbalance;
	private BigDecimal balance;
	private String currencycode;
	
	public PlayerBalanceResult() {
		playername = new String();
		bonusbalance = new BigDecimal(0);
		balance = new BigDecimal(0);
		currencycode = new String();
	}
	
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public BigDecimal getBonusbalance() {
		return bonusbalance;
	}
	public void setBonusbalance(BigDecimal bonusbalance) {
		this.bonusbalance = bonusbalance;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	@Override
	public String toString() {
		return "Result [playername=" + playername + ", bonusbalance="
				+ bonusbalance + ", balance=" + balance + ", currencycode="
				+ currencycode + "]";
	}
	
	
}
