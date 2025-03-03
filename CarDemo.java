class Car {
 
    String make;
    String model;
    int year;

   
    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

   
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}


public class CarDemo {
    public static void main(String[] args) {
        
        Car myCar = new Car(2020, "Toyota", "Corolla");

        
        myCar.displayInfo();
    }
}


