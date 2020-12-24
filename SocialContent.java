package model;

public class SocialContent {
    private int cid;
    private String content;
    private String uname;
    private String ctime;
    private String cimg;/*±¦È¦ÄÚÈÝµÄÍ¼Æ¬*/
    private String cvideo;/*±¦È¦ÄÚÈÝµÄÊÓÆµ*/
    private String love;
    private String uimg;
	public SocialContent(int cid, String content, String uname, String ctime,
			String cimg, String cvideo, String love,String uimg) {
		super();
		this.cid = cid;
		this.content = content;
		this.uname = uname;
		this.ctime = ctime;
		this.cimg = cimg;
		this.cvideo = cvideo;
		this.love = love;
		this.uimg = uimg;
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCimg() {
		return cimg;
	}
	public void setCimg(String cimg) {
		this.cimg = cimg;
	}
	public String getCvideo() {
		return cvideo;
	}
	public void setCvideo(String cvideo) {
		this.cvideo = cvideo;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
	public String getUimg() {
		return uimg;
	}
	public void setUimg(String uimg) {
		this.uimg = uimg;
	}
}
	
	