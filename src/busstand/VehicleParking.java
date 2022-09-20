package busstand;


/**
 * VehicleParking is the child class of parking. It contains the details of other vehicles
 * in the bus stand like two-wheelers, cars and autos.
 */
public class VehicleParking extends Parking {

    private int ParkingId;
    private String OwnerName;
    private String VehicleType;
    private int VehicleNumber;
    private int StartTime;
    private int EndTime;

    /**
     * Constructor for Vehicle Parking
     * @param NumberOfFreeBusSlots
     * @param NumberOfFreeOtherSlots
     * @param parkingId
     */
    public VehicleParking(int NumberOfFreeBusSlots, int NumberOfFreeOtherSlots, int parkingId) {
        super(NumberOfFreeBusSlots, NumberOfFreeOtherSlots);
        ParkingId = parkingId;
    }
}
