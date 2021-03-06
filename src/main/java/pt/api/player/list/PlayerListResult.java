package pt.api.player.list;

import java.math.BigDecimal;

public class PlayerListResult {
	
	
	public PlayerListResult() {
		super();
		PLAYERNAME = new String();
		SIGNUPDATE = new String();
		VIPLEVEL = new Integer(0);
		KIOSKNAME = new String();
		ADMINNAME = new String();
		FROZEN = new Integer(0);
		LASTLOGINDATE = new String();
		BALANCE = new BigDecimal(0);
		BONUSBALANCE = new BigDecimal(0);
		IP = new String();
	}
	
	private String PLAYERNAME;
	private String SIGNUPDATE;
	private Integer VIPLEVEL;
	private String KIOSKNAME;
	private String ADMINNAME;
	private Integer FROZEN;
	private String LASTLOGINDATE;
	private BigDecimal BALANCE;
	private BigDecimal BONUSBALANCE;
	private String IP;
	public String getPLAYERNAME() {
		return PLAYERNAME;
	}
	public void setPLAYERNAME(String pLAYERNAME) {
		PLAYERNAME = pLAYERNAME;
	}
	public String getSIGNUPDATE() {
		return SIGNUPDATE;
	}
	public void setSIGNUPDATE(String sIGNUPDATE) {
		SIGNUPDATE = sIGNUPDATE;
	}
	public Integer getVIPLEVEL() {
		return VIPLEVEL;
	}
	public void setVIPLEVEL(Integer vIPLEVEL) {
		VIPLEVEL = vIPLEVEL;
	}
	public String getKIOSKNAME() {
		return KIOSKNAME;
	}
	public void setKIOSKNAME(String kIOSKNAME) {
		KIOSKNAME = kIOSKNAME;
	}
	public String getADMINNAME() {
		return ADMINNAME;
	}
	public void setADMINNAME(String aDMINNAME) {
		ADMINNAME = aDMINNAME;
	}
	public Integer getFROZEN() {
		return FROZEN;
	}
	public void setFROZEN(Integer fROZEN) {
		FROZEN = fROZEN;
	}
	public String getLASTLOGINDATE() {
		return LASTLOGINDATE;
	}
	public void setLASTLOGINDATE(String lASTLOGINDATE) {
		LASTLOGINDATE = lASTLOGINDATE;
	}
	public BigDecimal getBALANCE() {
		return BALANCE;
	}
	public void setBALANCE(BigDecimal bALANCE) {
		BALANCE = bALANCE;
	}
	public BigDecimal getBONUSBALANCE() {
		return BONUSBALANCE;
	}
	public void setBONUSBALANCE(BigDecimal bONUSBALANCE) {
		BONUSBALANCE = bONUSBALANCE;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	@Override
	public String toString() {
		return "PlayerListResult [PLAYERNAME=" + PLAYERNAME + ", SIGNUPDATE="
				+ SIGNUPDATE + ", VIPLEVEL=" + VIPLEVEL + ", KIOSKNAME="
				+ KIOSKNAME + ", ADMINNAME=" + ADMINNAME + ", FROZEN=" + FROZEN
				+ ", LASTLOGINDATE=" + LASTLOGINDATE + ", BALANCE=" + BALANCE
				+ ", BONUSBALANCE=" + BONUSBALANCE + ", IP=" + IP + "]";
	}
	
}
