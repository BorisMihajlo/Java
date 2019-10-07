package rs.model;

import java.util.*;

public class Bibliotekar {

    public Bibliotekar() {
    }

    protected int id;
    protected String ime;
    protected String prezime;
    protected String adresa;
    protected String telefon;
    protected String email;
    protected String datum_rodjenja;
    protected String datum_zaposlenja;
    protected boolean admin;
    
	public Bibliotekar(int id, String ime, String prezime, String adresa, String telefon, String email,
			String datum_rodjenja_, String datum_zaposlenja, boolean admin) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.datum_rodjenja = datum_rodjenja_;
		this.datum_zaposlenja = datum_zaposlenja;
		this.admin = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public String getDatum_zaposlenja() {
		return datum_zaposlenja;
	}

	public void setDatum_zaposlenja(String datum_zaposlenja) {
		this.datum_zaposlenja = datum_zaposlenja;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Bibliotekar:"
				+ "\nid:  " + id + " " + ime + " " + prezime
				+ "\nadresa: " + adresa 
				+ "\ntelefon: " + telefon 
				+ "\nemail: " + email 
				+ "\ndatum_rodjenja: " + datum_rodjenja 
				+ "\ndatum_zaposlenja: " +datum_zaposlenja 
				+ "\nadmin: " + admin;
	}
}