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
    }


}
