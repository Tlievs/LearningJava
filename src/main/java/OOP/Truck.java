package OOP;

public class Truck extends Car{

    private int loadCapacity;

    public Truck(String model, int maxSpeed, int loadCapacity) {
        super(model, maxSpeed, false);
        setLoadCapacity(loadCapacity);
    }

    public void setLoadCapacity(int capacity) {
        if (capacity >= 0) {
            this.loadCapacity = capacity;
        } else {
            System.out.println("Load capacity cannot be less than 0");
        }
    }

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Truck capacity: " + getLoadCapacity());
    }
}
