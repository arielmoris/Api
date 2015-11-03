package pt.api.report.playergames;

import pt.api.bean.RequestBase;

public class PlayerGamesRequest extends RequestBase{
	
	private String timeperiod;
	private String startdate;
	private String enddate;
	private String playername;
	private String frozen;
	private String showinfo;
	private String gametype;
	private String excludezero;
	private String sortby;
	private Integer sortorder;
	private Integer page;
	private Integer perPage;
	
	public String getExcludezero() {
		return excludezero;
	}
	public void setExcludezero(String excludezero) {
		this.excludezero = excludezero;
	}
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
	public String getFrozen() {
		return frozen;
	}
	public void setFrozen(String frozen) {
		this.frozen = frozen;
	}
	public String getShowinfo() {
		return showinfo;
	}
	public void setShowinfo(String showinfo) {
		this.showinfo = showinfo;
	}
	public String getGametype() {
		return gametype;
	}
	public void setGametype(String gametype) {
		this.gametype = gametype;
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
		StringBuilder builder = new StringBuilder();
		builder.append("PlayerGamesRequest [timeperiod=").append(timeperiod)
				.append(", startdate=").append(startdate).append(", enddate=")
				.append(enddate).append(", playername=").append(playername)
				.append(", frozen=").append(frozen).append(", showinfo=")
				.append(showinfo).append(", gametype=").append(gametype)
				.append(", excludezero=").append(excludezero)
				.append(", sortby=").append(sortby).append(", sortorder=")
				.append(sortorder).append(", page=").append(page)
				.append(", perPage=").append(perPage).append("]");
		return builder.toString();
	}
}
