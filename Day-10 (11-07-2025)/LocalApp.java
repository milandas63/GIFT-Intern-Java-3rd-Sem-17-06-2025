package com.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class LocalApp extends JFrame {
	private static final long serialVersionUID = 1L;
	public JDesktopPane desktop;

	public LocalApp() {
		this.setTitle("Local Application");
		this.setIconImage(new ImageIcon("title.png").getImage());
		this.setLayout(new BorderLayout());

		///////////////////////////////////////////
		///////////////////////////////////////////		Menu Bar
		///////////////////////////////////////////
		JMenuBar mbar = new JMenuBar();
		this.setJMenuBar(mbar);
		JMenu mnuFile = new JMenu("File");
		mbar.add(mnuFile);
		mnuFile.setIcon(new ImageIcon("file.png"));
		mnuFile.setMnemonic('F');
			JMenu mnuNew = new JMenu("New");
			mnuFile.add(mnuNew);
				JMenuItem mnuNormalText = new JMenuItem("Normal Text");
				mnuNormalText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
				mnuNew.add(mnuNormalText);

				JMenuItem mnuHtmlPage = new JMenuItem("HTML Page");
				mnuHtmlPage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.SHIFT_MASK));
				mnuNew.add(mnuHtmlPage);
		
				JMenuItem mnuBrowserWindow = new JMenuItem("Browser Window");
				mnuBrowserWindow.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.SHIFT_MASK));
				mnuNew.add(mnuBrowserWindow);

				mnuNew.addSeparator();
				
				JMenuItem mnuConfig = new JMenuItem("Configure Template..");
				mnuNew.add(mnuConfig);

				JMenuItem mnuCCpp = new JMenuItem("C/C++");
				mnuNew.add(mnuCCpp);

				JMenuItem mnuPerl = new JMenuItem("Perl");
				mnuNew.add(mnuPerl);

				JMenuItem mnuJava = new JMenuItem("Java");
				mnuNew.add(mnuJava);

				JMenuItem mnuOthers = new JMenuItem("Others");
				mnuNew.add(mnuOthers);

			JMenuItem mnuOpen = new JMenuItem("Open");
			mnuFile.add(mnuOpen);

			JMenuItem mnuClose = new JMenuItem("Close");
			mnuFile.add(mnuClose);

			JMenuItem mnuCloseAll = new JMenuItem("Close All");
			mnuFile.add(mnuCloseAll);

			mnuFile.addSeparator();

			JMenuItem mnuSave = new JMenuItem("Save");
			mnuFile.add(mnuSave);

			JMenuItem mnuSaveAll = new JMenuItem("Save All");
			mnuFile.add(mnuSaveAll);

			JMenuItem mnuSaveAs = new JMenuItem("Save As");
			mnuFile.add(mnuSaveAs);

			mnuFile.addSeparator();

			JMenuItem mnuExit = new JMenuItem("Exit");
			mnuExit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Thank you for using this App");
					System.exit(0);
				}
			});
			mnuFile.add(mnuExit);

		JMenu mnuEdit = new JMenu("Edit");
		mbar.add(mnuEdit);
		mnuFile.setIcon(new ImageIcon("edit.png"));
		mnuFile.setMnemonic('E');

		///////////////////////////////////////////
		///////////////////////////////////////////		Tool Bar
		///////////////////////////////////////////
		JToolBar toolBar = new JToolBar();
		this.add(toolBar, BorderLayout.NORTH);
			JButton tbNew = new JButton(new ImageIcon("new.png"));
			toolBar.add(tbNew);
			JButton tbSave = new JButton(new ImageIcon("save.png"));
			toolBar.add(tbSave);
		

		///////////////////////////////////////////
		///////////////////////////////////////////		JSpliter
		///////////////////////////////////////////
		desktop = new JDesktopPane();
		JSplitPane mainSpliter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.addNavBar(), desktop);
		mainSpliter.setDividerLocation(200);
		this.add(mainSpliter, BorderLayout.CENTER);
			
		this.setBounds(0,0,1560,760);
		this.setVisible(true);
	}

	private JPanel addNavBar() {
		JPanel pnlNavBar = new JPanel(new GridLayout(15,1));
		JButton btnContact = new JButton("Contact");
		JButton btnRelation = new JButton("Relation");
		JButton btnLocation = new JButton("Location");
		JButton btnCollege = new JButton("College");
		JButton btnHostel = new JButton("Hostel");
		JButton btnGymnasium = new JButton("Gymnasium");
		btnContact.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame iFrame = new JInternalFrame("Contact");
				iFrame.setClosable(true);
				iFrame.setIconifiable(true);
				iFrame.setMaximizable(true);
				iFrame.setBounds(25,25,600,300);
				desktop.add(iFrame);
				iFrame.setVisible(true);
			}
		});
		btnRelation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame iFrame = new JInternalFrame("Relation");
				iFrame.setBounds(25,25,600,300);
				desktop.add(iFrame);
				iFrame.setVisible(true);
			}
		});
		pnlNavBar.add(btnContact);
		pnlNavBar.add(btnRelation);
		pnlNavBar.add(btnLocation);
		pnlNavBar.add(btnCollege);
		pnlNavBar.add(btnHostel);
		pnlNavBar.add(btnGymnasium);

		return pnlNavBar;
	}
	
	public static void main(String[] args) {
		new LocalApp();
	}
}
