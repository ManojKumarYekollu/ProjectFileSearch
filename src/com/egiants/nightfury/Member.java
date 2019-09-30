package com.egiants.nightfury;

public class Member {

	private String desc;
	private String MID; 
	private String givenFName; 
	private String receivedFName; 
	private String givenLName; 
	private String receivedLName;
	
	public Member(String desc, String mID, String givenFName, String receivedFName, String givenLName,
			String receivedLName) {
		super();
		this.desc = desc;
		MID = mID;
		this.givenFName = givenFName;
		this.receivedFName = receivedFName;
		this.givenLName = givenLName;
		this.receivedLName = receivedLName;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public String getGivenFName() {
		return givenFName;
	}
	public void setGivenFName(String givenFName) {
		this.givenFName = givenFName;
	}
	public String getReceivedFName() {
		return receivedFName;
	}
	public void setReceivedFName(String receivedFName) {
		this.receivedFName = receivedFName;
	}
	public String getGivenLName() {
		return givenLName;
	}
	public void setGivenLName(String givenLName) {
		this.givenLName = givenLName;
	}
	public String getReceivedLName() {
		return receivedLName;
	}
	public void setReceivedLName(String receivedLName) {
		this.receivedLName = receivedLName;
	}

	@Override
	public String toString() {
		return "Member [desc=" + desc + ", MID=" + MID + ", givenFName=" + givenFName + ", receivedFName="
				+ receivedFName + ", givenLName=" + givenLName + ", receivedLName=" + receivedLName + "]";
	} 
	
	
}
