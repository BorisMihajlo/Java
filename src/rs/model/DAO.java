package rs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;


public class DAO {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	private void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost/biblioteka", "root", "");
	}
	
    public DAO() {
    	super();
    }

    public User login(String username, String password) {
    	// TODO implement here
        return null;
    }

    public ArrayList<Bibliotekar> getBibliotekare() throws ClassNotFoundException, SQLException {
		// POMOCNE PROMENLJIVE ZA KONKRETNU METODU
		ArrayList<Bibliotekar> lista = new ArrayList<Bibliotekar>();

		connect();
		preparedStatement = connect.prepareStatement("select * from bibliotekar");

		// DOPUNJAVANJE SQL STRINGA, SVAKI ? SE MORA PODESITI 
		//preparedStatement.setString(1, o.getJmbg());
		
		preparedStatement.execute();
		
		//****POCETAK	AKO UPIT VRACA REZULTAT TREBA SLEDECI DEO 
		resultSet = preparedStatement.getResultSet();
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String ime = resultSet.getString("ime");
			String prezime = resultSet.getString("prezime");
			String adresa = resultSet.getString("adresa");
			String telefon = resultSet.getString("telefon");
			String email = resultSet.getString("email");
			String datum_rodjenja = resultSet.getString("datum_rodjenja");
			String datum_zaposlenja = resultSet.getString("datum_zaposlenja");
			boolean admin = resultSet.getBoolean("admin");
			
			Bibliotekar b = new Bibliotekar(id, ime, prezime, adresa, telefon, email, datum_rodjenja, datum_zaposlenja, admin);

			lista.add(b);
		}
		//****KRAJ		KRAJ OBRADE ResultSet-a	
		
		close();
		return lista;
	}
    
    public void dodajBibliotekara(Bibliotekar b) throws ClassNotFoundException, SQLException{
    	// TODO implement here
    	// POMOCNE PROMENLJIVE ZA KONKRETNU METODU

    			connect();
    			preparedStatement = connect.prepareStatement("insert into bibliotekar(ime, prezime, adresa, telefon, email, datum_rodjenja, datum_zaposlenja, admin) values (?,?,?,?,?,?,?,?)");

    			// DOPUNJAVANJE SQL STRINGA, SVAKI ? SE MORA PODESITI 
    			preparedStatement.setString(1, b.getIme());
    			preparedStatement.setString(2, b.getPrezime());
    			preparedStatement.setString(3, b.getAdresa());
    			preparedStatement.setString(4, b.getTelefon());
    			preparedStatement.setString(5, b.getEmail());
    			preparedStatement.setString(6, b.getDatum_rodjenja());
    			preparedStatement.setString(7, b.getDatum_zaposlenja());
    			preparedStatement.setBoolean(8, b.isAdmin());
    			
    			
    			preparedStatement.execute();
    			
    			//****POCETAK	AKO UPIT VRACA REZULTAT TREBA SLEDECI DEO 
    			//****KRAJ		KRAJ OBRADE ResultSet-a	
    			
    			close();
    }

    public void obrisiBibliotekara(int id) {
        // TODO implement here
    }

    public void urediBibliotekara(Bibliotekar b) {
        // TODO implement here
    }

    public Bibliotekar prikaziPodatkeBibliotekara(int id) {
        // TODO implement here
    	return null;
    }
    
    public ArrayList<Knjiga> getKnjige() throws ClassNotFoundException, SQLException {
		// POMOCNE PROMENLJIVE ZA KONKRETNU METODU
		ArrayList<Knjiga> lista = new ArrayList<Knjiga>();

		connect();
		preparedStatement = connect.prepareStatement("select * from knjiga");

		// DOPUNJAVANJE SQL STRINGA, SVAKI ? SE MORA PODESITI 
		//preparedStatement.setString(1, o.getJmbg());
		
		preparedStatement.execute();
		
		//****POCETAK	AKO UPIT VRACA REZULTAT TREBA SLEDECI DEO 
		resultSet = preparedStatement.getResultSet();
		
		while (resultSet.next()) {
			int id_knjige = resultSet.getInt("id_knjige");
			String naziv = resultSet.getString("naziv");
			String barkod = resultSet.getString("barkod");
			int ISBN_broj = resultSet.getInt("ISBN_broj");
			String autor = resultSet.getString("autor");
			String kategorija = resultSet.getString("kategorija");
			String sadrzaj = resultSet.getString("sadrzaj");
			String izdavac = resultSet.getString("izdavac");
			String izdanje = resultSet.getString("izdanje");
			int godina_izdavanja = resultSet.getInt("godina_izdavanja");
			int stanje = resultSet.getInt("stanje");
			int broj_dostupnih_knjiga = resultSet.getInt("broj_dostupnih_knjiga");
			int broj_izdatih_knjiga = resultSet.getInt("broj_izdatih_knjiga");
			boolean poklon = resultSet.getBoolean("poklon");
			
			Knjiga k = new Knjiga(id_knjige, naziv, barkod, ISBN_broj, autor, kategorija, sadrzaj, izdavac, izdanje, godina_izdavanja, stanje, broj_dostupnih_knjiga, broj_izdatih_knjiga, poklon);
			
			lista.add(k);
		}
		//****KRAJ		KRAJ OBRADE ResultSet-a	
		
		close();
		return lista;
	}

    public void dodajKnjigu(Knjiga k) throws ClassNotFoundException, SQLException{
        // TODO implement here
    	// POMOCNE PROMENLJIVE ZA KONKRETNU METODU

		connect();
		preparedStatement = connect.prepareStatement("insert into knjiga(naziv, barkod, ISBN_broj, autor, kategorija, sadrzaj, izdavac, izdanje, godina_izdavanja, stanje, broj_dostupnih_knjiga, broj_izdatih_knjiga, poklon) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");

		// DOPUNJAVANJE SQL STRINGA, SVAKI ? SE MORA PODESITI 
		preparedStatement.setString(1, k.getNaziv());
		preparedStatement.setString(2, k.getBarkod());
		preparedStatement.setInt(3, k.getISBN_broj());
		preparedStatement.setString(4, k.getAutor());
		preparedStatement.setString(5, k.getKategorija());
		preparedStatement.setString(6, k.getSadrzaj());
		preparedStatement.setString(7, k.getIzdavac());
		preparedStatement.setString(8, k.getIzdanje());
		preparedStatement.setInt(9, k.getGodina_izdavanja());
		preparedStatement.setInt(10, k.getStanje());
		preparedStatement.setInt(11, k.getBroj_dostupnih_knjiga());
		preparedStatement.setInt(12, k.getBroj_izdatih_knjiga());
		preparedStatement.setBoolean(13, k.isPoklon());
		
		
		preparedStatement.execute();
		
		//****POCETAK	AKO UPIT VRACA REZULTAT TREBA SLEDECI DEO 
		//****KRAJ		KRAJ OBRADE ResultSet-a	
		
		close();
    }

    public void obrisiKnjigu(int id_knjige) throws ClassNotFoundException, SQLException{
        // TODO implement here
    	// POMOCNE PROMENLJIVE ZA KONKRETNU METODU

    			connect();
    			preparedStatement = connect.prepareStatement("delete from knjiga where id_knjige = ?");

    			// DOPUNJAVANJE SQL STRINGA, SVAKI ? SE MORA PODESITI 
    			preparedStatement.setInt(1, id_knjige);
    			
    			preparedStatement.execute();
    			
    			//****POCETAK	AKO UPIT VRACA REZULTAT TREBA SLEDECI DEO 
    			//****KRAJ		KRAJ OBRADE ResultSet-a	
    			
    			close();
    }

    public void urediKnjigu(Knjiga k) {
        // TODO implement here
    }

    public Knjiga prikaziKnjigu(int id_knjige) throws ClassNotFoundException, SQLException {
        // TODO implement here
    	// POMOCNE PROMENLJIVE ZA KONKRETNU METODU

    			connect();
    			preparedStatement = connect.prepareStatement("select * from knjiga where id_knjige = ?");

    			// DOPUNJAVANJE SQL STRINGA, SVAKI ? SE MORA PODESITI 
    			preparedStatement.setInt(1, id_knjige);
    			
    			preparedStatement.execute();
    			
    			//****POCETAK	AKO UPIT VRACA REZULTAT TREBA SLEDECI DEO 
    			resultSet = preparedStatement.getResultSet();
    			
    			while (resultSet.next()) {
    				
    				String naziv = resultSet.getString("naziv");
    				String barkod = resultSet.getString("barkod");
    				int ISBN_broj = resultSet.getInt("ISBN_broj");
    				String autor = resultSet.getString("autor");
    				String kategorija = resultSet.getString("kategorija");
    				String sadrzaj = resultSet.getString("sadrzaj");
    				String izdavac = resultSet.getString("izdavac");
    				String izdanje = resultSet.getString("izdanje");
    				int godina_izdavanja = resultSet.getInt("godina_izdavanja");
    				int stanje = resultSet.getInt("stanje");
    				int broj_dostupnih_knjiga = resultSet.getInt("broj_dostupnih_knjiga");
    				int broj_izdatih_knjiga = resultSet.getInt("broj_izdatih_knjiga");
    				boolean poklon = resultSet.getBoolean("poklon");
    				
    				Knjiga k = new Knjiga(id_knjige, naziv, barkod, ISBN_broj, autor, kategorija, sadrzaj, izdavac, izdanje, godina_izdavanja, stanje, broj_dostupnih_knjiga, broj_izdatih_knjiga, poklon);
    				
    				System.out.println(k.toString());
    			}
    			
    			//****KRAJ		KRAJ OBRADE ResultSet-a	
    			
    			close();
				return (Knjiga) resultSet;
    }

    public void dodajKorisnika(Korisnik k) {
        // TODO implement here
    }

    public void obrisiKorisnika(int id) {
        // TODO implement here
    }

    public void urediKorisnika(Korisnik k) {
        // TODO implement here
    }

    public Korisnik prikaziPodatkeKorisnika(int id) {
        // TODO implement here
        return null;
    }

    public String uzimaTipKorisnika(String tip) {
        // TODO implement here
        return "";
    }

    public void izracunavaClanarinu(String tip) {
        // TODO implement here
    }

    public void clanarinaPlacena(boolean clanarina) {
        // TODO implement here
    }

    public boolean potvrdujeClanarinu(int redni_broj, int id_korisnika) {
        // TODO implement here
        return false;
    }

    public boolean proveravaDostupnostKnjige(String barkod) {
        // TODO implement here
        return false;
    }

    public boolean proveravaKorisnika(int id_korisnika) {
        // TODO implement here
        return false;
    }

    public boolean proveravaBrojPozajmljenihKnjiga(int id_korsinika) {
        // TODO implement here
        return false;
    }

    public void dodajePodatkePozajmljivanja(String barkod, int id_korisnika) {
        // TODO implement here
    }

    public boolean proveravaPodatkePozajmice(String barkod, int id_korisnika) {
        // TODO implement here
        return false;
    }

    public void vracaKnjigu(String barkod) {
        // TODO implement here
    }

    public void dodajAutora(Autor a) {
        // TODO implement here
    }
    
    private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}