package MachineTree.Car.Skoda;

import MachineTree.Car.Car;
import MachineTree.Car.Machine;

public class Octavia extends Car {
    public Octavia(Machine Engine, String CarNumber) {
        super(Engine, TypesOfCar.sedan);
        this.setCarNumber(CarNumber + "SK");
    }
}
