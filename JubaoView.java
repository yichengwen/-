/*
 * ApplyShopView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Admin;
import model.ApplyGoods;
import model.ApplyShop;
import model.Jubao;

/**
 *
 * @author  __USER__
 */
public class JubaoView extends javax.swing.JFrame {
	Jubao j;
	Admin a = new Admin();

	/** Creates new form ApplyShopView 
	 * @throws ClassNotFoundException */
	public JubaoView(Jubao j) throws ClassNotFoundException {
		this.j = j;
		initComponents();
		try {
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setLocationRelativeTo(null);
	}

	public void init() throws SQLException, ClassNotFoundException {

		ArrayList<String> details = a.getJubao(j.getJid() + "");
		this.jTextField8.setText(details.get(0));
		this.jTextField7.setText(details.get(1));
		this.jTextField6.setText(details.get(2));
		this.jTextField5.setText(details.get(3));
		this.jTextField2.setText(details.get(4));
		this.jTextField3.setText(details.get(5));
		this.jTextField4.setText(details.get(6));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));
		jPanel1.setEnabled(false);

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel6.setText("\u4e3e\u62a5\u72b6\u6001\uff1a");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel7.setText("\u4e3e\u62a5\u7c7b\u578b\uff1a");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel8.setText("\u4e3e\u62a5\u539f\u56e0\uff1a");

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField2.setBorder(null);
		jTextField2.setEnabled(false);
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField3.setBorder(null);
		jTextField3.setEnabled(false);

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12));
		jTextField4.setBorder(null);
		jTextField4.setEnabled(false);

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel9.setText("\u5546\u54c1\u540d\uff1a");

		jTextField5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField5.setBorder(null);
		jTextField5.setEnabled(false);
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jButton2.setText("\u00d7");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(0, 0, 0));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u5df2\u5904\u7406");
		jButton3.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton3ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel10.setText("\u5546\u54c1\u53f7\uff1a");

		jTextField6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField6.setBorder(null);
		jTextField6.setEnabled(false);
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel11.setText("\u4e3e\u62a5\u8005\uff1a");

		jTextField7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField7.setBorder(null);
		jTextField7.setEnabled(false);
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel12.setText("\u4e3e\u62a5\u53f7\uff1a");

		jTextField8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField8.setBorder(null);
		jTextField8.setEnabled(false);
		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(0, 0, 0));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u5df2\u8bfb");
		jButton4.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
										.addContainerGap(441, Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												52,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jButton4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												134,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(347, Short.MAX_VALUE))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
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
																												jLabel7)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												306,
																												Short.MAX_VALUE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel6)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												306,
																												Short.MAX_VALUE))
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jButton3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												117,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel8)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jTextField4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																306,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				20,
																				20,
																				20)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9)
																						.addComponent(
																								jLabel10)
																						.addComponent(
																								jLabel11)
																						.addComponent(
																								jLabel12))
																		.addGap(
																				21,
																				21,
																				21)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								306,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								306,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								306,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								306,
																								Short.MAX_VALUE))))
										.addGap(50, 50, 50)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												44,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(6, 6, 6)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																41,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE)
														.addComponent(
																jLabel10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																41,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																41,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																116,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(35, 35, 35)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton4)
														.addComponent(jButton3))
										.addGap(68, 68, 68)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		try {
			a.ReadJubao(j.getJid());
			JOptionPane.showMessageDialog(this, "ok");
			this.dispose();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "no");
			e.printStackTrace();
		}
	}

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// TODO add your handling code here:

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException {
		// TODO add your handling code here:
		try {
			a.okJubao(j.getJid());
			JOptionPane.showMessageDialog(this, "ok");
			this.dispose();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "no");
			e.printStackTrace();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new ApplyShopView().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	// End of variables declaration//GEN-END:variables

}