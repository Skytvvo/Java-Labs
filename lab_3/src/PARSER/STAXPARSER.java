package PARSER;

import MachineTree.Car.Car;
import MachineTree.Car.Machine;

import javax.xml.namespace.QName;
import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class STAXPARSER {

    private ArrayList<Car> park = new ArrayList<Car>();

    public ArrayList<Car> getPark() {
        return park;
    }

    private String filename = "files/TaxiPARK.xml";

    private XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();




    public void buildSetPark()
    {
        FileInputStream inputStream = null;
        XMLStreamReader reader = null;
        String name;

        try {
            inputStream = new FileInputStream(new File(filename));

            reader = xmlInputFactory.createXMLStreamReader(inputStream);

            while (reader.hasNext())
            {
                int type = reader.next();
                if(type == XMLStreamConstants.START_ELEMENT)
                {
                    name = reader.getLocalName();
                    if(name.equals("Car"))
                    {
                        Car st = buildCar(reader);
                        park.add(st);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }

    private Car buildCar(XMLStreamReader reader) throws XMLStreamException {
        Car car = new Car();
        String name;
        int type;
        while (reader.hasNext()) {
            type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    if(name.equals("CarNumber"))
                        car.setCarNumber(getXMLText(reader));
                    if(name.equals("CarType"))
                        car.setCarType( Car.GetTypeOfCarByName(getXMLText(reader)));
                    if(name.equals("Machine"))
                        car.setEngine(BuildMachine(reader));
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if(name.equals("Car"))
                        return car;
            }
        }
        return null;
    }


    private Machine BuildMachine(XMLStreamReader reader) throws XMLStreamException {
        Machine machine = new Machine();
        String name;
        int type;
        while (reader.hasNext()) {
            type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    if(name.equals("EngineVolume"))
                        machine.setEngineVolume(Integer.parseInt(getXMLText(reader)));
                    if(name.equals("EngineType"))
                        machine.setEngineType(Machine.GetEngineTypeByName(getXMLText(reader)));
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if(name.equals("Machine"))
                        return machine;
            }
        }
        return null;
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }
}
