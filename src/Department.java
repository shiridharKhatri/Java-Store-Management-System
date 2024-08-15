public class Department extends Store {
    private String productName; // Name of the product
    private double markedPrice; // Marked price of the product
    private Double sellingPrice; // Selling price of the product
    private boolean isInSales; // Flag indicating if the product is on sale

    // Constructor to initialize department properties
    public Department(int storeId, String storeName, String location, String openingHour,
                      double totalSales, double totalDiscount,
                      String productName, double markedPrice) {
        // Calling superclass constructor
        super(storeId, storeName, location, openingHour);
        // Initializing attributes
        super.setTotalSales(totalSales); // Set total sales
        super.setTotalDiscount(totalDiscount); // Set total discount
        this.isInSales = true; // Initially set product in sales
        this.sellingPrice = null; // Initially set selling price to null
        this.productName = productName; // Set product name
        this.markedPrice = markedPrice; // Set marked price
    }

    // Accessor methods to retrieve department information
    public String getProductName() {
        return productName;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isInSales() {
        return isInSales;
    }

    public double getMarkedPrice() {
        return markedPrice;
    }

    // Mutator method to set marked price
    public void setMarkedPrice(double markedPrice) {
        this.markedPrice = markedPrice;
    }

    // Method to calculate selling price and update total discount price
    public void calculateDiscountPrice(double markedPrice, boolean isInSales) {
        if (isInSales == true) {
            // Calculate selling price based on the marked price
            if (markedPrice >= 5000) {
                this.sellingPrice = markedPrice - markedPrice * 20 / 100;
            } else if (markedPrice >= 3000 && markedPrice < 5000) {
                this.sellingPrice = markedPrice - markedPrice * 10 / 100;
            } else if (markedPrice >= 1000 && markedPrice < 3000) {
                this.sellingPrice = markedPrice - markedPrice * 5 / 100;
            } else {
                this.sellingPrice = markedPrice;
            }
            this.isInSales = false; // Set product out of sales after calculating selling price
            super.setTotalDiscount(sellingPrice); // Update total discount price
        } else {
            System.out.println("The product is out of stock."); // Inform if product is out of stock
        }
    }

    // Display method to print department information
    public void display() {
        super.display(); // Calling superclass display method to print store information
        if (isInSales) {
            System.out.println("Product Name: " + productName);
            System.out.println("Marked Price: " + markedPrice); // Display marked price if product is in sales
        } else {
            System.out.println("Product Name: " + productName);
            System.out.println("Selling Price: " + sellingPrice); // Display selling price if product is not in sales
        }
    }
}
