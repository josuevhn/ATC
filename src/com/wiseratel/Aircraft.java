package com.wiseratel;

public abstract class Aircraft {

    private Boolean flying = false;
    private Boolean moving = false;

    private Integer speed = 0;
    private Integer altitude = 0;

    public Aircraft() {}

    public Aircraft(Boolean flying, Boolean moving, Integer speed, Integer altitude) {

        setFlying(flying);
        setMoving(moving);
        setSpeed(speed);
        setAltitude(altitude);

    } // Constructor

    public abstract void takeOff();
    public abstract void landing();

    public Boolean getFlying() {

        return flying;

    } // getFlying

    public void setFlying(Boolean flying) {

        this.flying = flying;

    } // setFlying

    public Boolean getMoving() {

        return moving;

    } // getMoving

    public void setMoving(Boolean moving) {

        this.moving = moving;

    } // setMoving

    public Integer getSpeed() {

        return speed;

    } // getSpeed

    public void setSpeed(Integer speed) {

        this.speed = speed;

        if (speed > 0) {

            setMoving(true);

        } else {

            setMoving(false);

        } // else

    } // setSpeed

    public Integer getAltitude() {

        return altitude;

    } // getAltitude

    public void setAltitude(Integer altitude) {

        this.altitude = altitude;

    } // setAltitude

} // Aircraft
