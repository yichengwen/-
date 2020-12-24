/*
 * SAddApplyGoodsView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ApplyGoods;
import model.Shop;

/**
 *
 * @author  __USER__
 */
public class SAddApplyGoodsView extends javax.swing.JFrame {
	String sid;

	/** Creates new form SAddApplyGoodsView */
	public SAddApplyGoodsView(String sid) {
		initComponents();
		this.sid = sid;

		this.setLocationRelativeTo(null);
	}

	public void init() throws SQLException, ClassNotFoundException {
		Shop s = new Shop();
		ArrayList<String> details = s.getShop(sid);

		this.jTextField5.setText(details.get(0));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));

		jLabel1.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel2.setText("\u7f16\u53f7\uff1a");

		jTextField1.setEditable(false);
		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jTextField1
				.setText("\u81ea\u52a8\u751f\u6210\uff0c\u65e0\u9700\u586b\u5199");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel3.setText("\u540d\u79f0\uff1a");

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel4.setText("\u7c7b\u578b\uff1a");

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel5.setText("\u8be6\u7ec6\u9875\uff1a");

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel6.setText("\u72b6\u6001\uff1a");

		jButton1.setBackground(new java.awt.Color(236, 227, 228));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22));
		jButton1.setText("\u6dfb\u52a0");
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

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel7.setText("\u7533\u8bf7\u4eba\uff1a");

		jTextField5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel8.setText("\u4ef7\u683c\uff1a");

		jTextField6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));

		jTextField7.setEditable(false);
		jTextField7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jTextField7.setText("\u7533\u8bf7\u4e2d");

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
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				45,
																				45,
																				45)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				31,
																				31,
																				31)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				233,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel8,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												78,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												207,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												78,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												207,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												78,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												207,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												78,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												207,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																jLabel7,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel5,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel6,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jTextField5,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																208,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jTextField4,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				208,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addComponent(
																																				jTextField7,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				207,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												22, Short.MAX_VALUE)
										.addComponent(jButton2).addGap(56, 56,
												56)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
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
																		.addGap(
																				37,
																				37,
																				37)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				400,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton2)
																		.addGap(
																				15,
																				15,
																				15)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGap(34, 34, 34)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												78,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

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

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Shop a = new Shop();

		int id = Integer.parseInt(sid);
		String apgstatus = this.jTextField7.getText();
		String apgtype = this.jTextField3.getText();
		String apgname = this.jTextField2.getText();
		String apgprice = this.jTextField6.getText();
		String apgnum = this.jTextField5.getText();
		String apgcontent = this.jTextField4.getText();

		ApplyGoods l = new ApplyGoods(0, apgname, apgtype, apgcontent,
				apgstatus, apgprice, id);
		try {

			a.addapplygoods(l);
			JOptionPane.showMessageDialog(this, "…Í«Î≥…π¶");
			this.dispose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	// End of variables declaration//GEN-END:variables

}