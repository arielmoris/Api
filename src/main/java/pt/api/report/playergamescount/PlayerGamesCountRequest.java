package pt.api.report.playergamescount;

import pt.api.bean.RequestBase;

public class PlayerGamesCountRequest extends RequestBase{
	
	private String playername;
	private Integer lastgamescount;
	private String sortby;
	private Integer sortorder;
	private Integer page;
	private Integer perPage;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		if(playername != null)
			this.playername = playername;
	}
	public Integer getLastgamescount() {
		return lastgamescount;
	}
	public void setLastgamescount(Integer lastgamescount) {
		this.lastgamescount = lastgamescount;
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
		return "PlayerGamesCountRequest [playername=" + playername
				+ ", lastgamescount=" + lastgamescount + ", sortby=" + sortby
				+ ", sortorder=" + sortorder + ", page=" + page + ", perPage="
				+ perPage + "]";
	}
	
}
