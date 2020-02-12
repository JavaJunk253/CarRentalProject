package sprinters;

import java.util.ArrayList;
import java.util.List;

public class Company {

	ArrayList<Location> locations;

	public static ArrayList<Location> addLocations() {

		Location RentalDealer1 = new Location("Federal Way", 1, 98023, 19.99, 30, 70);
		Location RentalDealer2 = new Location("Tacoma", 2, 98409, 24.99, 40, 60);
		Location RentalDealer3 = new Location("Bellevue", 3, 98004, 29.99, 50, 50);
		Location RentalDealer4 = new Location("Everett", 4, 98201, 20.00, 20, 80);
		Location RentalDealer5 = new Location("Lake City", 5, 98125, 17.99, 10, 90);
		Location RentalDealer6 = new Location("Seattle", 6, 98101, 22.99, 5, 95);

		ArrayList<Location> locations = new ArrayList<>();

		locations.add(RentalDealer1);
		locations.add(RentalDealer2);
		locations.add(RentalDealer3);
		locations.add(RentalDealer4);
		locations.add(RentalDealer5);
		locations.add(RentalDealer6);

		return locations;
	}

}
