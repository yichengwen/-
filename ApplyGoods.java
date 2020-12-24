package model;

public class ApplyGoods {
	private int apgid;
	private String apgname;
	private String apgprice;
	private String apgtype;
	private String apgcontent;
	private String apgstatus;
	private int sid;
	public ApplyGoods(int apgid, String apgname, String apgtype,
			String apgcontent, String apgstatus,String apgprice, int sid) {
		super();
		this.apgid = apgid;
		this.apgname = apgname;
		this.apgtype = apgtype;
		this.apgcontent = apgcontent;
		this.apgstatus = apgstatus;
		this.sid = sid;
		this.apgprice = apgprice;
	}
	public String getApgprice() {
		return apgprice;
	}
	public void setApgprice(String apgprice) {
		this.apgprice = apgprice;
	}
	public int getApgid() {
		return apgid;
	}
	public void setApgid(int apgid) {
		this.apgid = apgid;
	}
	public String getApgname() {
		return apgname;
	}
	public void setApgname(String apgname) {
		this.apgname = apgname;
	}
	public String getApgtype() {
		return apgtype;
	}
	public void setApgtype(String apgtype) {
		this.apgtype = apgtype;
	}
	public String getApgcontent() {
		return apgcontent;
	}
	public void setApgcontent(String apgcontent) {
		this.apgcontent = apgcontent;
	}
	public String getApgstatus() {
		return apgstatus;
	}
	public void setApgstatus(String apgstatus) {
		this.apgstatus = apgstatus;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
