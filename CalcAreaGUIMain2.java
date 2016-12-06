package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
	JTextField radiusTf;
	JTextField areaTf;
	JButton b1;
	JButton b2;
	public CalcAreaGUIMain2() {
		JPanel panel = new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		JLabel label1=new JLabel("radius");
		JLabel label2=new JLabel("Area");
		radiusTf=new JTextField(10);
		areaTf=new JTextField(10);
		b1=new JButton("calculation");
		b2=new JButton("cancle");
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(label2);
		panel.add(radiusTf);
		panel.add(areaTf);
		panel.add(b1);
		panel.add(b2);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if (b == b1) {
			b.setText("complete calculation");
			Double r=Double.parseDouble(radiusTf.getText());
			Double area=Math.PI*Math.pow(r,2);
			areaTf.setText(String.format("%.2f", area));
		}
		else if (b == b2) {
			radiusTf.setText("");
			areaTf.setText("");
		}
	}
	
	public static void main(String[] args) {
		CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.pack();
		c.setVisible(true);
	}
}