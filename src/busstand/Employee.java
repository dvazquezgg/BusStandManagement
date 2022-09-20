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
     * Getter for employee ID
     * @return
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Getter for employee name
     * @return
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Setter for employee designation
     * @param designation
     */
    public void setEmployeeDesignation(String designation){
        this.employeeDesignation = designation;
    }

    /**
     * Getter for employee designation
     * @return
     */
    public String getEmployeeDesignation(){
        return this.employeeDesignation;
    }

    /**
     * Setter for employee salary
     * @param salary
     */
    public void setEmployeeSalary(double salary){
        this.employeeSalary = salary;
    }

    /**
     * Getter for employee salary
     * @return
     */
    public double getEmployeeSalary(){
        return this.employeeSalary;
    }

    /**
     * Constructors for Employee
     * @param employeeId
     * @param employeeName
     */
    public Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    /**
     * This method fetches the employee details.
     * @return
     */
    public String employeeDetails(){
        return "";
    }
}
