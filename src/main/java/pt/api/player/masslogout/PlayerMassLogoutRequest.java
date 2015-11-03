package pt.api.player.masslogout;

import java.util.List;

import pt.api.bean.RequestBase;

public class PlayerMassLogoutRequest extends RequestBase{
	private List<PlayerMassLogoutParam> params;

	public List<PlayerMassLogoutParam> getParams() {
		return params;
	}

	public void setParams(List<PlayerMassLogoutParam> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "PlayerMassLogoutRequest [params=" + params + "]";
	}
	
	
}
