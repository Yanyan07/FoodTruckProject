package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck[] trucks = new FoodTruck[5];
		while (FoodTruck.count < trucks.length) {
			System.out.print("Please enter the name of food truck, enter quit to exit from the input : ");
			String name = sc.nextLine();
			if ("quit".equalsIgnoreCase(name)) {
				break;
			}
			System.out.print("Please enter the food type of food truck: ");
			String type = sc.nextLine();
			System.out.print("Please enter the rating for the food truck: ");
			double rating = sc.nextDouble();
			sc.nextLine();

			FoodTruck truck = new FoodTruck(name, type, rating);
			trucks[FoodTruck.count - 1] = truck;
		}

		double sumRating = 0.0;
		FoodTruck maxRatingTruck = trucks[0];
		for (int i = 0; i < FoodTruck.count; i++) {
			sumRating += trucks[i].getRating();
			if (trucks[i].getRating() > maxRatingTruck.getRating()) {
				maxRatingTruck = trucks[i];
			}
		}
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("| 1. list all existing food trucks         |");
			System.out.println("| 2. see the average rating of food trucks |");
			System.out.println("| 3. display the highest-rated food truck  |");
			System.out.println("| 4. quit                                  |");
			System.out.println("--------------------------------------------");
			System.out.print("Please enter your choice(1-4): ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				for(int i=0; i<FoodTruck.count; i++) {
					System.out.println(trucks[i]);
				}
				break;
			case 2:
			System.out.println("The average rating of food trucks: " + sumRating / FoodTruck.count);
			break;
			case 3:
			System.out.println("The highest-rated food truck: " + maxRatingTruck);
			break;
			case 4:
				keepGoing = false;
				System.out.println("Thanks for coming, have a great day!");
				break;
				
			default:
				System.out.println("Input is invalid, please enter number from 1 to 4");
				break;
			}
		}
		sc.close();
	}

}
