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
     * 一般功能：1.注册 2.登录 3.申请创建店铺4.填写店铺信息（店铺名，店铺密码）
     * 特殊功能：1.申请上架商品  2.提交商品信息（商品名，商品价格，商品介绍，商品安全证书） 3.发起团购 （填写标题，填写名额）
     * 共7个方法。
     * 共3个属性。
     * @throws ClassNotFoundException 
     * @throws SQLException 
     */
	
	/*一般功能*/
	/*登录and注册*/
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
	/*特殊功能*/
	/*申请上架/下架商品(跳转到填表)*/

	/*
	 * 查找商品
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
	 * 添加商品
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
	 * 删除商品
	 */
	public void removeGoods(String gid) throws SQLException, ClassNotFoundException{
		String sql = "delete from goods where gid="+gid;
		DataConnection.getStat().executeUpdate(sql);
	}
	/*
	 * 
	 * 更新商品
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
 * 查找订单
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
 * 查看订单
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
 * 删除订单
 */
public void removedingdan(String did) throws SQLException, ClassNotFoundException{
	String sql = "delete from dingdan where did="+did;
	DataConnection.getStat().executeUpdate(sql);
}
/*
 * 未发货
 */
public void weifahuo(String did) throws SQLException, ClassNotFoundException{
	String sql = "update dingdan set dstatus='未发货'where did = "+did;
	DataConnection.getStat().executeUpdate(sql);
}
	/*
	 * 
     * 快递中
	 */
	public void kuaidizhong(String did) throws SQLException, ClassNotFoundException{
		String sql = "update dingdan set dstatus='快递中'where did = "+did;
		DataConnection.getStat().executeUpdate(sql);
			
		}
		/*
		 * 已收货
		 */
	public void yishouhuo(String did) throws SQLException, ClassNotFoundException{
		String sql = "update dingdan set dstatus='已收货'where did = "+did;
		DataConnection.getStat().executeUpdate(sql);
			
		}
	
	
	

	/*
	 * /*
	 * 查找申请中的商品
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
	 * 查看申请中的商品
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
	 * 更新申请中商品
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
 * 删除申请中商品
 */
public void removeapplygoods(String apgid) throws SQLException, ClassNotFoundException{
	String sql = "delete from applygoods where apgid="+apgid;
	DataConnection.getStat().executeUpdate(sql);
}
	
/*
 * 添加申请商品
 */
public void addapplygoods(ApplyGoods a) throws SQLException, ClassNotFoundException{
	String sql="insert into applygoods(apgid,apgname,apgtype,apgcontent,apgstatus,sid,apgprice)values('"+a.getApgid()+"','"
	+a.getApgname()+"','"+a.getApgtype()+"','"+a.getApgcontent()+"','"+a.getApgstatus()+"','"+a.getSid()+"','"+a.getApgprice()+"')";
	System.out.println(sql);
	DataConnection.getStat().executeUpdate(sql);
}
/*
 * 通过获得个人信息
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
 * 更新申请中商品
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
/*订单判断*/
public void Ddanpd(int gid,int gnum) throws SQLException, ClassNotFoundException{
	  String sql = "select*from dingdan where gid="+gid+" and dstatus='人数不够'";
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
	   sql="update dingdan set dstatus='可发货'where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	   sql="delete from panduan where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	  }
	  else{
	   sql="update dingdan set dstatus='人数不够'where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	   sql="delete from panduan where gid="+gid;
	   DataConnection.getStat().executeUpdate(sql);
	  }
	  }
}
public void Yifahuo(String did) throws SQLException, ClassNotFoundException{
	String sql = "update dingdan set dstatus ='已发货' where did="+did;
	DataConnection.getStat().executeUpdate(sql);
}
}
