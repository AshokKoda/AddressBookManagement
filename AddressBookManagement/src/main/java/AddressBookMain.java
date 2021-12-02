import java.util.Scanner;

import maganementInterfaces.PersonImplementation;

public class AddressBookMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int option;
		PersonImplementation person = new PersonImplementation();
		
		System.out.println("<-----------Welcome To Address Book---------->");
		System.out.println("Enter '1' to Add contact");
		System.out.println("Enter '2' to Edit contact");
		System.out.println("Enter '3' to Delete contact");
		option = sc.nextInt();
		
		if(option == 1)
			person.addPerson();
		else if(option == 2)
			person.editPerson();
		else
			System.out.println("Invalid option");

	}

}
