package MachineTree.Car;

import org.apache.log4j.Logger;

import java.io.Serializable;

//Internal class Engine
public class Machine implements Serializable {
    private static final Logger LOG =
            Logger.getLogger(Machine.class);

    //Enum of Engine Types
    public enum  TypesOfEngine
    {
        Diesel,
        Petrol
    }

    //Constructor
    public Machine(int EngineVolume, TypesOfEngine EngineType) {
        this.setEngineVolume(EngineVolume);
        this.setEngineType(EngineType);
        LOG.info("Created Engine");

    }
    public  Machine()
    {

    }

    //Engine Volume
    private int EngineVolume;

    public void setEngineVolume(int engineVolume) {
        this.EngineVolume = engineVolume;
    }

    public int getEngineVolume() {
        return EngineVolume;
    }



    //Engine Type of Machine
    private TypesOfEngine EngineType;

    public void setEngineType(TypesOfEngine engineType) {
        EngineType = engineType;
    }

    public TypesOfEngine getEngineType() {
        return EngineType;
    }

    public static TypesOfEngine GetEngineTypeByName(String name)
    {
        if(name.equals(TypesOfEngine.Diesel.toString() ))
            return TypesOfEngine.Diesel;
         if(name.equals(TypesOfEngine.Petrol.toString() ))
            return TypesOfEngine.Petrol;

        return null;
    }
}