package pt.api.report.playerstats;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;

public class PlayerStatsResponse extends ResponseBase{
	private List<PlayerStatsResult> result;
	private Pagination pagination;
	public List<PlayerStatsResult> getResult() {
		return result;
	}
	public void setResult(List<PlayerStatsResult> result) {
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
		return "PlayerStatsResponse [errorcode=" + getErrorcode()+ ", error=" +getError()+", result=" + result + ", pagination="
				+ pagination + "]";
	}
	
}
