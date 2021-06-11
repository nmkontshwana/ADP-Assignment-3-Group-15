package za.ac.cput.ADP3LabBookingSystem.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.ADP3LabBookingSystem.Entity.Seat;

import static org.junit.jupiter.api.Assertions.*;

class SeatFactoryTest {
    @Test
    public void createSeat(){
        Seat seat = SeatFactory.createSeat("4","yes");
        System.out.println(seat);
    }

}