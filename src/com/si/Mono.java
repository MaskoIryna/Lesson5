package com.si;

public class Mono extends Transport implements Speed{
    private int passenger = 0;

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void infoCar(String nameTransport){
        System.out.println(" Name transport is " + nameTransport  + " passenger " + passenger + " and have " +
                speedMono + " speed");
    }

}
