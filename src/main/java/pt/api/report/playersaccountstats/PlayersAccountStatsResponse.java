package pt.api.report.playersaccountstats;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;

public class PlayersAccountStatsResponse extends ResponseBase{
	
	private List<PlayersAccountStatsResult> result;
	private Pagination pagination;
	
	public List<PlayersAccountStatsResult> getResult() {
		return result;
	}
	public void setResult(List<PlayersAccountStatsResult> result) {
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
		return "PlayersAccountStatsResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result
				+ ", pagination=" + pagination + "]";
	}
}
