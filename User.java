package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
    /**
     * �û�id���û������û����� 
     * @author Lemming
     *
     */
public class User {
	private String uname;/*�������������������ע��Ҫ��õ�*/
    private String upw;
    private int uid;
    private String uscore;/*�û�����*/
    private String uadress;/*������ʱ���޸�*/
    private String uphone;
    private String uimg;/*���û�ͷ��*/
    public User(){}
	public User(String uname, String upw, int uid, String uscore, String uadress,
			String uphone, String uimg) {
		super();
		this.uname = uname;
		this.upw = upw;
		this.uid = uid;
		this.uscore = uscore;
		this.uadress = uadress;
		this.uphone = uphone;
		this.uimg = uimg;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUimg() {
		return uimg;
	}

	public void setUimg(String uimg) {
		this.uimg = uimg;
	}

	public String getUadress() {
		return uadress;
	}

	public void setUadress(String uadress) {
		this.uadress = uadress;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
    public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUscore() {
		return uscore;
	}

	public void setUscore(String uscore) {
		this.uscore = uscore;
	}

	/*��ͨ����*/
	/*��¼*/
	public boolean login(String uid,String upw) throws SQLException, ClassNotFoundException{
		String sql = "select * from user where uid='"+uid+"'and upw='"+upw+"'";
		DataConnection.getStat().executeQuery(sql);
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next())
			return true;
		return false;
	}
	/*ע��*/
	public void register(String uname,String upw) throws SQLException, ClassNotFoundException{
		String sql = "insert into user (uname, upw) values('"+uname+"','"+upw+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	//ע�����
	public void registershop(String a,String b,String c,String d) throws SQLException, ClassNotFoundException{
		String sql = "insert into applyshop (uid,apsname,apstatus,apintroduce,apw) values('"+a+"','"+b+"','������','"+c+"','"+d+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*���ұ�Ȧ*/
	public ArrayList<SocialContent> searchSC(String msg,String cid) throws SQLException, ClassNotFoundException{
		ArrayList<SocialContent> SC = new ArrayList<SocialContent>();
		String sql;
		
		if(msg.trim().equals("")){
			sql = "select *from socialcontent";
		}else{
		sql= "select *from socialcontent where cid like '%"+msg+"%'"
		+"or content like '%"+msg+"%' or uname="+uname;
		}
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		while(rs.next()){
			SC.add(new SocialContent(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
		}
		return SC;
	}
	/*�����Ȧ*/
	public SocialContent viewSC(String cid) throws SQLException, ClassNotFoundException{
		SocialContent sc = null;
		String sql = "select *from socialcontent where cid="+cid;
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			sc = new SocialContent(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
		}
		return sc;
	}
	/*ͨ��ID��ȡ��Ϣ*/
	public ArrayList<String> getUser(String uid) throws SQLException, ClassNotFoundException{
		ArrayList<String> details = new ArrayList<String>();
		String sql="select *from user where uid='"+uid+"'";
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			details.add(rs.getString(1));
			details.add(rs.getString(2));
			details.add(rs.getString(3));
			details.add(rs.getString(4));
			details.add(rs.getString(5));
			details.add(rs.getString(6));
			details.add(rs.getString(7));
		}
		return details;
	}
	/*�鿴˽��*/
	public ArrayList<Sixin> searchSX(String msg,String uid) throws SQLException, ClassNotFoundException{
		ArrayList<Sixin> SX = new ArrayList<Sixin>();
		String sql;
		sql = "select * from sixin where brid='"+uid+"'or dxid='"+uid+"'";
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		while(rs.next()){
			SX.add(new Sixin(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
		}
		return SX;
	}
	/*����˽��*/
	public void addSX(Sixin sx) throws SQLException, ClassNotFoundException{
		String sql = "insert into sixin(sxid,brid,brname,dxid,dxname,sxcontent)"+ "values('"+sx.getSxid()+"','"+sx.getBrid()+"','"+sx.getBrname()+"','"+sx.getDxid()+"','"+sx.getDxname()+"','"+sx.getSxcontent()+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*������Ȧ*/
	public void addSC(SocialContent sc) throws SQLException, ClassNotFoundException{
		String sql="insert into socialcontent(cid,content,uname,ctime,cimg,cvideo,love,uimg)" +
		"values("+sc.getCid()+",'"+sc.getContent()+"','"+sc.getUname()+"','"+sc.getCtime()+"','"+sc.getCimg()+"','"+sc.getCvideo()+"','"+sc.getLove()+"','"+sc.getUimg()+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*ɾ����Ȧ*/
	public void delSC(String cid,String uid) throws SQLException, ClassNotFoundException{
		String sql = "delete from socialcontent where cid='"+cid+"'";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*��ȡ�����Ȧ�����ߵ�����*/
	public String getUname(String cid) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String sql="select *from socialcontent where cid='"+cid+"'";
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next())
			return rs.getString("uname");
		return "";
	}
	/*�鿴����*/
	public ArrayList<PingLun> searchPL(String msg,String cid) throws SQLException, ClassNotFoundException{
		ArrayList<PingLun> PL = new ArrayList<PingLun>();
		String sql;
		sql = "select *from pinglun" ;
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		while(rs.next()){
			PL.add(new PingLun(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)));
		}
		return PL;
	}
	/*��������*/
	public void addPL(PingLun pl) throws SQLException, ClassNotFoundException{
		String sql="insert into pinglun(pid,uid,pcontent,uname)" +
		"values('"+pl.getPid()+"','"+pl.getUid()+"','"+pl.getPcontent()+"','"+pl.getUname()+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*ɾ������*/
	public void delPL(String pid,String uid) throws SQLException, ClassNotFoundException{
		String sql = "delete from socialcontent where pid="+pid;
		DataConnection.getStat().executeUpdate(sql);
	}
	/*���ұ���*/
	public ArrayList<Goods> searchG(String msg) throws SQLException, ClassNotFoundException{
		ArrayList<Goods> g = new ArrayList<Goods>();
		String sql;
		if(msg.trim().equals("")){
			sql = "select *from goods";
		}else{
		sql= "select *from goods where gid like '%"+msg+"%'"
		+"or gcontent like '%"+msg+"%'";
		}
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		while(rs.next()){
			g.add(new Goods(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8)));
		}
		return g;
	}
	/*���������ϸ��Ϣ*/
	public Goods viewG(String gid) throws SQLException, ClassNotFoundException{
		Goods g = null;
		String sql = "select *from goods where gid="+gid;
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			g = new Goods(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8));
		}
		return g;
	}
	/*�ٱ�����*/
	public void addJuBao(Jubao jb) throws SQLException, ClassNotFoundException{
		String sql="insert into jubao(jid,uid,gid,gname,gstatus,jtype,jreason)" +"values('"+jb.getJid()+"','"+jb.getUid()+"','"+jb.getGid()+"','"+jb.getGname()+"','"+jb.getGstatus()+"','"+jb.getJtype()+"','"+jb.getJreason()+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*�鿴�ҵ�ƴ�Ŷ���*/
	public ArrayList<Dingdan> searchDD(String uid) throws SQLException, ClassNotFoundException{
		ArrayList<Dingdan> DD = new ArrayList<Dingdan>();
		String sql;
		sql = "select *from dingdan where uid ="+uid;
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		while(rs.next()){
			DD.add(new Dingdan(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getString(10)));
		}
		return DD;
	}
	/*ȷ���µ�*/
	public void XiaDan(Dingdan dd) throws SQLException, ClassNotFoundException{
		String sql="insert into dingdan(did,gname,gid,uid,uname,uaddress,uphone,gnum,sid,dstatus)" +
		"values("+dd.getDid()+",'"+dd.getGname()+"','"+dd.getGid()+"','"+dd.getUid()+"','"+dd.getUname()+"','"+dd.getUaddress()+"','"+dd.getUphone()+"','"+dd.getGnum()+"','"+dd.getSid()+"','"+dd.getDstatus()+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*�鿴���ۣ���Ʒ��*/
	public ArrayList<PingJia> searchPJ(String gid) throws SQLException, ClassNotFoundException{
		ArrayList<PingJia> PJ = new ArrayList<PingJia>();
		String sql;
		sql = "select *from pingjia where gid="+gid ;
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		while(rs.next()){
			PJ.add(new PingJia(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
		}
		return PJ;
	}
	/*�鿴ƴ�Ŷ���������Ϣ*/
	public Dingdan viewDD(String did) throws SQLException, ClassNotFoundException{
		Dingdan d = null;
		String sql = "select *from dingdan where did="+did;
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			d = new Dingdan(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getString(10));
		}
		return d;
	}
	/*����������*/
	public void addPJ(PingJia pj) throws SQLException, ClassNotFoundException{
		String sql="insert into PingJia(pjid,uid,gid,pjcontent,uname)" +"values('"+pj.getPjid()+"','"+pj.getUid()+"','"+pj.getGid()+"','"+pj.getPjcontent()+"','"+pj.getUname()+"')";
		DataConnection.getStat().executeUpdate(sql);
	}
	/*ɾ���Զ���������*/
	public void delPJ(PingJia pjid) throws SQLException, ClassNotFoundException{
		String sql="delete from pingjia where pjid="+pjid;
		DataConnection.getStat().executeUpdate(sql);
	}
}
