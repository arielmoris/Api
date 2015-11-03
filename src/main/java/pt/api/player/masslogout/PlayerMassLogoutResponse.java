package pt.api.player.masslogout;

import java.util.List;

import pt.api.bean.ResponseBase;

public class PlayerMassLogoutResponse extends ResponseBase{
	
	private List<PlayerMassLogoutResult> result;

	public List<PlayerMassLogoutResult> getResult() {
		return result;
	}

	public void setResult(List<PlayerMassLogoutResult> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "PlayerMassLogoutResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
