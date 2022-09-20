package busstand;

/**
 * It is the child class of TravelAgency. It contains the details of the non-government buses
 * and travel services available for booking long travel tickets.
 */
public class PrivateAgency extends TravelAgency {

    private int inchargeId;
    private String inchargeContact;

    public PrivateAgency(String agencyName, int totalBuses, int inchargeId, String inchargeContact) {
        super(agencyName, totalBuses);
        this.inchargeId = inchargeId;
        this.inchargeContact = inchargeContact;
    }

    public int getInchargeId() {
        return inchargeId;
    }

    public String getInchargeContact() {
        return inchargeContact;
    }
}
