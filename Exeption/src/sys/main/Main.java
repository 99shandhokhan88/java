package sys.main;

import sys.buisness.AgeVerify;
import sys.exception.BadAgeException;
import sys.math.Operazione;

public class Main {

	
	/*
	public static void main(String[] args) {
		
		Operazione operazione = new Operazione();
		
		operazione.divisione(0, 0);

	}
	
	*/
	
public static void main(String[] args) throws BadAgeException {
		
		AgeVerify ageVerify = new AgeVerify();
		ageVerify.verify(9);

	}


}
