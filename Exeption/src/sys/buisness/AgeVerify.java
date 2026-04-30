package sys.buisness;

import sys.exception.BadAgeException;

public class AgeVerify {

public void verify(int age) throws BadAgeException {
	
	if(age>=18)
		System.out.println("Napoli");
	else
		throw new BadAgeException("Minorenne!");

}

}