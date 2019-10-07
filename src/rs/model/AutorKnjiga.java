package rs.model;

import java.util.*;

public class AutorKnjiga {

    public AutorKnjiga() {
    }
    
    public int id_autora;
	public int id_knjige;
    public String naziv;
    public String ime;
    public String prezime;
	
	public AutorKnjiga(int id_autora, int id_knjige, String naziv, String ime, String prezime) {
		super();
		this.id_autora = id_autora;
		this.id_knjige = id_knjige;
		this.naziv = naziv;
		this.ime = ime;
		this.prezime = prezime;
	}

	public int getId_autora() {
		return id_autora;
	}
	
	public void setId_autora(int id_autora) {
		this.id_autora = id_autora;
	}

	public int getId_knjige() {
		return id_knjige;
	}

	public void setId_knjige(int id_knjige) {
		this.id_knjige = id_knjige;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
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

	@Override
	public String toString() {
		return "\nAutor: " + ime + " " + prezime +
				"\nNaziv knjige: " + naziv;
	}
    
}