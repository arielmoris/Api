package pt.api.player.masscreate;

import java.util.List;

import pt.api.bean.ResponseBase;

public class PlayerMassCreateResponse extends ResponseBase{
	private List<PlayerMassCreateResult> result;

	public List<PlayerMassCreateResult> getResult() {
		return result;
	}

	public void setResult(List<PlayerMassCreateResult> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "PlayerMassCreateResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
