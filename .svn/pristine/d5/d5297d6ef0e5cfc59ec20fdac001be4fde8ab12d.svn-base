package pt.api.report.gamestats;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;

public class GameStatsResponse extends ResponseBase{
	private List<GameStatsResult> result;
	private Pagination pagination;
	public List<GameStatsResult> getResult() {
		return result;
	}
	public void setResult(List<GameStatsResult> result) {
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
		return "GameStatsResponse [errorcode=" + getErrorcode()+ ", error=" +getError()+", result=" + result + ", pagination="
				+ pagination + "]";
	}
	
}
