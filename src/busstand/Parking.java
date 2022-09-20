package busstand;

/**
 * Mostly all bus stand will have a parking space alongside. This class gives us the details of the parking lot,
 * the information about the vehicles and the owner of the vehicles.
 * @author danteinpijamas
 */
public class Parking {

    private int noOfFreeBusSlots;
    private int noOfFreeOtherSlots;



    public void setNoOfFreeBusSlots (int busSlots) {
        this.noOfFreeBusSlots = busSlots;

    }

    /**
     * setter for number of bus slots
      *
     */


    public int getNoOfFreeBusSlots () {
        return this.noOfFreeBusSlots;

}
    /**
     * getter for number of bus slots
     *
     */


    public void setNoOfFreeOtherSlots (int otherSlots) {
        this.noOfFreeOtherSlots = otherSlots;
    }

    /**
     * setter for number of other slots
     *
     */

    public int getNoOfFreeOtherSlots () {
        return this.noOfFreeOtherSlots;
    }

    /**
     * getter for number of other slots
     *
     */

    public Parking(int NumberOfFreeBusSlots,int NumberOfFreeOtherSlots) {
        this.noOfFreeBusSlots = NumberOfFreeBusSlots;
        this.noOfFreeOtherSlots = NumberOfFreeOtherSlots;
    }

    /**
     * This method is to park the vehicle
     */
    public void parkVehicle(){

    }


    /**
     * Pay method is to pay the fees for parking
     */
    public void pay(){

    }
}
