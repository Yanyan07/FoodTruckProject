package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	static int count = 0;
	private int id;
	private String name;
	private String type;
	private double rating;
	
	public FoodTruck() {
		id = count;
		count++;
	}
	public FoodTruck(String name, String type, double rating) {
		this.name = name;
		this.type = type;
		this.rating = rating;
		id = count;
		count++;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "FoodTruck [id=" + id + ", name=" + name + ", type=" + type + ", rating=" + rating + "]";
	}
	
}
