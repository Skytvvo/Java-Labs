package com.company.University;

import java.util.Random;

public class Enter {
    private int enterID;
    public Enter(int id) {
        super();
        this.enterID = id;
    }
    public int getEnterID() {
        return enterID;
    }
    public void setEnterID(int id) {
        this.enterID = id;
    }
    public void using() {
        try {
// использование соединени  я
            Thread.sleep(new Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

