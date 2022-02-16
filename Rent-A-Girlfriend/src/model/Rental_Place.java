package model;

import java.util.ArrayList;

public class Rental_Place {

	private Girl Momoka;
	private Girl Kimberly;
	private Girl Samantha;
	private Girl Beatrice;
	private Girl Ann;
	private Girl Candy;
	private Girl Veronica;
	private Girl Alice;
	private Girl Mila;
	private Girl Lizzie;
	private Girl Amy;
	private Girl Marina;
	private Girl Jada;
	private Girl Shelly;
	private Girl Allie;
	private Girl Caitlin;
	private ArrayList<Girl> girlList = new ArrayList<>(); 	
	
	public void populate()
	{
		Momoka = new Girl("Momoka", 22, "Asian", "Japan", "long black", "brown", 0);
		Kimberly = new Girl("Kimberly", 20, "White", "Russia", "long brown", "brown", 1);
		Samantha = new Girl("Samantha", 18, "White", "U.S.A.", "long brown", "brown", 2);
		Beatrice = new Girl("Beatrice", 24, "Black", "U.S.A", "short black", "brown", 3);
		Ann = new Girl("Ann", 22, "White", "Germany", "long blonde", "blue", 4);
		Candy = new Girl("Candy", 23, "Asian", "China", "long blonde", "brown", 5);
		Veronica = new Girl("Veronica", 25, "Latina", "Mexico", "long brown", "brown", 6);
		Alice = new Girl("Alice", 23, "Asian", "Vietnam", "long black", "brown", 7);
		Mila = new Girl("Mila", 21, "Asian", "Korea", "short black", "brown", 8);
		Lizzie = new Girl("Lizzie", 19, "White", "U.S.A.", "short brown", "blue", 9);
		Amy = new Girl("Amy", 18, "White", "U.S.A", "short blonde", "green", 10);
		Marina = new Girl("Marina", 19, "Latina", "Mexico", "long brown", "brown", 11);
		Jada = new Girl("Jada", 20, "Black", "U.S.A", "long black", "brown", 12);
		Shelly = new Girl("Shelly", 21, "Asian", "Philippines", "long black", "brown", 13);
		Allie = new Girl("Allie", 24, "White", "U.S.A", "long red", "green", 14);
		Caitlin = new Girl("Caitlin", 22, "White", "U.S.A.", "short red", "blue", 15);
		girlList.add(Momoka);
		girlList.add(Kimberly);
		girlList.add(Samantha);
		girlList.add(Beatrice);
		girlList.add(Ann);
		girlList.add(Candy);
		girlList.add(Veronica);
		girlList.add(Alice);
		girlList.add(Allie);
		girlList.add(Mila);
		girlList.add(Lizzie);
		girlList.add(Amy);
		girlList.add(Marina);
		girlList.add(Jada);
		girlList.add(Shelly);
		girlList.add(Allie);
		girlList.add(Caitlin);
	}
	
	public ArrayList<Girl> displayAll()
	{
		return girlList;
	}
	
	public ArrayList<Girl> searchByRace(String race)
	{
		ArrayList<Girl> listToReturn = new ArrayList<>();
		for(Girl girl : girlList)
		{
			if(girl.getRace().toLowerCase().equals(race.toLowerCase()))
			{
				listToReturn.add(girl);
			}
		}
		return listToReturn;
	}
	
	public ArrayList<Girl> searchByHair(String hair)
	{
		ArrayList<Girl> listToReturn = new ArrayList<>();
		for(Girl girl : girlList)
		{
			System.out.println("Debug: " + girl.getHair().toLowerCase().equals(hair.toLowerCase()));
			if(girl.getHair().toLowerCase().equals(hair.toLowerCase()))
			{
				System.out.println("Debug: if block executed");
				listToReturn.add(girl);
			}
		}
		return listToReturn;
	}
	
	public ArrayList<Girl> searchByAge(int lowbound, int highbound)
	{
		ArrayList<Girl> listToReturn = new ArrayList<>();
		for(Girl girl : girlList)
		{
			if(girl.getAge() >= lowbound && girl.getAge() <= highbound)
			{
				listToReturn.add(girl);
			}
		}
		return listToReturn;
	}
	
	public ArrayList<Girl> searchByNationality(String nationality)
	{
		ArrayList<Girl> listToReturn = new ArrayList<>();
		for(Girl girl : girlList)
		{
			if(girl.getNationality().toLowerCase().equals(nationality.toLowerCase()))
			{
				listToReturn.add(girl);
			}
		}
		return listToReturn;
	}
	
	public ArrayList<Girl> searchByAgeRaceHair(int lowbound, int highbound, String race, String hair)
	{
		ArrayList<Girl> listToReturn = new ArrayList<>();
		for(Girl girl : girlList)
		{
			if(girl.getAge() >= lowbound && girl.getAge() <= highbound && 
					girl.getRace().toLowerCase().equals(race.toLowerCase()) &&  
					girl.getHair().toLowerCase().equals(hair.toLowerCase()))
			{
				listToReturn.add(girl);
			}
		}
		return listToReturn;
	}
	
	public Girl rentGirl(int index)
	{
		
		Girl girl = girlList.get(index);
		return girl;
	}
}