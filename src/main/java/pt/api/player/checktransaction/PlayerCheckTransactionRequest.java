package pt.api.player.checktransaction;

import pt.api.bean.RequestBase;

public class PlayerCheckTransactionRequest extends RequestBase{
	private String externaltransactionid;

	public String getExternaltransactionid() {
		return externaltransactionid;
	}

	public void setExternaltransactionid(String externaltransactionid) {
		this.externaltransactionid = externaltransactionid;
	}
	
	
}
