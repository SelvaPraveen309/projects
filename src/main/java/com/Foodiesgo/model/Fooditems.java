package com.Foodiesgo.model;

import java.time.LocalTime;

public class Fooditems {

	private String foodname;
	private int price;
    private LocalTime startingtime;
    private LocalTime endingtime;
    private String available;
	private String foodstyle;
	private int id;
	
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodname() {
	 		return foodname;
	 	}
	 	public void setFoodname(String foodname) {
	 		this.foodname = foodname;
	 	}
	 	public int getPrice() {
	 		return price;
	 	}
	 	public void setPrice(int price) {
	 		this.price = price;
	 	}
	 	public LocalTime getStartingtime() {
	 		return startingtime;
	 	}
	 	public void setStartingtime(LocalTime startingtime) {
	 		this.startingtime = startingtime;
	 	}
	 	public LocalTime getEndingtime() {
	 		return endingtime;
	 	}
	 	public void setEndingtime(LocalTime endingtime) {
	 		this.endingtime = endingtime;
	 	}
	 	public String getAvailable() {
	 		return available;
	 	}
	 	public void setAvailable(String available) {
	 		this.available = available;
	 	}
	 	public String getFoodstyle() {
	 		return foodstyle;
	 	}
	 	public void setFoodstyle(String foodstyle) {
			this.foodstyle = foodstyle;
		}
		
	 

}

