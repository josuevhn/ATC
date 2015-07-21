package com.wiseratel;

public class Airplane extends Aircraft {

    private Integer wings = 2;
    private Integer engines = 2;
    private Byte flags = 0;

    public Airplane() {

        super();

    } // Constructor

    public Airplane(Boolean flying, Boolean moving, Integer speed, Integer altitude) {

        super(flying, moving, speed, altitude);

    } // Constructor

    public Airplane(Integer wings, Integer engines) {

        setWings(wings);
        setEngines(engines);

    } // Constructor

    public void takeOff() {

        System.out.println("Airplane taking off...");

        this.setMoving(true);
        this.setFlying(true);
        this.setAltitude(20000);

    } // takeOff

    public void landing() {

        System.out.println("Airplane landing...");

        this.setMoving(false);
        this.setFlying(false);
        this.setAltitude(0);

    } // landing

    public void someUniqueMethod(String stringParameter) {

        // Code here!

    } // someUniqueMethod

    @Override
    public String toString() {

        return String.format("Boeing 737 de %d alas y %d turbinas, volando a una velocidad de %d nudos y a una altura de %d pies.", getWings(), getEngines(), getSpeed(), getAltitude());

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

    public Byte getFlags() {

        return flags;

    } // getFlags

    public void setFlags(Byte flags) {

        this.flags = flags;

    } // setFlags

} // Airplane
