package pt.api.report.playertransactions;

public class PlayerTransactionsResult {
	
	private String KIOSKNAME;
	private String ADMINNAME;
	private String PLAYERNAME;
	private String BRAND;
	private String TRANSACTIONTIME;
	private String AMOUNT;
	private String TYPE;
	private String REMOTEIP;
	private String RNUM;
	
	public PlayerTransactionsResult() {
		super();
		KIOSKNAME = new String();
		ADMINNAME = new String();
		PLAYERNAME = new String();
		BRAND = new String();
		TRANSACTIONTIME = new String();
		AMOUNT = new String();
		TYPE = new String();
		REMOTEIP = new String();
		RNUM = new String();
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
	public String getPLAYERNAME() {
		return PLAYERNAME;
	}
	public void setPLAYERNAME(String pLAYERNAME) {
		PLAYERNAME = pLAYERNAME;
	}
	public String getBRAND() {
		return BRAND;
	}
	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}
	public String getTRANSACTIONTIME() {
		return TRANSACTIONTIME;
	}
	public void setTRANSACTIONTIME(String tRANSACTIONTIME) {
		TRANSACTIONTIME = tRANSACTIONTIME;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getREMOTEIP() {
		return REMOTEIP;
	}
	public void setREMOTEIP(String rEMOTEIP) {
		REMOTEIP = rEMOTEIP;
	}
	public String getRNUM() {
		return RNUM;
	}
	public void setRNUM(String rNUM) {
		RNUM = rNUM;
	}
	@Override
	public String toString() {
		return "PlayerTransactionsResult [KIOSKNAME=" + KIOSKNAME
				+ ", ADMINNAME=" + ADMINNAME + ", PLAYERNAME=" + PLAYERNAME
				+ ", BRAND=" + BRAND + ", TRANSACTIONTIME=" + TRANSACTIONTIME
				+ ", AMOUNT=" + AMOUNT + ", TYPE=" + TYPE + ", REMOTEIP="
				+ REMOTEIP + ", RNUM=" + RNUM + "]";
	}
	
	
}
