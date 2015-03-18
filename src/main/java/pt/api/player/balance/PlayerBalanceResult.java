package pt.api.player.balance;

public class PlayerBalanceResult {
	private String playername;
	private Integer bonusbalance;
	private Integer balance;
	private String currencycode;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Integer getBonusbalance() {
		return bonusbalance;
	}
	public void setBonusbalance(Integer bonusbalance) {
		this.bonusbalance = bonusbalance;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
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
