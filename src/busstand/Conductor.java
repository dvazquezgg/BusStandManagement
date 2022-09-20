package busstand;


/**
 * Conductor is the child class of employee. This gives us the bus conductor details.
 */
public class Conductor extends Employee {
    //private int busId;
    private Bus busId;

    /**
     *
     * @param employeeId
     * @param employeeName
     * @param busId
     */
    public Conductor(int employeeId, String employeeName, Bus busId) {
        super(employeeId, employeeName);
        this.busId = busId;
    }
}

