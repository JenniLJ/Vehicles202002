package model;

public class Semi {
	
	private String brand;
	private int year;
	private int seats;
	
	public Semi() {
		super();
	}
	
	public Semi(String b, int y, int s) {
		super();
		this.brand = b;
		this.year = y;
		this.seats = s;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public String makeNoise() {
		return "HOOONNkk";
	}
}
