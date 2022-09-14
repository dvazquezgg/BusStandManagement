package busstand;

/**
 * Bus parking is the child class of parking. It is the space in which buses used to be parked.
 * In India, buses to specific places will have some allocated area in the bus stand,
 * so those buses need to be parked there.
 */
public class BusParking extends Parking{

    private int slotId;
    private String placeName;
    private int arrivalTime;
    private int departureTime;
}
