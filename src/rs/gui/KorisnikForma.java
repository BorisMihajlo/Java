package rs.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class KorisnikForma extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KorisnikForma frame = new KorisnikForma();
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
	public KorisnikForma() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel korisnikPanel = new JPanel();
		korisnikPanel.setBackground(Color.WHITE);
		getContentPane().add(korisnikPanel, "p1");
		korisnikPanel.setLayout(null);
		
		JButton button = new JButton("DODAJ");
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(SystemColor.menu);
		button.setBounds(546, 248, 128, 23);
		korisnikPanel.add(button);
		
		JButton button_1 = new JButton("OBRISI");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(546, 282, 128, 23);
		korisnikPanel.add(button_1);
		
		JButton button_2 = new JButton("UREDI");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(546, 316, 128, 23);
		korisnikPanel.add(button_2);
		
		JButton button_3 = new JButton("PRIKAZI");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(546, 350, 128, 23);
		korisnikPanel.add(button_3);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(434, 23, 240, 214);
		korisnikPanel.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 0, 240, 214);
		panel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(24, 23, 153, 23);
		korisnikPanel.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(187, 23, 230, 23);
		korisnikPanel.add(textField);
		
		JLabel label_2 = new JLabel("Ime:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(24, 57, 153, 23);
		korisnikPanel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(187, 57, 230, 23);
		korisnikPanel.add(textField_1);
		
		JLabel label_3 = new JLabel("Prezime:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(24, 91, 153, 23);
		korisnikPanel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(187, 91, 230, 23);
		korisnikPanel.add(textField_2);
		
		JLabel label_4 = new JLabel("Adresa:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(24, 125, 153, 23);
		korisnikPanel.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(187, 125, 230, 23);
		korisnikPanel.add(textField_3);
		
		JLabel label_5 = new JLabel("Telefon:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(24, 159, 153, 23);
		korisnikPanel.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(187, 159, 230, 23);
		korisnikPanel.add(textField_4);
		
		JLabel label_6 = new JLabel("email:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(24, 193, 153, 23);
		korisnikPanel.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(187, 193, 230, 23);
		korisnikPanel.add(textField_5);
		
		JLabel label_7 = new JLabel("Obrazovanje:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(24, 227, 153, 23);
		korisnikPanel.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(187, 227, 230, 23);
		korisnikPanel.add(textField_6);
		
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(187, 261, 46, 20);
		korisnikPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setMaximumRowCount(10);
		comboBox_1.setBounds(243, 261, 100, 20);
		korisnikPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(new Object[]{});
		comboBox_2.setMaximumRowCount(10);
		comboBox_2.setBounds(353, 261, 64, 20);
		korisnikPanel.add(comboBox_2);
		
		JLabel label_8 = new JLabel("Datum rodjenja:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(24, 261, 153, 23);
		korisnikPanel.add(label_8);
		
		JLabel label_9 = new JLabel("Datum zaposlenja:");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(24, 292, 153, 23);
		korisnikPanel.add(label_9);
		
		JComboBox comboBox_3 = new JComboBox(new Object[]{});
		comboBox_3.setMaximumRowCount(10);
		comboBox_3.setBounds(187, 292, 46, 20);
		korisnikPanel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(new Object[]{});
		comboBox_4.setMaximumRowCount(10);
		comboBox_4.setBounds(243, 292, 100, 20);
		korisnikPanel.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox(new Object[]{});
		comboBox_5.setMaximumRowCount(10);
		comboBox_5.setBounds(353, 292, 64, 20);
		korisnikPanel.add(comboBox_5);
		
		JPanel clanarinaPanel = new JPanel();
		clanarinaPanel.setBackground(Color.WHITE);
		getContentPane().add(clanarinaPanel, "p2");
		clanarinaPanel.setLayout(null);
		
		JButton button_4 = new JButton("DODAJ");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBackground(SystemColor.menu);
		button_4.setBounds(546, 248, 128, 23);
		clanarinaPanel.add(button_4);
		
		JButton button_5 = new JButton("OBRISI");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBackground(SystemColor.menu);
		button_5.setBounds(546, 282, 128, 23);
		clanarinaPanel.add(button_5);
		
		JButton button_6 = new JButton("UREDI");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBackground(SystemColor.menu);
		button_6.setBounds(546, 316, 128, 23);
		clanarinaPanel.add(button_6);
		
		JButton button_7 = new JButton("PRIKAZI");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_7.setBackground(SystemColor.menu);
		button_7.setBounds(546, 350, 128, 23);
		clanarinaPanel.add(button_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(434, 23, 240, 214);
		clanarinaPanel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(0, 0, 240, 214);
		panel_1.add(lblNewLabel_1);
		
		JLabel label_11 = new JLabel("ID:");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(24, 23, 153, 23);
		clanarinaPanel.add(label_11);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(187, 23, 230, 23);
		clanarinaPanel.add(textField_7);
		
		JLabel label_12 = new JLabel("Ime:");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(24, 57, 153, 23);
		clanarinaPanel.add(label_12);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setColumns(10);
		textField_8.setBounds(187, 57, 230, 23);
		clanarinaPanel.add(textField_8);
		
		JLabel label_13 = new JLabel("Prezime:");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(24, 91, 153, 23);
		clanarinaPanel.add(label_13);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(187, 91, 230, 23);
		clanarinaPanel.add(textField_9);
		
		JLabel label_14 = new JLabel("Adresa:");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(24, 125, 153, 23);
		clanarinaPanel.add(label_14);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBounds(187, 125, 230, 23);
		clanarinaPanel.add(textField_10);
		
		JLabel label_15 = new JLabel("Telefon:");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setBounds(24, 159, 153, 23);
		clanarinaPanel.add(label_15);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_11.setColumns(10);
		textField_11.setBounds(187, 159, 230, 23);
		clanarinaPanel.add(textField_11);
		
		JLabel label_16 = new JLabel("email:");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(24, 193, 153, 23);
		clanarinaPanel.add(label_16);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_12.setColumns(10);
		textField_12.setBounds(187, 193, 230, 23);
		clanarinaPanel.add(textField_12);
		
		JLabel label_17 = new JLabel("Obrazovanje:");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(24, 227, 153, 23);
		clanarinaPanel.add(label_17);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_13.setColumns(10);
		textField_13.setBounds(187, 227, 230, 23);
		clanarinaPanel.add(textField_13);
		
		JComboBox comboBox_6 = new JComboBox(new Object[]{});
		comboBox_6.setMaximumRowCount(10);
		comboBox_6.setBounds(187, 261, 46, 20);
		clanarinaPanel.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox(new Object[]{});
		comboBox_7.setMaximumRowCount(10);
		comboBox_7.setBounds(243, 261, 100, 20);
		clanarinaPanel.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox(new Object[]{});
		comboBox_8.setMaximumRowCount(10);
		comboBox_8.setBounds(353, 261, 64, 20);
		clanarinaPanel.add(comboBox_8);
		
		JLabel label_18 = new JLabel("Datum rodjenja:");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBounds(24, 261, 153, 23);
		clanarinaPanel.add(label_18);
		
		JLabel label_19 = new JLabel("Datum zaposlenja:");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBounds(24, 292, 153, 23);
		clanarinaPanel.add(label_19);
		
		JComboBox comboBox_9 = new JComboBox(new Object[]{});
		comboBox_9.setMaximumRowCount(10);
		comboBox_9.setBounds(187, 292, 46, 20);
		clanarinaPanel.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox(new Object[]{});
		comboBox_10.setMaximumRowCount(10);
		comboBox_10.setBounds(243, 292, 100, 20);
		clanarinaPanel.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox(new Object[]{});
		comboBox_11.setMaximumRowCount(10);
		comboBox_11.setBounds(353, 292, 64, 20);
		clanarinaPanel.add(comboBox_11);
		
		JLabel label_20 = new JLabel("Admin:");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_20.setBounds(24, 322, 153, 23);
		clanarinaPanel.add(label_20);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setBounds(187, 319, 97, 23);
		clanarinaPanel.add(checkBox_1);
		setTitle("Korisnik");
		setBounds(100, 100, 700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JButton btnKorisnik = new JButton("KORISNIK");
		btnKorisnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) getContentPane().getLayout();
				c1.show(getContentPane(), "p1");
			}
		});
		btnKorisnik.setBackground(UIManager.getColor("Button.background"));
		btnKorisnik.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(btnKorisnik);
		
		JButton btnClanarina = new JButton("CLANARINA");
		btnClanarina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout) getContentPane().getLayout();
				c2.show(getContentPane(), "p2");
			}
		});
		btnClanarina.setBackground(UIManager.getColor("Button.background"));
		btnClanarina.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(btnClanarina);
		
		JButton btnBibliotekar = new JButton("BIBLIOTEKAR");
		btnBibliotekar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BibliotekarForma.main(new String[] {});
				dispose();
			}
		});
		btnBibliotekar.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(btnBibliotekar);
	}

}
