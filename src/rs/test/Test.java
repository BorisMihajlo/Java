package rs.test;

import java.sql.SQLException;

import rs.model.DAO;
import rs.model.Knjiga;

public class Test {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		try {
			//System.out.println(dao.getKnjige());
			
			//Knjiga k = new Knjiga(0, "Hari Poter i relikvije smrti", "bar125317523123", 216924, "J. K. Roling", "misterija, avantura", "Konacan duel izmedju dobra i zla...", "Vulkan", "trece", 2015, 1, 1, 0);
				
			//dao.dodajKnjigu(k);
			
			System.out.println(dao.prikaziKnjigu(17));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}