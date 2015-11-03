package pt.api.report.playertransactions;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;

public class PlayerTransactionsResponse extends ResponseBase{
	private List<PlayerTransactionsResult> result;
	private Pagination pagination;
	public List<PlayerTransactionsResult> getResult() {
		return result;
	}
	public void setResult(List<PlayerTransactionsResult> result) {
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
		return "PlayerTransactionsResponse [errorcode=" + getErrorcode()+ ", error=" +getError()+", result=" + result + ", pagination="
				+ pagination + "]";
	}
}
