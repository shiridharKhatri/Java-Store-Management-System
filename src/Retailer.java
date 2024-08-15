public class Retailer extends Store {
    // Attributes
    private int vatInclusivePrice; // Price including Value Added Tax (VAT)
    private int loyaltyPoints; // Loyalty points earned by the retailer
    private boolean isPaymentOnline; // Flag indicating if payment is made online
    private String purchasedYear; // Year when the purchase was made

    // Constructor to initialize retailer properties
    public Retailer(int storeId, String storeName, String location, String openingHour,
                    double totalSales, double totalDiscount, int vatInclusivePrice,
                    boolean isPaymentOnline, String purchasedYear) {
        super(storeId, storeName, location, openingHour); // Call superclass constructor
        super.setTotalSales(totalSales); // Set total sales using superclass method
        super.setTotalDiscount(totalDiscount); // Set total discount using superclass method
        this.vatInclusivePrice = vatInclusivePrice; // Set VAT inclusive price
        this.isPaymentOnline = isPaymentOnline; // Set payment method
        this.purchasedYear = purchasedYear; // Set purchased year
        this.loyaltyPoints = 0; // Initially set loyalty points to 0
    }

    // Accessor methods to retrieve retailer information
    public int getVatInclusivePrice() {
        return vatInclusivePrice;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public boolean isPaymentOnline() {
        return isPaymentOnline;
    }

    public String getPurchasedYear() {
        return purchasedYear;
    }

    // Mutator methods to set retailer information
    public void setVatInclusivePrice(int vatInclusivePrice) {
        this.vatInclusivePrice = vatInclusivePrice;
    }

    public void setPaymentOnline(boolean isPaymentOnline) {
        this.isPaymentOnline = isPaymentOnline;
    }

    public void setPurchasedYear(String purchasedYear) {
        this.purchasedYear = purchasedYear;
    }

    // Method to calculate and set loyalty points
    public void setLoyaltyPoints(boolean isPaymentOnline, int vatInclusivePrice) {
        if (isPaymentOnline) {
            this.loyaltyPoints = vatInclusivePrice / 100; // 1% of VAT inclusive price
        }
    }

    // Method to remove product if eligible
    public void removeProduct() {
        if (loyaltyPoints <= 0 && (purchasedYear.equals("2020") ||
                purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            System.out.println("Product removed.");
            vatInclusivePrice = 0;
            loyaltyPoints = 0;
            isPaymentOnline = false;
        }
    }

    // Method to display retailer details
    public void display() {
        if (loyaltyPoints > 0) {
            System.out.println("Retailer Details:");
            super.display(); // Calling superclass method to display common store details
            System.out.println("VAT Inclusive Price: " + vatInclusivePrice);
            System.out.println("Loyalty Point: " + loyaltyPoints);
            System.out.println("Purchased Year: " + purchasedYear);
        } else {
            super.display(); // Calling superclass method to display common store details
            System.out.println("Product has been removed.");
        }
    }
}