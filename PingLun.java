package model;

public class PingLun {
    private int pid;
    private int uid;
    private String pcontent;
    private String uname;
	public PingLun(int pid, int uid, String pcontent, String uname) {
		super();
		this.pid = pid;
		this.uid = uid;
		this.pcontent = pcontent;
		this.uname = uname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
}
