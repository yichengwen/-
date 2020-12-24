/*
 * UViewDingdanView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Dingdan;
import model.PingJia;
import model.SocialContent;
import model.User;

/**
 *
 * @author  __USER__
 */
public class UViewDingdanView extends javax.swing.JFrame {

	User u = new User();
	String did;

	/** Creates new form UViewDingdanView */
	public UViewDingdanView(String did) {
		this.did = did;
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
		Dingdan d = u.viewDD(did);
		this.jTextField1.setText(d.getGname());
		this.jTextField2.setText(Integer.toString(d.getGid()));
		this.jTextField3.setText(d.getUname());
		this.jTextField4.setText(Integer.toString(d.getUid()));
		this.jTextField5.setText(d.getUaddress());
		this.jTextField6.setText(d.getUphone());
		this.jTextField7.setText(Integer.toString(d.getGnum()));
		this.jTextField8.setText(Integer.toString(d.getSid()));
		this.jTextField9.setText(d.getDstatus());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36));
		jLabel1.setForeground(new java.awt.Color(204, 204, 255));
		jLabel1.setText("\u786e\u8ba4\u8ba2\u5355");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setForeground(new java.awt.Color(204, 204, 255));
		jLabel2.setText("\u5546\u54c1\u540d\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel3.setForeground(new java.awt.Color(204, 204, 255));
		jLabel3.setText("\u5546\u54c1ID\uff1a");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel5.setForeground(new java.awt.Color(204, 204, 255));
		jLabel5.setText("\u60a8\u7684\u5730\u5740\uff1a");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel6.setForeground(new java.awt.Color(204, 204, 255));
		jLabel6.setText("\u60a8\u7684\u7535\u8bdd\uff1a");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel7.setForeground(new java.awt.Color(204, 204, 255));
		jLabel7.setText("\u7528\u6237\u540d\uff1a");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel8.setForeground(new java.awt.Color(204, 204, 255));
		jLabel8.setText("\u7528\u6237ID\uff1a");

		jTextField1.setEditable(false);
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextField2.setEditable(false);
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jTextField3.setEditable(false);
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTextField4.setEditable(false);

		jTextField5.setEditable(false);
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jTextField6.setEditable(false);
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel4.setForeground(new java.awt.Color(204, 204, 255));
		jLabel4.setText("\u56e2\u8d2d\u4e0b\u9650\u4eba\u6570\uff1a");

		jTextField7.setEditable(false);

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel9.setForeground(new java.awt.Color(204, 204, 255));
		jLabel9.setText("\u5546\u5e97ID\uff1a");

		jTextField8.setEditable(false);

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel10.setForeground(new java.awt.Color(204, 204, 255));
		jLabel10.setText("\u8ba2\u5355\u72b6\u6001\uff1a");

		jTextField9.setEditable(false);

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton1.setForeground(new java.awt.Color(203, 200, 250));
		jButton1
				.setText("\u53d1\u8868\u5bf9\u8be5\u5546\u54c1\u7684\u8bc4\u4ef7");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("X");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
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
								jPanel1Layout.createSequentialGroup().addGap(
										130, 130, 130).addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										297,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(176, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap(
																				243,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel1)
																		.addGap(
																				177,
																				177,
																				177))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel4))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel6))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel5))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel8))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel7))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel3))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel2))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel9)
																														.addComponent(
																																jLabel10))))
																		.addGap(
																				34,
																				34,
																				34)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField9,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								392,
																								Short.MAX_VALUE))))
										.addGap(39, 39, 39))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(518, Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(22, 22, 22)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel1))
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																39,
																Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																42,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																36,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(33, 33, 33)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(22, 22, 22)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(35, 35, 35)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																44,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												23, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				38,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				30,
																				30,
																				30)
																		.addComponent(
																				jTextField9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				37,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				101,
																				101,
																				101)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				32,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				30,
																				30,
																				30)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				40,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String pjcontent = JOptionPane.showInputDialog("请输入您对该商品的评价");
		int uid = Integer.parseInt(this.jTextField4.getText());
		int gid = Integer.parseInt(this.jTextField2.getText());
		String uname = this.jTextField3.getText();
		PingJia pj = new PingJia(0, uid, gid, pjcontent, uname);
		try {
			u.addPJ(pj);
			JOptionPane.showMessageDialog(this, "发布成功");
			this.dispose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "发布失败");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "发布失败");
			e.printStackTrace();
		}

	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables

}