package com.company;
import MachineTree.Car.Car;
import PARSER.STAXPARSER;
import Serializable.Serializator;
import TaxiPark.Park.Park;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class Main {

    static{
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        LOG.info("Starting program_____________________________");

        Park TaxiPark = new Park();


        STAXPARSER staxparser = new STAXPARSER();
        staxparser.buildSetPark();
        TaxiPark.setTaxis(staxparser.getPark());

        for (Car car : TaxiPark.getTaxi()) {
            System.out.println("==========");
            System.out.println(car.getCarNumber());
            System.out.println(car.getCarType());
            System.out.println(car.getEngine().getEngineType());
            System.out.println(car.getEngine().getEngineVolume());
        }

        Serializator serializator = new Serializator();
        serializator.DeSer()
                .getTaxi()
                .stream()
                .filter(item -> item.getEngine().getEngineVolume() < 2000)
                .map(item -> item.getEngine().getEngineVolume()+400)
                .forEach(System.out::println);


    }
}
