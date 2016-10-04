/*
 * person.java
 */
/**
 * @author Sheheryar Ahmad
 */
public class Person {
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param identification
	 */
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	
	/**
	 * 	Print person data
	 */
	public void printPerson(){
		 System.out.println("Name: " + lastName + ", " + firstName + 	"\nID: " + idNumber); 
	}
	 
}

