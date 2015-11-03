package pt.api.player.massfreeze;

import java.util.List;

import pt.api.bean.RequestBase;

public class PlayerMassFreezeRequest extends RequestBase{
	private String isFreeze;
	private String depositowner;
	private String isWithdraw;
	private List<PlayerMassFreezeParam> params;
	
	public String getIsFreeze() {
		return isFreeze;
	}
	public void setIsFreeze(String isFreeze) {
		this.isFreeze = isFreeze;
	}
	public String getDepositowner() {
		return depositowner;
	}
	public void setDepositowner(String depositowner) {
		this.depositowner = depositowner;
	}
	public String getIsWithdraw() {
		return isWithdraw;
	}
	public void setIsWithdraw(String isWithdraw) {
		this.isWithdraw = isWithdraw;
	}
	public List<PlayerMassFreezeParam> getParams() {
		return params;
	}
	public void setParams(List<PlayerMassFreezeParam> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "PlayerMassFreezeRequest [isFreeze=" + isFreeze
				+ ", depositowner=" + depositowner + ", isWithdraw="
				+ isWithdraw + ", params=" + params + "]";
	}
}
