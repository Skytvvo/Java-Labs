package Serializable;

import TaxiPark.Park.Park;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public  class Serializator {
    private String pathName  = "files/db.json";

    Gson gosn = new Gson();
    Path path = Paths.get(pathName);

    public void Ser(Park park)
    {
        String json = gosn.toJson(park);
        try {
            Files.write(path, json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Park DeSer()
    {
        try {
            String jsonFile = Files.readAllLines(path).get(0);
            Park park = gosn.fromJson(jsonFile, Park.class);
            return park;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

