package busstand;


/**
 * This class gives information about the passengers of the bus stand.
 */
public class Passengers {


    private int passengerId;
    private String passengerName;
    private int passengerAge;
    private char passengerGender;
    private String source;
    private String destination;
    // private int busId;
    private Bus busId;

    /**
     * this method is to get the details of a specific passenger
     * @return
     */
    public String passengerDetails(){
        return "";
    }

    /**
     * Setter for passengerName
     * @param passengerName
     */
    public void setPassengerName(String passengerName){
        this.passengerName= passengerName;
    }

    /**
     * Getter for passengerName
     * @return
     */
    public String getPassengerName(){
        return this.passengerName;
    }

    /**
     * Getter for passengerId
     * @return
     */
    public int getPassengerId() {
        return passengerId;
    }

    /**
     * Setter for passengerID
     * @param passengerId
     */
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    /**
     * Getter for passengerAge
     * @return
     */
    public int getPassengerAge() {
        return passengerAge;
    }

    /**
     * Setter for passengerID
     * @param passengerAge
     */
    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    /**
     * Getter for passengerGender
     * @return
     */
    public char getPassengerGender() {
        return passengerGender;
    }

    /**
     * Setter for passengerGender
     * @param passengerGender
     */
    public void setPassengerGender(char passengerGender) {
        this.passengerGender = passengerGender;
    }

    /**
     * Getter for getSource
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * Setter for setSource
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Getter for getDestination
     * @return
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Setter for setDestination
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Getter for busId
     * @return
     */
    public Bus getBusId() {
        return busId;
    }

    /**
     * Setter for busID
     * @param busId
     */
    public void setBusId(Bus busId) {
        this.busId = busId;
    }

    /**
     * Constructor for Passengers
     * @param passengerId
     * @param passengerName
     * @param passengerGender
     */
    public Passengers (int passengerId, String passengerName, char passengerGender) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
    }

}
