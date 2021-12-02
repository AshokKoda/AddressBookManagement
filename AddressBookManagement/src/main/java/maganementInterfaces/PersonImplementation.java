package maganementInterfaces;

import java.util.Scanner;

import managementEntity.AddressEntity;
import managementEntity.ContactEntity;

public class PersonImplementation implements IPerson {

	ContactEntity contact = new ContactEntity();
	AddressEntity address = new AddressEntity();
	
	public void addPerson() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//First name
		System.out.println("Enter First Name:");
		contact.setFirstName(sc.next());
		
		//Last name
		System.out.println("Enter Last Name:");
		contact.setLastName(sc.next());
		
		//Address city
		System.out.println("Enter City:");
		address.setCity(sc.next());
		
		//State
		System.out.println("Enter State:");
		address.setState(sc.next());
		
		//ZIP
		System.out.println("Enter ZIP:");
		address.setZip(sc.nextLong());
		
		//Phone no
		System.out.println("Enter Phone No:");
		address.setPhoneNo(sc.nextLong());
		
		//Email
		System.out.println("Enter Email-ID:");
		address.setEmail(sc.next());
		
		System.out.println("<-----------Welcome To Address Book---------->");
		System.out.println("First Name: " + contact.getFirstName() +"\n"
		+"Last Name: " + contact.getLastName() + "\n"
		+"City: " + address.getCity() + "\n"
		+"State: " + address.getState() + "\n"
		+"Zip Code: " + address.getZip() + "\n"
		+"Phone No: " + address.getPhoneNo() + "\n"
		+"Email-ID: " + address.getEmail());
	}
	
	public void editPerson() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lastname to edit:");
		String lname = sc.next();
		
		boolean isPerson = false;
		if(isPerson)
		{
			System.out.println("enter new state:");
			contact.getAddress().setState(sc.next());
			System.out.println("enter new city:");
			contact.getAddress().setCity(sc.next());
			System.out.println("enter new Zip:");
			contact.getAddress().setZip(sc.nextLong());
			System.out.println("enter new phone no:");
			contact.getAddress().setState(sc.next());
			System.out.println("enter new email:");
			contact.getAddress().setEmail(sc.next());
			
			contact.setLastName(lname);
			System.out.println("Edit completed");
		}else
		{
			System.out.println("No person found with this name.");
		}
	}

}
