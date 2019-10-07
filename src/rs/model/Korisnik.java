package rs.model;

import java.util.*;

public class Korisnik {

  
    public Korisnik() {
    }

    protected int id_korisnika;
    protected String ime;
    protected String prezime;
    protected String adresa;
    protected String broj_telefona;
    protected String datum_rodjenja;
    protected int broj_clanske_karte;
    public Boolean clanarina;
    public int broj_pozajmljenih_knjiga;
    public int max_broj_knjiga;
    public String tip;
	
	public Korisnik(int id_korisnika, String ime, String prezime, String adresa, String broj_telefona,
			String datum_rodjenja, int broj_clanske_karte, Boolean clanarina, int broj_pozajmljenih_knjiga,
			int max_broj_knjiga, String tip) {
		super();
		this.id_korisnika = id_korisnika;
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.broj_telefona = broj_telefona;
		this.datum_rodjenja = datum_rodjenja;
		this.broj_clanske_karte = broj_clanske_karte;
		this.clanarina = clanarina;
		this.broj_pozajmljenih_knjiga = broj_pozajmljenih_knjiga;
		this.max_broj_knjiga = max_broj_knjiga;
		this.tip = tip;
	}
	
	public int getId_korisnika() {
		return id_korisnika;
	}

	public void setId_korisnika(int id_korisnika) {
		this.id_korisnika = id_korisnika;
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

	public String getBroj_telefona() {
		return broj_telefona;
	}

	public void setBroj_telefona(String broj_telefona) {
		this.broj_telefona = broj_telefona;
	}

	public String getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public int getBroj_clanske_karte() {
		return broj_clanske_karte;
	}

	public void setBroj_clanske_karte(int broj_clanske_karte) {
		this.broj_clanske_karte = broj_clanske_karte;
	}

	public Boolean getClanarina() {
		return clanarina;
	}

	public void setClanarina(Boolean clanarina) {
		this.clanarina = clanarina;
	}

	public int getBroj_pozajmljenih_knjiga() {
		return broj_pozajmljenih_knjiga;
	}

	public void setBroj_pozajmljenih_knjiga(int broj_pozajmljenih_knjiga) {
		this.broj_pozajmljenih_knjiga = broj_pozajmljenih_knjiga;
	}

	public int getMax_broj_knjiga() {
		return max_broj_knjiga;
	}

	public void setMax_broj_knjiga(int max_broj_knjiga) {
		this.max_broj_knjiga = max_broj_knjiga;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "\nKorisnik:" +
				"\nid: " + id_korisnika + " " + ime + " " + prezime +
				"\nadresa: " + adresa + 
				"\nbroj telefona: " + broj_telefona + 
				"\ndatum rodjenja: " + datum_rodjenja + 
				"\nbroj clanske karte: " + broj_clanske_karte +
				"\nclanarina: " + clanarina + 
				"\ntip: " + tip +
				"\nbroj pozajmljenih knjiga: " + broj_pozajmljenih_knjiga + 
				"\nmaksimalan broj knjiga koji moze biti pozajmljen u jednom trenutku: " + max_broj_knjiga;
	}

}