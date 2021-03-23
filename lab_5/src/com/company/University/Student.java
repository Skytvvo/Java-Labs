package com.company.University;

import java.util.ArrayList;

public class Student implements Runnable {

    private ArrayList<University> pool;

    private int id;
    public Student(ArrayList<University> as,int id) {
        this.pool = as;
        this.id = id;

    }
    public void run() {
        pool.get(0).Enter(id);
    }
}
