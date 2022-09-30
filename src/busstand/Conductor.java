package busstand;


/**
 * Conductor is the child class of employee. This gives us the bus conductor details.
 */
public class Conductor extends Employee {
    public Bus getBusId() {
        return busId;
    }

    public void setBusId(Bus busId) {
        this.busId = busId;
    }

    //private int busId;
    private Bus busId;

    /**
     *
     * @param employeeId
     * @param employeeName
     * @param busId
     */
    public Conductor(String employeeId, String employeeName, Bus busId) {
        super(employeeId, employeeName);
        this.busId = busId;
    }

    /**
     *
     * @param employeeId
     * @param employeeName
     */
    public Conductor(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }
}

