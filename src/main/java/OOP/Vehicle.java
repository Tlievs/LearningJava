package OOP;

abstract class Vehicle implements Chargeable {
    private final String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public abstract void startEngine();
}
