package com.si;

public class Car extends Transport implements Speed{
    private int passenger = 4;
    private String conditioner = "yes";
    private String rudder = "yes";

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public String getTrunk() {
        return conditioner;
    }

    public void setTrunk(String trunk) {
        this.conditioner = trunk;
    }

    public String getRudder() {
        return rudder;
    }

    public void setRudder(String rudder) {
        this.rudder = rudder;
    }

    public void infoCar(String nameTransport){
                System.out.println(" Name transpot is " + nameTransport  + " passenger " + passenger
                        +  " conditioner " + conditioner + " rudder " + rudder + " and have speed " + speedCar + km);
    }


}
