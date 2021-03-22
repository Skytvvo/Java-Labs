package com.company.University;

public class Student {
    private boolean entered = false;
    private University<Enter> pool;
    private int id;
    public Student(University<Enter> pool, int id) {
        this.pool = pool;
        this.id = id;
    }
    public void run() {
        Enter connect = null;
        try {
            connect = pool.getResource(100); // изменить на 100
            entered = true;
            System.out.println("Student enter #" + this.id
                    + " to door #" + connect.getEnterID());

            connect.using();
        } catch (Exception e) {
            System.out.println("Student can't enter #" + this.id +
                    " Door is busy ->"
                    + e.getMessage());
        } finally {
            if (connect != null) {
                entered = false;
                System.out.println("Enter Student #" + this.id + " : "
                        + connect.getEnterID() + " exit");
                pool.returnResource(connect);
            }
        }
    }
    public boolean isEntered() { return entered; }
}
