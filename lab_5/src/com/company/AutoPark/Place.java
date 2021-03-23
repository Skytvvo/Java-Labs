package com.company.AutoPark;

import java.util.concurrent.locks.ReentrantLock;

public class Place extends Thread{

   public AutoPark autoPark;
    public Car car;
    Thread main;
    public Place(AutoPark a, Car car)
    {
        this.autoPark = a;
        this.car = car;

    }

    @Override
    public void run()
    {
     /*   try {
            main.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        autoPark.takePLACE(car);


    }

}
