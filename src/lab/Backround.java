package lab;

public class Backround {
	private double distance;
	private double fuel;
	private double mpg;
	private String destination;

	
	public void RoadTripLog (String name) {
		destination = name;
		distance = 0;
		fuel = 0;
		mpg = 0;
	}
	
	public double getTotalDistance() {
		return distance;
	}
	public double getTotalFuel() {
		return fuel;
	}
	public void addDistance(double add) {
		distance =+ add;
	}
	public void addFuel(double add) {
		fuel =+ add;
	}
	public double getMPG() {
		mpg = distance/fuel;
		mpg = Math.round(mpg*10)/10;
		return mpg;
	}
	public String toString() {
		return "Destination: " + destination + "\n Distance: " + distance + "\nFuel: " + fuel + "\nMPG" + mpg;
	}
	
}
