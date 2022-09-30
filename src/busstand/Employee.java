package busstand;

import util.NameGenerator;

/**
 *  This class gives us the details of all the employees working for the bus stand including retailers,
 *  support staff, etc. This class is the parent class of
 *  Driver, Conductor and Maintenance staff since they all are employees.
 */
public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeDesignation;
    private double employeeSalary;

    /**
     * Getter for employee ID
     * @return
     */
    public String getEmployeeId() {
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
    public Employee(String employeeId, String employeeName){
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


    private static final int MAX_EMPLOYEE = 50;

    private static int conductorCount = 0;
    private static int driverCount = 0;

    public static int getConductorCount() {
        return conductorCount;
    }

    public static int getDriverCount() {
        return driverCount;
    }

    private static int employeeCount = 0;

    public static Employee[] builder(){
        Employee[] employees = new Employee[MAX_EMPLOYEE];
        createDrivers(10, employees);
        createConductors(10, employees);
        return employees;
    }

    private static void createDrivers(int quantity, Employee[] employees){
        String[] driverNames = NameGenerator.getNames(quantity);
        for(int count = 0; count < quantity; count++){
            employees[employeeCount] = new Driver(NameGenerator.randomIdentifier(), driverNames[count]);
            employees[employeeCount].setEmployeeDesignation("Driver");
            employeeCount ++;
            driverCount++;
        }
    }

    private static void createConductors(int quantity, Employee[] employees){
        String[] conductorNames = NameGenerator.getNames(quantity);
        for(int count = 0; count < quantity; count++){
            employees[employeeCount] = new Conductor(NameGenerator.randomIdentifier(), conductorNames[count]);
            employees[employeeCount].setEmployeeDesignation("Conductor");
            employeeCount ++;
            conductorCount++;

        }

    }
}
