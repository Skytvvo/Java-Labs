package MachineTree.Car;

import org.apache.log4j.Logger;

import java.io.Console;

public abstract class Car implements CarActions {
    private static final Logger LOG =
            Logger.getLogger(Car.class);

    private String CarNumber;

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    //Car constructor
    public Car(Machine Engine, TypesOfCar CarType)
    {
        this.setEngine(Engine);
        this.setCarType(CarType);
        LOG.info("Created car");

    }



    //Car engine
    private Machine Engine;

    public Machine getEngine() {
        return Engine;
    }

    public void setEngine(Machine engine) {
        Engine = engine;
    }

    //Car type
    private TypesOfCar CarType;

    public TypesOfCar getCarType() {
        return CarType;
    }

    public void setCarType(TypesOfCar carType) {
        CarType = carType;
    }



    //Types of car
    public enum TypesOfCar
    {
        sedan,
        hatchback,
        crossover,
        compartment
    }



    @Override
    public void EngineIgnition()
    {
        System.out.println("Engine is works");
    }

    @Override
    public void Move()
    {
        EngineIgnition();
        System.out.println("The car went to the route");
    }
}
