package pt.api.report.gamestats;

import pt.api.bean.RequestBase;

public class GameStatsRequest extends RequestBase{
	
	private String timeperiod;
	private String startdate;
	private String enddate;
	private String gametype;
	private String playername;
	private String viplevel;
	private String gametypesearch;
	private String gamename;
	private String gamecode;
	private String kioskname;
	private String maxbet;
	private String minbet;
	private String livenetwork;
	private String maxwin;
	private String minwin;
	private String clientplatform;
	private String showjackpot;
	private String showrealmoney;
	private String showlivegamestip;
	private String reportby;
	private String sortby;
	private Integer sortorder;
	private String includehourdata;
	private String currency;
	private Integer page;
	private Integer perPage;
	
	public String getTimeperiod() {
		return timeperiod;
	}
	public void setTimeperiod(String timeperiod) {
		this.timeperiod = timeperiod;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getGametype() {
		return gametype;
	}
	public void setGametype(String gametype) {
		this.gametype = gametype;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		if(playername != null)
			this.playername = playername.toUpperCase();
	}
	public String getViplevel() {
		return viplevel;
	}
	public void setViplevel(String viplevel) {
		this.viplevel = viplevel;
	}
	public String getGametypesearch() {
		return gametypesearch;
	}
	public void setGametypesearch(String gametypesearch) {
		this.gametypesearch = gametypesearch;
	}
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	public String getGamecode() {
		return gamecode;
	}
	public void setGamecode(String gamecode) {
		this.gamecode = gamecode;
	}
	public String getKioskname() {
		return kioskname;
	}
	public void setKioskname(String kioskname) {
		this.kioskname = kioskname;
	}
	public String getMaxbet() {
		return maxbet;
	}
	public void setMaxbet(String maxbet) {
		this.maxbet = maxbet;
	}
	public String getMinbet() {
		return minbet;
	}
	public void setMinbet(String minbet) {
		this.minbet = minbet;
	}
	public String getLivenetwork() {
		return livenetwork;
	}
	public void setLivenetwork(String livenetwork) {
		this.livenetwork = livenetwork;
	}
	public String getMaxwin() {
		return maxwin;
	}
	public void setMaxwin(String maxwin) {
		this.maxwin = maxwin;
	}
	public String getMinwin() {
		return minwin;
	}
	public void setMinwin(String minwin) {
		this.minwin = minwin;
	}
	public String getClientplatform() {
		return clientplatform;
	}
	public void setClientplatform(String clientplatform) {
		this.clientplatform = clientplatform;
	}
	public String getShowjackpot() {
		return showjackpot;
	}
	public void setShowjackpot(String showjackpot) {
		this.showjackpot = showjackpot;
	}
	public String getShowrealmoney() {
		return showrealmoney;
	}
	public void setShowrealmoney(String showrealmoney) {
		this.showrealmoney = showrealmoney;
	}
	public String getShowlivegamestip() {
		return showlivegamestip;
	}
	public void setShowlivegamestip(String showlivegamestip) {
		this.showlivegamestip = showlivegamestip;
	}
	public String getReportby() {
		return reportby;
	}
	public void setReportby(String reportby) {
		this.reportby = reportby;
	}
	public String getSortby() {
		return sortby;
	}
	public void setSortby(String sortby) {
		this.sortby = sortby;
	}
	public Integer getSortorder() {
		return sortorder;
	}
	public void setSortorder(Integer sortorder) {
		this.sortorder = sortorder;
	}
	public String getIncludehourdata() {
		return includehourdata;
	}
	public void setIncludehourdata(String includehourdata) {
		this.includehourdata = includehourdata;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPerPage() {
		return perPage;
	}
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
	@Override
	public String toString() {
		return "GameStatsRequest [timeperiod=" + timeperiod + ", startdate="
				+ startdate + ", enddate=" + enddate + ", gametype=" + gametype
				+ ", playername=" + playername + ", viplevel=" + viplevel
				+ ", gametypesearch=" + gametypesearch + ", gamename="
				+ gamename + ", gamecode=" + gamecode + ", kioskname="
				+ kioskname + ", maxbet=" + maxbet + ", minbet=" + minbet
				+ ", livenetwork=" + livenetwork + ", maxwin=" + maxwin
				+ ", minwin=" + minwin + ", clientplatform=" + clientplatform
				+ ", showjackpot=" + showjackpot + ", showrealmoney="
				+ showrealmoney + ", showlivegamestip=" + showlivegamestip
				+ ", reportby=" + reportby + ", sortby=" + sortby
				+ ", sortorder=" + sortorder + ", includehourdata="
				+ includehourdata + ", currency=" + currency + ", page=" + page
				+ ", perPage=" + perPage + "]";
	}
	
}
