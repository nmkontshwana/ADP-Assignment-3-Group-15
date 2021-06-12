/*
* ComputerLab.java
* Entity for the ComputerLab.
* Author: Avuyile Mgxotshwa (219132488)
* Date: 09 June 2021
* */
package za.ac.cput.ADP3LabBookingSystem.Entity;

public class ComputerLab {
    //private variables
    private String labId, buildingId;
    private int capacity;
    private boolean availability;

    //Builder builder
    private ComputerLab(Builder builder) {
        this.labId = builder.labId;
        this.buildingId = builder.buildingId;
        this.capacity = builder.capacity;
        this.availability = builder.availability;
    }

    //toString
    @Override
    public String toString() {
        return "ComputerLab{" +
                "labId='" + labId + '\'' +
                ", buildingId='" + buildingId + '\'' +
                ", capacity=" + capacity +
                ", availability=" + availability +
                '}';
    }

        //Builder class
        public static class Builder{
            //private variables
            private String labId, buildingId;
            private int capacity;
            private boolean availability;

            //setters
            public Builder setLabId(String labId) {
                this.labId = labId;

                return this;
            }

            public Builder setBuildingId(String buildingId) {
                this.buildingId = buildingId;

                return this;
            }

            public Builder setCapacity(int capacity) {
                this.capacity = capacity;

                return this;
            }

            public Builder setAvailability(boolean availability) {
                this.availability = availability;

                return this;
            }

            //build()
            public ComputerLab build() {
                return new ComputerLab(this);
            }

            //copy
            public Builder copy(ComputerLab computerLab) {
                this.labId = computerLab.labId;
                this.buildingId = computerLab.buildingId;
                this.capacity= computerLab.capacity;
                this.availability = computerLab.availability;

                return this;
            }

        }//end Builder class
}//end ComputerLab class
