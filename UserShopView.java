/*
 * UserShopView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Dingdan;
import model.Goods;
import model.User;

/**
 *
 * @author  __USER__
 */
public class UserShopView extends javax.swing.JFrame implements Runnable {

	User u = new User();
	String uid;

	/** Creates new form UserShopView */
	public UserShopView(String uid) {
		this.uid = uid;
		initComponents();
		this.setLocationRelativeTo(null);
		try {
			init();
			searchG("");
			searchDD("");
			imgrote();
			Thread myt = new Thread(this);
			myt.start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	ArrayList<Image> imgs = new ArrayList<Image>();
	int i = 0;

	private void imgrote() {
		for (int i = 1; i <= 5; i++) {
			Image img = new ImageIcon("img\\" + i + ".jpg").getImage()
					.getScaledInstance(this.jButton10.getWidth(),
							this.jButton10.getHeight(), Image.SCALE_SMOOTH);
			imgs.add(img);
		}
		this.jButton10.setIcon(new ImageIcon(imgs.get(0)));
	}

	public void init() throws SQLException, ClassNotFoundException {
		ArrayList<String> details = u.getUser(uid);
		this.jTextField2.setText(details.get(2));
	}

	private void searchG(String msg) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "宝儿ID", "宝儿名", "价格", "描述" };
		ArrayList<Goods> g = u.searchG(msg);
		Object[][] detail = new Object[g.size()][4];
		for (int i = 0; i < g.size(); i++) {
			detail[i][0] = g.get(i).getGid();
			detail[i][1] = g.get(i).getGname();
			detail[i][2] = g.get(i).getGprice();
			detail[i][3] = g.get(i).getGcontent();
		}
		this.jTable2.setModel(new DefaultTableModel(detail, titles));
	}

	private void searchDD(String uid) throws SQLException,
			ClassNotFoundException {
		Object[] titles = { "订单ID", "宝儿ID", "宝儿名", "拼团状态" };
		ArrayList<Dingdan> DD = u.searchDD(this.jTextField2.getText());
		Object[][] detail = new Object[DD.size()][4];
		for (int i = 0; i < DD.size(); i++) {
			detail[i][0] = DD.get(i).getDid();
			detail[i][1] = DD.get(i).getGid();
			detail[i][2] = DD.get(i).getGname();
			detail[i][3] = DD.get(i).getDstatus();
		}
		this.jTable3.setModel(new DefaultTableModel(detail, titles));
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton5 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jTabbedPane1.setForeground(new java.awt.Color(204, 200, 255));
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(jTable3);

		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton5.setForeground(new java.awt.Color(153, 153, 255));
		jButton5.setText("\u67e5\u770b\u5546\u54c1\u8be6\u60c5");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton7.setForeground(new java.awt.Color(153, 153, 255));
		jButton7.setText("\u67e5\u770b\u60a8\u7684\u8ba2\u5355\u8be6\u60c5");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
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
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												206, Short.MAX_VALUE)
										.addComponent(jButton7)
										.addContainerGap()).addComponent(
								jScrollPane3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												521,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																31,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		jTabbedPane1.addTab("\u8d2d\u4e70\u5386\u53f2", jPanel3);

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jButton4.setText("\u67e5\u770b\u8be6\u60c5");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton6.setText("\u641c\u7d22");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(255, 255, 255));
		jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
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
								jPanel2Layout.createSequentialGroup()
										.addContainerGap().addComponent(
												jButton4).addContainerGap(399,
												Short.MAX_VALUE))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												332,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												72,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(69, Short.MAX_VALUE))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jButton10,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												468, Short.MAX_VALUE)
										.addContainerGap()).addComponent(
								jScrollPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 492,
								Short.MAX_VALUE));
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
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton6))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton10,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												141, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												340,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u5b9d\u513f\u8d2d", jPanel2);

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton1.setForeground(new java.awt.Color(200, 200, 250));
		jButton1.setText("\u5b9d\u5708");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton2.setForeground(new java.awt.Color(200, 200, 250));
		jButton2.setText("\u5b9d\u513f\u8d2d");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton3.setForeground(new java.awt.Color(200, 200, 250));
		jButton3.setText("\u6211\u7684");

		jTextField2.setEditable(false);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel1.setForeground(new java.awt.Color(204, 204, 255));
		jLabel1.setText("\u5f53\u524d\u7528\u6237ID\uff1a");

		jButton8.setText("X");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
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
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				140,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				148,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton8)
																		.addGap(
																				28,
																				28,
																				28))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTabbedPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				497,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				115,
																				115,
																				115)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				115,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton3)
																		.addContainerGap()))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(20, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				27,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				36,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												614,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addGap(11, 11, 11)));

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

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (i == 5)
			i = 0;
		this.jButton10.setIcon(new ImageIcon(imgs.get(i)));
		i++;
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			searchDD(uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = JOptionPane.showInputDialog("请输入订单号");
		new UViewDingdanView(msg).setVisible(true);

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String gid = JOptionPane.showInputDialog("请输入要查看的宝儿ID");
		if (gid.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "宝儿不存在");
		} else
			new UViewGoodsView(gid, uid).setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		// TODO add your handling code here:
		String gid = JOptionPane.showInputDialog("请输入要查看的宝儿");
		if (gid.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "宝儿不存在");
		} else
			new UViewGoodsView(gid, uid).setVisible(true);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String msg = this.jTextField1.getText();
		try {
			this.searchG(msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new UserMainView(uid).setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new UserShopView().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;

	// End of variables declaration//GEN-END:variables

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (i == 5)
				i = 0;
			this.jButton10.setIcon(new ImageIcon(imgs.get(i)));
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}