package rs.model;

import java.util.*;


public class Knjiga {

    public Knjiga() {
    }

    public int id_knjige;
    public String naziv;
    public String barkod;
    public int ISBN_broj;
    public String autor;
    public String kategorija;
    public String sadrzaj;
    public String izdavac;
    public String izdanje;
    public int godina_izdavanja;
    public int stanje;
    public int broj_dostupnih_knjiga;
    public int broj_izdatih_knjiga;
    public boolean poklon;
	
	public Knjiga(int id_knjige, String naziv, String barkod, int ISBN_broj, String autor, String kategorija, String sadrzaj, String izdavac, String izdanje, int godina_izdavanja, int stanje, int broj_dostupnih_knjiga, int broj_izdatih_knjiga, boolean poklon) {
		super();
		this.id_knjige = id_knjige;
		this.naziv = naziv;
		this.barkod = barkod;
		this.ISBN_broj = ISBN_broj;
		this.autor = autor;
		this.kategorija = kategorija;
		this.sadrzaj = sadrzaj;
		this.izdavac = izdavac;
		this.izdanje = izdanje;
		this.godina_izdavanja = godina_izdavanja;
		this.stanje = stanje;
		this.broj_dostupnih_knjiga = broj_dostupnih_knjiga;
		this.broj_izdatih_knjiga = broj_izdatih_knjiga;
		this.poklon = poklon;
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


	public String getBarkod() {
		return barkod;
	}


	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}


	public int getISBN_broj() {
		return ISBN_broj;
	}


	public void setISBN_broj(int ISBN_broj) {
		this.ISBN_broj = ISBN_broj;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getKategorija() {
		return kategorija;
	}


	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}


	public String getSadrzaj() {
		return sadrzaj;
	}


	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}


	public String getIzdavac() {
		return izdavac;
	}


	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}


	public String getIzdanje() {
		return izdanje;
	}


	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}


	public int getGodina_izdavanja() {
		return godina_izdavanja;
	}


	public void setGodina_izdavanja(int godina_izdavanja) {
		this.godina_izdavanja = godina_izdavanja;
	}


	public int getStanje() {
		return stanje;
	}


	public void setStanje(int stanje) {
		this.stanje = stanje;
	}


	public int getBroj_dostupnih_knjiga() {
		return broj_dostupnih_knjiga;
	}


	public void setBroj_dostupnih_knjiga(int broj_dostupnih_knjiga) {
		this.broj_dostupnih_knjiga = broj_dostupnih_knjiga;
	}


	public int getBroj_izdatih_knjiga() {
		return broj_izdatih_knjiga;
	}


	public void setBroj_izdatih_knjiga(int broj_izdatih_knjiga) {
		this.broj_izdatih_knjiga = broj_izdatih_knjiga;
	}


	public boolean isPoklon() {
		return poklon;
	}

	public void setPoklon(boolean poklon) {
		this.poklon = poklon;
	}

	@Override
	public String toString() {
		return "\nKnjiga:" +
				"\nid: " + id_knjige + " " + naziv + 
				"\nautor: " + autor + 
				"\nbarkod: " + barkod +
				"\nISBN broj: " + ISBN_broj + 
				"\nkategorija: " + kategorija +
				"\nsadrzaj: " + sadrzaj +
				"\nizdavac: " + izdavac +
				"\nizdanje: " + izdanje +
				"\ngodina izdanja: " + godina_izdavanja + ". godina" +
				"\nstanje: " + stanje +
				"\ndostupno: " + broj_dostupnih_knjiga +
				"\nizdato: " + broj_izdatih_knjiga +
				"\npoklon: " + poklon;
	}
    
}