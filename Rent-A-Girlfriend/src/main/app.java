package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Girl;
import model.Rental_Place;

public class app {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Rental_Place rp = new Rental_Place();
		int userInput;
		ArrayList<Girl> girlList;
		rp.populate();
		
		do
		{
			System.out.println("Rent-A-Girlfriend");
			System.out.println("1 - View All Girls");
			System.out.println("2 - Search Girls");
			System.out.println("3 - Rent a Girl");
			userInput = console.nextInt();
			String userInput2;
			
			switch(userInput)
			{
			case 1:
				girlList = rp.displayAll();
				for(Girl girl : girlList)
				{
					System.out.println(girl);
				}
				break;
			case 2:
				System.out.println("1 - Search by hair");
				System.out.println("2 - Search by race");
				System.out.println("3 - Search by nationality");
				System.out.println("4 - Search by age");
				System.out.println("5 - Search by age, race and hair");
				userInput = console.nextInt();
				switch(userInput)
				{
				case 1:
					System.out.println("Enter her hair length and color. Length first then space then color");
					userInput2 = console.next() + console.nextLine();
					girlList = rp.searchByHair(userInput2);
					for(Girl g : girlList)
					{
						System.out.println(g);
					}
					break;
				case 2:
					System.out.println("Enter her race");
					userInput2 = console.next();
					girlList = rp.searchByRace(userInput2);
					for(Girl g : girlList)
					{
						System.out.println(g);
					}
					break;
				case 3:
					System.out.println("Enter her nationality");
					userInput2 = console.next();
					girlList = rp.searchByNationality(userInput2);
					for(Girl g : girlList)
					{
						System.out.println(g);
					}
					break;
				case 4:
					System.out.println("Enter the lowest age you want");
					int lowbound = console.nextInt();
					System.out.println("Enter the highest age you want");
					int highbound = console.nextInt();
					girlList = rp.searchByAge(lowbound, highbound);
					for(Girl g : girlList)
					{
						System.out.println(g);
					}
					break;
				case 5:
					System.out.println("Enter the lowest age you want");
					lowbound = console.nextInt();
					System.out.println("Enter the highest age you want");
					highbound = console.nextInt();
					System.out.println("Enter her race");
					String race = console.next();
					System.out.println("Enter her hair length and color. Length first then space then color");
					String hair = console.next() + console.nextLine();
					girlList = rp.searchByAgeRaceHair(lowbound, highbound, race, hair);
					for(Girl g : girlList)
					{
						System.out.println(g);
					}
					break;
				default:
					System.out.println("Please select a valid option");
				}
				break;
			case 3:
				System.out.println("Please enter the index of the girl you want to rent.");
				int index = console.nextInt();
				Girl girl = rp.rentGirl(index);
				System.out.println("You have rented: " + girl);
				break;
			default:
				System.out.println("Please select a valid option.");
			}
			System.out.println("Choose another option? 1 - Yes, 2 - No");
			userInput = console.nextInt();
		}
		while(userInput == 1);
	}
}