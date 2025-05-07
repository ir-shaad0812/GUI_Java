
public class Store
{
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;

    // Constructor
    public Store(int storeId, String storeName, String location, String openingHour)
    {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;
    }

    // Accessor methods
    public int getStoreId()
    {
        return storeId;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public String getLocation()
    {
        return location;
    }

    public String getOpeningHour()
    {
        return openingHour;
    }

    public double getTotalSales()
    {
        return totalSales;
    }

    public double getTotalDiscount()
    {
        return totalDiscount;
    }

    // Method to set total sales
    public void setTotalSales(double newTotalSales) 
    {
        totalSales += newTotalSales;
    }

    // Method to set total discount
    public void setTotalDiscount(double newDiscount) 
    {
        totalDiscount += newDiscount;
    }

    // Method to display store information
    public void display() 
    {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Opening Hour: " + openingHour);
        System.out.println("Total Sales: " + totalSales);
        if (totalSales == 0.0 && totalDiscount == 0.0) 
        {
            System.out.println("No sales and discounts yet.");
        }
    }
}
