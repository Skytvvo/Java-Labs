package TaxiPark.Park;

import MachineTree.Car.Car;
import MachineTree.Car.Machine;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Park implements Serializable {

    public void setTaxis(ArrayList<Car> taxi) {
        Taxi = taxi;
    }

    private static final Logger LOG =
            Logger.getLogger(Park.class);


    public Park() {
            this.Taxi = new ArrayList<Car>();
            this.director = new Director();
            LOG.info("Created park");
    }

    //Director
    public Director director;



    //Car Park
    private ArrayList<Car> Taxi;



    public ArrayList<Car> getTaxi() {
        return Taxi;
    }

    public void setTaxi(Car taxi) {
        Taxi.add(taxi);
    }

    public class Director implements Serializable {

        public void CountParkCost()
        {
            LOG.info("Count park cost");
            try {


                int Cost = 0;

                for (Car car :
                        Taxi) {
                    Cost += GetСoefficient(car);
                }

                System.out.println("Cost of taxi park: " + Cost + "$");
            }
            catch (Exception e)
            {
                LOG.error("Cost is overflow");
                System.out.println(e.getMessage());
            }
        }

        private int GetСoefficient(Car car)
        {
            int coefficient = 0;
            switch (car.getCarType())
            {
                case compartment -> {
                    coefficient += 4;
                    break;
                }
                case crossover -> {
                    coefficient += 3;
                    break;
                }
                case hatchback -> {
                    coefficient += 2;
                    break;
                }
                case sedan -> {
                    coefficient += 1;
                }
            }



            try {
               coefficient =  coefficient * director.GetFuelCoefficient(car.getEngine()) *10;
            }
            catch (Exception e)
            {
                LOG.error("coefficient is overflow");
                System.out.println(e.getMessage());
            }
            return coefficient;
        }

        private int GetFuelCoefficient(Machine engine)
        {
            if(engine.getEngineType() == Machine.TypesOfEngine.Diesel)
                return engine.getEngineVolume();
            return engine.getEngineVolume() * 2;
        }

        public void SortPark()
        {
            LOG.info("Sort park");
            Collections.sort(Taxi, new Comparator<Car>() {
                @Override
                public int compare(Car lhs, Car rhs) {
                    return Integer.compare(GetFuelCoefficient(rhs.getEngine()), GetFuelCoefficient(lhs.getEngine()));
                }
            });
        }

        public void FindCar(int MinSpeed, int MaxSpeed)
        {
            LOG.info("Find car");
            for (Car car:
                 Taxi) {
                int CurrentSpeed =GetFuelCoefficient(car.getEngine())/10;
                if( CurrentSpeed > MinSpeed && CurrentSpeed < MaxSpeed)
                    System.out.println("Car: " + car.getCarNumber());
            }
        }

        public void PrintPark()
        {
            LOG.info("Print car");
            for (Car car:
                 Taxi) {
                System.out.println("Park: " + car.getCarNumber() + " " + car.getEngine().getEngineType());
            }
        }

    }


}
