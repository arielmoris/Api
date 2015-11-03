package pt.api.player.masscreate;

import java.util.List;

import pt.api.bean.RequestBase;

public class PlayerMassCreateRequest extends RequestBase{
	private String depositowner;
	private List<PlayerMassCreateParam> params;
	public String getDepositowner() {
		return depositowner;
	}
	public void setDepositowner(String depositowner) {
		this.depositowner = depositowner;
	}
	public List<PlayerMassCreateParam> getParams() {
		return params;
	}
	public void setParams(List<PlayerMassCreateParam> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "PlayerMassCreateRequest [depositowner=" + depositowner
				+ ", params=" + params + "]";
	}
	
	
}
