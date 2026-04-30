package com.sis;

public class StudentWorking extends Student{
	
	@Override
	public void study() {
		
		System.out.println("working and studying");
	}
	
	@Override
	public String toString() {
		return "StudentWorking [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", age=" + getAge() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
