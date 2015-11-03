package pt.api.player.massupdate;

import java.util.List;

import pt.api.bean.ResponseBase;

public class PlayerMassUpdateResponse extends ResponseBase{
	
	private List<PlayerMassUpdateResult> result;

	public List<PlayerMassUpdateResult> getResult() {
		return result;
	}

	public void setResult(List<PlayerMassUpdateResult> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "PlayerMassUpdateResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
}
