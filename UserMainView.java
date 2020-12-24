/*
 * UserMainView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Shop;
import model.Sixin;
import model.SocialContent;
import model.User;

/**
 *
 * @author  __USER__
 */
public class UserMainView extends javax.swing.JFrame {
	String uid;
	User u = new User();

	/** Creates new form UserMainView */
	public UserMainView(String uid) {
		this.uid = uid;
		initComponents();
		this.setLocationRelativeTo(null);
		try {
			search("");
			searchSixin("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void search(String msg) throws SQLException, ClassNotFoundException {
		Object[] titles = { "宝圈ID", "宝圈内容", "用户名" };
		ArrayList<SocialContent> SC = u.searchSC(msg, uid);
		Object[][] detail = new Object[SC.size()][3];
		for (int i = 0; i < SC.size(); i++) {
			detail[i][0] = SC.get(i).getCid();
			detail[i][1] = SC.get(i).getContent();
			detail[i][2] = SC.get(i).getUname();
		}
		this.jTable1.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchSixin(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "发送人用户名", "私信内容", "发送对象用户名" };
		ArrayList<Sixin> SX = u.searchSX(msg, uid);
		Object[][] detail = new Object[SX.size()][3];
		for (int i = 0; i < SX.size(); i++) {
			detail[i][0] = SX.get(i).getBrname();
			detail[i][1] = SX.get(i).getSxcontent();
			detail[i][2] = SX.get(i).getDxname();
		}
		this.jTable2.setModel(new DefaultTableModel(detail, titles));
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTextField1 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton1.setForeground(new java.awt.Color(204, 204, 255));
		jButton1.setText("\u5b9d\u5708");

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton2.setForeground(new java.awt.Color(204, 204, 255));
		jButton2.setText("\u5b9d\u513f\u8d2d");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton3.setForeground(new java.awt.Color(204, 204, 255));
		jButton3.setText("\u6211\u7684");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTabbedPane1.setForeground(new java.awt.Color(204, 204, 255));
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jButton4.setText("\u641c\u5b9d\u5708");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton5.setForeground(new java.awt.Color(204, 204, 255));
		jButton5.setText("\u53d1\u5b9d\u5708");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton6.setForeground(new java.awt.Color(204, 204, 255));
		jButton6.setText("\u5220\u5b9d\u5708");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton7.setForeground(new java.awt.Color(204, 204, 255));
		jButton7.setText("\u770b\u5b9d\u5708");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
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
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				356,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4))
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5)
																		.addGap(
																				96,
																				96,
																				96)
																		.addComponent(
																				jButton6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton7)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												409,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(26, 26, 26)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton7)
														.addComponent(jButton5)
														.addComponent(jButton6))
										.addGap(81, 81, 81)));

		jTabbedPane1.addTab("\u4e3b\u9875", jPanel2);

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton8.setForeground(new java.awt.Color(204, 204, 255));
		jButton8.setText("\u53d1\u79c1\u4fe1");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton8ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455,
				Short.MAX_VALUE).addGroup(
				jPanel3Layout.createSequentialGroup().addGap(31, 31, 31)
						.addComponent(jButton8,
								javax.swing.GroupLayout.PREFERRED_SIZE, 383,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addComponent(
						jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
						459, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18,
						18, 18).addComponent(jButton8,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		jTabbedPane1.addTab("\u79c1\u4fe1", jPanel3);

		jButton9.setText("x");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jButton1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 68,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(115,
						115, 115).addComponent(jButton2).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						108, Short.MAX_VALUE).addComponent(jButton3).addGap(25,
						25, 25)).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(
						jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
						460, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap(391,
						Short.MAX_VALUE).addComponent(jButton9).addGap(42, 42,
						42)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jButton9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												575,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException {
		// TODO add your handling code here:
		String msg = JOptionPane.showInputDialog("请输入您要发送对象的id");
		//		ArrayList<String> details = u.getUser(msg);
		//		String sid = details.get(2);
		//		if(sid.trim().equals("")){
		//			JOptionPane.showMessageDialog(this, "对象不存在");
		//		}
		new UAddSixinView(msg, uid).setVisible(true);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String msg = this.jTextField1.getText();
		try {
			this.search(msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String cid = JOptionPane.showInputDialog("请输入要查看的宝圈");
		if (cid.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "宝圈不存在");
		} else
			new UViewSCView(uid, cid).setVisible(true);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String cid = JOptionPane.showInputDialog("请输入要删除的宝圈ID");

		try {
			u.delSC(cid, uid);
			this.search("");
			JOptionPane.showMessageDialog(this, "删除成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//		new UAddBaoQuan(uid).setVisible(true);
		SocialContent sc;
		new UAddBaoQuan(uid).setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new UserView(uid).setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new UserShopView(uid).setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new UserMainView().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
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
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}