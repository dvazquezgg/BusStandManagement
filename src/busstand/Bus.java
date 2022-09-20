package busstand;

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



}
