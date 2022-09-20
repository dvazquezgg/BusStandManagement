package busstand;


/**
 * Driver is the child class of Employee. It gives the details of all
 * the bus drivers in the bus stand.
 */
public class Driver extends Employee{

    // private int busId;
    private Bus busId;

    /**
     * Constructor for Driver
     * @param employeeId
     * @param employeeName
     * @param busId
     */
    public Driver(int employeeId, String employeeName, Bus busId) {
        super(employeeId, employeeName);
        this.busId = busId;
    }
}
