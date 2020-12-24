/*
 * ShopMainView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.*;

/**
 *
 * @author  __USER__
 */
public class ShopMainView extends javax.swing.JFrame {
	String sid;

	/** Creates new form ShopMainView */
	public ShopMainView(String sid) {
		this.sid = sid;
		initComponents();
		this.setLocationRelativeTo(null);
		try {
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void init() throws SQLException, ClassNotFoundException {
		searchgoods("");
		searchapplygoods("");
		searchdingdan("");
	}

	Shop s = new Shop();

	private void searchgoods(String msg) throws SQLException,
			ClassNotFoundException {

		Object[] titles = { "商品编号", "商品名称", "商品价格 ", "商品数量" };
		ArrayList<Goods> goods = s.searchgoods(msg, sid);
		Object[][] detail = new Object[goods.size()][4];

		for (int i = 0; i < goods.size(); i++) {
			detail[i][0] = goods.get(i).getGid();
			detail[i][1] = goods.get(i).getGname();
			detail[i][2] = goods.get(i).getGprice();
			detail[i][3] = goods.get(i).getGnum();
		}
		this.jTable1.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchdingdan(String msg) throws SQLException,
			ClassNotFoundException {

		Object[] titles = { "订单编号", "商品名字", "商品ID", "购买用户ID", "用户地址", "用户电话",
				"店铺ID", "订单状态" };
		ArrayList<Dingdan> dingdan = s.searchdingdan(msg);
		Object[][] detail = new Object[dingdan.size()][8];

		for (int i = 0; i < dingdan.size(); i++) {
			detail[i][0] = dingdan.get(i).getDid();
			detail[i][1] = dingdan.get(i).getGname();
			detail[i][2] = dingdan.get(i).getGid();
			detail[i][3] = dingdan.get(i).getUid();
			detail[i][4] = dingdan.get(i).getUaddress();
			detail[i][5] = dingdan.get(i).getUphone();
			detail[i][6] = dingdan.get(i).getSid();
			detail[i][7] = dingdan.get(i).getDstatus();
		}
		this.jTable2.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchapplygoods(String msg) throws SQLException,
			ClassNotFoundException {

		Object[] titles = { "商品编号", "商品名称", "商品种类", "商品介绍", "商品状态", "申请人",
				"商品价格 " };
		ArrayList<ApplyGoods> applygoods = s.searchapplygoods(msg);
		Object[][] detail = new Object[applygoods.size()][7];

		for (int i = 0; i < applygoods.size(); i++) {
			detail[i][0] = applygoods.get(i).getApgid();
			detail[i][1] = applygoods.get(i).getApgname();
			detail[i][2] = applygoods.get(i).getApgtype();
			detail[i][3] = applygoods.get(i).getApgcontent();
			detail[i][4] = applygoods.get(i).getApgstatus();
			detail[i][5] = applygoods.get(i).getApgprice();
			detail[i][6] = applygoods.get(i).getSid();

		}
		this.jTable3.setModel(new DefaultTableModel(detail, titles));
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTextField2 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jTextField1 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jTextField3 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton1.setText("\u5546\u5bb6\u4e2a\u4eba\u4fe1\u606f");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTabbedPane1.setForeground(new java.awt.Color(205, 205, 255));
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));

		jPanel2.setBackground(new java.awt.Color(236, 227, 228));

		jTable1.setBackground(new java.awt.Color(236, 227, 228));
		jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton4.setText("\u67e5\u627e\u5546\u54c1");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton6.setText("\u67e5\u770b\u5546\u54c1");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton7.setText("\u5220\u9664\u5546\u54c1");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton8.setText("\u66f4\u65b0\u5546\u54c1");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																552,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												50, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButton4)
														.addComponent(jButton6)
														.addComponent(jButton7)
														.addComponent(jButton8))
										.addGap(44, 44, 44)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				524,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				69,
																				69,
																				69)
																		.addComponent(
																				jButton6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton7)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton8)))));

		jTabbedPane1.addTab("\u5546\u54c1", jPanel2);

		jPanel3.setBackground(new java.awt.Color(236, 227, 228));

		jTable2.setBackground(new java.awt.Color(236, 227, 228));
		jTable2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton3.setText("\u67e5\u627e\u8ba2\u5355");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton10.setText("\u67e5\u770b\u8ba2\u5355");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton11.setText("\u5220\u9664\u8ba2\u5355");
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
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(9, 9, 9)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																561,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												36, Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton10,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton11,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addGap(52, 52, 52)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(34, 34, 34)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(81, 81, 81)
										.addComponent(jButton10)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton11).addGap(365,
												365, 365)).addGroup(
								jPanel3Layout.createSequentialGroup().addGap(
										78, 78, 78).addComponent(jScrollPane2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										501, Short.MAX_VALUE)
										.addGap(14, 14, 14)));

		jTabbedPane1.addTab("\u8ba2\u5355", jPanel3);

		jPanel4.setBackground(new java.awt.Color(236, 227, 228));

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton5.setText("\u67e5\u627e\u7533\u8bf7\u5546\u54c1");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jTable3.setBackground(new java.awt.Color(236, 227, 228));
		jTable3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(jTable3);

		jButton14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton14.setText("\u67e5\u770b\u7533\u8bf7\u5546\u54c1");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton15.setText("\u5220\u9664\u7533\u8bf7\u5546\u54c1");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton16.setText("\u66f4\u65b0\u7533\u8bf7\u5546\u54c1");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton17.setText("\u6dfb\u52a0\u7533\u8bf7\u5546\u54c1");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane3,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																547,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton14,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton15,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton16,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton17,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addGap(52, 52, 52)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton5)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				30,
																				Short.MAX_VALUE)
																		.addComponent(
																				jScrollPane3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				502,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				73,
																				73,
																				73)
																		.addComponent(
																				jButton14)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton15)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton16)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton17)
																		.addContainerGap()))));

		jTabbedPane1.addTab("\u7533\u8bf7\u4e0a\u67b6\u5546\u54c1", jPanel4);

		jButton9.setText("X");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												570, Short.MAX_VALUE)
										.addComponent(jButton9)
										.addContainerGap()).addComponent(
								jTabbedPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 776,
								Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(14, 14, 14)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton9)
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												14, Short.MAX_VALUE)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												619,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new ShopView(sid).setVisible(true);
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		String apgid = JOptionPane.showInputDialog("请输入需要删除的商品编号");
		int n = JOptionPane
				.showConfirmDialog(this, "确定要删除编号" + apgid + "的订单吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;

				details = s.getApplyGoods(apgid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "商品不存在");
				else {
					s.getApplyGoods(apgid);
					s.removeapplygoods(apgid);
					JOptionPane.showMessageDialog(this, "删除成功");
					this.searchapplygoods("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "删除失败，请确认删除的商品");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		String apgid = JOptionPane.showInputDialog(this, "请输入更新申请商品的编号");
		ArrayList<String> details;
		try {
			details = s.getApplyGoods(apgid);
			if (details.size() == 0)
				JOptionPane.showMessageDialog(this, "该商品不存在");
			else
				new SViewApplyGoodsView(apgid).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		new SAddApplyGoodsView(sid).setVisible(true);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = this.jTextField3.getText();
		try {
			this.searchapplygoods(msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		String apgid = JOptionPane.showInputDialog(this, "请输入查看申请商品的编号");
		ArrayList<String> details;
		try {
			details = s.getApplyGoods(apgid);
			if (details.size() == 0)
				JOptionPane.showMessageDialog(this, "该申请商品不存在");
			else
				new GoodsView(details).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		String did = JOptionPane.showInputDialog("请输入需要删除的订单编号");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除编号" + did + "的订单吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;

				details = s.getDingdan(did);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "订单不存在");
				else {
					s.getDingdan(did);
					s.removedingdan(did);
					JOptionPane.showMessageDialog(this, "删除成功");
					this.searchdingdan("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "删除失败，请确认删除的订单");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		String did = JOptionPane.showInputDialog(this, "请输入要查看的订单编号");
		Dingdan d;
		try {
			d = s.viewDingdan(did);
			if (d == null)
				JOptionPane.showMessageDialog(this, "输入错误");
			else
				new SViewDingdanView(d).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = this.jTextField1.getText();
		try {
			this.searchdingdan(msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String gid = JOptionPane.showInputDialog("请输入需要删除的商品编号");
		int n = JOptionPane.showConfirmDialog(this, "确定要删除编号为" + gid + "的商品吗？");
		if (n == JOptionPane.OK_OPTION) {
			try {
				ArrayList<String> details;

				details = s.getGoods(gid);
				if (details.size() == 0)
					JOptionPane.showMessageDialog(this, "商品不存在");
				else {
					s.getGoods(gid);
					s.removeGoods(gid);
					JOptionPane.showMessageDialog(this, "删除成功");
					this.searchgoods("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "删除失败，请确认删除的商品编号");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String gid = JOptionPane.showInputDialog(this, "请输入查看商品的编号");
		ArrayList<String> details;
		try {
			details = s.getGoods(gid);
			if (details.size() == 0)
				JOptionPane.showMessageDialog(this, "该商品不存在");
			else
				new GoodsView(details).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		String gid = JOptionPane.showInputDialog(this, "请输入更新商品的编号");
		ArrayList<String> details;
		try {
			details = s.getGoods(gid);
			if (details.size() == 0)
				JOptionPane.showMessageDialog(this, "该商品不存在");
			else
				new UpdateGoodsView(gid).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = this.jTextField2.getText();
		try {
			this.searchgoods(msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new ShopMainView().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}