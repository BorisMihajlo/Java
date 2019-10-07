package rs.model;

import java.util.*;

public class Clanarina {

    public Clanarina() {
    }
    
    public int redni_broj;
    protected int id_korisnika;
    public float cena;
    public String datum_otvaranja;
    public String datum_isticanja;
    
	public Clanarina(int redni_broj, int id_korisnika, float cena, String datum_otvaranja, String datum_isticanja) {
		super();
		this.redni_broj = redni_broj;
		this.id_korisnika = id_korisnika;
		this.cena = cena;
		this.datum_otvaranja = datum_otvaranja;
		this.datum_isticanja = datum_isticanja;
	}

	public int getRedni_broj() {
		return redni_broj;
	}

	public void setRedni_broj(int redni_broj) {
		this.redni_broj = redni_broj;
	}

	public int getId_korisnika() {
		return id_korisnika;
	}

	public void setId_korisnika(int id_korisnika) {
		this.id_korisnika = id_korisnika;
	}

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public String getDatum_otvaranja() {
		return datum_otvaranja;
	}

	public void setDatum_otvaranja(String datum_otvaranja) {
		this.datum_otvaranja = datum_otvaranja;
	}

	public String getDatum_isticanja() {
		return datum_isticanja;
	}

	public void setDatum_isticanja(String datum_isticanja) {
		this.datum_isticanja = datum_isticanja;
	}

	@Override
	public String toString() {
		return "\nRedni broj clanarine: " + redni_broj + 
				"\nZa korisnika: " + id_korisnika + " iznosi " + cena + " dinara." +
				"\nOtvorena: " + datum_otvaranja +
				"\nIstice: " + datum_isticanja;
	}
    
}