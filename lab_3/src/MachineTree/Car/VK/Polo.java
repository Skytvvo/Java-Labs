package MachineTree.Car.VK;

import MachineTree.Car.Car;
import MachineTree.Car.Machine;

public class Polo extends Car {

    public Polo(Machine Engine, String CarNumber) {
        super(Engine, TypesOfCar.sedan);
        this.setCarNumber(CarNumber + "VK");

    }



}
