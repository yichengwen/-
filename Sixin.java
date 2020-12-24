package model;

public class Sixin {
   private int sxid;
   private int brid;
   private String brname;
   private int dxid;
   private String dxname;
   private String sxcontent;
public Sixin(int sxid, int brid, String brname,int dxid,String dxname, String sxcontent) {
	super();
	this.sxid = sxid;
	this.brid = brid;
	this.dxid = dxid;
	this.sxcontent = sxcontent;
	this.brname = brname;
	this.dxname = dxname;
}

public String getBrname() {
	return brname;
}

public void setBrname(String brname) {
	this.brname = brname;
}

public String getDxname() {
	return dxname;
}

public void setDxname(String dxname) {
	this.dxname = dxname;
}

public int getSxid() {
	return sxid;
}
public void setSxid(int sxid) {
	this.sxid = sxid;
}
public int getBrid() {
	return brid;
}
public void setBrid(int brid) {
	this.brid = brid;
}
public int getDxid() {
	return dxid;
}
public void setDxid(int dxid) {
	this.dxid = dxid;
}
public String getSxcontent() {
	return sxcontent;
}
public void setSxcontent(String sxcontent) {
	this.sxcontent = sxcontent;
}
}
