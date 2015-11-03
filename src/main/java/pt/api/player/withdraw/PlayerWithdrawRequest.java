package pt.api.player.withdraw;

import java.math.BigDecimal;

import pt.api.bean.RequestBase;

public class PlayerWithdrawRequest extends RequestBase{
	private String playername;
	private BigDecimal amount;
	private String adminname;
	private String isForce;
	private String externaltranid;
	private Boolean losebonus;
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
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getIsForce() {
		return isForce;
	}
	public void setIsForce(String isForce) {
		this.isForce = isForce;
	}
	public String getExternaltranid() {
		return externaltranid;
	}
	public void setExternaltranid(String externaltranid) {
		this.externaltranid = externaltranid;
	}
	public Boolean getLosebonus() {
		return losebonus;
	}
	public void setLosebonus(Boolean losebonus) {
		this.losebonus = losebonus;
	}
	@Override
	public String toString() {
		return "PlayerWithdrawRequest [playername=" + playername + ", amount="
				+ amount + ", adminname=" + adminname + ", isForce=" + isForce
				+ ", externaltranid=" + externaltranid + ", losebonus="
				+ losebonus + "]";
	}
	
	
}
