package busstand;

/**
 * This class contains the details of all the shops which would be present inside the bus stand.
 */
public class Shops {

    private int shopId;
    private String shopName;
    private int OwnerId;

    /**
     * It displays the shops of the bus stand along with items available there
     * @return
     */
    private String shopDetails(){
        return "";
    }

    /**
     * Constructor's for shops with owner ID
     * @param shopId
     * @param shopName
     * @param ownerId
     */
    public Shops(int shopId, String shopName, int ownerId) {
        this.shopId = shopId;
        this.shopName = shopName;
        OwnerId = ownerId;
    }

    /**
     * Constructor's for shops without owner ID
     * @param shopId
     * @param shopName
     */
    public Shops(int shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

    /**
     * Getter for owner ID
     * @return
     */
    public int getOwnerId() {
        return OwnerId;
    }

    /**
     * Setter for owner ID
     * @param ownerId
     */
    public void setOwnerId(int ownerId) {
        OwnerId = ownerId;
    }

    /**
     * Getter for shop ID
     * @return
     */
    public int getShopId() {
        return shopId;
    }

    /**
     * Getter for shop Name
     * @return
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method is to purchase the items in those shops
     */
    private void buy(){

    }
}
