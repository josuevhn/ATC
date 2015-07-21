package com.wiseratel;

import java.util.ArrayList;
import java.util.List;

public class ATC {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("############   Detectando aeronaves en espacio aéreo   ############");

        // Creamos dos aeronaves, un avión y un helicoptero

        Airplane boeing737 = new Airplane();
        Helicopter kamovKA52 = new Helicopter(6, 2);

        System.out.println();

        // Establecemos parámetros por defecto y despegamos

        boeing737.setFlags((byte) 5);
        boeing737.setSpeed(300);
        boeing737.takeOff();

        // Establecemos parámetros por defecto y despegamos

        kamovKA52.setRotorRPM(1024);
        kamovKA52.takeOff();

        System.out.println();

        // Representamos en el radar las aeronaves volando en nuestro espacio aéreo.

        System.out.println("############   Representando la aeronaves en el radar   ############");

        System.out.println();

        ArrayList<Aircraft> aircrafts = new ArrayList<>();

        aircrafts.add(boeing737);
        aircrafts.add(kamovKA52);

        for(Aircraft aircraft : aircrafts) {

            System.out.println(aircraft);

            // --- Solución final...

            if(aircraft instanceof Airplane) {

                ((Airplane) aircraft).someUniqueMethod("Texto de ejemplo");

            } // if
            else if (aircraft instanceof Helicopter) {

                ((Helicopter) aircraft).someUniqueMethod(0);

            } // else if

            // ... al problema planteado en el artículo ---

        } // for

        System.out.println();

        // Aterrizamos ambas aeronaves

        System.out.println("############   Aeronaves aterrizando   ############");

        System.out.println();

        boeing737.landing();
        kamovKA52.landing();

        System.out.println();

    } // main

} // ATC
