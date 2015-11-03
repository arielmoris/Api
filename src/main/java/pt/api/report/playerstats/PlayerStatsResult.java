package pt.api.report.playerstats;

public class PlayerStatsResult {
	
	private String PLAYERNAME;
	private String CODE;
	private String KIOSKNAME;
	private String ENTITYNAME;
	private String ENTITYCODE;
	private String CLIENTPLATFORM;
	private String STATSDATE;
	private String CURRENCYCODE;
	private String ACTIVEPLAYERS;
	private String BALANCECHANGE;
	private String DEPOSITS;
	private String WITHDRAWS;
	private String COMPENSATION;
	private String BONUSES;
	private String COMPS;
	private String PROGRESSIVEBETS;
	private String PROGRESSIVEWINS;
	private String BETS;
	private String WINS;
	private String NETLOSS;
	private String NETPURCHASE;
	private String NETGAMING;
	private String HOUSEEARNINGS;
	private String RNUM;
	
	
	public PlayerStatsResult() {
		super();
		PLAYERNAME = new String();
		CODE = new String();
		KIOSKNAME = new String();
		ENTITYNAME = new String();
		ENTITYCODE = new String();
		CLIENTPLATFORM = new String();
		STATSDATE = new String();
		CURRENCYCODE = new String();
		ACTIVEPLAYERS = new String();
		BALANCECHANGE = new String();
		DEPOSITS = new String();
		WITHDRAWS = new String();
		COMPENSATION = new String();
		BONUSES = new String();
		COMPS = new String();
		PROGRESSIVEBETS = new String();
		PROGRESSIVEWINS = new String();
		BETS = new String();
		WINS = new String();
		NETLOSS = new String();
		NETPURCHASE = new String();
		NETGAMING = new String();
		HOUSEEARNINGS = new String();
		RNUM = new String();
	}
	
	public String getPLAYERNAME() {
		return PLAYERNAME;
	}
	public void setPLAYERNAME(String pLAYERNAME) {
		PLAYERNAME = pLAYERNAME;
	}
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getKIOSKNAME() {
		return KIOSKNAME;
	}
	public void setKIOSKNAME(String kIOSKNAME) {
		KIOSKNAME = kIOSKNAME;
	}
	public String getENTITYNAME() {
		return ENTITYNAME;
	}
	public void setENTITYNAME(String eNTITYNAME) {
		ENTITYNAME = eNTITYNAME;
	}
	public String getENTITYCODE() {
		return ENTITYCODE;
	}
	public void setENTITYCODE(String eNTITYCODE) {
		ENTITYCODE = eNTITYCODE;
	}
	public String getCLIENTPLATFORM() {
		return CLIENTPLATFORM;
	}
	public void setCLIENTPLATFORM(String cLIENTPLATFORM) {
		CLIENTPLATFORM = cLIENTPLATFORM;
	}
	public String getSTATSDATE() {
		return STATSDATE;
	}
	public void setSTATSDATE(String sTATSDATE) {
		STATSDATE = sTATSDATE;
	}
	public String getCURRENCYCODE() {
		return CURRENCYCODE;
	}
	public void setCURRENCYCODE(String cURRENCYCODE) {
		CURRENCYCODE = cURRENCYCODE;
	}
	public String getACTIVEPLAYERS() {
		return ACTIVEPLAYERS;
	}
	public void setACTIVEPLAYERS(String aCTIVEPLAYERS) {
		ACTIVEPLAYERS = aCTIVEPLAYERS;
	}
	public String getBALANCECHANGE() {
		return BALANCECHANGE;
	}
	public void setBALANCECHANGE(String bALANCECHANGE) {
		BALANCECHANGE = bALANCECHANGE;
	}
	public String getDEPOSITS() {
		return DEPOSITS;
	}
	public void setDEPOSITS(String dEPOSITS) {
		DEPOSITS = dEPOSITS;
	}
	public String getWITHDRAWS() {
		return WITHDRAWS;
	}
	public void setWITHDRAWS(String wITHDRAWS) {
		WITHDRAWS = wITHDRAWS;
	}
	public String getCOMPENSATION() {
		return COMPENSATION;
	}
	public void setCOMPENSATION(String cOMPENSATION) {
		COMPENSATION = cOMPENSATION;
	}
	public String getBONUSES() {
		return BONUSES;
	}
	public void setBONUSES(String bONUSES) {
		BONUSES = bONUSES;
	}
	public String getCOMPS() {
		return COMPS;
	}
	public void setCOMPS(String cOMPS) {
		COMPS = cOMPS;
	}
	public String getPROGRESSIVEBETS() {
		return PROGRESSIVEBETS;
	}
	public void setPROGRESSIVEBETS(String pROGRESSIVEBETS) {
		PROGRESSIVEBETS = pROGRESSIVEBETS;
	}
	public String getPROGRESSIVEWINS() {
		return PROGRESSIVEWINS;
	}
	public void setPROGRESSIVEWINS(String pROGRESSIVEWINS) {
		PROGRESSIVEWINS = pROGRESSIVEWINS;
	}
	public String getBETS() {
		return BETS;
	}
	public void setBETS(String bETS) {
		BETS = bETS;
	}
	public String getWINS() {
		return WINS;
	}
	public void setWINS(String wINS) {
		WINS = wINS;
	}
	public String getNETLOSS() {
		return NETLOSS;
	}
	public void setNETLOSS(String nETLOSS) {
		NETLOSS = nETLOSS;
	}
	public String getNETPURCHASE() {
		return NETPURCHASE;
	}
	public void setNETPURCHASE(String nETPURCHASE) {
		NETPURCHASE = nETPURCHASE;
	}
	public String getNETGAMING() {
		return NETGAMING;
	}
	public void setNETGAMING(String nETGAMING) {
		NETGAMING = nETGAMING;
	}
	public String getHOUSEEARNINGS() {
		return HOUSEEARNINGS;
	}
	public void setHOUSEEARNINGS(String hOUSEEARNINGS) {
		HOUSEEARNINGS = hOUSEEARNINGS;
	}
	public String getRNUM() {
		return RNUM;
	}
	public void setRNUM(String rNUM) {
		RNUM = rNUM;
	}
	@Override
	public String toString() {
		return "PlayerStatsResult [PLAYERNAME=" + PLAYERNAME + ", CODE=" + CODE
				+ ", KIOSKNAME=" + KIOSKNAME + ", ENTITYNAME=" + ENTITYNAME
				+ ", ENTITYCODE=" + ENTITYCODE + ", CLIENTPLATFORM="
				+ CLIENTPLATFORM + ", STATSDATE=" + STATSDATE
				+ ", CURRENCYCODE=" + CURRENCYCODE + ", ACTIVEPLAYERS="
				+ ACTIVEPLAYERS + ", BALANCECHANGE=" + BALANCECHANGE
				+ ", DEPOSITS=" + DEPOSITS + ", WITHDRAWS=" + WITHDRAWS
				+ ", COMPENSATION=" + COMPENSATION + ", BONUSES=" + BONUSES
				+ ", COMPS=" + COMPS + ", PROGRESSIVEBETS=" + PROGRESSIVEBETS
				+ ", PROGRESSIVEWINS=" + PROGRESSIVEWINS + ", BETS=" + BETS
				+ ", WINS=" + WINS + ", NETLOSS=" + NETLOSS + ", NETPURCHASE="
				+ NETPURCHASE + ", NETGAMING=" + NETGAMING + ", HOUSEEARNINGS="
				+ HOUSEEARNINGS + ", RNUM=" + RNUM + "]";
	}
}
