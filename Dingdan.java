package model;

public class Dingdan {
	private int did;
	private String gname;
	private int gid;
	private int uid;
	private String uname;
	private String uaddress;
	private String uphone;
	private int gnum;
	private int sid;
	private String dstatus;
	public Dingdan(int did, String gname, int gid, int uid, String uname,
			String uaddress, String uphone, int gnum, int sid, String dstatus) {
		super();
		this.did = did;
		this.gname = gname;
		this.gid = gid;
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.uphone = uphone;
		this.gnum = gnum;
		this.sid = sid;
		this.dstatus = dstatus;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getDstatus() {
		return dstatus;
	}
	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}
}
