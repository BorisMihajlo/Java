package rs.gui;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

import rs.model.Forma;

public class LoginForma {

	private JFrame frmBiblioteka;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForma window = new LoginForma();
					window.frmBiblioteka.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBiblioteka = new JFrame();
		frmBiblioteka.getContentPane().setBackground(Color.WHITE);
		frmBiblioteka.setTitle("Biblioteka");
		frmBiblioteka.setBounds(100, 100, 450, 450);
		frmBiblioteka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBiblioteka.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(22, 11, 391, 25);
		frmBiblioteka.getContentPane().add(lblLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 47, 391, 2);
		frmBiblioteka.getContentPane().add(separator);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(66, 134, 120, 25);
		frmBiblioteka.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(66, 192, 120, 25);
		frmBiblioteka.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(254, 138, 120, 25);
		frmBiblioteka.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(254, 192, 120, 25);
		frmBiblioteka.getContentPane().add(passwordField);
		
		JRadioButton admin = new JRadioButton("ADMIN");
		admin.setBackground(Color.WHITE);
		admin.setFont(new Font("Tahoma", Font.BOLD, 14));
		admin.setBounds(56, 79, 130, 25);
		frmBiblioteka.getContentPane().add(admin);
		
		JRadioButton biblio = new JRadioButton("BIBLIOTEKAR");
		biblio.setBackground(Color.WHITE);
		biblio.setFont(new Font("Tahoma", Font.BOLD, 14));
		biblio.setBounds(244, 82, 130, 25);
		frmBiblioteka.getContentPane().add(biblio);
		
		ButtonGroup grupa = new ButtonGroup();
		grupa.add(admin);
		grupa.add(biblio);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/image.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(66, 254, 174, 146);
		frmBiblioteka.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textField.getText();
				String password = passwordField.getText();
	
				if(username.equals("admin") && password.equals("Admin123!") && admin.isSelected()) {
					frmBiblioteka.dispose();
					JOptionPane.showMessageDialog(null, "Admin uspesno ulogovan!");
					AdminForma.main(new String[] {});
				}
					
				else if (username.equals("bibliotekar")&& password.equals("Bibliotekari1234!!!") && biblio.isSelected()) {
					frmBiblioteka.dispose();
					JOptionPane.showMessageDialog(null, "Bibliotekar uspesno ulogovan!");
					BibliotekarForma.main(new String[] {});
				}
					
				else {
					JOptionPane.showMessageDialog(null, "Greska! Pokusajte ponovo.");
					textField.setText(null);
					passwordField.setText(null);
					grupa.clearSelection();
				}
			}
		});
		btnNewButton.setBounds(264, 362, 120, 25);
		frmBiblioteka.getContentPane().add(btnNewButton);
	}
}
