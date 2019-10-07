package rs.model;

import java.util.*;

public class Autor {

    public Autor() {
    }

    public int id;
    public String ime;
    public String prezime;
    public String biografija;
	
    public Autor(int id, String ime, String prezime, String biografija) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.biografija = biografija;
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

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	@Override
	public String toString() {
		return "\nid: " + id + "\n" + 
				"Autor: " + ime + " " + prezime + "\n" +
				"Biografija: " + biografija;
	} 	

}