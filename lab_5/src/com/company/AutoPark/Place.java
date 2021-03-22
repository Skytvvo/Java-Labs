package com.company.AutoPark;

import java.util.concurrent.locks.ReentrantLock;

public class Place extends Thread{

   public AutoPark autoPark;
    public Car car;
    public Place(AutoPark a, Car car)
    {
        this.autoPark = a;
        this.car = car;
    }

    @Override
    public void run()
    {
        autoPark.takePLACE(car);
    }

}
