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
import model.ApplyShop;
import model.Shop;
import model.User;

/**
 *
 * @author  __USER__
 */
public class ViewUser extends javax.swing.JFrame {
	User user;
	Admin a = new Admin();

	/** Creates new form ApplyShopView 
	 * @throws ClassNotFoundException */
	public ViewUser(User user) throws ClassNotFoundException {
		this.user = user;
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

		ArrayList<String> details = a.getUser(user.getUid() + "");
		this.jTextField6.setText(details.get(2));
		this.jTextField2.setText(details.get(0));
		this.jTextField3.setText(details.get(1));
		this.jTextField7.setText(details.get(5));

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));
		jPanel1.setEnabled(false);

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel6.setText("\u7528\u6237\u540d\uff1a");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel7.setText("\u5bc6\u7801\uff1a");

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

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jButton2.setText("\u00d7");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel10.setText("\u7528\u6237id\u53f7\uff1a");

		jTextField6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField6.setBorder(null);
		jTextField6.setEnabled(false);
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel11.setText("\u624b\u673a\u53f7\uff1a");

		jTextField7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jTextField7.setBorder(null);
		jTextField7.setEnabled(false);
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
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
										.addContainerGap(348, Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												52,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(84, 84, 84)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel11)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				136,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel7)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								136,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel6)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								136,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel10)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								136,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(56, Short.MAX_VALUE)));
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
										.addGap(144, 144, 144)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField6,
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
																jTextField2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																41,
																Short.MAX_VALUE)
														.addComponent(
																jLabel6,
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
																jTextField3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																41,
																Short.MAX_VALUE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																49,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
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
										.addGap(240, 240, 240)));

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

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
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
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	// End of variables declaration//GEN-END:variables

}