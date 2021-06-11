package za.ac.cput.ADP3LabBookingSystem.Factory;

import za.ac.cput.ADP3LabBookingSystem.Entity.Seat;
import za.ac.cput.ADP3LabBookingSystem.Util.GenericHelper;
public class SeatFactory {

    public static Seat createSeat(String seatNumber, String labId, boolean seatAvailability) {
        String seatId = GenericHelper.generateBuildingId();
        Seat seat = new Seat.Builder()
                .setSeatNumber(seatId)
                .setLabId(labId)
                .setSeatAvailability(seatAvailability)

                .build();

        return seat;
    }
}
