package com.company.AutoPark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class AutoPark {
    ArrayList<Car> first = new ArrayList<>(4);
    ArrayList<Car> second = new ArrayList<>(4);
    ReentrantLock locker = new ReentrantLock();


    public AutoPark()
    {
        first.add(null);
        first.add(null);
        first.add(null);
        first.add(null);
        second.add(null);
        second.add(null);
        second.add(null);
        second.add(null);

    }
    public void takePLACE(Car car) {
        locker.lock();

        System.out.println("Car " + car.number + " explore in 1");
        for (Car c:
             first) {
            if(c == null)
            {
                System.out.println("Car "+ car.number + " found in 1");
                c = car;
                locker.unlock();

                return;
            }
        }
        takeAnotherPlace(car);
    }

    public void takeAnotherPlace(Car car)
    {
        System.out.println("Car " + car.number + " explore in 2");

        for (Car c:
                second) {
            if(c ==null)
            {
                System.out.println("Car "+ car.number + " found in 2");
                c = car;
                locker.unlock();


                return;
            }
        }
        takePLACE(car);
    }
}
