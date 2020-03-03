package jp.co.lsstyle.y.hiruta.forms;

import java.io.Serializable;

public class SampleForm implements Serializable{


	private int infoId;
	private String infoName;


	public int getInfoId() {
		return infoId;
	}
	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}
	public String getInfoName() {
		return infoName;
	}
	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

}
