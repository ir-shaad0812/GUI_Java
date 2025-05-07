public class Department extends Store 
{
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    // Constructor
    public Department(int storeId, String storeName, String location, String openingHour, 
                      double totalSales, double totalDiscount, String productName, double markedPrice) 
    {
        super(storeId, storeName, location, openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.isInSales = true;
        this.sellingPrice = 0.0;
        calculateDiscountPrice(isInSales, markedPrice);
    }

    // Accessor methods
    public String getProductName()
    {
        return productName;
    }

    public double getMarkedPrice() 
    {
        return markedPrice;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public boolean getIsInSales()
    {
        return this.isInSales;
    }

    // Mutator method for marked price
    public void setMarkedPrice(double newMarkedPrice)
    {
        markedPrice = newMarkedPrice;
    }

    // Method to calculate discount price and set selling price
    public void calculateDiscountPrice(boolean isInSales, double markedPrice)
    {
        double discountPercent = 0.0;
        if (isInSales) 
        {
            if (markedPrice >= 5000)
            {
                discountPercent = 0.20;
            }
            else if (markedPrice >= 3000 && markedPrice < 5000)
            {
                discountPercent = 0.10;
            }
            else if (markedPrice >= 1000 && markedPrice < 3000) 
            {
                discountPercent = 0.05;
            }
        }
        double discountPrice = markedPrice * discountPercent;
        sellingPrice = markedPrice - discountPrice;
        super.setTotalDiscount(discountPrice);
        super.setTotalSales(sellingPrice);
        this.isInSales = false;
    }

    // Method to display department details
    @Override
    public void display()
    {
        super.display();
        if (isInSales) 
        {
            System.out.println("Product Name: " + productName);
            System.out.println("Marked Price: " + markedPrice);
        } 
        else 
        {
            System.out.println("Product Name: " + productName);
            System.out.println("Selling Price: " + sellingPrice);
        }
    }
}
