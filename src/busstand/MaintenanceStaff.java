package busstand;


/**
 * Maintenance staff is the child class of employee. It gives the details of all the maintenance staff.
 */
public class MaintenanceStaff extends Employee {

    private String department;

    public MaintenanceStaff(int employeeId, String employeeName, String department) {
        super(employeeId, employeeName);
        this.department = department;
    }
}
