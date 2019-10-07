package rs.model;

import java.util.*;

public class KnjigaKorisnik {

    
    public KnjigaKorisnik() {
    }

    public String barkod;
    protected int id_korisnika;
    public String datum_izdavanja;
    public String rok_vracanja;
    public String datum_vracanja;
    
	public KnjigaKorisnik(String barkod, int id_korisnika, String datum_izdavanja, String rok_vracanja,
			String datum_vracanja) {
		super();
		this.barkod = barkod;
		this.id_korisnika = id_korisnika;
		this.datum_izdavanja = datum_izdavanja;
		this.rok_vracanja = rok_vracanja;
		this.datum_vracanja = datum_vracanja;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public int getId_korisnika() {
		return id_korisnika;
	}

	public void setId_korisnika(int id_korisnika) {
		this.id_korisnika = id_korisnika;
	}

	public String getDatum_izdavanja() {
		return datum_izdavanja;
	}

	public void setDatum_izdavanja(String datum_izdavanja) {
		this.datum_izdavanja = datum_izdavanja;
	}

	public String getRok_vracanja() {
		return rok_vracanja;
	}

	public void setRok_vracanja(String rok_vracanja) {
		this.rok_vracanja = rok_vracanja;
	}

	public String getDatum_vracanja() {
		return datum_vracanja;
	}

	public void setDatum_vracanja(String datum_vracanja) {
		this.datum_vracanja = datum_vracanja;
	}

	@Override
	public String toString() {
		return "\nPozajmica: " + barkod + " " + id_korisnika +
				"\nDatum izdavanja: " + datum_izdavanja + 
				"\nRok vracanja: " + rok_vracanja + 
				"\nDatum vracanja: " + datum_vracanja;
	}
    
}