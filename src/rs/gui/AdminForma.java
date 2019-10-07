package rs.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Checkbox;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import rs.model.Bibliotekar;
import rs.model.DAO;

import javax.swing.ListSelectionModel;

public class AdminForma extends JFrame{
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
	private JCheckBox chckbxNewCheckBox;
	
	private ArrayList<Bibliotekar>bibliotekari;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminForma frame = new AdminForma();
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
	public AdminForma() {
		
		bibliotekari = new ArrayList<Bibliotekar>();
				
		getContentPane().setBackground(Color.WHITE);
		setTitle("Admin");
		setBounds(100, 100, 700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel bibliotekarPanel = new JPanel();
		bibliotekarPanel.setBackground(Color.WHITE);
		getContentPane().add(bibliotekarPanel, "p1");
		bibliotekarPanel.setLayout(null);
		
		JButton btnDodaj = new JButton("DODAJ");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String i = textField.getText();
				String ime = textField_1.getText();
				String prezime = textField_2.getText();
				String adresa = textField_3.getText();
				String telefon = textField_4.getText();
				String email = textField_5.getText();
				SimpleDateFormat dodajDatumRodjenja = new SimpleDateFormat("yyyy-MM-dd");
    			SimpleDateFormat dodajDatumZaposlenja = new SimpleDateFormat("yyyy-MM-dd");
    			
				
				if(i!=null && i.trim().length()>0 && ime!=null && ime.trim().length()>0 && prezime!=null && prezime.trim().length()>0 && adresa!=null && adresa.trim().length()>0 && telefon!=null && telefon.trim().length()>0 && email!=null && email.trim().length()>0) {
					try {
						int id = Integer.parseInt(i);
		    			String datum_rodjenja = dodajDatumRodjenja.format(textField_10);
		    			String datum_zaposlenja = dodajDatumZaposlenja.format(textField_11);
		    			boolean admin = chckbxNewCheckBox.isSelected();
						
						Bibliotekar b = new Bibliotekar(id, ime, prezime, adresa, telefon, email, datum_rodjenja, datum_zaposlenja, admin);
						bibliotekari.add(b);
						
						System.out.println(b.toString());
						
						DAO dao = new DAO();
						dao.dodajBibliotekara(b);
						System.out.println(dao.getBibliotekare());
						
						JOptionPane.showMessageDialog(null, "Bibliotekar dodat.\n"+b);
						clearFields();
						
					} catch (Exception e) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "Greska!");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Morate popuniti sva polja!");
				}
			}
		});
		btnDodaj.setBackground(UIManager.getColor("Button.background"));
		btnDodaj.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDodaj.setBounds(546, 248, 128, 23);
		bibliotekarPanel.add(btnDodaj);
		
		JButton btnObrisi = new JButton("OBRISI");
		btnObrisi.setBackground(UIManager.getColor("Button.background"));
		btnObrisi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnObrisi.setBounds(546, 282, 128, 23);
		bibliotekarPanel.add(btnObrisi);
		
		JButton btnUredi = new JButton("UREDI");
		btnUredi.setBackground(UIManager.getColor("Button.background"));
		btnUredi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUredi.setBounds(546, 316, 128, 23);
		bibliotekarPanel.add(btnUredi);
		
		JButton btnPrikazi = new JButton("PRIKAZI");
		btnPrikazi.setBackground(UIManager.getColor("Button.background"));
		btnPrikazi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrikazi.setBounds(546, 350, 128, 23);
		bibliotekarPanel.add(btnPrikazi);
		
		JLabel lbl = new JLabel("ID:");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl.setBounds(24, 23, 153, 23);
		bibliotekarPanel.add(lbl);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(187, 23, 230, 23);
		bibliotekarPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIme.setBounds(24, 57, 153, 23);
		bibliotekarPanel.add(lblIme);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(187, 57, 230, 23);
		bibliotekarPanel.add(textField_1);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrezime.setBounds(24, 91, 153, 23);
		bibliotekarPanel.add(lblPrezime);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(187, 91, 230, 23);
		bibliotekarPanel.add(textField_2);
		
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdresa.setBounds(24, 125, 153, 23);
		bibliotekarPanel.add(lblAdresa);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(187, 125, 230, 23);
		bibliotekarPanel.add(textField_3);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefon.setBounds(24, 159, 153, 23);
		bibliotekarPanel.add(lblTelefon);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(187, 159, 230, 23);
		bibliotekarPanel.add(textField_4);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(24, 193, 153, 23);
		bibliotekarPanel.add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(187, 193, 230, 23);
		bibliotekarPanel.add(textField_5);
		
		
		JLabel lblDatumRodjenja = new JLabel("Datum rodjenja:");
		lblDatumRodjenja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatumRodjenja.setBounds(24, 227, 153, 23);
		bibliotekarPanel.add(lblDatumRodjenja);
		
		JLabel lblDatumZaposlenja = new JLabel("Datum zaposlenja:");
		lblDatumZaposlenja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatumZaposlenja.setBounds(24, 292, 153, 23);
		bibliotekarPanel.add(lblDatumZaposlenja);
		
		JLabel lblAdmin = new JLabel("Admin:");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdmin.setBounds(24, 322, 153, 23);
		bibliotekarPanel.add(lblAdmin);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(187, 319, 97, 23);
		bibliotekarPanel.add(chckbxNewCheckBox);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBounds(187, 227, 230, 23);
		bibliotekarPanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_11.setColumns(10);
		textField_11.setBounds(187, 292, 230, 23);
		bibliotekarPanel.add(textField_11);
		
		JPanel korisnikPanel = new JPanel();
		korisnikPanel.setBackground(Color.WHITE);
		getContentPane().add(korisnikPanel, "p2");
		korisnikPanel.setLayout(null);
		
		JLabel lblIdKorisnika = new JLabel("ID Korisnika:");
		lblIdKorisnika.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdKorisnika.setBounds(499, 366, 198, 23);
		korisnikPanel.add(lblIdKorisnika);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(746, 366, 128, 23);
		korisnikPanel.add(textField_7);
		
		JButton button = new JButton("PRIKAZI");
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(SystemColor.menu);
		button.setBounds(746, 400, 128, 23);
		korisnikPanel.add(button);
		
		JPanel knjigaPanel = new JPanel();
		knjigaPanel.setBackground(Color.WHITE);
		getContentPane().add(knjigaPanel, "p3");
		knjigaPanel.setLayout(null);
		
		JLabel lblIdKnjige = new JLabel("ID Knjige:");
		lblIdKnjige.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdKnjige.setBounds(321, 316, 198, 23);
		knjigaPanel.add(lblIdKnjige);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setColumns(10);
		textField_8.setBounds(546, 316, 128, 23);
		knjigaPanel.add(textField_8);
		
		JButton button_1 = new JButton("PRIKAZI");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(546, 350, 128, 23);
		knjigaPanel.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(25, 11, 286, 362);
		knjigaPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(0, 0, 286, 362);
		panel_2.add(lblNewLabel_2);
		
		JPanel clanarinaPanel = new JPanel();
		clanarinaPanel.setBackground(Color.WHITE);
		getContentPane().add(clanarinaPanel, "p4");
		clanarinaPanel.setLayout(null);
		
		JLabel lblIdClanarine = new JLabel("ID Clanarine:");
		lblIdClanarine.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdClanarine.setBounds(321, 316, 198, 23);
		clanarinaPanel.add(lblIdClanarine);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(546, 316, 128, 23);
		clanarinaPanel.add(textField_9);
		
		JButton button_2 = new JButton("PRIKAZI");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(546, 350, 128, 23);
		clanarinaPanel.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(25, 11, 286, 362);
		clanarinaPanel.add(panel_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(0, 0, 286, 362);
		panel_3.add(label_1);
		
		JRadioButton rdbtnAktivne = new JRadioButton("Aktivne");
		rdbtnAktivne.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnAktivne.setBackground(Color.WHITE);
		rdbtnAktivne.setBounds(546, 246, 128, 23);
		clanarinaPanel.add(rdbtnAktivne);
		
		JRadioButton rdbtnIstekle = new JRadioButton("Istekle");
		rdbtnIstekle.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnIstekle.setBackground(Color.WHITE);
		rdbtnIstekle.setBounds(546, 272, 128, 23);
		clanarinaPanel.add(rdbtnIstekle);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JButton btnBibliotekar = new JButton("BIBLIOTEKAR");
		btnBibliotekar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) getContentPane().getLayout();
				c1.show(getContentPane(), "p1");
			}
		});
		btnBibliotekar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBibliotekar.setBackground(UIManager.getColor("Button.background"));
		menuBar.add(btnBibliotekar);
		
		JButton btnKorisnik = new JButton("KORISNIK");
		btnKorisnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout) getContentPane().getLayout();
				c2.show(getContentPane(), "p2");
			}
		});
		btnKorisnik.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnKorisnik.setBackground(UIManager.getColor("Button.background"));
		menuBar.add(btnKorisnik);
		
		JButton btnKnjiga = new JButton("KNJIGA");
		btnKnjiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c3 = (CardLayout) getContentPane().getLayout();
				c3.show(getContentPane(), "p3");
			}
		});
		btnKnjiga.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnKnjiga.setBackground(UIManager.getColor("Button.background"));
		menuBar.add(btnKnjiga);
		
		JButton btnClanarina = new JButton("CLANARINA");
		btnClanarina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c4 = (CardLayout) getContentPane().getLayout();
				c4.show(getContentPane(), "p4");
			}
		});
		btnClanarina.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClanarina.setBackground(UIManager.getColor("Button.background"));
		menuBar.add(btnClanarina);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBackground(UIManager.getColor("Button.background"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForma.main(new String[] {});
				dispose();
			}
		});
		menuBar.add(btnLogout);

	}
	
	public void clearFields() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_10.setText("");
		textField_11.setText("");
		chckbxNewCheckBox.setSelected(false);
	}
}