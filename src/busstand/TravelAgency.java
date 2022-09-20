package busstand;


/**
 * These are the agencies which would be selling tickets for long-distance buses.
 * It has two child classes GovernmentAgency and PrivateAgency.
 */
public class TravelAgency {

    private String agencyName;
    private int totalBuses;

    /**
     * Constructor for Travel Agency
     * @param agencyName
     * @param totalBuses
     */
    public TravelAgency(String agencyName, int totalBuses) {
        this.agencyName = agencyName;
        this.totalBuses = totalBuses;
    }

    /**
     * getter for Agency Name
     * @return
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * getter for Total Buses
     * @return
     */
    public int getTotalBuses() {
        return totalBuses;
    }

    /**
     * setter for TotalBuses
     * @param totalBuses
     */
    public void setTotalBuses(int totalBuses) {
        this.totalBuses = totalBuses;
    }

    /**
     * This method shows the buses available for traveling
     * @return
     */
    public int getAvailableBuses(){
       return 0;
    }

    /**
     * this method books the ticket for us
     */
    public void bookTicket(){

    }



}
