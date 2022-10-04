package busstand;

/**
 * This class contains the details about the bus stand
 * @author Benja1243
 * @author MayaPapaya
 * @author dvazquez
 * @author danteinpijamas
 *
 */

import util.IBIO;
import util.NameGenerator;

import static java.lang.System.exit;

public class BusStandManagement {


    private String busStandName;
    private String city;
    private String area;
    private boolean open;

    // Arrays for Parking, Shop and Agencies
    private static BusStandManagement[] busStandManagement;
    private Parking[] parkings;
    private Shops[] shops;
    private TravelAgency[] agencies;

    private int parkingCount;

    /**
     * Constructor for Bus Stand Management class
     * @param busStandName
     * @param city
     * @param area
     */
    public BusStandManagement(String busStandName, String city, String area) {
        this.busStandName = busStandName;
        this.city = city;
        this.area = area;
        this.open = false;

        parkings = new Parking[5];
        parkingCount = 0;
        shops = new Shops[5];
        agencies = new TravelAgency[5];
    }

    private void addParking(Parking parking){
        parkings[parkingCount] = parking;
        parkingCount ++;
    }

    private void printParking(){
        for(int count=0; count < parkingCount; count++){
            IBIO.output(parkings[count].toString());
        }
    }
    /**
     * Getter for BusStandName
     * @return
     */
    public String getBusStandName() {
        return busStandName;
    }

    /**
     * Getter for City
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Getter for Area
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * This method says whether the bus stop is functioning or not.
     * @return
     */
    public boolean isOpen(){
        return open;
    }

    /**
     * Set status for the BusStand
     * @param open
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    public static BusStandManagement createBusStand(String name, String city, String area){
        BusStandManagement busStandMgt = new BusStandManagement(name, city, area);
        BusParking busParking = new BusParking(15,2,1, "Main Parking");
        VehicleParking vehicleParking = new VehicleParking(0,30,2);
        busStandMgt.addParking(busParking);
        busStandMgt.addParking(vehicleParking);

        return busStandMgt;
    }

    public static void initStations(){

        busStandManagement = new BusStandManagement[3];
        busStandManagement[0] = createBusStand("Naucalpan Station", "Mexico City", "North");
        busStandManagement[1] = createBusStand("Tlalpan Station", "Mexico City", "South");
        busStandManagement[2] = createBusStand("Iztacalco Station", "Mexico City", "East");

    }

    public static int menu(String[] options){

        IBIO.output("Select an option from the menu:");
        for(int count = 0; count < options.length; count++){
            IBIO.output((count + 1) + " " + options[count]);
        }
        int selection = IBIO.inputInt("Choice:");
        return selection;
    }

    public static void parkBus(){
        IBIO.output("Parking bus");
    }

    private static String pickOption(String prompt, String[] options){
        IBIO.output(prompt);
        for(int count = 0; count < options.length; count++){
            IBIO.output((count + 1) + " " + options[count]);
        }
        int selection = IBIO.inputInt("Choice:");
        return options[selection - 1];
    }

    private static int pickTime(String prompt, int[] slots){
        IBIO.output(prompt);
        for(int count = 0; count < slots.length; count++){
            int hr = slots[count] / 100;
            int min = slots[count] % 100;
            IBIO.output( String.format("%2d %02d:%02d",(count + 1),hr,min));
        }
        int selection = IBIO.inputInt("Choice:");
        return slots[selection - 1];

    }

    public static void assignBus(){
        final int[] timeSlots = {815,900,945,1030,
                1115,1200,1245,1330,
                1415,1500,1545,1630,
                1715,1800,1845,1930};
        final String[] locations = {"North", "South", "East"};
        IBIO.output("Assign bus");

        String origin = pickOption("Select origin for the bus", locations);
        String destination  = pickOption("Select destination for the bus", locations);
        int timeSlot = pickTime("Select time to departure",timeSlots);
        IBIO.output("Select Driver for the bus");
        IBIO.output("Select Conductor for the bus");

    }

    public static void sellTicket(){
        IBIO.output("Sell Ticket");
    }

    public static void main(String[] args) {
        initStations();
        Employee[] employees = Employee.builder();
        Bus[] buses = Bus.builder(6);

        IBIO.output("Welcome to the BusStandManagement Program");
        final String[] MENU_OPTIONS = {
                "Parking a Bus",
                "Assign Bus to a route and time slot",
                "Sell a Ticket"};

        int option = menu(MENU_OPTIONS);
        switch (option){
            case 1:
                parkBus();
                break;
            case 2:
                assignBus();
                break;
            case 3:
                sellTicket();
                break;
            default:
                IBIO.output("Not a valid option. Finishing the program");
                exit(0);
                break;
        }

    }

}