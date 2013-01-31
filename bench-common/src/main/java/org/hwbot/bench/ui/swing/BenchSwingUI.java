/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hwbot.bench.ui.swing;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.hwbot.bench.service.BenchService;
import org.hwbot.bench.ui.BenchUI;

/**
 * 
 * @author frederik
 */
public class BenchSwingUI extends javax.swing.JPanel implements BenchUI {

	private static final long serialVersionUID = 1L;
	private final BenchService benchService;
	private JFileChooser fc;

	private String title = "HWBOT Benchmark";
	private String subtitle = "Multithreaded Prime Bench - 32/64Bit - Win/Mac/Linux";

	/**
	 * Creates new form BenchUI
	 * 
	 * @param benchBot
	 */
	public BenchSwingUI(BenchService benchService, String title, String subtitle) {
		this.benchService = benchService;
		this.title = title;
		this.subtitle = subtitle;
		initComponents();
		this.console.setEditable(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		console = new javax.swing.JTextArea();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		startButton = new javax.swing.JButton();
		score = new javax.swing.JLabel();
		jProgressBar1 = new javax.swing.JProgressBar();
		compareButton = new javax.swing.JButton();
		saveButton = new javax.swing.JButton();

		fc = new JFileChooser();
		fc.setApproveButtonText("Select");
		fc.setDialogTitle("Select directory to store file");
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		// In response to a button click:
		// int returnVal = fc.showOpenDialog(saveButton);

		console.setColumns(20);
		console.setRows(5);
		jScrollPane1.setViewportView(console);

		jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		jLabel1.setText(title);
		jLabel3.setText(subtitle);

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.add(jPanel1Layout
								.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
								.add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 337, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(org.jdesktop.layout.GroupLayout.TRAILING,
										jPanel1Layout
												.createSequentialGroup()
												.add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(54, 54, 54)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		startButton.setText("Start");
		startButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startButtonActionPerformed(evt);
			}
		});

		score.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
		score.setText("score:");

		compareButton.setText("Compare on HWBOT");
		compareButton.setEnabled(false);
		compareButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				compareButtonActionPerformed(evt);
			}
		});

		saveButton.setText("Save");
		saveButton.setEnabled(false);
		saveButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveButtonActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout
						.createSequentialGroup()
						.add(layout
								.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
								.add(layout
										.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
										.add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 337, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(layout
										.createSequentialGroup()
										.addContainerGap()
										.add(startButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
										.add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
										.add(compareButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(layout
										.createSequentialGroup()
										.add(12, 12, 12)
										.add(layout
												.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
												.add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
												.add(score, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)))).addContainerGap(22, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
				org.jdesktop.layout.GroupLayout.TRAILING,
				layout.createSequentialGroup()
						.add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
						.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(startButton).add(compareButton).add(saveButton))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(score)
						.addContainerGap(14, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void compareButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_compareButtonActionPerformed
		benchService.submit();
	}// GEN-LAST:event_compareButtonActionPerformed

	private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		this.startButton.setEnabled(false);
		this.compareButton.setEnabled(false);
		this.saveButton.setEnabled(false);
		this.benchService.benchmark();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void saveButtonActionPerformed(ActionEvent evt) {
		int returnVal = fc.showOpenDialog(saveButton);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			if (file.isDirectory()) {
				file = new File(file, title + " - " + new SimpleDateFormat("dd-MM-yyyy HH'h'mm'm'") + ".hwbot");
			}
			// write xml to this file
			byte[] dataFile = benchService.getDataFile();
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(dataFile);
				fileOutputStream.close();
				JOptionPane.showMessageDialog(this, "Date file saved to: " + file.getAbsolutePath());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "Failed to save the file. Sorry! Error: " + e.getMessage());
			}
		} else {
			// cancelled
			System.out.println("cancelled save: " + returnVal);
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton compareButton;
	private javax.swing.JTextArea console;
	private javax.swing.JButton saveButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel score;
	private javax.swing.JButton startButton;

	// End of variables declaration//GEN-END:variables

	public javax.swing.JButton getCompareButton() {
		return compareButton;
	}

	public void setCompareButton(javax.swing.JButton compareButton) {
		this.compareButton = compareButton;
	}

	public javax.swing.JTextArea getConsole() {
		return console;
	}

	public void setConsole(javax.swing.JTextArea console) {
		this.console = console;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.jLabel3 = jLabel3;
	}

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.jPanel1 = jPanel1;
	}

	public javax.swing.JProgressBar getjProgressBar1() {
		return jProgressBar1;
	}

	public void setjProgressBar1(javax.swing.JProgressBar jProgressBar1) {
		this.jProgressBar1 = jProgressBar1;
	}

	public javax.swing.JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
		this.jScrollPane1 = jScrollPane1;
	}

	public javax.swing.JButton getStartButton() {
		return startButton;
	}

	public void setStartButton(javax.swing.JButton startButton) {
		this.startButton = startButton;
	}

	public javax.swing.JLabel getScore() {
		return score;
	}

	public void setScore(javax.swing.JLabel score) {
		this.score = score;
	}

	public void notifyBenchmarkFinished(Long score) {
		this.score.setText("Score: " + this.benchService.formatScore(score));
		this.compareButton.setEnabled(true);
		this.saveButton.setEnabled(true);
		this.startButton.setEnabled(true);
	}

	public void waitForCommands() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}

}
