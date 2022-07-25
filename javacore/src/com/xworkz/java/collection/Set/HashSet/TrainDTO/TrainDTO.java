package com.xworkz.java.collection.Set.HashSet.TrainDTO;

public class TrainDTO {
	private String name;
	private String source;
	private String destination;
	private int number;
	private double price;
	private int noOfCompartments;
	
	public TrainDTO(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfCompartments() {
		return noOfCompartments;
	}

	public void setNoOfCompartments(int noOfCompartments) {
		this.noOfCompartments = noOfCompartments;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", source=" + source + ", destination=" + destination + ", number=" + number
				+ ", price=" + price + ", noOfCompartments=" + noOfCompartments + "]";
	}
	
	

}
