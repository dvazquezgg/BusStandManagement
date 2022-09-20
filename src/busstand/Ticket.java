package busstand;

/**
 * This holds the information about the ticket booked for travelling. It would contain the passenger
 * details and the bus along with the timing of the travel.
 */
public class Ticket {

    private int ticketId;
    //private int busId;
    //private int passengerId;

    private double ticketPrice;

    private Bus busId;
    private Passengers passengerId;

    /**
     * ticket details of a specific passenger can be viewed using this method
     * @return
     */
    private String ticketDetails(){
        return "";
    }

    /**
     * this method shows whether the passenger purchased and paid for the ticket
     * @return
     */
    private boolean isPaid(){
        return false;
    }
}

