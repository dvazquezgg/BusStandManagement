package busstand;

/**
 * This class contains the details about the bus stand
 * @author Benja1243
 * @author MayaPapaya
 * @author dvazquez
 *
<<<<<<< Updated upstream
 * @author danteinpijamas
 *
 */

import util.IBIO;

public class BusStandManagement {


    private String busStandName;
    private String city;
    private String area;
    private boolean open;

    // Arrays for Parking, Shop and Agencies
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

    public static void main(String[] args){
        IBIO.output("Welcome to the BusStandManagement Program");

        String busStandName = "Naucalpan Station";
        String city = "Mexico City";
        String area = "North";
        // Calling the Constructor for the BusStandManagement
        BusStandManagement busStandMgt = new BusStandManagement(busStandName, city, area);
        BusStandManagement busStandMgtA = new BusStandManagement("Tlalpan station", city, "South");

        IBIO.output(busStandMgt.isOpen());
        IBIO.output(busStandMgtA.isOpen());

        busStandMgt.setOpen(true);
        IBIO.output("Is the " + busStandMgt.getBusStandName() + " open?" + busStandMgt.isOpen());

        BusParking busParking = new BusParking(15,2,1, "Main Parking");
        VehicleParking vehicleParking = new VehicleParking(0,30,2);
        busStandMgt.addParking(busParking);
        busStandMgt.addParking(vehicleParking);
        busStandMgt.printParking();

        IBIO.output(busStandMgt.parkings[0].getNoOfFreeBusSlots());
        // Casting the first parking to BusParking
        BusParking tempParking = (BusParking) busStandMgt.parkings[0];
        IBIO.output(tempParking.getPlaceName());

        // private methods or properties can not be called
        // IBIO.output(tempParking.noOfFreeBusSlots);

        //Non-static fields can not be called
        // parkings[1];

    }


}
