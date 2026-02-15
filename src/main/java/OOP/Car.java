package OOP;

public class Car extends Vehicle {
    private int maxSpeed;
    private boolean isElectric;

    public Car(String model, int maxSpeed, boolean isElectric) {
        super(model);
        setMaxSpeed(maxSpeed);
        setElectric(isElectric);
    }

    public void setMaxSpeed (int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Max speed cannot be less than zero");
        }
    }

    public void setElectric (boolean isElectric) {
        this.isElectric = isElectric;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public boolean IsElectric() {
        return this.isElectric;
    }

    public void displayDetails() {
        System.out.println("Car model: " + getModel() + ", Max speed: " + getMaxSpeed() + ", Electric: " + IsElectric());
    }

    public void startEngine() {
        System.out.println("Starting engine model : " + getModel());
    }

    @Override
    public void charge() {
        if (IsElectric()) {
            System.out.println("Charging model: " + getModel());
        } else {
            System.out.println("Model: " + getModel() + " is not electric car");
        }
    }
}
