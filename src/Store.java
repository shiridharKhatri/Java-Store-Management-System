public class Store {
    private int storeId; // Unique identifier for the store
    private String storeName; // Name of the store
    private String location; // Location of the store
    private String openingHour; // Opening hour of the store
    private Double totalSales; // Total sales made by the store
    private Double totalDiscount; // Total discount applied by the store

    // Constructor to initialize store properties
    public Store(int storeId, String storeName, String location, String openingHour) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = null; // Initially set total sales to null
        this.totalDiscount = null; // Initially set total discount to null
    }

    // Accessor methods to retrieve store information
    public int getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    // Mutator methods to update total sales and total discount
    public void setTotalSales(double newTotalSales) {
        if (totalSales == null) {
            totalSales = newTotalSales; // Set total sales if not initialized
        } else {
            totalSales += newTotalSales; // Add to existing total sales
        }
    }

    public void setTotalDiscount(double newDiscountPrice) {
        if (totalDiscount == null) {
            totalDiscount = newDiscountPrice; // Set total discount if not initialized
        } else {
            totalDiscount += newDiscountPrice; // Add to existing total discount
        }
    }

    // Display method to print store information
    public void display() {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + location);
        System.out.println("Store Opening Hour: " + openingHour);
        if (totalSales == null) {
            System.out.println("Total store sales are not available!"); // Inform if total sales not available
        } else {
            System.out.println("Store Total Sales: " + totalSales); // Display total sales
        }
        if (totalDiscount == null) {
            System.out.println("Total discount is not available!"); // Inform if total discount not available
        } else {
            System.out.println("Store Total Discount: " + totalDiscount); // Display total discount
        }
    }
}
