/*
 * AdminMainView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Admin;
import model.ApplyGoods;
import model.ApplyShop;
import model.Goods;
import model.Jubao;
import model.Shop;
import model.User;

/**
 *
 * @author  __USER__
 */
public class AdminMainView extends javax.swing.JFrame {
	Admin a = new Admin();

	/** Creates new form AdminMainView */
	public AdminMainView() {
		initComponents();

		try {
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setLocationRelativeTo(null);
	}

	public void init() throws SQLException, ClassNotFoundException {
		RegisterShop("");
		RegisterGoods("");
		JubaoGoods("");
		searchShop("");
		searchGoods("");
		searchUser("");
	}

	//	Shop s=new Shop();
	//	 private void searchStu(String msg) throws SQLException, ClassNotFoundException {
	//	  Object[] titles = { "店铺ID", "店铺名", "密码" };
	//	  ArrayList<Shop> stus = s.searchStu(msg);
	//	  Object[][] detail = new Object[stus.size()][3];
	//	  for (int i = 0; i < stus.size(); i++) {
	//	   detail[i][0] = stus.get(i).getSid();
	//	   detail[i][1] = stus.get(i).getSname();
	//	   detail[i][2] = stus.get(i).getSpw();
	//	  }
	//	  this.jTable1.setModel(new DefaultTableModel(detail, titles));
	//	 }

	private void RegisterShop(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "申请号", "店铺名", "申请状态" };
		ArrayList<ApplyShop> Rshop = a.RegisterShop(msg);
		Object[][] detail = new Object[Rshop.size()][3];
		for (int i = 0; i < Rshop.size(); i++) {
			detail[i][0] = Rshop.get(i).getApsid();
			detail[i][1] = Rshop.get(i).getApsname();
			detail[i][2] = Rshop.get(i).getApstatus();
		}
		this.jTable1.setModel(new DefaultTableModel(detail, titles));
	}

	private void RegisterGoods(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "申请号", "申请人", "商品名", "商品类型", "申请状态" };
		ArrayList<ApplyGoods> Rgoods = a.RegisterGoods(msg);
		Object[][] detail = new Object[Rgoods.size()][5];
		for (int i = 0; i < Rgoods.size(); i++) {
			detail[i][0] = Rgoods.get(i).getApgid();
			detail[i][1] = Rgoods.get(i).getSid();
			detail[i][2] = Rgoods.get(i).getApgname();
			detail[i][3] = Rgoods.get(i).getApgtype();
			detail[i][4] = Rgoods.get(i).getApgstatus();
		}
		this.jTable2.setModel(new DefaultTableModel(detail, titles));
	}

	private void JubaoGoods(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "举报号", "举报人", "举报物", "举报类型", "举报状态" };
		ArrayList<Jubao> Jgoods = a.JubaoGoods(msg);
		Object[][] detail = new Object[Jgoods.size()][5];
		for (int i = 0; i < Jgoods.size(); i++) {
			detail[i][0] = Jgoods.get(i).getJid();
			detail[i][1] = Jgoods.get(i).getUid();
			detail[i][2] = Jgoods.get(i).getGid();
			detail[i][3] = Jgoods.get(i).getJtype();
			detail[i][4] = Jgoods.get(i).getGstatus();
		}
		this.jTable3.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchShop(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "店铺号", "店铺名" };
		ArrayList<Shop> Rshop = a.searchShop(msg);
		Object[][] detail = new Object[Rshop.size()][2];
		for (int i = 0; i < Rshop.size(); i++) {
			detail[i][0] = Rshop.get(i).getSid();
			detail[i][1] = Rshop.get(i).getSname();

		}
		this.jTable6.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchGoods(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "商品号", "店家", "商品名", "商品类型" };
		ArrayList<Goods> Rgoods = a.searchGoods(msg);
		Object[][] detail = new Object[Rgoods.size()][4];
		for (int i = 0; i < Rgoods.size(); i++) {
			detail[i][0] = Rgoods.get(i).getGid();
			detail[i][1] = Rgoods.get(i).getSid();
			detail[i][2] = Rgoods.get(i).getGname();
			detail[i][3] = Rgoods.get(i).getGtype();

		}
		this.jTable7.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchUser(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "id号", "用户名", "手机号" };
		ArrayList<User> users = a.searchUser(msg);
		Object[][] detail = new Object[users.size()][4];
		for (int i = 0; i < users.size(); i++) {
			detail[i][0] = users.get(i).getUid();
			detail[i][1] = users.get(i).getUname();
			detail[i][2] = users.get(i).getUphone();

		}
		this.jTable4.setModel(new DefaultTableModel(detail, titles));
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton4 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jComboBox3 = new javax.swing.JComboBox();
		jButton10 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		jButton11 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jComboBox4 = new javax.swing.JComboBox();
		jButton14 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jScrollPane7 = new javax.swing.JScrollPane();
		jTable7 = new javax.swing.JTable();
		jButton27 = new javax.swing.JButton();
		jButton28 = new javax.swing.JButton();
		jButton29 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jPanel7 = new javax.swing.JPanel();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTable6 = new javax.swing.JTable();
		jButton23 = new javax.swing.JButton();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jTabbedPane1.setBackground(new java.awt.Color(236, 227, 228));
		jTabbedPane1.setForeground(new java.awt.Color(204, 204, 225));
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));

		jPanel2.setBackground(new java.awt.Color(236, 227, 240));

		jTable1.setBackground(new java.awt.Color(236, 227, 228));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton4.setText("\u67e5\u770b");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton6.setText("\u5220\u9664");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton6ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jComboBox3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"全部", "申请中", "已批准", "不批准" }));

		jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton10.setText("\u786e\u5b9a");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton5.setText("\u9000\u51fa");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButton4)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				319,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton6))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jComboBox3,
																				0,
																				364,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton10)))
										.addGap(35, 35, 35)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												422,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton10)
														.addComponent(
																jComboBox3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(14, 14, 14)
										.addComponent(jButton4)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton6)
														.addComponent(jButton5))
										.addContainerGap(56, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u5e97\u94fa\u7533\u8bf7", jPanel2);

		jPanel3.setBackground(new java.awt.Color(236, 227, 240));

		jTable2.setBackground(new java.awt.Color(236, 227, 228));
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton8.setText("\u67e5\u770b");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton8ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton9.setText("\u5220\u9664");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton9ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"全部", "申请中", "已上架", "不批准" }));

		jButton11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton11.setText("\u786e\u5b9a");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jComboBox1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												362,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton9)
														.addComponent(jButton8)
														.addComponent(jButton11))
										.addContainerGap(31, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												389,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton11)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26).addComponent(
												jButton8).addGap(18, 18, 18)
										.addComponent(jButton9)
										.addContainerGap(77, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u4e0a\u67b6\u5546\u54c1\u7533\u8bf7", jPanel3);

		jPanel4.setBackground(new java.awt.Color(236, 227, 240));

		jTable3.setBackground(new java.awt.Color(236, 227, 228));
		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(jTable3);

		jButton12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton12.setText("\u67e5\u770b");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton12ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton13.setText("\u5220\u9664");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton13ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("\u4e3e\u62a5\u72b6\u6001\uff1a");

		jComboBox4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"所有", "未读", "已读", "已解决" }));
		jComboBox4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox4ActionPerformed(evt);
			}
		});

		jButton14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton14.setText("\u786e\u5b9a");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(45, 45, 45)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jComboBox4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												239,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton14)
										.addContainerGap(37, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap(181, Short.MAX_VALUE)
										.addComponent(jButton12)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton13).addGap(161,
												161, 161)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addComponent(
						jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
						418, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(46,
						46, 46).addGroup(
						jPanel4Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton14)).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57,
						Short.MAX_VALUE).addGroup(
						jPanel4Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton13)
								.addComponent(jButton12)).addGap(40, 40, 40)));

		jTabbedPane1.addTab("\u4e3e\u62a5", jPanel4);

		jPanel5.setBackground(new java.awt.Color(236, 227, 240));

		jTable4.setBackground(new java.awt.Color(236, 227, 228));
		jTable4.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane4.setViewportView(jTable4);

		jButton15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton15.setText("\u589e\u52a0");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton16.setText("\u5220\u9664");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton16ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton17.setText("\u67e5\u770b");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton17ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton2.setText("\u5237\u65b0");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane4,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton15)
										.addGap(56, 56, 56)
										.addComponent(jButton16)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												61, Short.MAX_VALUE)
										.addComponent(jButton17).addGap(65, 65,
												65).addComponent(jButton2)
										.addGap(34, 34, 34)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												418,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(63, 63, 63)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton15)
														.addComponent(jButton16)
														.addComponent(jButton17)
														.addComponent(jButton2))
										.addContainerGap(113, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7528\u6237", jPanel5);

		jPanel6.setBackground(new java.awt.Color(236, 227, 240));

		jTable7.setBackground(new java.awt.Color(236, 227, 228));
		jTable7.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane7.setViewportView(jTable7);

		jButton27.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton27.setText("\u589e\u52a0");
		jButton27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton27ActionPerformed(evt);
			}
		});

		jButton28.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton28.setText("\u5220\u9664");
		jButton28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton28ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton29.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton29.setText("\u67e5\u770b");
		jButton29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton29ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton1.setText("\u5237\u65b0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane7,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton27)
										.addGap(56, 56, 56)
										.addComponent(jButton28)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												85, Short.MAX_VALUE)
										.addComponent(jButton29).addGap(53, 53,
												53).addComponent(jButton1)
										.addGap(22, 22, 22)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												418,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(77, 77, 77)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton27)
														.addComponent(jButton28)
														.addComponent(jButton29)
														.addComponent(jButton1))
										.addContainerGap(99, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u5546\u54c1", jPanel6);

		jPanel7.setBackground(new java.awt.Color(236, 227, 240));

		jTable6.setBackground(new java.awt.Color(236, 227, 228));
		jTable6.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane6.setViewportView(jTable6);

		jButton23.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton23.setText("\u589e\u52a0");
		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});

		jButton24.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton24.setText("\u5220\u9664");
		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton24ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton25.setText("\u67e5\u770b");
		jButton25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton25ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton3.setText("\u5237\u65b0");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane6,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addComponent(jButton23)
										.addGap(56, 56, 56)
										.addComponent(jButton24)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												61, Short.MAX_VALUE)
										.addComponent(jButton25).addGap(55, 55,
												55).addComponent(jButton3)
										.addGap(36, 36, 36)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												418,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(69, 69, 69)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton23)
														.addComponent(jButton24)
														.addComponent(jButton25)
														.addComponent(jButton3))
										.addContainerGap(107, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u5e97\u5bb6", jPanel7);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665,
				Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			this.searchShop("");
			JOptionPane.showMessageDialog(this, "ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "no");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			this.searchUser("");
			JOptionPane.showMessageDialog(this, "ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "no");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			this.searchGoods("");
			JOptionPane.showMessageDialog(this, "ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "no");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton29ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apgid = JOptionPane.showInputDialog("请输入要查看的上架申请号");
		Goods apg;
		try {
			apg = a.viewGoods(apgid);
			if (apg == null)
				JOptionPane.showMessageDialog(this, "null");
			else
				new AGoodsView(apg).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton28ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要删除的商品");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除的id号" + apsid
				+ "的商品吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;
				details = a.getGoods(apsid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "学号不存在");
				else {
					a.getGoods(apsid);
					a.removeGoods(apsid);
					JOptionPane.showMessageDialog(this, "成功");
					this.searchGoods("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "失败");
			}
		}

	}

	private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new AddGoods().setVisible(true);

	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要删除的店铺");
		int n = JOptionPane
				.showConfirmDialog(this, "确定要删除的号" + apsid + "的店铺吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;
				details = a.getShop(apsid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "学号不存在");
				else {
					a.getShop(apsid);
					a.removeShop(apsid);
					JOptionPane.showMessageDialog(this, "成功");
					this.searchShop("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "失败");
			}
		}

	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new AddShop().setVisible(true);
	}

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要查看的店面号");
		Shop aps;
		try {
			aps = a.viewshop(apsid);

			if (aps == null)
				JOptionPane.showMessageDialog(this, "null");
			else
				new AShopView(aps).setVisible(true);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton24A3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2n21ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButtoton19ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apgid = JOptionPane.showInputDialog("请输入要查看的上架申请号");
		User apg;
		try {
			apg = a.viewUser(apgid);
			if (apg == null)
				JOptionPane.showMessageDialog(this, "null");
			else
				new ViewUser(apg).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要删除的用户");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除的id号" + apsid
				+ "的用户吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;
				details = a.getUser(apsid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "学号不存在");
				else {
					a.getUser(apsid);
					a.removeUser(apsid);
					JOptionPane.showMessageDialog(this, "成功");
					this.searchUser("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "失败");
			}
		}

	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		try {
			String name = JOptionPane.showInputDialog("请输入用户名");
			String pw = JOptionPane.showInputDialog("请输入用户密码");
			String phone = JOptionPane.showInputDialog("请输入用户手机");
			a.AddUser(name, pw, phone);
			JOptionPane.showMessageDialog(this, "ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "no");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int choice = this.jComboBox4.getSelectedIndex();
		try {
			if (choice == 0) {
				this.JubaoGoods("");
			}
			if (choice == 1) {
				this.JubaoGoods("未读");
			}
			if (choice == 2) {
				this.JubaoGoods("已读");
			}
			if (choice == 3) {
				this.JubaoGoods("已处理");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int choice = this.jComboBox1.getSelectedIndex();
		try {
			if (choice == 0) {
				this.RegisterGoods("");
			}
			if (choice == 1) {
				this.RegisterGoods("申请中");
			}
			if (choice == 2) {
				this.RegisterGoods("上架");
			}
			if (choice == 3) {
				this.RegisterGoods("不批准");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int choice = this.jComboBox3.getSelectedIndex();
		try {
			if (choice == 0) {
				this.RegisterShop("");
			}
			if (choice == 1) {
				this.RegisterShop("申请中");
			}
			if (choice == 2) {
				this.RegisterShop("批准");
			}
			if (choice == 3) {
				this.RegisterShop("拒绝");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要删除的举报单号");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除的单号" + apsid
				+ "的举报吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;
				details = a.getJubao(apsid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "举报不存在");
				else {
					a.getJubao(apsid);
					a.removeJubao(apsid);
					JOptionPane.showMessageDialog(this, "成功");
					this.JubaoGoods("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "失败");
			}
		}
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String jid = JOptionPane.showInputDialog("请输入要查看的店面申请号");
		Jubao j;
		try {
			j = a.viewJubaoGoods(jid);
			if (j == null)
				JOptionPane.showMessageDialog(this, "null");
			else
				new JubaoView(j).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要删除的上架申请单号");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除的单号" + apsid
				+ "的上架申请吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;
				details = a.getApplyGoods(apsid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "号不存在");
				else {
					a.getApplyGoods(apsid);
					a.removeApplyGoods(apsid);
					JOptionPane.showMessageDialog(this, "成功");
					this.RegisterGoods("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "失败");
			}
		}
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apgid = JOptionPane.showInputDialog("请输入要查看的上架申请号");
		ApplyGoods apg;
		try {
			apg = a.viewApplyGoods(apgid);
			if (apg == null)
				JOptionPane.showMessageDialog(this, "null");
			else
				new ApplyGoodsView(apg).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		String apsid = JOptionPane.showInputDialog("请输入要删除的申请单号");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除的单号" + apsid
				+ "的申请吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;
				details = a.getApplyShop(apsid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "学号不存在");
				else {
					a.getApplyShop(apsid);
					a.removeApplyShop(apsid);
					JOptionPane.showMessageDialog(this, "成功");
					this.RegisterShop("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "失败");
			}
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		String apsid = JOptionPane.showInputDialog("请输入要查看的店面申请号");
		ApplyShop aps;
		try {
			aps = a.viewApplyshop(apsid);

			if (aps == null)
				JOptionPane.showMessageDialog(this, "null");
			else
				new ApplyShopView(aps).setVisible(true);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminMainView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton27;
	private javax.swing.JButton jButton28;
	private javax.swing.JButton jButton29;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable6;
	private javax.swing.JTable jTable7;
	// End of variables declaration//GEN-END:variables

}