package model;

public class ApplyShop {
	private int apsid;
	private int uid;
	private String apsname;
	private String apstatus;
	private String apintroduce;
	private String apw;
	public ApplyShop(int apsid, int uid, String apsname, String apstatus,
			String apintroduce, String apw) {
		super();
		this.apsid = apsid;
		this.uid = uid;
		this.apsname = apsname;
		this.apstatus = apstatus;
		this.apintroduce = apintroduce;
		this.apw = apw;
	}
	public int getApsid() {
		return apsid;
	}
	public void setApsid(int apsid) {
		this.apsid = apsid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getApsname() {
		return apsname;
	}
	public void setApsname(String apsname) {
		this.apsname = apsname;
	}
	public String getApstatus() {
		return apstatus;
	}
	public void setApstatus(String apstatus) {
		this.apstatus = apstatus;
	}
	public String getApintroduce() {
		return apintroduce;
	}
	public void setApintroduce(String apintroduce) {
		this.apintroduce = apintroduce;
	}
	public String getApw() {
		return apw;
	}
	public void setApw(String apw) {
		this.apw = apw;
	}
	
}
