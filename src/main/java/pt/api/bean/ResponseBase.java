package pt.api.bean;

public class ResponseBase {
	private Integer errorcode;
	private String error;
	
	public Integer getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "ResponseBase [errorcode=" + errorcode + ", error=" + error
				+ "]";
	}
	
}
