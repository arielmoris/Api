package pt.api.player.masscreate;

import java.math.BigDecimal;
import java.util.Date;

public class PlayerMassCreateDeposit {
	
	
	public PlayerMassCreateDeposit() {
		super();
		this.result = new String();
		this.amount = new BigDecimal(0);
		this.kiosktransactiontime = new Date();
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
	public String getPtinternaltransactionid() {
		return ptinternaltransactionid;
	}
	public void setPtinternaltransactionid(String ptinternaltransactionid) {
		this.ptinternaltransactionid = ptinternaltransactionid;
	}
	public Date getKiosktransactiontime() {
		return kiosktransactiontime;
	}
	public void setKiosktransactiontime(Date kiosktransactiontime) {
		this.kiosktransactiontime = kiosktransactiontime;
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
		return "PlayerMassCreateDeposit [result=" + result + ", amount="
				+ amount + ", kiosktransactiontime=" + kiosktransactiontime
				+ ", ptinternaltransactionid=" + ptinternaltransactionid
				+ ", instantcashtype=" + instantcashtype + ", executiontime="
				+ executiontime + ", currentplayerbalance="
				+ currentplayerbalance + ", error=" + error + ", errorcode="
				+ errorcode + "]";
	}
	
	
}
