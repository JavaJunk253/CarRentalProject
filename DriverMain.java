package sprinters;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Source;

public class DriverMain
{
	public static void main(String[] args)
	{
		showMenu();
	}
	
	public static void showMenu() 
	{
		ArrayList<Location> companyList = Company.addLocations();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select an option.");
		System.out.println("1. Add new location \n2. Show list of locations."
				+ "\n3. Show location based on zip. \n4. Show all location data"
				+ "\n5. Show location rate \n6. Show all vehicles avaliable"
				+ "\n7. Calulate daily revenue. \n8. Exit");
		
		int choice = scan.nextInt();
			if (choice == 1)
			{//add location
				//companyList = Company.addLocations();
				//showMenu();
			} else if (choice == 2) 
			{
				for (Location location: companyList)
				{
					System.out.println(location.getLocationName() + " " +location.getLocationRate());
				}
				//show list
				System.out.println("showing list");
			} else if (choice == 3) 
			{//show based on zip
				
			} else if (choice == 4) 
			{//show all location data
				
			} else if (choice == 5) 
			{//show location rate
				
			} else if (choice == 6) 
			{//show all vehicles available
				
			} else if (choice == 7) 
			{//calculate daily revenue
				
			} else if (choice == 8) 
			{
				System.out.println("Goodbye");
			}
			else {
				System.out.println("Not valid entry");
				showMenu();
			}
			
	}
	
	public static void addLocation() 
	{
		Scanner addScan = new Scanner(System.in);
		ArrayList<String> LocationName = new ArrayList<>();
		System.out.println("Enter location name: ");
		String locationName = addScan.nextLine();
		LocationName.add(locationName);
		System.out.println("Enter Location zip: ");
		int locationZip = addScan.nextInt();
		System.out.println("Enter Identifier: ");
		int id = addScan.nextInt();
		System.out.println("How many vehicles are at this location?");
		int totalVehicles = addScan.nextInt();
		System.out.println("How many of those vehicles are rented?");
		int rentedVehicles = addScan.nextInt();

	}
}
