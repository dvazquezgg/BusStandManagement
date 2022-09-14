package busstand;

/**
 *  This class gives us the details of all the employees working for the bus stand including retailers,
 *  support staff, etc. This class is the parent class of
 *  Driver, Conductor and Maintenance staff since they all are employees.
 */
public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeDesignation;
    private double employeeSalary;


    /**
     * This method fetches the employee details.
     * @return
     */
    public String employeeDetails(){
        return "";
    }
}
