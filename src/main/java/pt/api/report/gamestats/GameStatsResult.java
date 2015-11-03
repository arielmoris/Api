package pt.api.report.gamestats;

public class GameStatsResult {
	private String GAMENAME;
	private String GAME;
	private String GAMETYPE;
	
	private String VIP_LEVEL;
	
	private String KIOSKNAME;
	
	private String PLAYERNAME;
	private String FULLNAME;
	private String VIPLEVEL;
	private String COUNTRY;
	
	private String CLIENTPLATFORM;
	
	private String DAILY;
	private String MONTHLY;
	private String PLAYERS;
	private String GAMES;
	private String CURRENCYCODE;
	
	private String REALMONEYBETS;
	private String REALMONEYWINS;
	private String BETS;
	private String WINS;
	private String INCOME;
	private String JACKPOTBETS;
	private String JACKPOTWINS;
	private String TOTALLIVEGAMETIPS;
	private String RNUM;
	
	public GameStatsResult() {
		super();
		GAMENAME= new String("");
		PLAYERS = new String("0");
		GAMES = new String("0");
		REALMONEYBETS = new String("0");
		REALMONEYWINS = new String("0");
		BETS = new String("0");
		WINS = new String("0");
		INCOME = new String("0");
		JACKPOTBETS = new String("0");
		JACKPOTWINS = new String("0");
		TOTALLIVEGAMETIPS = new String("0");
		RNUM = new String("0");
	}


	public String getGAME() {
		return GAME;
	}


	public void setGAME(String gAME) {
		GAME = gAME;
	}


	public String getGAMETYPE() {
		return GAMETYPE;
	}


	public void setGAMETYPE(String gAMETYPE) {
		GAMETYPE = gAMETYPE;
	}


	public String getVIP_LEVEL() {
		return VIP_LEVEL;
	}


	public void setVIP_LEVEL(String vIP_LEVEL) {
		VIP_LEVEL = vIP_LEVEL;
	}


	public String getKIOSKNAME() {
		return KIOSKNAME;
	}


	public void setKIOSKNAME(String kIOSKNAME) {
		KIOSKNAME = kIOSKNAME;
	}


	public String getPLAYERNAME() {
		return PLAYERNAME;
	}


	public void setPLAYERNAME(String pLAYERNAME) {
		PLAYERNAME = pLAYERNAME;
	}


	public String getFULLNAME() {
		return FULLNAME;
	}


	public void setFULLNAME(String fULLNAME) {
		FULLNAME = fULLNAME;
	}


	public String getVIPLEVEL() {
		return VIPLEVEL;
	}


	public void setVIPLEVEL(String vIPLEVEL) {
		VIPLEVEL = vIPLEVEL;
	}


	public String getCOUNTRY() {
		return COUNTRY;
	}


	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}


	public String getCLIENTPLATFORM() {
		return CLIENTPLATFORM;
	}


	public void setCLIENTPLATFORM(String cLIENTPLATFORM) {
		CLIENTPLATFORM = cLIENTPLATFORM;
	}


	public String getDAILY() {
		return DAILY;
	}


	public void setDAILY(String dAILY) {
		DAILY = dAILY;
	}
	
	
	public String getMONTHLY() {
		return MONTHLY;
	}


	public void setMONTHLY(String mONTHLY) {
		MONTHLY = mONTHLY;
	}


	public String getPLAYERS() {
		return PLAYERS;
	}


	public void setPLAYERS(String pLAYERS) {
		PLAYERS = pLAYERS;
	}


	public String getGAMES() {
		return GAMES;
	}


	public void setGAMES(String gAMES) {
		GAMES = gAMES;
	}


	public String getCURRENCYCODE() {
		return CURRENCYCODE;
	}


	public void setCURRENCYCODE(String cURRENCYCODE) {
		CURRENCYCODE = cURRENCYCODE;
	}


	public String getREALMONEYBETS() {
		return REALMONEYBETS;
	}


	public void setREALMONEYBETS(String rEALMONEYBETS) {
		REALMONEYBETS = rEALMONEYBETS;
	}


	public String getREALMONEYWINS() {
		return REALMONEYWINS;
	}


	public void setREALMONEYWINS(String rEALMONEYWINS) {
		REALMONEYWINS = rEALMONEYWINS;
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


	public String getINCOME() {
		return INCOME;
	}


	public void setINCOME(String iNCOME) {
		INCOME = iNCOME;
	}


	public String getJACKPOTBETS() {
		return JACKPOTBETS;
	}


	public void setJACKPOTBETS(String jACKPOTBETS) {
		JACKPOTBETS = jACKPOTBETS;
	}

	public String getJACKPOTWINS() {
		return JACKPOTWINS;
	}


	public void setJACKPOTWINS(String jACKPOTWINS) {
		JACKPOTWINS = jACKPOTWINS;
	}


	public String getTOTALLIVEGAMETIPS() {
		return TOTALLIVEGAMETIPS;
	}


	public void setTOTALLIVEGAMETIPS(String tOTALLIVEGAMETIPS) {
		TOTALLIVEGAMETIPS = tOTALLIVEGAMETIPS;
	}


	public String getRNUM() {
		return RNUM;
	}
	public void setRNUM(String rNUM) {
		RNUM = rNUM;
	}
	
	

	public String getGAMENAME() {
		return GAMENAME;
	}


	public void setGAMENAME(String gAMENAME) {
		GAMENAME = gAMENAME;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GameStatsResult [GAMENAME=").append(GAMENAME)
				.append(", GAME=").append(GAME).append(", GAMETYPE=")
				.append(GAMETYPE).append(", VIP_LEVEL=").append(VIP_LEVEL)
				.append(", KIOSKNAME=").append(KIOSKNAME)
				.append(", PLAYERNAME=").append(PLAYERNAME)
				.append(", FULLNAME=").append(FULLNAME).append(", VIPLEVEL=")
				.append(VIPLEVEL).append(", COUNTRY=").append(COUNTRY)
				.append(", CLIENTPLATFORM=").append(CLIENTPLATFORM)
				.append(", DAILY=").append(DAILY).append(", MONTHLY=")
				.append(MONTHLY).append(", PLAYERS=").append(PLAYERS)
				.append(", GAMES=").append(GAMES).append(", CURRENCYCODE=")
				.append(CURRENCYCODE).append(", REALMONEYBETS=")
				.append(REALMONEYBETS).append(", REALMONEYWINS=")
				.append(REALMONEYWINS).append(", BETS=").append(BETS)
				.append(", WINS=").append(WINS).append(", INCOME=")
				.append(INCOME).append(", JACKPOTBETS=").append(JACKPOTBETS)
				.append(", JACKPOTWINS=").append(JACKPOTWINS)
				.append(", TOTALLIVEGAMETIPS=").append(TOTALLIVEGAMETIPS)
				.append(", RNUM=").append(RNUM).append("]");
		return builder.toString();
	}

}
