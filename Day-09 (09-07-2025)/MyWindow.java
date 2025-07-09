package com.gui;

import javax.swing.JFrame;

public class MyWindow {
	public MyWindow() {
		JFrame frame = new JFrame("My Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,150,600,400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MyWindow();
	}

}
