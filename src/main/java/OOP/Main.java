package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Tiguan", 100, false));
        vehicles.add(new Car("Model 3", 150, true));
        vehicles.add(new Truck("TCX", 150, 10));
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.charge();
        }
        System.out.println(vehicles.size());
        vehicles.removeFirst();
        System.out.println(vehicles.size());
        HashMap<String, Car> vehicleHashMap = new HashMap<>();
        vehicleHashMap.put("A020BT799", new Car("Civic", 120, false));
        vehicleHashMap.put("O000OO78", new Car("Vesta", 100, true));
        vehicleHashMap.get("O000OO78").displayDetails();
    }
}
