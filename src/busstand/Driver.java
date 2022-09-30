package busstand;


/**
 * Driver is the child class of Employee. It gives the details of all
 * the bus drivers in the bus stand.
 */
public class Driver extends Employee{

    // private int busId;
    private Bus busId;

    public Bus getBusId() {
        return busId;
    }

    public void setBusId(Bus busId) {
        this.busId = busId;
    }

    /**
     * Constructor for Driver
     * @param employeeId
     * @param employeeName
     * @param busId
     */
    public Driver(String employeeId, String employeeName, Bus busId) {
        super(employeeId, employeeName);
        this.busId = busId;
    }

    public Driver(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }
}
