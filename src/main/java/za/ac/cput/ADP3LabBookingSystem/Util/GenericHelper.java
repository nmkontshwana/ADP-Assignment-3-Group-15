/*
 * GenericHelper.java
 * GenericHelper Class.
 * Author: Avuyile Mgxotshwa (219132488)
 * Date: 10 June 2021
 * */
package za.ac.cput.ADP3LabBookingSystem.Util;

import java.util.UUID;

public class GenericHelper {

    //placeholder buildingId
    public static String generateBuildingId() {

        return UUID.randomUUID().toString();
    }

    //typical computer lab capacity
    public static  int computerLabCapacity(){

        return 35; //a typical lab can accommodate 35 students
    }

    //check computer lab availability
    public static boolean checkAvailability() {

        return true; //default state of availability
    }

}
