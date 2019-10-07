package rs.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

import rs.model.DAO;
import rs.model.Knjiga;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class KnjigaForma extends JFrame {

	private JTextField txtID;
	private JTextField txtNaziv;
	private JTextField txtBarkod;
	private JTextField txtISBN;
	private JTextField txtAutor;
	private JTextField txtKategorija;
	private JTextField txtSadrzaj;
	private JTextField textField_7;
	private JTextField txtStanje;
	private JTextField txtDostupno;
	private JTextField txtIzdato;
	private JTextField txtIzdavac;
	private JTextField txtIzdanje;
	private JTextField txtGodinaIzdanja;
	private JCheckBox checkBox;
	private ArrayList<Knjiga>knjige;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KnjigaForma frame = new KnjigaForma();
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
	public KnjigaForma() {
		
		knjige = new ArrayList<Knjiga>();
		
		getContentPane().setBackground(Color.WHITE);
		setTitle("Knjiga");
		setBounds(100, 100, 700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel knjigePanel = new JPanel();
		knjigePanel.setBackground(Color.WHITE);
		getContentPane().add(knjigePanel, "p1");
		knjigePanel.setLayout(null);
		
		JButton button = new JButton("DODAJ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txtID.getText();
				String naziv = txtNaziv.getText();
				String barkod = txtBarkod.getText();
				String isbn = txtISBN.getText();
				String autor = txtAutor.getText();
				String kategorija = txtKategorija.getText();
				String sadrzaj = txtSadrzaj.getText();
				String izdavac = txtIzdavac.getText();
				String izdanje = txtIzdanje.getText();
				String godina = txtGodinaIzdanja.getText();
				String s = txtStanje.getText();
				String d = txtDostupno.getText();
				String i = txtIzdato.getText();
				boolean poklon = false;
				
				
				if(id!=null && id.trim().length()>0 && naziv!=null && naziv.trim().length()>0 && barkod!=null && barkod.trim().length()>0 && isbn!=null && isbn.trim().length()>0 && autor!=null && autor.trim().length()>0 && kategorija!=null && kategorija.trim().length()>0 && sadrzaj!=null && sadrzaj.trim().length()>0 && izdavac!=null && izdavac.trim().length()>0 && izdanje!=null && izdanje.trim().length()>0 && godina!=null && godina.trim().length()>0 && s!=null && s.trim().length()>0 && d!=null && d.trim().length()>0 && i!=null && i.trim().length()>0 || checkBox.isSelected()) {
					
					try {
						
						int id_knjige = Integer.parseInt(id);
						int ISBN_broj = Integer.parseInt(isbn);
						int godina_izdavanja = Integer.parseInt(godina);
						int stanje = Integer.parseInt(s);
						int broj_dostupnih_knjiga = Integer.parseInt(d);
						int broj_izdatih_knjiga = Integer.parseInt(i);
					
						
						Knjiga k = new Knjiga(id_knjige, naziv, barkod, ISBN_broj, autor, kategorija, sadrzaj, izdavac, izdanje, godina_izdavanja, stanje, broj_dostupnih_knjiga, broj_izdatih_knjiga, poklon );
						knjige.add(k);
						
						DAO dao = new DAO();
						dao.dodajKnjigu(k);
						
						JOptionPane.showMessageDialog(null, "Dodata knjiga:\n"+k);
						clearFields();
						
					} catch (Exception e) {
						// TODO: handle exception
						
						e.printStackTrace();
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Morate popuniti sva polja.");
					
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(SystemColor.menu);
		button.setBounds(546, 248, 128, 23);
		knjigePanel.add(button);
		
		JButton button_1 = new JButton("OBRISI");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txtID.getText();
				
				if(id!=null && id.trim().length()>0) {
					
					try {
						int id_knjige = Integer.parseInt(id);
						
						DAO dao = new DAO();
						dao.obrisiKnjigu(id_knjige);
						
						JOptionPane.showMessageDialog(null, "Knjiga obrisana!");
						clearFields();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "ID knjige mora biti broj.");
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(546, 282, 128, 23);
		knjigePanel.add(button_1);
		
		JButton button_2 = new JButton("UREDI");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(546, 316, 128, 23);
		knjigePanel.add(button_2);
		
		JButton button_3 = new JButton("PRIKAZI");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                String id = txtID.getText();
				
				if(id!=null && id.trim().length()>0) {
					
					try {
						int id_knjige = Integer.parseInt(id);
						
						
						String ispis="PODACI O KNJIZI\n";
						
						DAO k = new DAO();
						
						ispis+="\t"+k.prikaziKnjigu(id_knjige)+"\n";
							
						JOptionPane.showMessageDialog(null, ispis);
						clearFields();
					} catch (Exception e) {
						// TODO: handle exception
						//JOptionPane.showMessageDialog(null, "Greska!");
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "ID knjige mora biti broj.");
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(546, 350, 128, 23);
		knjigePanel.add(button_3);
		
		JLabel lblIdKnjige = new JLabel("ID knjige:");
		lblIdKnjige.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdKnjige.setBounds(24, 23, 170, 23);
		knjigePanel.add(lblIdKnjige);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtID.setColumns(10);
		txtID.setBounds(204, 23, 251, 23);
		knjigePanel.add(txtID);
		
		JLabel lblNaziv = new JLabel("Naziv:");
		lblNaziv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNaziv.setBounds(24, 57, 170, 23);
		knjigePanel.add(lblNaziv);
		
		txtNaziv = new JTextField();
		txtNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNaziv.setColumns(10);
		txtNaziv.setBounds(204, 57, 251, 23);
		knjigePanel.add(txtNaziv);
		
		JLabel lblBarkod_1 = new JLabel("Barkod:");
		lblBarkod_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBarkod_1.setBounds(24, 91, 170, 23);
		knjigePanel.add(lblBarkod_1);
		
		txtBarkod = new JTextField();
		txtBarkod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBarkod.setColumns(10);
		txtBarkod.setBounds(204, 91, 251, 23);
		knjigePanel.add(txtBarkod);
		
		JLabel lblIsbnBroj = new JLabel("ISBN broj:");
		lblIsbnBroj.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIsbnBroj.setBounds(24, 125, 170, 23);
		knjigePanel.add(lblIsbnBroj);
		
		txtISBN = new JTextField();
		txtISBN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtISBN.setColumns(10);
		txtISBN.setBounds(204, 125, 251, 23);
		knjigePanel.add(txtISBN);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutor.setBounds(24, 159, 170, 23);
		knjigePanel.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAutor.setColumns(10);
		txtAutor.setBounds(204, 159, 251, 23);
		knjigePanel.add(txtAutor);
		
		JLabel lblKategorija = new JLabel("Kategorija:");
		lblKategorija.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKategorija.setBounds(24, 193, 170, 23);
		knjigePanel.add(lblKategorija);
		
		txtKategorija = new JTextField();
		txtKategorija.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtKategorija.setColumns(10);
		txtKategorija.setBounds(204, 193, 251, 23);
		knjigePanel.add(txtKategorija);
		
		JLabel lblSadrzaj = new JLabel("Sadrzaj:");
		lblSadrzaj.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSadrzaj.setBounds(24, 227, 170, 23);
		knjigePanel.add(lblSadrzaj);
		
		txtSadrzaj = new JTextField();
		txtSadrzaj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSadrzaj.setColumns(10);
		txtSadrzaj.setBounds(204, 227, 251, 23);
		knjigePanel.add(txtSadrzaj);
		
		JLabel lblStanje = new JLabel("Stanje:");
		lblStanje.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStanje.setBounds(465, 23, 97, 23);
		knjigePanel.add(lblStanje);
		
		txtStanje = new JTextField();
		txtStanje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtStanje.setColumns(10);
		txtStanje.setBounds(572, 23, 87, 23);
		knjigePanel.add(txtStanje);
		
		JLabel lblDostupno = new JLabel("Dostupno:");
		lblDostupno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDostupno.setBounds(465, 57, 97, 23);
		knjigePanel.add(lblDostupno);
		
		txtDostupno = new JTextField();
		txtDostupno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDostupno.setColumns(10);
		txtDostupno.setBounds(572, 57, 87, 23);
		knjigePanel.add(txtDostupno);
		
		JLabel lblIzdato = new JLabel("Izdato:");
		lblIzdato.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzdato.setBounds(465, 91, 97, 23);
		knjigePanel.add(lblIzdato);
		
		txtIzdato = new JTextField();
		txtIzdato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIzdato.setColumns(10);
		txtIzdato.setBounds(572, 91, 87, 23);
		knjigePanel.add(txtIzdato);
		
		JLabel lblIzdavac = new JLabel("Izdavac:");
		lblIzdavac.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzdavac.setBounds(24, 282, 170, 23);
		knjigePanel.add(lblIzdavac);
		
		txtIzdavac = new JTextField();
		txtIzdavac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIzdavac.setColumns(10);
		txtIzdavac.setBounds(204, 282, 251, 23);
		knjigePanel.add(txtIzdavac);
		
		JLabel lblIzdanje = new JLabel("Izdanje:");
		lblIzdanje.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzdanje.setBounds(24, 316, 170, 23);
		knjigePanel.add(lblIzdanje);
		
		txtIzdanje = new JTextField();
		txtIzdanje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIzdanje.setColumns(10);
		txtIzdanje.setBounds(204, 316, 251, 23);
		knjigePanel.add(txtIzdanje);
		
		JLabel lblGodinaIzdanja = new JLabel("Godina izdanja:");
		lblGodinaIzdanja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGodinaIzdanja.setBounds(24, 350, 170, 23);
		knjigePanel.add(lblGodinaIzdanja);
		
		txtGodinaIzdanja = new JTextField();
		txtGodinaIzdanja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtGodinaIzdanja.setColumns(10);
		txtGodinaIzdanja.setBounds(204, 350, 251, 23);
		knjigePanel.add(txtGodinaIzdanja);
		
		JLabel lblPoklon = new JLabel("Poklon:");
		lblPoklon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPoklon.setBounds(465, 125, 97, 23);
		knjigePanel.add(lblPoklon);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(572, 127, 97, 23);
		knjigePanel.add(checkBox);
		
		JPanel izdavanjePanel = new JPanel();
		izdavanjePanel.setBackground(Color.WHITE);
		getContentPane().add(izdavanjePanel, "p2");
		izdavanjePanel.setLayout(null);
		
		JLabel lblBarkod = new JLabel("Barkod:");
		lblBarkod.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBarkod.setBounds(325, 316, 198, 23);
		izdavanjePanel.add(lblBarkod);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(550, 316, 128, 23);
		izdavanjePanel.add(textField_7);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOk.setBackground(SystemColor.menu);
		btnOk.setBounds(550, 350, 128, 23);
		izdavanjePanel.add(btnOk);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(29, 11, 286, 362);
		izdavanjePanel.add(panel_1);
		
		JLabel label_12 = new JLabel("");
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_12.setBounds(0, 0, 286, 362);
		panel_1.add(label_12);
		
		JRadioButton rdbtnIzdaj = new JRadioButton("Izdaj");
		rdbtnIzdaj.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnIzdaj.setBackground(Color.WHITE);
		rdbtnIzdaj.setBounds(550, 246, 128, 23);
		izdavanjePanel.add(rdbtnIzdaj);
		
		JRadioButton rdbtnVrati = new JRadioButton("Vrati");
		rdbtnVrati.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVrati.setBackground(Color.WHITE);
		rdbtnVrati.setBounds(550, 272, 128, 23);
		izdavanjePanel.add(rdbtnVrati);
		setTitle("Knjiga");
		setBounds(100, 100, 700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JButton btnKnjige = new JButton("KNJIGA");
		btnKnjige.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c1 = (CardLayout) getContentPane().getLayout();
				c1.show(getContentPane(), "p1");
			}
		});
		btnKnjige.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnKnjige.setBackground(UIManager.getColor("Button.background"));
		menuBar.add(btnKnjige);
		
		JButton btnIzdavanje = new JButton("IZDAVANJE");
		btnIzdavanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c2 = (CardLayout) getContentPane().getLayout();
				c2.show(getContentPane(), "p2");
			}
		});
		btnIzdavanje.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIzdavanje.setBackground(UIManager.getColor("Button.background"));
		menuBar.add(btnIzdavanje);
		
		JButton btnBibliotekar = new JButton("BIBLIOTEKAR");
		btnBibliotekar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BibliotekarForma.main(new String[] {});
				dispose();
			}
		});
		btnBibliotekar.setBackground(UIManager.getColor("Button.background"));
		btnBibliotekar.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(btnBibliotekar);
	}
	
	public void clearFields() {
		txtID.setText("");
		txtNaziv.setText("");
		txtBarkod.setText("");
		txtISBN.setText("");
		txtAutor.setText("");
		txtKategorija.setText("");
		txtSadrzaj.setText("");
		txtIzdanje.setText("");
		txtIzdavac.setText("");
		txtGodinaIzdanja.setText("");
		txtDostupno.setText("");
		txtStanje.setText("");
		txtIzdato.setText("");
		checkBox.setSelected(false);
	}
}
