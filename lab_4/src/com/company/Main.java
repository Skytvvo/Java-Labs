package com.company;

import MachineTree.Car.Car;
import MachineTree.Car.Machine;
import MachineTree.Car.Skoda.Octavia;
import MachineTree.Car.VK.Polo;
import TaxiPark.Park.Park;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static{
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Starting program_____________________________");
        Park TaxiPark = new Park();

        Machine eng1 = new Machine(1400, Machine.TypesOfEngine.Petrol);
        Machine eng2 = new Machine(1900, Machine.TypesOfEngine.Diesel);
        Machine eng3 = new Machine(1600, Machine.TypesOfEngine.Petrol);

        Polo VK1 = new Polo(eng1, "TX1010");
        Polo VK2 = new Polo(eng2, "TX0001");
        Octavia SK1 = new Octavia(eng3, "TX2020");

        TaxiPark.setTaxi(VK1);
        TaxiPark.setTaxi(VK2);
        TaxiPark.setTaxi(SK1);

        TaxiPark.director.CountParkCost();
        TaxiPark.director.PrintPark();

        TaxiPark.director.SortPark();
        System.out.println();

        TaxiPark.director.PrintPark();
        TaxiPark.director.FindCar(40,200);
    }
}
