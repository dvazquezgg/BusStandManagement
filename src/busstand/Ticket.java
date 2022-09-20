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

    /**
     * Constructor for Ticket
     * @param ticketId
     * @param busId
     * @param passenger
     */
    public Ticket (int ticketId, Bus busId, Passengers passenger){
       this.ticketId = ticketId;
       this.busId = busId;
       this.passengerId = passenger;
    }
    /**
     * getter for ticket ID of each ticket
     * @return
     */
    public int getTicketId(){
        return this.ticketId;
    }

    public double setTicketPrice(int prices){
        this.ticketPrice = prices;
    }

     public double getTicketPrice(){
        return ticketPrice;
     }

    public Bus getBusId() {
        return this.busId;
    }

    public Passengers getPassengerId(){
        return passengerId;
    }


