package sys.main;

import sys.Contatore;

public class Main {

	public static void main(String[] args) {
		
		Contatore contatore = new Contatore();
		
		contatore.conta();
		contatore.conta();
		contatore.conta();
		contatore.conta();
		contatore.conta();
		
		Contatore contatore2 = new Contatore();
		contatore2.conta();
		
		contatore.setX(2);
		contatore2.conta();
		
		Contatore.conta();
		
	}

}
