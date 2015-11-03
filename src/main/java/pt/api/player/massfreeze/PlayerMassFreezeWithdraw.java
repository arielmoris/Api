package pt.api.player.massfreeze;

import java.math.BigDecimal;
import java.util.Date;

public class PlayerMassFreezeWithdraw {
	
	
	public PlayerMassFreezeWithdraw() {
		super();
		this.result = new String();
		this.amount = new BigDecimal(0);
		this.kiosktransactiontime = new Date();
		this.kiosktransactionid = new String();
		this.ptinternaltransactionid = new String();
		this.instantcashtype = new String();
		this.executiontime = new Date();
		this.currentplayerbalance = new BigDecimal(0);
		this.error = new String();
		this.errorcode = new String();
	}
	
	private String result;
	private BigDecimal amount;
	private Date kiosktransactiontime;
	private String kiosktransactionid;
	private String ptinternaltransactionid;
	private String instantcashtype;
	private Date executiontime;
	private BigDecimal currentplayerbalance;
	private String error;
	private String errorcode;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getKiosktransactiontime() {
		return kiosktransactiontime;
	}
	public void setKiosktransactiontime(Date kiosktransactiontime) {
		this.kiosktransactiontime = kiosktransactiontime;
	}
	public String getKiosktransactionid() {
		return kiosktransactionid;
	}
	public void setKiosktransactionid(String kiosktransactionid) {
		this.kiosktransactionid = kiosktransactionid;
	}
	public String getPtinternaltransactionid() {
		return ptinternaltransactionid;
	}
	public void setPtinternaltransactionid(String ptinternaltransactionid) {
		this.ptinternaltransactionid = ptinternaltransactionid;
	}
	public String getInstantcashtype() {
		return instantcashtype;
	}
	public void setInstantcashtype(String instantcashtype) {
		this.instantcashtype = instantcashtype;
	}
	public Date getExecutiontime() {
		return executiontime;
	}
	public void setExecutiontime(Date executiontime) {
		this.executiontime = executiontime;
	}
	public BigDecimal getCurrentplayerbalance() {
		return currentplayerbalance;
	}
	public void setCurrentplayerbalance(BigDecimal currentplayerbalance) {
		this.currentplayerbalance = currentplayerbalance;
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
		return "PlayerMassFreezeWithdraw [result=" + result + ", amount="
				+ amount + ", kiosktransactiontime=" + kiosktransactiontime
				+ ", kiosktransactionid=" + kiosktransactionid
				+ ", ptinternaltransactionid=" + ptinternaltransactionid
				+ ", instantcashtype=" + instantcashtype + ", executiontime="
				+ executiontime + ", currentplayerbalance="
				+ currentplayerbalance + ", error=" + error + ", errorcode="
				+ errorcode + "]";
	}
	
}

