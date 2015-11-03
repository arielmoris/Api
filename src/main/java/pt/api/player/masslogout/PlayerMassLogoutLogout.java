package pt.api.player.masslogout;

public class PlayerMassLogoutLogout {
	
	
	public PlayerMassLogoutLogout() {
		super();
		this.result = new String();
		this.error = new String();
		this.errorcode = new String();
	}
	
	private String result;
	private String error;
	private String errorcode;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	@Override
	public String toString() {
		return "PlayerMassLogoutLogout [result=" + result + ", error=" + error
				+ ", errorcode=" + errorcode + "]";
	}
	
	
	
}
