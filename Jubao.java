package model;

public class Jubao {
    private int jid;
    private int uid;
    private int gid;
    private String gname;
    private String gstatus;
    private String jtype;
    private String jreason;
	public Jubao(int jid, int uid, int gid, String gname, String gstatus,
			String jtype, String jreason) {
		super();
		this.jid = jid;
		this.uid = uid;
		this.gid = gid;
		this.gname = gname;
		this.gstatus = gstatus;
		this.jtype = jtype;
		this.jreason = jreason;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
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
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGstatus() {
		return gstatus;
	}
	public void setGstatus(String gstatus) {
		this.gstatus = gstatus;
	}
	public String getJtype() {
		return jtype;
	}
	public void setJtype(String jtype) {
		this.jtype = jtype;
	}
	public String getJreason() {
		return jreason;
	}
	public void setJreason(String jreason) {
		this.jreason = jreason;
	}
}
