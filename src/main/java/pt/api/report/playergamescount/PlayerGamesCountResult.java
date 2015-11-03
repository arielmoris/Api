package pt.api.report.playergamescount;

public class PlayerGamesCountResult {
	private String PLAYERNAME;
	private String WINDOWID;
	private String GAMEID;
	private String GAMECODE;
	private String GAMENAME;
	private String SESSIONID;
	private String BET;
	private String WIN;
	private String PROGRESSIVEBET;
	private String ASPROGRESSIVEWIN;
	private String BALANCE;
	private String CURRENTBET;
	private String GAMEDATE;
	private String INFO;
	private String LIVENETWORK;
	private Integer RNUM;
	
	
	public PlayerGamesCountResult() {
		super();
		PLAYERNAME = new String();
		WINDOWID = new String();
		GAMEID = new String();
		GAMECODE = new String();
		GAMENAME = new String();
		SESSIONID = new String();
		BET = new String();
		WIN = new String();
		PROGRESSIVEBET = new String();
		ASPROGRESSIVEWIN = new String();
		BALANCE = new String();
		CURRENTBET = new String();
		GAMEDATE = new String();
		INFO = new String();
		LIVENETWORK = new String();
		RNUM = new Integer(0);
	}
	
	public String getPLAYERNAME() {
		return PLAYERNAME;
	}
	public void setPLAYERNAME(String pLAYERNAME) {
		PLAYERNAME = pLAYERNAME;
	}
	public String getWINDOWID() {
		return WINDOWID;
	}
	public void setWINDOWID(String wINDOWID) {
		WINDOWID = wINDOWID;
	}
	public String getGAMEID() {
		return GAMEID;
	}
	public void setGAMEID(String gAMEID) {
		GAMEID = gAMEID;
	}
	public String getGAMECODE() {
		return GAMECODE;
	}
	public void setGAMECODE(String gAMECODE) {
		GAMECODE = gAMECODE;
	}
	public String getGAMENAME() {
		return GAMENAME;
	}
	public void setGAMENAME(String gAMENAME) {
		GAMENAME = gAMENAME;
	}
	public String getSESSIONID() {
		return SESSIONID;
	}
	public void setSESSIONID(String sESSIONID) {
		SESSIONID = sESSIONID;
	}
	public String getBET() {
		return BET;
	}
	public void setBET(String bET) {
		BET = bET;
	}
	public String getWIN() {
		return WIN;
	}
	public void setWIN(String wIN) {
		WIN = wIN;
	}
	public String getPROGRESSIVEBET() {
		return PROGRESSIVEBET;
	}
	public void setPROGRESSIVEBET(String pROGRESSIVEBET) {
		PROGRESSIVEBET = pROGRESSIVEBET;
	}
	public String getASPROGRESSIVEWIN() {
		return ASPROGRESSIVEWIN;
	}
	public void setASPROGRESSIVEWIN(String aSPROGRESSIVEWIN) {
		ASPROGRESSIVEWIN = aSPROGRESSIVEWIN;
	}
	public String getBALANCE() {
		return BALANCE;
	}
	public void setBALANCE(String bALANCE) {
		BALANCE = bALANCE;
	}
	public String getCURRENTBET() {
		return CURRENTBET;
	}
	public void setCURRENTBET(String cURRENTBET) {
		CURRENTBET = cURRENTBET;
	}
	public String getGAMEDATE() {
		return GAMEDATE;
	}
	public void setGAMEDATE(String gAMEDATE) {
		GAMEDATE = gAMEDATE;
	}
	public String getINFO() {
		return INFO;
	}
	public void setINFO(String iNFO) {
		INFO = iNFO;
	}
	public String getLIVENETWORK() {
		return LIVENETWORK;
	}
	public void setLIVENETWORK(String lIVENETWORK) {
		LIVENETWORK = lIVENETWORK;
	}
	public Integer getRNUM() {
		return RNUM;
	}
	public void setRNUM(Integer rNUM) {
		RNUM = rNUM;
	}
	@Override
	public String toString() {
		return "PlayerGamesCountResult [PLAYERNAME=" + PLAYERNAME
				+ ", WINDOWID=" + WINDOWID + ", GAMEID=" + GAMEID
				+ ", GAMECODE=" + GAMECODE + ", GAMENAME=" + GAMENAME
				+ ", SESSIONID=" + SESSIONID + ", BET=" + BET + ", WIN=" + WIN
				+ ", PROGRESSIVEBET=" + PROGRESSIVEBET + ", ASPROGRESSIVEWIN="
				+ ASPROGRESSIVEWIN + ", BALANCE=" + BALANCE + ", CURRENTBET="
				+ CURRENTBET + ", GAMEDATE=" + GAMEDATE + ", INFO=" + INFO
				+ ", LIVENETWORK=" + LIVENETWORK + ", RNUM=" + RNUM + "]";
	}
	
}
