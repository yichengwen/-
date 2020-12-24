package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	private int aid;
	private String aname;
    private String apw;
	
    public Admin(){}
	public Admin(String aname, String apw, int aid) {
		super();
		this.aname = aname;
		this.apw = apw;
		this.aid = aid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApw() {
		return apw;
	}
	public void setApw(String apw) {
		this.apw = apw;
	}
	
	/**
	 * 一般功能：1.登录  2.注册
	 * 特殊功能：1. 审批商品上架(查看、驳回、通过) 2.查看被举报用户3.查看被举报内容4.删除他人账号 5.删除他人发布内容 6.下架店铺商品 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	//显示注册店铺
	 public ArrayList<ApplyShop> RegisterShop(String msg)throws SQLException, ClassNotFoundException{
	  ArrayList<ApplyShop>shops=new ArrayList<ApplyShop>();
	  String sql;
	  try{
	   int n=Integer.parseInt(msg);
	   sql="select * from applyshop where apsid="+n;
	  }catch(Exception e){
	   sql="select * from applyshop where apstatus like'%"+msg+"%'";
	  }
	  ResultSet rs=DataConnection.getStat().executeQuery(sql);
	  while(rs.next()){
	   shops.add(new ApplyShop(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
	  }
	  return shops;
	 }
	 public ApplyShop viewApplyshop(String apsid) throws SQLException, ClassNotFoundException{
			ApplyShop aps=null;
			String sql="select * from applyshop where apsid="+apsid;
			ResultSet rs=DataConnection.getStat().executeQuery(sql);
			if(rs.next()){
				aps=new ApplyShop(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
			return aps;
		}
	 public ArrayList<String>  getApplyShop(String apsid) throws SQLException, ClassNotFoundException{
			ArrayList<String>details=new ArrayList<String>();
			String sql="select * from ApplyShop where apsid="+apsid;
			ResultSet rs=DataConnection.getStat().executeQuery(sql);
			if(rs.next()){
				details.add(rs.getString(1));
				details.add(rs.getString(2));
				details.add(rs.getString(3));
				details.add(rs.getString(4));
				details.add(rs.getString(5));
				details.add(rs.getString(6));
			}
			return details;
		}
	 public void acceptApplyShop(int apsid) throws SQLException, ClassNotFoundException{
			String sql="update applyshop set apstatus='批准'where apsid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
	 public void acceptAddShop(String sname,String spw,String sintroduct,String uid) throws SQLException, ClassNotFoundException{
			String sql="insert into Shop(sname,spw,sintroduce,uid)values('"+sname+"','"+spw+"','"+sintroduct+"','"+uid+"')";
			DataConnection.getStat().executeUpdate(sql);
		}
		public void rejectApplyShop(int apsid) throws SQLException, ClassNotFoundException{
			String sql="update applyshop set apstatus='拒绝'where apsid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
		public void removeApplyShop(String apsid) throws SQLException, ClassNotFoundException{
			String sql="delete from applyshop where apsid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
		
		
		
		
		
		
		
	 //显示注册商品
	 public ArrayList<ApplyGoods> RegisterGoods(String msg)throws SQLException, ClassNotFoundException{
	  ArrayList<ApplyGoods>Rgoods=new ArrayList<ApplyGoods>();
	  String sql;
	  try{
	   int n=Integer.parseInt(msg);
	   sql="select * from applygoods where apgid="+n;
	  }catch(Exception e){
	   sql="select * from applygoods where apgstatus like'%"+msg+"%'";
	  }
	  ResultSet rs=DataConnection.getStat().executeQuery(sql);
	  while(rs.next()){
//		                        apgid,          apgname,        apgtype,      apgcontent,      apgstatus,       apgprice,   sid
	   Rgoods.add(new ApplyGoods(rs.getInt(1),rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(3),rs.getInt(7)));
	  }
	  return Rgoods;
	 }
	 
	 public ApplyGoods viewApplyGoods(String apgid) throws SQLException, ClassNotFoundException{
			ApplyGoods apg=null;
			String sql="select * from applygoods where apgid="+apgid;
			ResultSet rs=DataConnection.getStat().executeQuery(sql);
			if(rs.next()){
				apg=new ApplyGoods(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
				
			}
			return apg;
		}
	 public ArrayList<String>  getApplyGoods(String apgid) throws SQLException, ClassNotFoundException{
			ArrayList<String>details=new ArrayList<String>();
			String sql="select * from applygoods where apgid="+apgid;
			ResultSet rs=DataConnection.getStat().executeQuery(sql);
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
	 public void acceptApplyGoods(int apgid) throws SQLException, ClassNotFoundException{
			String sql="update applygoods set apgstatus='批准上架'where apgid="+apgid;
			DataConnection.getStat().executeUpdate(sql);
		}
	 public void acceptAddGoods(String gname,int sid,String gcontent,String gtype,String gprice) throws SQLException, ClassNotFoundException{
			String sql="insert into goods(gname,sid,gcontent,gtype,gprice)values('"+gname+"','"+sid+"','"+gcontent+"','"+gtype+"','"+gprice+"')";
			DataConnection.getStat().executeUpdate(sql);
		}
		public void rejectApplyGoods(int apsid) throws SQLException, ClassNotFoundException{
			String sql="update applygoods set apgstatus='不批准'where apgid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
		public void removeApplyGoods(String apsid) throws SQLException, ClassNotFoundException{
			String sql="delete from applygoods where apgid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
		
		
		
		
		
		
		
		
		
		
		
	 //显示举报的商品
	 public ArrayList<Jubao> JubaoGoods(String msg)throws SQLException, ClassNotFoundException{
	  ArrayList<Jubao>Rgoods=new ArrayList<Jubao>();
	  String sql;
	  try{
	   int n=Integer.parseInt(msg);
	   sql="select * from jubao where jid="+n;
	  }catch(Exception e){
	   sql="select * from jubao where gstatus like'%"+msg+"%'";
	  }
	  ResultSet rs=DataConnection.getStat().executeQuery(sql);
	  while(rs.next()){
	   Rgoods.add(new Jubao(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
	  }
	  return Rgoods;
	 }
	 public Jubao viewJubaoGoods(String jid) throws SQLException, ClassNotFoundException{
		 Jubao j=null;
			String sql="select * from jubao where jid="+jid;
			ResultSet rs=DataConnection.getStat().executeQuery(sql);
			if(rs.next()){
				j=new Jubao(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				
			}
			return j;
		}
	 public ArrayList<String>  getJubao(String jid) throws SQLException, ClassNotFoundException{
			ArrayList<String>details=new ArrayList<String>();
			String sql="select * from jubao where jid="+jid;
			ResultSet rs=DataConnection.getStat().executeQuery(sql);
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
	 public void ReadJubao(int apgid) throws SQLException, ClassNotFoundException{
			String sql="update jubao set gstatus='已读'where jid="+apgid;
			DataConnection.getStat().executeUpdate(sql);
		}
	 
		public void okJubao(int apsid) throws SQLException, ClassNotFoundException{
			String sql="update jubao set gstatus='已处理'where jid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
		public void removeJubao(String apsid) throws SQLException, ClassNotFoundException{
			String sql="delete from jubao where jid="+apsid;
			DataConnection.getStat().executeUpdate(sql);
		}
	 //显示商平
		 public ArrayList<Goods> searchGoods(String msg)throws SQLException, ClassNotFoundException{
			  ArrayList<Goods>Sgoods=new ArrayList<Goods>();
			  String sql;
			  try{
			   int n=Integer.parseInt(msg);
			   sql="select * from goods where gid="+n;
			  }catch(Exception e){
			   sql="select * from goods where gtype like'%"+msg+"%'";
			  }
			  ResultSet rs=DataConnection.getStat().executeQuery(sql);
			  while(rs.next()){
				  //int gid, int sid, int gprice, String gname, int gnum,String gcentent, String gtype
					
			   Sgoods.add(new Goods(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8)));
			  }
			  return Sgoods;
			 }
			 
			 public Goods viewGoods(String gid) throws SQLException, ClassNotFoundException{
					Goods g=null;
					String sql="select * from goods where gid="+gid;
					ResultSet rs=DataConnection.getStat().executeQuery(sql);
					if(rs.next()){
						g=new Goods(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8));
						
					}
					return g;
				}
			 public ArrayList<String>  getGoods(String gid) throws SQLException, ClassNotFoundException{
					ArrayList<String>details=new ArrayList<String>();
					String sql="select * from goods where gid="+gid;
					ResultSet rs=DataConnection.getStat().executeQuery(sql);
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
			 
			 public void removeGoods(String gid) throws SQLException, ClassNotFoundException{
					String sql="delete from Goods where gid="+gid;
					DataConnection.getStat().executeUpdate(sql);
				}
			 //, int sid, int gprice, String gname, int gnum,String gcentent, String gtype
			 public void AddGoods(int sid, int gprice, String gname, int gnum,String gcentent, String gtype) throws SQLException, ClassNotFoundException{
					String sql="insert into Goods(sid,gprice,gname,gnum,gcentent,gtype)values("+sid+","+gprice+",'"+gname+"',"+gnum+",'"+gcentent+"','"+gtype+"')";
					DataConnection.getStat().executeUpdate(sql);
				}
			 
			 
			 
			 
			 //商店
			 public ArrayList<Shop> searchShop(String msg)throws SQLException, ClassNotFoundException{
				  ArrayList<Shop>shops=new ArrayList<Shop>();
				  String sql;
				  try{
				   int n=Integer.parseInt(msg);
				   sql="select * from shop where sid="+n;
				  }catch(Exception e){
				   sql="select * from shop where sname like'%"+msg+"%'";
				  }
				  ResultSet rs=DataConnection.getStat().executeQuery(sql);
				  while(rs.next()){
				   shops.add(new Shop(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
				  }
				  return shops;
				 }
				 public Shop viewshop(String sid) throws SQLException, ClassNotFoundException{
						Shop s=null;
						String sql="select * from shop where sid="+sid;
						ResultSet rs=DataConnection.getStat().executeQuery(sql);
						if(rs.next()){
							s=new Shop(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
						}
						return s;
					}
				 public ArrayList<String>  getShop(String sid) throws SQLException, ClassNotFoundException{
						ArrayList<String>details=new ArrayList<String>();
						String sql="select * from Shop where sid="+sid;
						ResultSet rs=DataConnection.getStat().executeQuery(sql);
						if(rs.next()){
							details.add(rs.getString(1));
							details.add(rs.getString(2));
							details.add(rs.getString(3));
							details.add(rs.getString(4));
							details.add(rs.getString(5));
						}
						return details;
					}
				 public void removeShop(String sid) throws SQLException, ClassNotFoundException{
						String sql="delete from shop where sid="+sid;
						DataConnection.getStat().executeUpdate(sql);
					}
				 public void AddShop(String sname,String spw,String sintroduce) throws SQLException, ClassNotFoundException{
						String sql="insert into Shop(sname,spw,sintroduce)values('"+sname+"','"+spw+"','"+sintroduce+"')";
						DataConnection.getStat().executeUpdate(sql);
					}
			 //user
				 public ArrayList<User> searchUser(String msg)throws SQLException, ClassNotFoundException{
					  ArrayList<User>users=new ArrayList<User>();
					  String sql;
					  try{
					   int n=Integer.parseInt(msg);
					   sql="select * from User where uid="+n;
					  }catch(Exception e){
					   sql="select * from User where uname like'%"+msg+"%'";
					  }
					  ResultSet rs=DataConnection.getStat().executeQuery(sql);
					  while(rs.next()){
						//  String uname, String upw, int uid, String uscore, String uadress,String uphone, String uimg
						  users.add(new User(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
					  }
					  return users;
					 }
					 public User viewUser(String uid) throws SQLException, ClassNotFoundException{
						 User u=null;
							String sql="select * from user where uid="+uid;
							ResultSet rs=DataConnection.getStat().executeQuery(sql);
							if(rs.next()){
								u=new User(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
							}
							return u;
						}
					 public ArrayList<String>  getUser(String uid) throws SQLException, ClassNotFoundException{
							ArrayList<String>details=new ArrayList<String>();
							String sql="select * from User where uid="+uid;
							ResultSet rs=DataConnection.getStat().executeQuery(sql);
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
					 public void removeUser(String sid) throws SQLException, ClassNotFoundException{
							String sql="delete from User where uid="+sid;
							DataConnection.getStat().executeUpdate(sql);
						}
			 
					 public void AddUser(String sname,String spw,String sintroduce) throws SQLException, ClassNotFoundException{
							String sql="insert into user(uname,upw,uphone)values('"+sname+"','"+spw+"','"+sintroduce+"')";
							DataConnection.getStat().executeUpdate(sql);
						}
			 
			 
			 
	 
}
