package rs.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class BibliotekarForma extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BibliotekarForma frame = new BibliotekarForma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BibliotekarForma() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setTitle("Bibliotekar");
		setBounds(100, 100, 700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("KNJIGE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KnjigaForma.main(new String[] {});
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(SystemColor.menu);
		button.setBounds(69, 283, 230, 50);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("KORISNICI");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KorisnikForma.main(new String[] {});
				dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(391, 283, 230, 50);
		getContentPane().add(button_1);
		
		JLabel label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/image1.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(104, 35, 150, 210);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/image2.png")).getImage();
		label_1.setIcon(new ImageIcon(img2));
		label_1.setBounds(426, 35, 150, 210);
		getContentPane().add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(104, 344, 485, 2);
		getContentPane().add(separator);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForma.main(new String[] {});
				dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBackground(SystemColor.menu);
		btnLogout.setBounds(278, 375, 120, 25);
		getContentPane().add(btnLogout);
		
		
	}
}
