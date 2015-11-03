package pt.api.entity.generatekey;

import pt.api.bean.RequestBase;

public class GenerateKeyRequest extends RequestBase{
	private String entityname;

	public String getEntityname() {
		return entityname;
	}

	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}

	@Override
	public String toString() {
		return "GenerateKeyRequest [entityname=" + entityname + "]";
	}
	
	
}
