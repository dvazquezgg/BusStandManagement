package busstand;


/**
 * It is the child class of TravelAgency. It contains the details of the government agency in
 * charge and the government buses available for long travel.
 */
public class GovermentAgency extends TravelAgency{

    private int inchargeId;

    public GovermentAgency(String agencyName, int totalBuses, int inchargeId) {
        super(agencyName, totalBuses);
        this.inchargeId = inchargeId;
    }
}
