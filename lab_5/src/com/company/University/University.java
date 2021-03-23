package com.company.University;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class University  {

    public int id;
    public  University(int id)
    {
        this.id = id;
    }

    public synchronized void Enter(int st)
    {
        System.out.println("Student "+st+" entered to "+this.id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

