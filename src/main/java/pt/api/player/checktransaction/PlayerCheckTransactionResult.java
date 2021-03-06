package pt.api.player.checktransaction;

import java.math.BigDecimal;
import java.util.Date;

public class PlayerCheckTransactionResult {
	
	
	private String status;
	private String externaltransactionid;
	private Date executiontime;
	private BigDecimal amount;
	private BigDecimal currentplayerbalance;
	private Date kiosktransactiontime;
	private String kiosktransactionid;
	private String ptinternaltransactionid;
	private String ip;
	
	
	public PlayerCheckTransactionResult() {
		super();
		this.status = new String();
		this.externaltransactionid = new String();
		this.executiontime = new Date();
		this.amount = new BigDecimal(0);
		this.currentplayerbalance = new BigDecimal(0);
		this.kiosktransactiontime = new Date();
		this.kiosktransactionid = new String();
		this.ptinternaltransactionid = new String();
		this.ip = new String();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExternaltransactionid() {
		return externaltransactionid;
	}
	public void setExternaltransactionid(String externaltransactionid) {
		this.externaltransactionid = externaltransactionid;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getExecutiontime() {
		return executiontime;
	}
	public void setExecutiontime(Date executiontime) {
		this.executiontime = executiontime;
	}
	public Date getKiosktransactiontime() {
		return kiosktransactiontime;
	}
	public void setKiosktransactiontime(Date kiosktransactiontime) {
		this.kiosktransactiontime = kiosktransactiontime;
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", externaltransactionid="
				+ externaltransactionid + ", executiontime=" + executiontime
				+ ", amount=" + amount + ", currentplayerbalance="
				+ currentplayerbalance + ", kiosktransactiontime="
				+ kiosktransactiontime + ", kiosktransactionid="
				+ kiosktransactionid + ", ptinternaltransactionid="
				+ ptinternaltransactionid + ", ip=" + ip + "]";
	}
}
