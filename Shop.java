package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Shop {
    private int sid;
    private String sname;
    private String spw;
    private String sintroduce;
    private int uid;
    
    public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSpw() {
		return spw;
	}
	public void setSpw(String spw) {
		this.spw = spw;
	}
	public String getSintroduce() {
		return sintroduce;
	}
	public void setSintroduce(String sintroduce) {
		this.sintroduce = sintroduce;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Shop(int sid, String sname, String spw, String sintroduce, int uid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.spw = spw;
		this.sintroduce = sintroduce;
		this.uid = uid;
	}
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	/**
     * һ�㹦�ܣ�1.ע�� 2.��¼ 3.���봴������4.��д������Ϣ�����������������룩
     * ���⹦�ܣ�1.�����ϼ���Ʒ  2.�ύ��Ʒ��Ϣ����Ʒ������Ʒ�۸���Ʒ���ܣ���Ʒ��ȫ֤�飩 3.�����Ź� ����д���⣬��д���
     * ��7��������
     * ��3�����ԡ�
     * @throws ClassNotFoundException 
     * @throws SQLException 
     */
	
	/*һ�㹦��*/
	/*��¼andע��*/
	public boolean login(String sid,String spw) throws SQLException, ClassNotFoundException{
		String sql = "select * from shop where sid='"+sid+"'and spw='"+spw+"'";
		DataConnection.getStat().executeQuery(sql);
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		
		if(rs.next())
			return true;
		return false;

	}
	public void regshop(String sname,String spw) throws SQLException, ClassNotFoundException{
		String sql = "insert into shop(sname, spw) values('"+sname+"','"+spw+"')";
		DataConnection.getStat().executeUpdate(sql);

	}
	public void logshop() throws SQLException, ClassNotFoundException{
		String sql="select * from shop where sname='"+sid+"'and spw='"+spw+"'";;
		DataConnection.getStat().executeUpdate(sql);
	}
	/*���⹦��*/
	/*�����ϼ�/�¼���Ʒ(��ת�����)*/

	/*
	 * ������Ʒ
	 */
	public ArrayList<Goods> searchgoods(String msg,String sid) throws SQLException, ClassNotFoundException{
		ArrayList<Goods> goods = new ArrayList<Goods>();
		String sql = "";
		try{
			int n = Integer.parseInt(msg);
			sql = "select *from goods where sid = "+sid;
		
		}catch(Exception e){
			sql = "select *from goods where gname like '%"+msg+"%'and sid='"+sid+"'";
//			String sql="select * from user where uid='"+name+"'and upw='"+pw+"'";
		}
		
		 ResultSet rs = DataConnection.getStat().executeQuery(sql);
		 while(rs.next()){
			 goods.add(new Goods(rs.getInt(1),rs.getInt(2),rs.getString(2),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8)));
		 }
		 return goods;
	}
	/*
	 * �����Ʒ
	 */
	public void addGoods(Goods g) throws SQLException, ClassNotFoundException{
		String sql = "insert into goods(gid,gname,,gprice,gnum)values('"+g.getGid()+"','"
		+g.getGname()+"','"+g.getGprice()+"','"+g.getGnum()+"')";
		System.out.println(sql);
		DataConnection.getStat().executeUpdate(sql);
	}
	public ArrayList<String> getGoods(String gid) throws SQLException, ClassNotFoundException{
		String sql = "select *from goods where gid = "+gid;
		 ArrayList<String> details = new ArrayList<String>();
		 ResultSet rs = DataConnection.getStat().executeQuery(sql);
		 if(rs.next()){
			 details.add(rs.getString(1));
			 details.add(rs.getString(4));
			 details.add(rs.getString(3));
			 details.add(rs.getString(5));
		 }
		return details;
		
	}
	/*
	 * ɾ����Ʒ
	 */
	public void removeGoods(String gid) throws SQLException, ClassNotFoundException{
		String sql = "delete from goods where gid="+gid;
		DataConnection.getStat().executeUpdate(sql);
	}
	/*
	 * 
	 * ������Ʒ
	 */
	
public void updategoods(String gid,String gname,String gprice,String gnum ) throws SQLException, ClassNotFoundException{
	String sql = "";
		 sql = "update goods set gname ='"+gname+"'where gid = "+gid;
		DataConnection.getStat().executeUpdate(sql);
		sql = "update goods set gprice ='"+gprice+"'where gid = "+gid;
		DataConnection.getStat().executeUpdate(sql);
		sql = "update goods set gnum ='"+gnum+"'where gid = "+gid;
		DataConnection.getStat().executeUpdate(sql);
		
	}
/*
 * ���Ҷ���
 */
public ArrayList<Dingdan> searchdingdan(String msg) throws SQLException, ClassNotFoundException{
	ArrayList<Dingdan> dingdan = new ArrayList<Dingdan>();
	String sql = "";
	try{
		int n = Integer.parseInt(msg);
		sql = "select *from dingdan where did = "+n;
	
	}catch(Exception e){
		sql = "select *from dingdan where gname like '%"+msg+"%'";
	}
	
	 ResultSet rs = DataConnection.getStat().executeQuery(sql);
	 while(rs.next()){
		 dingdan.add(new Dingdan(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getString(10)));
	 }
	 return dingdan;
}
/*
 * �鿴����
 */
public  Dingdan viewDingdan(String did) throws SQLException, ClassNotFoundException{
	Dingdan dingdan = null;
	String sql = "select *from dingdan where did="+did;
	ResultSet rs =DataConnection.getStat().executeQuery(sql);
	if(rs.next()){
		dingdan = new Dingdan(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getString(10));
	}
	return dingdan;
}
public ArrayList<String> getDingdan(String did) throws SQLException, ClassNotFoundException{
	String sql = "select *from dingdan where did = "+did;
	 ArrayList<String> details = new ArrayList<String>();
	 ResultSet rs = DataConnection.getStat().executeQuery(sql);
	 if(rs.next()){
		 details.add(rs.getString(2));
		 details.add(rs.getString(1));
		 details.add(rs.getString(3));
		 details.add(rs.getString(4));
		 details.add(rs.getString(5));
		 details.add(rs.getString(6));
	 }
	return details;
	
}
/*
 * ɾ������
 */
public void removedingdan(String did) throws SQLException, ClassNotFoundException{
	String sql = "delete from dingdan where did="+did;
	DataConnection.getStat().executeUpdate(sql);
}
/*
 * δ����
 */
public void weifahuo(String did) throws SQLException, ClassNotFoundException{
	String sql = "update dingdan set dstatus='δ����'where did = "+did;
	DataConnection.getStat().executeUpdate(sql);
}
	/*
	 * 
     * �����
	 */
	public void kuaidizhong(String did) throws SQLException, ClassNotFoundException{
		String sql = "update dingdan set dstatus='�����'where did = "+did;
		DataConnection.getStat().executeUpdate(sql);
			
		}
		/*
		 * ���ջ�
		 */
	public void yishouhuo(String did) throws SQLException, ClassNotFoundException{
		String sql = "update dingdan set dstatus='���ջ�'where did = "+did;
		DataConnection.getStat().executeUpdate(sql);
			
		}
	
	
	

	/*
	 * /*
	 * ���������е���Ʒ
	 */
	
	 
	public ArrayList<ApplyGoods> searchapplygoods(String msg) throws SQLException, ClassNotFoundException{
		ArrayList<ApplyGoods> applygoods = new ArrayList<ApplyGoods>();
		String sql = "";
		try{
			int n = Integer.parseInt(msg);
			sql = "select *from applygoods where apgid = "+n;
		
		}catch(Exception e){
			sql = "select *from applygoods where apgname like '%"+msg+"%'";
		}
		
		 ResultSet rs = DataConnection.getStat().executeQuery(sql);
		 while(rs.next()){
			 applygoods.add(new ApplyGoods(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
		 }
		 return applygoods;
	}

	public ArrayList<String> getApplyGoods(String apgid) throws SQLException, ClassNotFoundException{
		String sql = "select *from applygoods where apgid = "+apgid;
		 ArrayList<String> details = new ArrayList<String>();
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
	/*
	 * �鿴�����е���Ʒ
	 */
	public  ApplyGoods viewapplygoods(String apgid) throws SQLException, ClassNotFoundException{
		ApplyGoods applygoods  = null;
		String sql = "select *from applygoods where apgid="+apgid;
		ResultSet rs =DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			applygoods = new ApplyGoods(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
		}
		return applygoods;
	}
	/*
	 * 
	 * ������������Ʒ
	 */
	
public void updateapplygoods(String apgid,String apgname,String apgprice,String apgnum ,
		String apgcontent) throws SQLException, ClassNotFoundException{
	String sql = "";
		 sql = "update applygoods set apgname ='"+apgname+"'where apgid = "+apgid;
		DataConnection.getStat().executeUpdate(sql);
		sql = "update applygoods set apgprice ='"+apgprice+"'where apgid = "+apgid;
		DataConnection.getStat().executeUpdate(sql);
		sql = "update applygoods set apgcontent ='"+apgcontent+"'where apgid = "+apgid;
		DataConnection.getStat().executeUpdate(sql);
		
	}
/*
 * ɾ����������Ʒ
 */
public void removeapplygoods(String apgid) throws SQLException, ClassNotFoundException{
	String sql = "delete from applygoods where apgid="+apgid;
	DataConnection.getStat().executeUpdate(sql);
}
	
/*
 * ���������Ʒ
 */
public void addapplygoods(ApplyGoods a) throws SQLException, ClassNotFoundException{
	String sql="insert into applygoods(apgid,apgname,apgtype,apgcontent,apgstatus,sid,apgprice)values('"+a.getApgid()+"','"
	+a.getApgname()+"','"+a.getApgtype()+"','"+a.getApgcontent()+"','"+a.getApgstatus()+"','"+a.getSid()+"','"+a.getApgprice()+"')";
	System.out.println(sql);
	DataConnection.getStat().executeUpdate(sql);
}
/*
 * ͨ����ø�����Ϣ
 */

public ArrayList<String> getShop(String sid) throws SQLException, ClassNotFoundException{
	String sql = "select *from shop where sid = "+sid;
	 ArrayList<String> details = new ArrayList<String>();
	 ResultSet rs = DataConnection.getStat().executeQuery(sql);
	 if(rs.next()){
		 details.add(rs.getString(2));
		 details.add(rs.getString(1));
		 details.add(rs.getString(3));
		 details.add(rs.getString(4));
	 }
	 return details;
	
}
/*
 * 
 * ������������Ʒ
 */

public void updateshop(String sid,String sname,String spw,String sintroduce) throws SQLException, ClassNotFoundException{
String sql = "";
	 sql = "update shop set sname ='"+sname+"'where sid = "+sid;
	DataConnection.getStat().executeUpdate(sql);
	sql = "update shop set spw ='"+spw+"'where sid = "+sid;
	DataConnection.getStat().executeUpdate(sql);
	sql = "update shop set sintroduce ='"+sintroduce+"'where sid = "+sid;
	DataConnection.getStat().executeUpdate(sql);
	
	
	
}
/*�����ж�*/
public void Ddanpd(int gid,int gnum) throws SQLException, ClassNotFoundException{
	  String sql = "select*from dingdan where gid="+gid+" and dstatus='��������'";
	  ResultSet rs = DataConnection.getStat().executeQuery(sql);
	  while(rs.next()){
	   int a=rs.getInt("gid");
	   int b=rs.getInt("uid");
	   sql="insert into panduan(gid,uid) values('"+a+"','"+b+"')";
	   DataConnection.getStat().executeUpdate(sql);
	  }
	   sql="select count(*)  as num from panduan";
	  ResultSet rs1 =DataConnection.getStat().executeQuery(sql);
	  if (rs1.next()) {
	  int i=rs1.getInt("num");
	  
//	  System.out.println(i);//renshu
	  if(i>=gnum){//
	   sql="update dingdan set dstatus='�ɷ���'where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	   sql="delete from panduan where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	  }
	  else{
	   sql="update dingdan set dstatus='��������'where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	   sql="delete from panduan where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	  }
	  }
}
public void Yifahuo(String did) throws SQLException, ClassNotFoundException{
	String sql = "update dingdan set dstatus ='�ѷ���' where did="+did;
	DataConnection.getStat().executeUpdate(sql);
}
}
