package pt.api.report.playerstats;

import pt.api.bean.RequestBase;

public class PlayerStatsRequest extends RequestBase{
	private String timeperiod;
	private String startdate;
	private String enddate;
	private String playername;
	private String adminname;
	private String kioskname;
	private String entityname;
	private String platform;
	private String reportby;
	private String reportbycustomfield;
	private String customfieldname;
	private String customfieldvalue;
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
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		if(playername != null)
			this.playername = playername;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getKioskname() {
		return kioskname;
	}
	public void setKioskname(String kioskname) {
		this.kioskname = kioskname;
	}
	public String getEntityname() {
		return entityname;
	}
	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getReportby() {
		return reportby;
	}
	public void setReportby(String reportby) {
		this.reportby = reportby;
	}
	public String getReportbycustomfield() {
		return reportbycustomfield;
	}
	public void setReportbycustomfield(String reportbycustomfield) {
		this.reportbycustomfield = reportbycustomfield;
	}
	public String getCustomfieldname() {
		return customfieldname;
	}
	public void setCustomfieldname(String customfieldname) {
		this.customfieldname = customfieldname;
	}
	public String getCustomfieldvalue() {
		return customfieldvalue;
	}
	public void setCustomfieldvalue(String customfieldvalue) {
		this.customfieldvalue = customfieldvalue;
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
		return "PlayerStatsRequest [timeperiod=" + timeperiod + ", startdate="
				+ startdate + ", enddate=" + enddate + ", playername="
				+ playername + ", adminname=" + adminname + ", kioskname="
				+ kioskname + ", entityname=" + entityname + ", platform="
				+ platform + ", reportby=" + reportby
				+ ", reportbycustomfield=" + reportbycustomfield
				+ ", customfieldname=" + customfieldname
				+ ", customfieldvalue=" + customfieldvalue
				+ ", includehourdata=" + includehourdata + ", currency="
				+ currency + ", page=" + page + ", perPage=" + perPage + "]";
	}
	
	
}
