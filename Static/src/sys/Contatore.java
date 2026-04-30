package sys;

public class Contatore {
	
	// variabile di classe
	static int x;
	
	public static void conta() {
		
		x = x + 1;
		System.out.println(x);
		
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Contatore.x = x;
	}
	
	

}
