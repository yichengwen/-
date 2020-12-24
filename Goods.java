package model;

public class Goods {
    private int gid;
    private int sid;
    private String gprice;/*价格*/
    private String gname;
    private int gnum;/*用来记录团购人数下限*/
    private String gcontent;
    private String gtype;
    private int uid;
	public Goods(int gid, int sid, String gprice, String gname, int gnum,
			String gcontent, String gtype,int uid) {
		super();
		this.gid = gid;
		this.sid = sid;
		this.gprice = gprice;
		this.gname = gname;
		this.gnum = gnum;
		this.gcontent = gcontent;
		this.gtype = gtype;
		this.uid = uid;
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
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public String getGcontent() {
		return gcontent;
	}
	public void setGcontent(String gcontent) {
		this.gcontent = gcontent;
	}
	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
    
}
	