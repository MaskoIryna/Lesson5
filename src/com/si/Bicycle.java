package com.si;

public class Bicycle extends Transport implements Speed{
    private int passenger = 1;
    private String rudder = "yes";

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public String getRudder() {
        return rudder;
    }

    public void setRudder(String rudder) {
        this.rudder = rudder;
    }

    public void infoCar(String nameTransport){
        System.out.println(" Name transport is " + nameTransport  + " passenger " + passenger + " rudder " + rudder +
                " and have speed " + speedBacycal + km);
    }


}
