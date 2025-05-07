import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class StoreGUI1 extends JFrame
{
    private JPanel departmentPanel, retailerPanel, discountPanel, removeProductPanel, loyaltyPanel;

    private JLabel storeIdLabel1, storeIdLabel2,  storeNameLabel1, storeNameLabel2, locationLabel1, locationLabel2, openingHourLabel1, openingHourLabel2, salesLabel1, salesLabel2, discountLabel1, discountLabel2, productNameLabel, markedPriceLabel, vatLabel, paymentOnlineLabel2, purchasedYearLabel,  titleLabel,   markedPriceDiscountLabel, vatLoyaltyLabel, departmentStoreIdField, departmentStoreNameField, departmentLocationField, departmentOpeningHourField, departmentSalesField, departmentDiscountField, retailerStoreIdField, retailerStoreNameField, retailerLocationField, retailerOpeningHourField, retailerSalesField, retailerDiscountField, calculateProductNameField, calculateMarkedPriceField, calculateVatField, setLoyaltyVatField, IDDiscount, isInSaleDis, paymentOnlineretLabel,removeProductIDLabel, loyaltyIDLabel;

    private JTextField storeIdField1, storeIdField2,  storeNameField1, storeNameField2, locationField1, locationField2, openingHourField1, openingHourField2, salesField1, salesField2, discountField1, discountField2, productNameField, markedPriceField, vatField, vatLoyaltyField,removeProductIDField, IDDiscountField,markedPricedisField,loyaltyIDfield;

    private JComboBox<String> purchasedYearComboBox;

    private JCheckBox paymentOnlineCheckBox1,  paymentOnlineCheckBox3,  inSalesCheckBox1;



    private JButton addDepartmentButton, addRetailerButton, calculateDiscountButton, removeProductButton, setLoyaltyPointsButton, displayButton, clearButton, displayDepartmentButton, displayRetailerButton;

    private TitledBorder departmentBorder, retailerBorder, discountBorder, removeProductBorder, loyaltyBorder;

    private Font titleFont;
    private ArrayList<Store> storeList;

    // Constructor
    public StoreGUI1()
    {
        setSize(1400, 1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Store GUI");

        storeList = new ArrayList<>();
        


        // Department Panel
        departmentPanel = new JPanel();
        departmentPanel.setBounds(100, 160, 400, 350);
        departmentPanel.setLayout(new GridLayout(9, 2, 10, 10));
        departmentBorder = new TitledBorder("Add Department");
        departmentPanel.setBorder(departmentBorder);

        // Retailer Panel
        retailerPanel = new JPanel();
        retailerPanel.setBounds(550, 160, 800, 400);
        retailerPanel.setLayout(new GridLayout(10, 2, 10,10));
        retailerBorder = new TitledBorder("Add Retailer");
        retailerPanel.setBorder(retailerBorder);

        // Discount Panel
        discountPanel = new JPanel();
        discountPanel.setBounds(550, 600, 300, 200);
        discountPanel.setLayout(new GridLayout(4, 2, 10, 10));
        discountBorder = new TitledBorder("Calculate Discount");
        discountPanel.setBorder(discountBorder);

        // Remove Product Panel
        removeProductPanel = new JPanel();
        removeProductPanel.setBounds(100, 600, 400, 100);
        removeProductPanel.setLayout(new GridLayout(2, 2, 10, 10));
        removeProductBorder = new TitledBorder("Remove Product");
        removeProductPanel.setBorder(removeProductBorder);

        // Loyalty Panel
        loyaltyPanel = new JPanel();
        loyaltyPanel.setBounds(1000, 600, 400, 200);
        loyaltyPanel.setLayout(new GridLayout(4, 2, 10, 10));
        loyaltyBorder = new TitledBorder("Set Loyalty Point");
        loyaltyPanel.setBorder(loyaltyBorder);

        // Labels
        storeIdLabel1 = new JLabel("Store ID:");
        storeIdLabel2 = new JLabel("Store ID:");
        storeNameLabel1 = new JLabel("Store Name:");
        storeNameLabel2 = new JLabel("Store Name:");
        locationLabel1 = new JLabel("Location:");
        locationLabel2 = new JLabel("Location");
        openingHourLabel1 = new JLabel("Opening Hour:");
        openingHourLabel2 = new JLabel("Opening Hour:");
        salesLabel1 = new JLabel("Total Sales:");
        salesLabel2 = new JLabel("Total Sales:");
        discountLabel1 = new JLabel("Total Discount:");
        discountLabel2 = new JLabel("Total Discount:");
        productNameLabel = new JLabel("Product Name:");
        markedPriceLabel = new JLabel("Marked Price:");
        vatLabel = new JLabel("VAT Inclusive Price:");
        paymentOnlineLabel2 = new JLabel("Is Payment Online:");
        purchasedYearLabel = new JLabel("Purchased Year:");
        titleLabel = new JLabel("Business Management System");
        markedPriceDiscountLabel = new JLabel("Marked Price");
        vatLoyaltyLabel = new JLabel("VAT Inclusive Price");
        IDDiscount=new JLabel("Store ID");
        isInSaleDis= new JLabel("Is In Sales");
        paymentOnlineretLabel=new JLabel("Is Payment Online");
        removeProductIDLabel = new JLabel("Store ID");
        loyaltyIDLabel=new JLabel("Store ID");



        // Font
        titleFont = new Font("Arial", Font.BOLD, 20);

// Text Fields
storeIdField1 = new JTextField();
storeIdField2 = new JTextField();
storeNameField1 = new JTextField(); 
storeNameField2 = new JTextField(); 
locationField1 = new JTextField();
locationField2 = new JTextField();
openingHourField1 = new JTextField();
openingHourField2 = new JTextField();
salesField1 = new JTextField();
salesField2 = new JTextField();
discountField1 = new JTextField();
discountField2 = new JTextField();
productNameField = new JTextField(); 
markedPriceField = new JTextField();
vatField = new JTextField();
vatLoyaltyField = new JTextField();
removeProductIDField = new JTextField();
IDDiscountField=new JTextField();
markedPricedisField=new JTextField();
loyaltyIDfield=new JTextField();

        // ComboBox
        String[] years = {"Years", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
            "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
            "2020", "2021", "2022", "2023", "2024"};
        purchasedYearComboBox = new JComboBox<>(years);

        // CheckBoxes
        paymentOnlineCheckBox1 = new JCheckBox("Yes");
        paymentOnlineCheckBox3 = new JCheckBox("Yes"); 
        inSalesCheckBox1 = new JCheckBox("Yes");

;

        // Buttons
        addDepartmentButton = new JButton("Add Department");
        addRetailerButton = new JButton("Add Retailer");
        calculateDiscountButton = new JButton("Calculate Discount");
        removeProductButton = new JButton("Remove Product");
        setLoyaltyPointsButton = new JButton("Set Loyalty Point");
        displayButton = new JButton("Display");
        clearButton = new JButton("Clear");
        displayDepartmentButton = new JButton("Display Department");
        displayRetailerButton = new JButton("Display Retailer");

        // Adding Panels
        add(departmentPanel);
        add(retailerPanel);
        add(discountPanel);
        add(removeProductPanel);
        add(loyaltyPanel);
        titleLabel.setFont(titleFont);

        // Adding Labels and TextFields
        departmentPanel.add(storeIdLabel1);
        departmentPanel.add(storeIdField1);
        departmentPanel.add(storeNameLabel1);
        departmentPanel.add(storeNameField1);
        departmentPanel.add(locationLabel1);
        departmentPanel.add(locationField1);
        departmentPanel.add(openingHourLabel1);
        departmentPanel.add(openingHourField1);
        departmentPanel.add(salesLabel1);
        departmentPanel.add(salesField1);
        departmentPanel.add(discountLabel1);
        departmentPanel.add(discountField1);
        departmentPanel.add(markedPriceLabel);
        departmentPanel.add(markedPriceField);
        departmentPanel.add(productNameLabel);
        departmentPanel.add(productNameField);
        departmentPanel.add(addDepartmentButton);
        departmentPanel.add(displayDepartmentButton);



        retailerPanel.add(storeIdLabel2);
        retailerPanel.add(storeIdField2);
        retailerPanel.add(storeNameLabel2);
        retailerPanel.add(storeNameField2);
        retailerPanel.add(locationLabel2);
        retailerPanel.add(locationField2);
        retailerPanel.add(openingHourLabel2);
        retailerPanel.add(openingHourField2);
        retailerPanel.add(salesLabel2);
        retailerPanel.add(salesField2);
        retailerPanel.add(discountLabel2);
        retailerPanel.add(discountField2);
        retailerPanel.add(vatLabel);
        retailerPanel.add(vatField);
        retailerPanel.add(paymentOnlineretLabel);
        retailerPanel.add(paymentOnlineCheckBox3);
        retailerPanel.add(purchasedYearLabel);
        retailerPanel.add(purchasedYearComboBox);
        retailerPanel.add(addRetailerButton);
        retailerPanel.add(displayRetailerButton);



        discountPanel.add(IDDiscount);
        discountPanel.add(IDDiscountField);
        discountPanel.add(markedPriceDiscountLabel);
        discountPanel.add(markedPricedisField);
        discountPanel.add(isInSaleDis);
        discountPanel.add(inSalesCheckBox1);
        discountPanel.add(calculateDiscountButton);


        

        removeProductPanel.add(removeProductIDLabel);
        removeProductPanel.add(removeProductIDField);
        removeProductPanel.add(removeProductButton);
        
        loyaltyPanel.add(loyaltyIDLabel);
        loyaltyPanel.add(loyaltyIDfield);
        loyaltyPanel.add(vatLoyaltyLabel);
        loyaltyPanel.add(vatLoyaltyField);
        loyaltyPanel.add(paymentOnlineLabel2);
        loyaltyPanel.add(paymentOnlineCheckBox1);

        loyaltyPanel.add(setLoyaltyPointsButton);

        // Button Listeners
        addDepartmentButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                     int id=Integer.parseInt(salesField1.getText());
                     if (id<0) {
                        JOptionPane.showMessageDialog(null, "ID must be a positive integer");
                        return;
                        
                     }
                     for(Store store:storeList)
                     {
                         if (store.getStoreId()==id)
                         {
                          JOptionPane.showInternalMessageDialog(null,"StoreID already added in arraylist, can't add again","Error",JOptionPane.ERROR_MESSAGE);
                          return;                         
                        }
                     }
                        String storeName=storeNameField1.getText();
                        String Location=locationField1.getText();
                        String openingHour=openingHourField1.getText();
                        double totalSales=Double.parseDouble(salesField1.getText());
                        double totalDiscount=Double.parseDouble(discountField1.getText());
                        String pName=productNameField.getText();
                        double mPrice=Double.parseDouble(markedPriceField.getText());
                        Department department = new Department(id, storeName, Location, openingHour, totalSales, totalDiscount, pName, mPrice);
                        storeList.add(department);
                        JOptionPane.showMessageDialog(null,"Department added successfully.");                
                }catch(NumberFormatException ee){
                    JOptionPane.showMessageDialog(rootPane,"Invalid Number format. please enter Valid Number.","Error!",JOptionPane.ERROR_MESSAGE);
                }

            }
            
        });


        
        
        addRetailerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    int id=Integer.parseInt(storeIdField2.getText());
                    if (id<0) {
                        JOptionPane.showMessageDialog(null, "ID must be a positive integer");
                        return;
                        
                    }
                    String storeName=storeNameField2.getText();
                    String Location=locationField2.getText();
                    String openingHour=openingHourField2.getText();
                    double totalSales=Double.parseDouble(salesField2.getText());
                    if (totalSales<0) {
                        JOptionPane.showMessageDialog(null, "total Sales must be a positive integer");
                        return;
                        
                    }
                    double totalDiscount=Double.parseDouble(discountField2.getText());
                    String pYear=(String) purchasedYearComboBox.getSelectedItem();
                    int VAT=Integer.parseInt(vatField.getText());
                    for(Store store:storeList){
                        if (store.getStoreId()==id)
                        {
                         JOptionPane.showInternalMessageDialog(null,"StoreID already added in arraylist, can't add again","Error",JOptionPane.ERROR_MESSAGE);
                         return;                         
                       }
                    }
                    Boolean isPayOn=null;
                    if (paymentOnlineCheckBox3.isSelected()) {
                        isPayOn=true;
                    }else{
                        isPayOn=false;
                    }

                    Retailer retailer=new Retailer(id, storeName, Location, openingHour, totalSales, totalDiscount,VAT,isPayOn,pYear);
                    storeList.add(retailer);
                    JOptionPane.showMessageDialog(null,"Retailer added successfully."); 
                
                }catch(NumberFormatException ee){
                    JOptionPane.showMessageDialog(rootPane,"Invalid Number format. please enter Valid Number.","Error!",JOptionPane.ERROR_MESSAGE);                    
                }catch(NullPointerException ea){
                    JOptionPane.showMessageDialog(rootPane,"Please select atleast one checkbox","Error!",JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }

            
        });

        
        
        calculateDiscountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    int id=Integer.parseInt(IDDiscountField.getText());
                    if (id<0) {
                        JOptionPane.showMessageDialog(null, "ID must be a positive integer");
                        return;
                        
                    }
                    Double mp=Double.parseDouble(markedPricedisField.getText());
                    if (mp<0) {
                        JOptionPane.showMessageDialog(null, "MP2 must be a positive integer");
                        return;
                        
                    }
                    Boolean sale=null;
                    if (inSalesCheckBox1.isSelected()) {
                        sale=true;
                        
                    }else{
                        sale=false;
                    }

                    for(Store store:storeList)
                    {
                        if (store instanceof Department) 
                        {
                            Department department=(Department) store;
                            if (id==store.getStoreId()) {
                                department.calculateDiscountPrice(sale, mp);
                                JOptionPane.showMessageDialog(rootPane, "Discount is calculated\n"+ "Discount is "+ department.getTotalDiscount());
                            } else{
                                JOptionPane.showMessageDialog(rootPane, "ID cant be found to calculate discount");
                                return;
                            }                           
                        }
                    }

                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, "Invalid number format");
                }catch(NullPointerException ex){
                    JOptionPane.showMessageDialog(rootPane, "Fill up all fields");
                    return;
                }
              
                
            }
        });

        removeProductButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    try{

                        int id=Integer.parseInt(removeProductIDField.getText());
                        if (id<0) {
                            JOptionPane.showMessageDialog(null, "ID must be a positive integer");
                            return;
                            
                        }
                        for(Store store:storeList){
                            if (store instanceof Retailer) {
                                Retailer retailer=(Retailer) store;
                                if (id==store.getStoreId()) {
                                    retailer.removeProduct();
                                    JOptionPane.showMessageDialog(rootPane, "Product with store "+id+" Removed sucessfully");                       
                                }else{
                                    JOptionPane.showMessageDialog(rootPane, "Product cant be removed because the id couldnot be found");
                                }
                                                            
                            }
                        }
    
    
                    }catch(NumberFormatException  ex){
                        JOptionPane.showMessageDialog(rootPane, "Invalid number format");                   
                    }
                    
                }
        });
        
        setLoyaltyPointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(loyaltyIDfield.getText()); // Corrected variable names
                    if (id<0) {
                        JOptionPane.showMessageDialog(null, "ID must be a positive integer");
                        return;
                        
                    }
                    int VAT = Integer.parseInt(vatLoyaltyField.getText()); // Corrected variable names
                    if (VAT<0) {
                        JOptionPane.showMessageDialog(null, "ID must be a positive integer");
                        return;
                        
                    }
                    Boolean paymentOnline = null;
                    if (paymentOnlineCheckBox1.isSelected()) { // Corrected variable names
                        paymentOnline = true;
                    } else {
                        paymentOnline = false;
                    }
        
                    for (Store store : storeList) {
                        if (store instanceof Retailer) {
                            Retailer retailer = (Retailer) store;
                            if (id == store.getStoreId()) {
                                retailer.setLoyaltyPoint(paymentOnline, VAT);
                                JOptionPane.showMessageDialog(rootPane, "Loyalty points are " + retailer.getLoyaltyPoint());
                            }
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Invalid number format");
                    return;
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Fill up all fields");
                    return;
                }
            }
        });
        
        
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display information about stores or departments
                StringBuilder displayInfoText = new StringBuilder();
                for (Store store : storeList) {
                    displayInfoText.append(store.toString()).append("\n"); // Assuming Store has a proper toString() method
                }
        
                if (displayInfoText.length() > 0) {
                    JOptionPane.showMessageDialog(null, displayInfoText.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No information available.");
                }
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all text fields
                departmentStoreIdField.setText("");
                departmentStoreNameField.setText("");
                departmentLocationField.setText("");
                departmentOpeningHourField.setText("");
                departmentSalesField.setText("");
                departmentDiscountField.setText("");
                retailerStoreIdField.setText("");
                retailerStoreNameField.setText("");
                retailerLocationField.setText("");
                retailerOpeningHourField.setText("");
                retailerSalesField.setText("");
                retailerDiscountField.setText("");
                calculateProductNameField.setText("");
                calculateMarkedPriceField.setText("");
                calculateVatField.setText("");
                setLoyaltyVatField.setText("");
                removeProductIDField.setText("");
        
                // Reset combo box to default value
                purchasedYearComboBox.setSelectedIndex(0);
        
            }
        });
        
        
        displayDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display department details
                StringBuilder displayDepartmentText = new StringBuilder();
                for (Store store : storeList) {
                    if (store instanceof Department) {
                        displayDepartmentText.append(store.toString()).append("\n"); // Assuming Store has a proper toString() method
                    }
                }
        
                if (displayDepartmentText.length() > 0) {
                    JOptionPane.showMessageDialog(null, displayDepartmentText.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No department details available.");
                }
            }
        });
        
        displayRetailerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display retailer details
                StringBuilder displayRetailerText = new StringBuilder();
                for (Store store : storeList) {
                    if (store instanceof Retailer) {
                        displayRetailerText.append(store.toString()).append("\n"); // Assuming Store has a proper toString() method
                    }
                }
        
                if (displayRetailerText.length() > 0) {
                    JOptionPane.showMessageDialog(null, displayRetailerText.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No retailer details available.");
                }
            }
        });
        

        // Adding Panels to JFrame
        add(departmentPanel);
        add(retailerPanel);
        add(discountPanel);
        add(removeProductPanel);
        add(loyaltyPanel);
        titleLabel.setBounds(600, 50, 600, 100);
        add(titleLabel);
        clearButton.setBounds(100, 765, 175, 30); // Adjust coordinates and size
        displayButton.setBounds(300, 765, 175, 30); // Adjust coordinates and size
        add(clearButton);
        add(displayButton);
        
        // Set Visibility
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new StoreGUI1();
    }
}
