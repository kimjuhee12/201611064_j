package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalcAreaGUIMain2 extends JFrame implements ActionListener  {
	JTextField radiusTf1;
	JTextField areaTf2;
	public CalcAreaGUIMain2() {
		JPanel panel = new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		JLabel label1=new JLabel("radius");
		radiusTf1=new JTextField(10);
		JButton b1=new JButton("calculation");
		JButton b2=new JButton("cancle");
		b1.addActionListener(this);
		panel.add(label1);
		panel.add(radiusTf1);
		panel.add(b1);
		panel.add(b2);
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		b.setText("complete calculation");
		Double r=Double.parseDouble(radiusTf1.getText());
		areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
	}	
	public static void main(String[] args) {
		CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.pack();
		c.setVisible(true);
	
	}		
}