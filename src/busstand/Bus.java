package busstand;

import util.NameGenerator;

import java.util.Hashtable;

/**
 * This class gives us the details of the bus in the bus stand,
 * it helps us to get a ticket to that bus and get information about the seats.
 */
public class Bus {

    private int busId;
    private String busType;
    //private int driverId;
    //private int conductorId;
    private int totalSeats;
    private int seatsFilled;
    private String source;
    private String destination;
    private double ticketPrice;
    private int slotId;

    private Passengers[] passengers;
    private Ticket[] tickets;
    private Driver driverId;
    private Conductor conductorId;

    /**
     * Setter for Total seats in the bus
     * @param seats
     */
    public void setTotalSeats(int seats){
        this.totalSeats = seats;
    }

    /**
     * Getter for Total Seats
     * @return
     */
    public int getTotalSeats(){
        return this.totalSeats;
    }

    /**
     * getter for seatsFilled
     * @return number of seats filled
     */
    public int getSeatsFilled() {
        return seatsFilled;
    }

    /**
     * getter for Source
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * getter for Destination
     * @return
     */
    public String getDestination() {
        return destination;
    }

    /**
     * getter for Ticket Price
     * @return
     */
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * getter for SlotId
     * @return
     */
    public int getSlotId() {
        return slotId;
    }

    /**
     * getter for Passengers list
     * @return
     */
    public Passengers[] getPassengers() {
        return passengers;
    }

    /**
     * getter for Tickets list
     * @return
     */
    public Ticket[] getTickets() {
        return tickets;
    }

    /**
     * getter for driver
     * @return
     */
    public Driver getDriverId() {
        return driverId;
    }

    /**
     * getter for Conductor
     * @return
     */
    public Conductor getConductorId() {
        return conductorId;
    }

    /**
     * setter for seats filled
     * @param seatsFilled
     */
    public void setSeatsFilled(int seatsFilled) {
        this.seatsFilled = seatsFilled;
    }

    /**
     * setter for source
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * setter for destination
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * setter for ticket price
     * @param ticketPrice
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * setter for slotId
     * @param slotId
     */
    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    /**
     * setter for Passenger
     * @param passengers list of passengers as an Array
     */
    public void setPassengers(Passengers[] passengers) {
        this.passengers = passengers;
    }

    /**
     * setter for Tickets
     * @param tickets
     */
    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    /**
     * setter for driver
     * @param driverId
     */
    public void setDriverId(Driver driverId) {
        this.driverId = driverId;
    }

    /**
     * setter for conductor
     * @param conductorId
     */
    public void setConductorId(Conductor conductorId) {
        this.conductorId = conductorId;
    }

    /**
     * Constructore for the Bus class
     * @param idNumber
     * @param typeOfBus
     */
    public Bus(int idNumber, String typeOfBus){
        this.busId = idNumber;
        this.busType = typeOfBus;
    }

    /**
     * this method gives information abount an specific bus
     * @return
     */
    public String busDetails(){
        return "";
    }

    /**
     * this method helps us to book tickets for that specific bus
     * @return
     */
    public int getTicket(){
        return 0;
    }


    private static final int MAX_BUSES = 20;
    private static final Hashtable<String, Integer> busTypes = new Hashtable<String, Integer>(){{
        put("Minibus",20);
        put("Fulldeck",40);
        put("DoubleDecker",60);
    }};

    private static int busCount = 0;
    public static Bus[] builder(int quantity){
        Bus[] buses = new Bus[MAX_BUSES];

        for(int count = 0; count < quantity; count++){
            int busId = NameGenerator.randomNumericIdentifier();
            String busType = "DoubleDecker";
            int totalSeats = busTypes.get(busType);

            Bus aBus = new Bus(busId,busType);
            aBus.setTotalSeats(totalSeats);

            buses[busCount] = aBus;
            busCount++;
        }
        return buses;
    }

}
