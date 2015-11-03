package pt.api.entity.generatekey;

import pt.api.bean.ResponseBase;

public class GenerateKeyResponse extends ResponseBase{
	private GenerateKeyResult result;

	public GenerateKeyResult getResult() {
		return result;
	}

	public void setResult(GenerateKeyResult result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "GenerateKeyResponse [errorcode=" + getErrorcode() + ", error=" + getError()+", result=" + result + "]";
	}
	
}
