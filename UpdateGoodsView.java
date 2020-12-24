/*
 * UpdateGoodsView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Goods;
import model.Shop;

/**
 *
 * @author  __USER__
 */
public class UpdateGoodsView extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private String gid;

	/** Creates new form GoodsView */

	public UpdateGoodsView(String gid) {
		this.gid = gid;
		initComponents();
		this.setLocationRelativeTo(null);
		//setDate();
		try {
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//setDate();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	Shop s = new Shop();

	public void init() throws SQLException, ClassNotFoundException {
		ArrayList<String> details = s.getGoods(gid);
		this.jTextField1.setText(details.get(0));
		this.jTextField2.setText(details.get(1));
		this.jTextField3.setText(details.get(2));
		this.jTextField4.setText(details.get(3));
		//Leave l = s.viewLeave(lid, sid);
		//		String ltime = l.getLtime();
		//		String year = ltime.split("年")[0];
		//		String month = ltime.split("年")[1].split("月")[0];
		//		String day = ltime.split("年")[1].split("月")[1].split("日")[0];
		//		System.out.println(year + ":" + month + ":" + day);
		//		int y = Integer.parseInt(year);
		//		int m = Integer.parseInt(month);
		//		int d = Integer.parseInt(day);
		//		System.out.println(year + "/" + month + "/" + day);
		//		this.jComboBox1.setSelectedItem(2020 - y);
		//		this.jComboBox2.setSelectedItem(m);
		//		this.jComboBox3.setSelectedItem(d);
		//		//this.jTextField7.setText(year);
		//		//this.jTextField8.setText(month);
		//		//this.jTextField9.setText(day);
		//		this.jTextArea1.setText(l.getLreason());
		//		this.jTextField5.setText(lid);
		//		this.jTextField6.setText(l.getLstatus());

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
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(236, 227, 228));

		jLabel1.setBackground(new java.awt.Color(255, 255, 255));
		jLabel1.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel2.setText("\u540d\u79f0");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel3.setText("\u7f16\u53f7");

		jTextField2.setEditable(false);
		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel4.setText("\u4ef7\u683c");

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel5.setText("\u6570\u91cf");

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jButton1.setText("\u66f4\u65b0\u5b8c\u6210");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

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
								jPanel1Layout
										.createSequentialGroup()
										.addGap(44, 44, 44)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton9,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabel5,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												44,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jLabel4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												44,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jLabel3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												44,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												59,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jTextField1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								196,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addComponent(
																																				jTextField3,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				196,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												196,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																jLabel1,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField4,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																196,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))))
										.addContainerGap(41, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton9)
										.addGap(13, 13, 13)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												160,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																44,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																45,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																44,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				47,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								36,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								44,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				37,
																				37,
																				37))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				44,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(42, 42, 42)));

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

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String gname = this.jTextField1.getText();
		String gprice = this.jTextField3.getText();
		String gnum = this.jTextField4.getText();
		try {
			s.updategoods(gid, gname, gprice, gnum);
			JOptionPane.showMessageDialog(this, "更新成功");
			this.dispose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	private javax.swing.JButton jButton9;
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