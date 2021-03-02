package MachineTree.Car;

import org.apache.log4j.Logger;

//Internal class Engine
public class Machine {
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
}