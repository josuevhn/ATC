package com.wiseratel;

public class Helicopter extends Aircraft {

    private Integer wings = 4;
    private Integer engines = 2;
    private Integer rotorRPM = 0;

    public Helicopter() {

        super();

    } // Constructor

    public Helicopter(Boolean flying, Boolean moving, Integer speed, Integer altitude) {

        super(flying, moving, speed, altitude);

    } // Constructor

    public Helicopter(Integer wings, Integer engines) {

        setWings(wings);
        setEngines(engines);

    } // Constructor

    public void takeOff() {

        System.out.println("Helicopter taking off...");

        this.setMoving(true);
        this.setSpeed(200);
        this.setFlying(true);
        this.setAltitude(5000);

    } // takeOff

    public void landing() {

        System.out.println("Helicopter landing...");

        this.setMoving(false);
        this.setFlying(false);
        this.setAltitude(0);

    } // landing

    public void someUniqueMethod(Integer integerParameter) {

        // Code here!

    } // someUniqueMethod

    @Override
    public String toString() {

        return String.format("Kamov KA-52 Alligator de %d alas y %d rotores, volando a una velocidad de %d nudos y a una altura de %d pies.", getWings(), getEngines(), getSpeed(), getAltitude());

    } // toString

    public Integer getWings() {

        return wings;

    } // getWings

    private void setWings(Integer wings) {

        this.wings = wings;

    } // setWings

    public Integer getEngines() {

        return engines;

    } // getEngines

    private void setEngines(Integer engines) {

        this.engines = engines;

    } // setEngines

    public Integer getRotorRPM() {

        return rotorRPM;

    } // getRotorRPM

    public void setRotorRPM(Integer rotorRPM) {

        this.rotorRPM = rotorRPM;

    } // setRotorRPM

} // Helicopter
