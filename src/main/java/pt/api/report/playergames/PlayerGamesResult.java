package pt.api.report.playergames;

public class PlayerGamesResult {
	private String PLAYERNAME;
	private String WINDOWCODE;
	private String GAMEID;
	private String GAMECODE;
	private String GAMETYPE;
	private String GAMENAME;
	private String SESSIONID;
	private String BET;
	private String WIN;
	private String PROGRESSIVEBET;
	private String PROGRESSIVEWIN;
	private String BALANCE;
	private String CURRENTBET;
	private String GAMEDATE;
	private String LIVENETWORK;
	private String INFO;
	private Integer RNUM;
	
	
	public PlayerGamesResult() {
		super();
		PLAYERNAME = new String();
		WINDOWCODE = new String();
		GAMEID = new String();
		GAMECODE = new String();
		GAMETYPE = new String();
		GAMENAME = new String();
		SESSIONID = new String();
		BET = new String();
		WIN = new String();
		PROGRESSIVEBET = new String();
		PROGRESSIVEWIN = new String();
		BALANCE = new String();
		CURRENTBET = new String();
		GAMEDATE = new String();
		LIVENETWORK = new String();
		INFO = new String();
		RNUM = new Integer(0);
	}
	
	public String getPLAYERNAME() {
		return PLAYERNAME;
	}
	public void setPLAYERNAME(String pLAYERNAME) {
		PLAYERNAME = pLAYERNAME;
	}
	public String getWINDOWCODE() {
		return WINDOWCODE;
	}
	public void setWINDOWCODE(String wINDOWCODE) {
		WINDOWCODE = wINDOWCODE;
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
	public String getGAMETYPE() {
		return GAMETYPE;
	}
	public void setGAMETYPE(String gAMETYPE) {
		GAMETYPE = gAMETYPE;
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
	public String getPROGRESSIVEWIN() {
		return PROGRESSIVEWIN;
	}
	public void setPROGRESSIVEWIN(String pROGRESSIVEWIN) {
		PROGRESSIVEWIN = pROGRESSIVEWIN;
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
	public String getLIVENETWORK() {
		return LIVENETWORK;
	}
	public void setLIVENETWORK(String lIVENETWORK) {
		LIVENETWORK = lIVENETWORK;
	}
	
	public String getINFO() {
		return INFO;
	}

	public void setINFO(String iNFO) {
		INFO = iNFO;
	}

	public Integer getRNUM() {
		return RNUM;
	}
	
	public void setRNUM(Integer rNUM) {
		RNUM = rNUM;
	}

	@Override
	public String toString() {
		return "PlayerGamesResult [PLAYERNAME=" + PLAYERNAME + ", WINDOWCODE="
				+ WINDOWCODE + ", GAMEID=" + GAMEID + ", GAMECODE=" + GAMECODE
				+ ", GAMETYPE=" + GAMETYPE + ", GAMENAME=" + GAMENAME
				+ ", SESSIONID=" + SESSIONID + ", BET=" + BET + ", WIN=" + WIN
				+ ", PROGRESSIVEBET=" + PROGRESSIVEBET + ", PROGRESSIVEWIN="
				+ PROGRESSIVEWIN + ", BALANCE=" + BALANCE + ", CURRENTBET="
				+ CURRENTBET + ", GAMEDATE=" + GAMEDATE + ", LIVENETWORK="
				+ LIVENETWORK + ", INFO=" + INFO + ", RNUM=" + RNUM + "]";
	}
	
}
