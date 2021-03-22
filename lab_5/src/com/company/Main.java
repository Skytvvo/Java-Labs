package com.company;

import com.company.AutoPark.AutoPark;
import com.company.AutoPark.Car;
import com.company.AutoPark.Place;
import com.company.University.Enter;
import com.company.University.Student;
import com.company.University.University;

import javax.sql.CommonDataSource;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {



    public static void main(String[] args) {
        LinkedList<Enter> list = new LinkedList<Enter>() {
            {
                this.add(new Enter(1));
                this.add(new Enter(2));
                this.add(new Enter(3));
                this.add(new Enter(4));
                this.add(new Enter(5));
                this.add(new Enter(6));

            }
        };
      /*  University<Enter> doors = new University<>(list);

        for (int i = 0; i < 10; i++) {
            new Student(doors,i).run();
        }*/

        AutoPark a = new AutoPark();
       for(int i  =0; i<20; i++)
       {
        Place p = new Place(a, new Car(i));
        p.start();
       }
    }

}





