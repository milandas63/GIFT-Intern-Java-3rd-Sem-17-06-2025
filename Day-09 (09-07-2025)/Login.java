package com.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	private JTextField tfUser;
	private JPasswordField pfPassword;
	private JButton btnSubmit;
	private JButton btnExit;
	
	public Login() {
		JFrame frm = new JFrame("Login");
		frm.setLayout(null);
		
		JLabel caption = new JLabel("L O G I N", JLabel.CENTER);
		caption.setFont(new Font("Arial", Font.BOLD, 18));
		caption.setForeground(Color.yellow);
		caption.setBackground(Color.blue);
		caption.setOpaque(true);
		caption.setBounds(0,0,500,40);
		frm.add(caption);
				
		JLabel lblUser = new JLabel("Username: ");
		lblUser.setBounds(25,70,450,30);
		frm.add(lblUser);
		
		tfUser = new JTextField();
		tfUser.setBounds(15,100,450,30);
		frm.add(tfUser);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(25,135,450,30);
		frm.add(lblPassword);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(15, 165, 450, 30);
		frm.add(pfPassword);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(100,270,150,30);
		frm.add(btnSubmit);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(270,270,150,30);
		frm.add(btnExit);
		
		frm.setBounds(600,300,500,350);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

}
