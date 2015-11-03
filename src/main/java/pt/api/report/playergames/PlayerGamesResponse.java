package pt.api.report.playergames;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;

public class PlayerGamesResponse extends ResponseBase{
	private List<PlayerGamesResult> result;
	private Pagination pagination;
	public List<PlayerGamesResult> getResult() {
		return result;
	}
	public void setResult(List<PlayerGamesResult> result) {
		this.result = result;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	@Override
	public String toString() {
		return "PlayerGamesResponse [errorcode=" + getErrorcode()+ ", error=" +getError()+", result=" + result + ", pagination="
				+ pagination + "]";
	}
	
}
