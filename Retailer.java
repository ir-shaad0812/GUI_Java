public class Retailer extends Store 
{
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    private boolean isRemoved;

    // Constructor
    public Retailer(int storeId, String storeName, String location, String openingHour,
                    double totalSales, double totalDiscount, int vatInclusivePrice,
                    boolean isPaymentOnline, String purchasedYear)        
                    {
        super(storeId, storeName, location, openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
        this.isRemoved = false;
    }
    // Accessor methods
    public int getVatInclusivePrice()
    {
        return vatInclusivePrice;
    }

    public int getLoyaltyPoint() 
    {
        return loyaltyPoint;
    }

    public boolean getIsPaymentOnline()
    {
        return isPaymentOnline;
    }

    public String getPurchasedYear() 
    {
        return purchasedYear;
    }
    
    public boolean getIsRemoved(){
        return this.isRemoved;
    }

    // Mutator method for isPaymentOnline
    public void setIsPaymentOnline(boolean newIsPaymentOnline) 
    {
        this.isPaymentOnline = newIsPaymentOnline;
    }

    // Method to set loyalty point
    public void setLoyaltyPoint(boolean isPaymentOnline, int vatInclusivePrice)
    {
        if (isPaymentOnline)
        {
            loyaltyPoint = (int) (vatInclusivePrice * 0.01);
        }
    }

    // Method to remove product
    public void removeProduct() 
    {
        if (loyaltyPoint == 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) 
        {
            this.isRemoved = true;
            this.vatInclusivePrice = 0;
            this.loyaltyPoint = 0;
            this.isPaymentOnline = false;
        }
    }

    // Method to display retailer details
    @Override
    public void display() 
    {
        if (isRemoved) 
        {
            super.display();
            System.out.println("This product has been removed.");
            
        } 
        else 
        {
            super.display();
            System.out.println("VAT Inclusive Price: " + vatInclusivePrice);
            System.out.println("Loyalty Point: " + loyaltyPoint);
            System.out.println("Purchased Year: " + purchasedYear);
        }
    }

}
