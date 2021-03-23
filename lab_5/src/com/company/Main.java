package com.company;

import com.company.AutoPark.AutoPark;
import com.company.AutoPark.Car;
import com.company.AutoPark.Place;
import com.company.University.Enter;
import com.company.University.Student;
import com.company.University.University;

import javax.sql.CommonDataSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {



    public static void main(String[] args) {

        ArrayList<University> ft = new ArrayList<>();
        ft.add(new University(1));
        ft.add(new University(2));

        for (int i = 0; i<20; i++)
        {
            Thread t = new Thread(new Student(ft,i));
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

     /*   AutoPark a = new AutoPark();
       for(int i  =0; i<20; i++)
       {
        Place p = new Place(a, new Car(i));
        p.start();


       }*/
    }

}





