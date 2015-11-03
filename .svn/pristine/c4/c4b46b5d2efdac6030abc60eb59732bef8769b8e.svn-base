package pt.api.report.playergamescount;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;

public class PlayerGamesCountResponse extends ResponseBase{
	private List<PlayerGamesCountResult> result;
	private Pagination pagination;
	public List<PlayerGamesCountResult> getResult() {
		return result;
	}
	public void setResult(List<PlayerGamesCountResult> result) {
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
		return "PlayerGamesCountResponse [errorcode=" + getErrorcode()+ ", error=" +getError()+", result=" + result + ", pagination="
				+ pagination + "]";
	}
	
}
