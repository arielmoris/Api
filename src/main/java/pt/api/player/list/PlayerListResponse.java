package pt.api.player.list;

import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.ResponseBase;
import pt.api.bean.Total;

public class PlayerListResponse extends ResponseBase{
	private List<PlayerListResult> result;
	private Total total;
	private Pagination pagination;
	
	public List<PlayerListResult> getResult() {
		return result;
	}
	public void setResult(List<PlayerListResult> result) {
		this.result = result;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
}
