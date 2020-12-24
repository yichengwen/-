package model;

public class PingJia {
    private int pjid;
    private int uid;
    private int gid;
    private String pjcontent;
    private String uname;
	public PingJia(int pjid, int uid, int gid, String pjcontent,String uname) {
		super();
		this.pjid = pjid;
		this.uid = uid;
		this.gid = gid;
		this.pjcontent = pjcontent;
		this.uname = uname;
	}
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getPjid() {
		return pjid;
	}
	public void setPjid(int pjid) {
		this.pjid = pjid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getPjcontent() {
		return pjcontent;
	}
	public void setPjcontent(String pjcontent) {
		this.pjcontent = pjcontent;
	}
    
}
