package pt.api.player.info;

import java.util.List;

public class PlayerInfoNetworkNickname {
	
	private Integer networkId;
	private List<PlayerInfoNetworkData> networkData;
	
	public Integer getNetworkId() {
		return networkId;
	}
	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}
	public List<PlayerInfoNetworkData> getNetworkData() {
		return networkData;
	}
	public void setNetworkData(List<PlayerInfoNetworkData> networkData) {
		this.networkData = networkData;
	}
	@Override
	public String toString() {
		return "PlayerInfoNetworkNickname [networkId=" + networkId
				+ ", networkData=" + networkData + "]";
	}
	
	
}
