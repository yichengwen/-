/*
 * ShopView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Shop;

/**
 *
 * @author  __USER__
 */
public class ShopView extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private String sid;

	/** Creates new form ShopView */
	public ShopView(String sid) {
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

	Shop s = new Shop();

	public void init() throws SQLException, ClassNotFoundException {
		ArrayList<String> details = s.getShop(sid);
		this.jTextField1.setText(details.get(0));
		this.jTextField2.setText(details.get(1));
		this.jTextField3.setText(details.get(2));
		this.jTextField4.setText(details.get(3));

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
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel1.setText("\u5546\u5bb6\u7f16\u53f7\uff1a");

		jTextField1.setEditable(false);
		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel2.setText("\u5546\u5bb6\u540d\u79f0\uff1a");

		jTextField2.setEditable(false);
		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel3.setText("\u5bc6\u7801\uff1a");

		jTextField3.setEditable(false);
		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel4.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jButton1.setText("\u4fee\u6539\u8d44\u6599");
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

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel5.setText("\u4ecb\u7ecd\uff1a");

		jTextField4.setEditable(false);
		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

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
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				155,
																				155,
																				155)
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				191,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				67,
																				67,
																				67)
																		.addComponent(
																				jButton2))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel5)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel2))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jTextField2)
																														.addComponent(
																																jTextField4)
																														.addComponent(
																																jTextField3,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																285,
																																Short.MAX_VALUE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												287,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				34,
																				34,
																				34)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				430,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(24, Short.MAX_VALUE)));
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
																				51,
																				51,
																				51)
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				166,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				37,
																				37,
																				37)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				42,
																				42,
																				42)
																		.addComponent(
																				jButton2)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel5)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												42,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(26, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jPanel1,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new UpdateShop(sid).setVisible(true);
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
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}