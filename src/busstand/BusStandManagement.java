package busstand;

/**
 * This class contains the details about the bus stand
 * @author MayaPapaya
 * @author dvazquez
 *
 * @author valsimons
 */
public class BusStandManagement {


    private String busStandName;
    private String city;
    private String area;

    private Shops[] shops;
    private TravelAgency[] travelAgencies;
    private Parking[] parkings;

    /**
     * This method says whether the bus stop is functioning or not.
     * @return
     */
    public boolean isOpen(){
        return false;
    }
}
