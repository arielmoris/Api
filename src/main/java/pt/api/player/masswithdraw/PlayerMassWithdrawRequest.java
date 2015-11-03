package pt.api.player.masswithdraw;

import java.util.List;

import pt.api.bean.RequestBase;

public class PlayerMassWithdrawRequest extends RequestBase{
	private String depositowner;
	private List<PlayerMassWithdrawParam> params;
	public String getDepositowner() {
		return depositowner;
	}
	public void setDepositowner(String depositowner) {
		this.depositowner = depositowner;
	}
	public List<PlayerMassWithdrawParam> getParams() {
		return params;
	}
	public void setParams(List<PlayerMassWithdrawParam> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "PlayerMassWithdrawRequest [depositowner=" + depositowner
				+ ", params=" + params + "]";
	}
	
}
