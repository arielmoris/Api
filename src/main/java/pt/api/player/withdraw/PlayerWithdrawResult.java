package pt.api.player.withdraw;

import java.math.BigDecimal;
import java.util.Date;

public class PlayerWithdrawResult {
	private BigDecimal amount;
	private BigDecimal currentplayerbalance;
	private Date kiosktransactiontime;
	private String kiosktransactionid;
	private String ptinternaltransactionid;
	private String externaltransactionid;
	private String instantcashtype;
	private Date executiontime;
	private String result;
	
	
	public PlayerWithdrawResult() {
		super();
		this.amount = new BigDecimal(0);
		this.currentplayerbalance = new BigDecimal(0);
		this.kiosktransactiontime = new Date(0);
		this.kiosktransactionid = new String();
		this.ptinternaltransactionid = new String();
		this.externaltransactionid = new String();
		this.instantcashtype = new String();
		this.executiontime = new Date();
		this.result = new String();
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getCurrentplayerbalance() {
		return currentplayerbalance;
	}
	public void setCurrentplayerbalance(BigDecimal currentplayerbalance) {
		this.currentplayerbalance = currentplayerbalance;
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
	public String getExternaltransactionid() {
		return externaltransactionid;
	}
	public void setExternaltransactionid(String externaltransactionid) {
		this.externaltransactionid = externaltransactionid;
	}
	public String getInstantcashtype() {
		return instantcashtype;
	}
	public void setInstantcashtype(String instantcashtype) {
		this.instantcashtype = instantcashtype;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getKiosktransactiontime() {
		return kiosktransactiontime;
	}
	public void setKiosktransactiontime(Date kiosktransactiontime) {
		this.kiosktransactiontime = kiosktransactiontime;
	}
	public Date getExecutiontime() {
		return executiontime;
	}
	public void setExecutiontime(Date executiontime) {
		this.executiontime = executiontime;
	}
	@Override
	public String toString() {
		return "PlayerWithdrawResult [amount=" + amount
				+ ", currentplayerbalance=" + currentplayerbalance
				+ ", kiosktransactiontime=" + kiosktransactiontime
				+ ", kiosktransactionid=" + kiosktransactionid
				+ ", ptinternaltransactionid=" + ptinternaltransactionid
				+ ", externaltransactionid=" + externaltransactionid
				+ ", instantcashtype=" + instantcashtype + ", executiontime="
				+ executiontime + ", result=" + result + "]";
	}
	
	
}
