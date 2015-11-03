package pt.api.bean;

public class Pagination {
	private Integer currentPage;
	private Integer totalPages;
	private Integer itemsPerPage;
	private Integer totalCount;
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getItemsPerPage() {
		return itemsPerPage;
	}
	public void setItemsPerPage(Integer itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	@Override
	public String toString() {
		return "Pagination [currentPage=" + currentPage + ", totalPages="
				+ totalPages + ", itemsPerPage=" + itemsPerPage
				+ ", totalCount=" + totalCount + "]";
	}
}
