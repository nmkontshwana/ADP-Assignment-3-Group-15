/*
 * ComputerLabFactory.java
 * Factory for the ComputerLab.
 * Author: Avuyile Mgxotshwa (219132488)
 * Date: 10 June 2021
 * */
package za.ac.cput.ADP3LabBookingSystem.Factory;

import za.ac.cput.ADP3LabBookingSystem.Entity.ComputerLab;
import za.ac.cput.ADP3LabBookingSystem.Util.GenericHelper;

public class ComputerLabFactory {

    public static ComputerLab createComputerLab(String labID) {

        String buildingId= GenericHelper.generateBuildingId();
        int capacity = GenericHelper.computerLabCapacity();
        boolean available = GenericHelper.checkAvailability();

        ComputerLab computerLab = new ComputerLab.Builder()
                .setLabId(labID)
                .setBuildingId(buildingId)
                .setCapacity(capacity)
                .setAvailability(available)
                .build();

        return computerLab;
    }

}
