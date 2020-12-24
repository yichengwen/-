package model;



import java.io.*;
import java.net.*;
import java.sql.*;


public class Server implements MyProtocal {
	Socket s;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	public Server() throws IOException, SQLException {
		ServerSocket ss = new ServerSocket(12312);
		while (true) {
			s = ss.accept();
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			int command = ois.readInt();
			if (command == LOGIN) {
				login();
			} else if (command == REGISTER) {
				register();
			}
		}
	}

	

	public void login() throws IOException, SQLException {
		String name = ois.readUTF();
		String pw = ois.readUTF();
		int num=ois.readInt();
		boolean result = false;
		try{
//			String sql="select*from BiqiBabyUser where uname='"+name+"'and upw='"+pw+"'";
//			ResultSet rs = DataConnection.getStat().executeQuery(sql);
//			if (rs.next())
//				result=true;
			if(num==1){
				String sql="select * from user where uid='"+name+"'and upw='"+pw+"'";
				ResultSet rs = DataConnection.getStat().executeQuery(sql);
				if (rs.next())
					result=true;
			}
			else if(num==2){
				String sql="select * from shop where sid='"+name+"'and spw='"+pw+"'";
				ResultSet rs = DataConnection.getStat().executeQuery(sql);
				if (rs.next())
					result=true;
			}else if(num==3){
				String sql="select * from admin where aid='"+name+"' and apw='"+pw+"'";
				ResultSet rs = DataConnection.getStat().executeQuery(sql);
				if (rs.next())
					result=true;
			}
//			public boolean login(String sid,String spw) throws SQLException, ClassNotFoundException{
//				String sql = "select * from shop where sid='"+sid+"'and spw='"+spw+"'";
//				DataConnection.getStat().executeQuery(sql);
//				ResultSet rs = DataConnection.getStat().executeQuery(sql);
//				
//				if(rs.next())
//					return true;
//				return false;
//
//			}
//			public boolean login(String uid,String upw) throws SQLException, ClassNotFoundException{
//				String sql = "select * from user where uid='"+uid+"'and upw='"+upw+"'";
//				DataConnection.getStat().executeQuery(sql);
//				ResultSet rs = DataConnection.getStat().executeQuery(sql);
//				if(rs.next())
//					return true;
//				return false;
//			}
//			public boolean login(String aid,String apw) throws SQLException, ClassNotFoundException{
//				String sql = "select * from admin where aid='"+aid+"' and apw='"+apw+"'";
//				DataConnection.getStat().executeQuery(sql);
//				ResultSet rs = DataConnection.getStat().executeQuery(sql);
//				if(rs.next())
//					return true;
//				return false;
//			}
		}catch(Exception e){
			e.printStackTrace();
			}
		oos.writeBoolean(result);
		oos.flush();
	}

	public void register() throws IOException {
		String name = ois.readUTF();
		String pw = ois.readUTF();
		
		String msg = "×¢²á³É¹¦";
		try{
//			String sql="insert into BiqiBabyUser(uname,upw) values('"+name+"','"+pw+"')";
//			DataConnection.getStat().executeUpdate(sql);
			
				String sql = "insert into user (uname, upw) values('"+name+"','"+pw+"')";
				DataConnection.getStat().executeUpdate(sql);
			
//			else if(num==2){
//				String sql = "insert into applyshop(sname, spw) values('"+name+"','"+pw+"')";
//				DataConnection.getStat().executeUpdate(sql);
//			}
			}catch(Exception e){
				msg="×¢²áÊ§°Ü";
			}
		oos.writeUTF(msg);
		oos.flush();
	}
//shop
//	public void regshop(String sname,String spw) throws SQLException, ClassNotFoundException{
//		String sql = "insert into shop(sname, spw) values('"+sname+"','"+spw+"')";
//		DataConnection.getStat().executeUpdate(sql);
//
//	}
	//user
//	public void register(String uname,String upw) throws SQLException, ClassNotFoundException{
//		String sql = "insert into user (uname, upw) values('"+uname+"','"+upw+"')";
//		DataConnection.getStat().executeUpdate(sql);
//	}
	public static void main(String[] args) {
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

