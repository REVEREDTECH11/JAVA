/**
* File: PASSIGN05
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: MARCH 05, 2025
*/
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

interface Reviewable {

    void addReview(String review);
    
}

//MAKING ABSTRACT CLASS
abstract class Vehicle implements Reviewable {

    protected String make;
    
    protected String model;
    
    protected int year;
    
    protected String type;
    
    protected String review;

    //HAVING A DEFAULT CONSTRUCTOT
    public Vehicle() {
       
        this.make = "";
       
        this.model = "";
       
        this.year = 0;
       
        this.type = "undefined";
       
        this.review = "No review.";
    
    }

    //CONSTRUCTORS
    public Vehicle(String make, String model, int year) {
        
        this.make = make;
        
        this.model = model;
        
        this.year = year;
        
        this.type = "undefined";
        
        this.review = "No review.";
    
    }

	//METHOD
    public abstract String getDetailedInfo();

    @Override
    public void addReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + type + ")";
    }

    public String getReview() {
        return review;
    }

    public String getType() {
        return type;
    }
}

//CONCRETE CLASS CAR
class Car extends Vehicle {
    
    private int seatingCapacity;

    //No ARGS CONSTRUCTO
    public Car() {
        
        super("Default Make", "Default Model", 2000); // default values
        
        this.type = "Car";
        
       
        this.seatingCapacity = 5; // default seating capacity
    }

    public Car(String make, String model, int year, int seatingCapacity) {
       
        super(make, model, year);
       
        this.type = "Car";
       
        this.seatingCapacity = seatingCapacity;
    
    }

    @Override
    public String getDetailedInfo() {
        
        return toString() + "\nSeating Capacity: " + seatingCapacity + " people\n" + getReview();
   
    }

    @Override
    public String toString() {
      
        return super.toString();
    
    }

    public int getSeatingCapacity() {
        
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        
        this.seatingCapacity = seatingCapacity;
    
    }
    
}

//CONCRETE CLASS TRUCK
class Truck extends Vehicle {
   
    private double maxTowWeight;

    //NO ARGS CONTRUCTOR
    public Truck() {
       
        super("Default Make", "Default Model", 2000); // default values
       
        this.type = "Truck";
       
        this.maxTowWeight = 5000; // default towing capacity
    
    }

    public Truck(String make, String model, int year, double maxTowWeight) {
       
        super(make, model, year);
       
        this.type = "Truck";
       
        this.maxTowWeight = maxTowWeight;
    
    }

    @Override
    public String getDetailedInfo() {
        
        return toString() + "\nMax Tow Weight: " + formatTowWeight(maxTowWeight) + " lbs\n" + getReview();
    
    }

    @Override
    
    public String toString() {
    
        return super.toString();
    
    }

    public double getMaxTowWeight() {
    
        return maxTowWeight;
    
    }

    public void setMaxTowWeight(double maxTowWeight) {
    
        this.maxTowWeight = maxTowWeight;
    
    }

    private String formatTowWeight(double weight) {
    
        DecimalFormat df = new DecimalFormat("#,###.00");
    
        return df.format(weight);
    
    }

}

//MY MAIN CLASS
public class PAssign05 {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("Ford", "Expedition", 2020, 8);

        Car car2 = new Car("Toyota", "Camry", 2019, 5);

        Car car3 = new Car("Mazda", "MX5", 2018, 2);
        
        Truck truck1 = new Truck("Ford", "F-150", 2016, 10400);

        Truck truck2 = new Truck("Dodge", "Ram 1500", 2020, 7730);

        vehicles.add(car1);

        vehicles.add(car2);

        vehicles.add(car3);

        vehicles.add(truck1);

        vehicles.add(truck2);

        //MY MANUALLY ADDING REVIEWS
        car1.addReview("Big, spacious, and handy, the Expedition is a workhorse but falls short of more appealing rivals.");
        
        car2.addReview("No review.");
        
        car3.addReview("A more characterful four-cylinder makes one of our favorites even better.");
        
        truck1.addReview("Turns out there is a replacement for displacement.");
        
        truck2.addReview("When only a pickup truck will do, the Ram 1500 is the one to choose.");

        System.out.println("All Vehicles:");
        
        for (Vehicle vehicle : vehicles) {
        
            System.out.println(vehicle.getDetailedInfo());
        
            System.out.println();
        
        }
        
    }
    
}
