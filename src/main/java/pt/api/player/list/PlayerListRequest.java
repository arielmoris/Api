package pt.api.player.list;

import pt.api.bean.RequestBase;

public class PlayerListRequest extends RequestBase{
	private String kioskname;
	private String adminname;
	private Boolean online;
	private Integer page;
	private Integer perPage;
	public String getKioskname() {
		return kioskname;
	}
	public void setKioskname(String kioskname) {
		this.kioskname = kioskname;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public Boolean getOnline() {
		return online;
	}
	public void setOnline(Boolean online) {
		this.online = online;
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
}
