import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class StoreGUI  {
  public static Boolean isDarkMode = true;
  //  Dark Mode colours
  public static Color mainColor;
  public static Color secondaryColor;
  public static Color lowOpaqColor;
  public static Color inputColor;
  public static Border border;
  public static Color textColor;
  public static Color comboboxBg;

  public static void applyDarkMode() {
    mainColor = new Color(20, 24, 36);
    secondaryColor = new Color(255, 182, 0);
    lowOpaqColor = new Color(155, 151, 151);
    inputColor = new Color(32, 39, 58);
    border = BorderFactory.createLineBorder(secondaryColor, 2);
    textColor = Color.WHITE;
    comboboxBg = new Color(238, 200, 112);
  }

  public static void applyLightMode() {
    mainColor = new Color(221, 237, 244);
    secondaryColor = new Color(17, 129, 178);
    lowOpaqColor = new Color(82, 87, 82);
    inputColor = new Color(188, 208, 215);
    border = BorderFactory.createLineBorder(secondaryColor, 2);
    textColor = new Color(33, 34, 33);
    comboboxBg = new Color(78, 168, 210, 255);
  }

  ArrayList<Store> list = new ArrayList<Store>();

  public static void inputContainer(GridBagConstraints gbc, JPanel panel, String type) {
    JLabel storeIdLbl = new JLabel("Id");
    storeIdLbl.setForeground(lowOpaqColor);
    storeIdLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel storeNameLbl = new JLabel("Name");
    storeNameLbl.setForeground(lowOpaqColor);
    storeNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel storeLocationLbl = new JLabel("Location");
    storeLocationLbl.setForeground(lowOpaqColor);
    storeLocationLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel storeTotalSaleLbl = new JLabel("Total sales");
    storeTotalSaleLbl.setForeground(lowOpaqColor);
    storeTotalSaleLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel storeTotalDiscountLbl = new JLabel("Total discount");
    storeTotalDiscountLbl.setForeground(lowOpaqColor);
    storeTotalDiscountLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel productNameLbl = new JLabel();

    if (type.equals("department")) {
      productNameLbl.setText("Product Name");
    } else if (type.equals("retailer")) {
      productNameLbl.setText("Vat Inclusive Price");
    }
    productNameLbl.setForeground(lowOpaqColor);
    productNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel markedPriceLbl = new JLabel("Marked price");
    markedPriceLbl.setForeground(lowOpaqColor);
    markedPriceLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    JLabel purchaseYearLbl = new JLabel("Purchase year");
    purchaseYearLbl.setForeground(lowOpaqColor);
    purchaseYearLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));

    JTextField storeIdTf = new JTextField(3);
    storeIdTf.setBackground(inputColor);
    storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
    storeIdTf.setForeground(textColor);
    JTextField storeNameTf = new JTextField();
    storeNameTf.setBackground(inputColor);
    storeNameTf.setForeground(textColor);
    storeNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
    JTextField storeLocationTf = new JTextField();
    storeLocationTf.setForeground(textColor);
    storeLocationTf.setBackground(inputColor);
    storeLocationTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
    JTextField storeTotalSaleTf = new JTextField();
    storeTotalSaleTf.setForeground(textColor);
    storeTotalSaleTf.setBackground(inputColor);
    storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
    JTextField storeTotalDiscountTf = new JTextField();
    storeTotalDiscountTf.setForeground(textColor);
    storeTotalDiscountTf.setBackground(inputColor);
    storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
    JTextField productNameTf = new JTextField();
    productNameTf.setForeground(textColor);
    productNameTf.setBackground(inputColor);
    productNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
    JTextField markedPriceTf = new JTextField();
    markedPriceTf.setForeground(textColor);
    markedPriceTf.setBackground(inputColor);
    markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));

    String[] openinghours = new String[13];
    openinghours[0] = "Opening Hour";
    for (int i = 1; i <= 12; i++) {
      openinghours[i] = String.format(i + " AM");
    }

    String[] closinghours = new String[13];
    closinghours[0] = "Closing Hour";
    for (int i = 1; i <= 12; i++) {
      closinghours[i] = String.format(i + " PM");
    }
    JComboBox openingHour = new JComboBox(openinghours);
    openingHour.setBackground(comboboxBg);
    openingHour.setBorder(BorderFactory.createEmptyBorder());
    JComboBox closingHour = new JComboBox(closinghours);
    closingHour.setBackground(comboboxBg);
    closingHour.setBorder(null);

    JButton addBtn = new JButton();
    addBtn.setFocusPainted(false);
    addBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    addBtn.setBorder(border);
    addBtn.setBackground(secondaryColor);
    addBtn.setForeground(mainColor);
    addBtn.setPreferredSize(new Dimension(100, 35));
    JButton clearBtn = new JButton("Clear");
    clearBtn.setFocusPainted(false);
    clearBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    clearBtn.setBorder(null);
    clearBtn.setBackground(null);
    clearBtn.setForeground(secondaryColor);
    clearBtn.setPreferredSize(new Dimension(10, 35));
    JButton calculateDiscount = new JButton("Calculate discount");
    calculateDiscount.setPreferredSize(new Dimension(150, 30));
    calculateDiscount.setFocusPainted(false);
    calculateDiscount.setCursor(new Cursor(Cursor.HAND_CURSOR));
    calculateDiscount.setBorder(border);
    calculateDiscount.setBackground(null);
    calculateDiscount.setForeground(secondaryColor);

    JCheckBox paymentOnlinee = new JCheckBox("Is payment online?");
    paymentOnlinee.setBackground(null);
    paymentOnlinee.setForeground(lowOpaqColor);
    paymentOnlinee.setBorder(null);
    paymentOnlinee.setFocusPainted(false);
    paymentOnlinee.setPreferredSize(new Dimension(100, 35));

//    Error Messages label
    JLabel storeIdErrorLbl = new JLabel();
    storeIdErrorLbl.setForeground(Color.RED);
    storeIdErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));
    JLabel storeNameErrorLbl = new JLabel();
    storeNameErrorLbl.setForeground(Color.RED);
    storeNameErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));
    JLabel storeLocationErrorLbl = new JLabel();
    storeLocationErrorLbl.setForeground(Color.RED);
    storeLocationErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));
    JLabel storeSalesErrorLbl = new JLabel();
    storeSalesErrorLbl.setForeground(Color.RED);
    storeSalesErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));
    JLabel storeDiscountErrorLbl = new JLabel();
    storeDiscountErrorLbl.setForeground(Color.RED);
    storeDiscountErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));
    JLabel storePNameErrorLbl = new JLabel();
    storePNameErrorLbl.setForeground(Color.RED);
    storePNameErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));
    JLabel storeMPriceErrorLbl = new JLabel();
    storeMPriceErrorLbl.setForeground(Color.RED);
    storeMPriceErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));

//    Purchase year combobox
    JComboBox<Integer> years = new JComboBox<>();
    years.setForeground(textColor);
    years.setBackground(inputColor);
    years.setBorder(null);
    for (int i = 2000; i < 2060; i++) {
      years.addItem(i);
    }


//    Store Id
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.ipady = 15;
    gbc.gridx = 0;
    gbc.gridy = 2;
    panel.add(storeIdLbl, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(storeIdTf, gbc);

    gbc.insets = new Insets(8, 5, -15, 5);
    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(storeIdErrorLbl, gbc);

//    Store Name
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridwidth = 2;
    gbc.gridx = 1;
    gbc.gridy = 2;
    panel.add(storeNameLbl, gbc);
    gbc.gridy = 3;
    panel.add(storeNameTf, gbc);
    gbc.insets = new Insets(8, 5, -15, 5);
    gbc.gridy = 4;
    panel.add(storeNameErrorLbl, gbc);

//    Opening Hour
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridwidth = 1;
    gbc.gridx = 3;
    gbc.gridy = 3;
    panel.add(openingHour, gbc);

//    Closing Hour
    gbc.gridx = 4;
    gbc.gridy = 3;
    panel.add(closingHour, gbc);

//    Location section
    gbc.gridx = 0;
    gbc.gridy = 5;
    gbc.gridwidth = 3;
    panel.add(storeLocationLbl, gbc);
    gbc.gridy = 6;
    panel.add(storeLocationTf, gbc);
    gbc.gridy = 7;
    gbc.insets = new Insets(8, 5, -15, 5);
    panel.add(storeLocationErrorLbl, gbc);

//    total sales section
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridy = 5;
    gbc.gridx = 3;
    panel.add(storeTotalSaleLbl, gbc);
    gbc.gridy = 6;
    panel.add(storeTotalSaleTf, gbc);
    gbc.gridy = 7;
    gbc.insets = new Insets(8, 5, -15, 5);
    panel.add(storeSalesErrorLbl, gbc);

//    total discount
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridy = 8;
    gbc.gridx = 0;
    panel.add(storeTotalDiscountLbl, gbc);
    gbc.gridy = 9;
    panel.add(storeTotalDiscountTf, gbc);
    gbc.gridy = 10;
    gbc.insets = new Insets(8, 5, -15, 5);
    panel.add(storeDiscountErrorLbl, gbc);

//    Product name
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridy = 8;
    gbc.gridx = 3;
    panel.add(productNameLbl, gbc);
    gbc.gridy = 9;
    panel.add(productNameTf, gbc);
    gbc.gridy = 10;
    gbc.insets = new Insets(8, 5, -15, 5);
    panel.add(storePNameErrorLbl, gbc);

//    marked Price
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridx = 0;
    gbc.gridy = 11;
    panel.add(markedPriceLbl, gbc);
    gbc.gridy = 12;
    panel.add(markedPriceTf, gbc);

    gbc.gridy = 13;
    gbc.insets = new Insets(8, 5, -15, 5);
    panel.add(storeMPriceErrorLbl, gbc);

    if ("retailer".equals(type)){
      gbc.gridx = 3;
      gbc.gridy = 11;
      panel.add(purchaseYearLbl, gbc);
      gbc.gridy = 12;
      panel.add(years,gbc);
      addBtn.setText("Add Retailer");
    } else if ("department".equals(type)) {
      addBtn.setText("Add Department");
    }

//    Is paymnet Online
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridy = 14;
    gbc.gridx = 0;
    panel.add(paymentOnlinee, gbc);

//    Call to action buttons
    gbc.ipady = 2;
    gbc.gridwidth = 1;
    gbc.gridy = 15;
    gbc.gridx = 2;
    panel.add(clearBtn, gbc);
    gbc.gridx = 3;
    panel.add(calculateDiscount, gbc);
    gbc.gridx = 4;
    panel.add(addBtn, gbc);

    addBtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Boolean isValid = false;
        String storeId = (String) storeIdTf.getText();
        String storeName = (String) storeNameTf.getText();
        String location = (String) storeLocationTf.getText();
        String totalSale = (String) storeTotalSaleTf.getText();
        String totalDiscount = (String) storeTotalDiscountTf.getText();
        String productName = (String) productNameTf.getText();
        String markedPrice = (String) markedPriceTf.getText();
        Boolean isPayment = (Boolean) paymentOnlinee.isSelected();
        String open = (String) openingHour.getSelectedItem();
        String close = (String) closingHour.getSelectedItem();

        if((markedPrice == null || markedPrice.length() == 0) &&
                (productName == null || productName.length() == 0) &&
                (totalDiscount == null || totalDiscount.length() == 0) &&
                (totalSale == null || totalSale.length() == 0) &&
                (location == null || location.length() == 0) &&
                (storeName == null || storeName.length() == 0) &&
                (storeId == null || storeId.length() == 0)
        ){
          JOptionPane.showMessageDialog(panel, "Please fill all the fields", "Empty input field error!!", JOptionPane.ERROR_MESSAGE);
        }else{
          if (storeId == null || storeId.length() == 0) {
            storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeIdErrorLbl.setText("Invalid store id!!");
            isValid = false;
          } else {
            storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storeIdErrorLbl.setText("");
            isValid = true;
          }

          if (storeName == null || storeName.length() == 0) {
            storeNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeNameErrorLbl.setText("Invalid store name!!");
            isValid = false;
          } else {
            storeNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storeNameErrorLbl.setText("");
            isValid = true;
          }

          if (location == null || location.length() == 0) {
            storeLocationTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeLocationErrorLbl.setText("Invalid store location!!");
            isValid = false;
          } else {
            storeLocationTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storeLocationErrorLbl.setText("");
            isValid = true;
          }

          if (totalSale == null || totalSale.length() == 0) {
            storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeSalesErrorLbl.setText("Invalid store sale amount!!");
            isValid = false;
          } else {
            storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storeSalesErrorLbl.setText("");
            isValid = true;
          }

          if (totalDiscount == null || totalDiscount.length() == 0) {
            storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeDiscountErrorLbl.setText("Invalid store discount!!");
            isValid = false;
          } else {
            storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storeDiscountErrorLbl.setText("");
            isValid = true;
          }

          if (productName == null || productName.length() == 0) {
            productNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storePNameErrorLbl.setText("Invalid product name!!");
            isValid = false;
          } else {
            productNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storePNameErrorLbl.setText("");
            isValid = true;
          }

          if (markedPrice == null || markedPrice.length() == 0) {
            markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeMPriceErrorLbl.setText("Invalid marked price!!");
            isValid = false;
          } else {
            markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
            storeMPriceErrorLbl.setText("");
            isValid = true;
          }
          if (isValid) {
            JOptionPane.showMessageDialog(panel, "Thank you for adding!!", "Success!!", JOptionPane.INFORMATION_MESSAGE);
          }
        }

      }
    });
  }

  public static void retailerContainer(Boolean visiblity){
    JFrame frame = new JFrame("Store | Retailer");
    frame.setSize(850, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    panel.setOpaque(true);
    panel.setBackground(mainColor);
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    panel.setLayout(layout);
    panel.setBorder(new EmptyBorder(30, 30, 30, 30));
    JLabel title  = new JLabel("Retailer");
    title.setForeground(textColor);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0,0,2 ,0,textColor));

    String[] btns = {"Department", "Retailer", "Records"};

    JButton allRecordsBtns = new JButton();
    allRecordsBtns.setFocusPainted(false);
    allRecordsBtns.setBackground(null);
    allRecordsBtns.setForeground(null);
    allRecordsBtns.setBorder(null);
    allRecordsBtns.setEnabled(false);

    gbc.fill = GridBagConstraints.BOTH;
    gbc.anchor = GridBagConstraints.PAGE_START;
    gbc.insets = new Insets(0, 0, 20, 0);

    gbc.weightx = 1;
    gbc.weighty = 0;
    gbc.gridwidth = 5;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.ipady = 25;
    panel.add(title, gbc);
    gbc.ipady = 0;
    for (int i = 0; i < btns.length; i++) {
      JButton btn = new JButton(btns[i]);
      btn.setFocusPainted(false);
      btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn.setBorder(BorderFactory.createLineBorder(textColor, 2));
      btn.setBackground(null);
      btn.setForeground(textColor);
      btn.setPreferredSize(new Dimension(50, 35));
      if (btn.getText().equals("Retailer")) {
        btn.setBackground(textColor);
        btn.setForeground(mainColor);
      }
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Department")){
            frame.setVisible(false);
            departmentContainer(true);
          } else if (btn.getText().equals("Records")) {
            frame.setVisible(false);
            recordsContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.insets = new Insets(0, 0, 30, 0);
      panel.add(btn, gbc);
    }

    gbc.gridy = 1;
    gbc.gridx = 3;
    panel.add(allRecordsBtns, gbc);

    inputContainer(gbc, panel, "retailer");

    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(visiblity);
  }
  public static void recordsContainer(Boolean visibility) {
    JFrame frame = new JFrame("Store | All records");
    frame.setSize(1100, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Top panel for title and buttons
    JPanel topPanel = new JPanel(new GridBagLayout());
    topPanel.setOpaque(true);
    topPanel.setBackground(mainColor);
    GridBagConstraints gbc = new GridBagConstraints();
    topPanel.setBorder(new EmptyBorder(30, 30, 30, 30));

    JLabel title = new JLabel("All Records");
    title.setForeground(textColor);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, textColor));

    String[] btns = {"Department", "Retailer", "Records"};

    gbc.fill = GridBagConstraints.BOTH;
    gbc.anchor = GridBagConstraints.PAGE_START;
    gbc.insets = new Insets(0, 0, 20, 0);

    gbc.weightx = 1.0;
    gbc.weighty = 0;
    gbc.gridwidth = 5;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.ipady = 25;
    topPanel.add(title, gbc);

    gbc.ipady = 0;
    for (int i = 0; i < btns.length; i++) {
      JButton btn = new JButton(btns[i]);
      btn.setFocusPainted(false);
      btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn.setBorder(BorderFactory.createLineBorder(textColor, 2));
      btn.setBackground(null);
      btn.setForeground(textColor);
      btn.setPreferredSize(new Dimension(50, 35));
      if (btn.getText().equals("Records")) {
        btn.setBackground(textColor);
        btn.setForeground(mainColor);
      }
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Retailer")) {
            frame.setVisible(false);
            retailerContainer(true);
          } else if (btn.getText().equals("Department")) {
            frame.setVisible(false);
            departmentContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.insets = new Insets(0, 0, 5, 0);
      topPanel.add(btn, gbc);
    }
    JButton dummyBtn = new JButton();
    dummyBtn.setFocusPainted(false);
    dummyBtn.setBackground(null);
    dummyBtn.setForeground(null);
    dummyBtn.setBorder(null);
    dummyBtn.setEnabled(false);
    gbc.gridx = 3;
    topPanel.add(dummyBtn, gbc);

    JButton dummyBtnTwo = new JButton();
    dummyBtnTwo.setFocusPainted(false);
    dummyBtnTwo.setBackground(null);
    dummyBtnTwo.setForeground(null);
    dummyBtnTwo.setBorder(null);
    dummyBtnTwo.setEnabled(false);
    gbc.gridx = 4;
    topPanel.add(dummyBtnTwo, gbc);

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(mainColor);
    bottomPanel.setBorder(null);
    String[][] data = {
            {"1", "Walmart", "New York", "9am", "9pm", "50000", "5000", "Laptop", "700", "Electronics", "2021", "7%"},
            {"2", "Target", "Los Angeles", "8am", "10pm", "40000", "3000", "Tablet", "300", "Electronics", "2022", "7%"},
            {"3", "Best Buy", "Chicago", "10am", "8pm", "60000", "4000", "Smartphone", "800", "Electronics", "2021", "7%"},
            {"4", "Costco", "Houston", "9am", "9pm", "70000", "5000", "TV", "1200", "Electronics", "2023", "7%"},
            {"5", "Home Depot", "Phoenix", "7am", "9pm", "80000", "6000", "Washing Machine", "600", "Home Appliances", "2020", "7%"},
            {"6", "Kroger", "Philadelphia", "8am", "10pm", "90000", "7000", "Refrigerator", "1000", "Home Appliances", "2019", "7%"},
            {"7", "Walgreens", "San Antonio", "9am", "9pm", "100000", "8000", "Microwave", "200", "Home Appliances", "2018", "7%"},
            {"8", "CVS", "San Diego", "8am", "10pm", "110000", "9000", "Blender", "100", "Home Appliances", "2021", "7%"},
            {"9", "Safeway", "Dallas", "7am", "9pm", "120000", "10000", "Oven", "500", "Home Appliances", "2022", "7%"},
            {"10", "Whole Foods", "San Jose", "9am", "9pm", "130000", "11000", "Vacuum Cleaner", "300", "Home Appliances", "2020", "7%"}
    };

    String[] columnNames = {"Store Id", "Name", "Location", "Opening Hour", "Closing hour", "Sales", "Discount", "Product name", "Marked price", "Type", "Purchase Year", "VAT"};
    JTable datas = new JTable(data, columnNames);
    datas.setBackground(mainColor);
    datas.setForeground(textColor);
    datas.setGridColor(textColor);

    JTableHeader header = datas.getTableHeader();
    header.setPreferredSize(new Dimension(20, 35));
    header.setBackground(secondaryColor);
    header.setForeground(mainColor);
    header.setFont(new Font("Rockwell", Font.BOLD, 12));

    JScrollPane sp = new JScrollPane(datas);
    sp.setBackground(mainColor);
    sp.getViewport().setBackground(mainColor);
    sp.setBorder(BorderFactory.createEmptyBorder(0,25,20,25));
    bottomPanel.add(sp, BorderLayout.CENTER);

    // Add panels to the frame
    frame.add(topPanel, BorderLayout.NORTH);
    frame.add(bottomPanel, BorderLayout.CENTER);
    frame.setLocationRelativeTo(null);
    frame.setVisible(visibility);
  }

  public static void departmentContainer(Boolean visiblity){
    JFrame frame = new JFrame("Store | Department");
    frame.setSize(850, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel theme = new JLabel("Dark mode", JLabel.RIGHT);
    theme.setForeground(textColor);
    theme.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, textColor));
    theme.setCursor(new Cursor(Cursor.HAND_CURSOR));
    theme.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if(theme.getText().equals("Dark mode")){
          theme.setText("Light mode");
          isDarkMode = false;
        }else{
          theme.setText("Dark mode");
          isDarkMode = true;
        }
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        theme.setForeground(secondaryColor);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        theme.setForeground(textColor);
      }
    });

    JPanel panel = new JPanel();
    panel.setOpaque(true);
    panel.setBackground(mainColor);
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    panel.setLayout(layout);
    panel.setSize(700, 700);
    panel.setBorder(new EmptyBorder(30, 30, 30, 30));
    JLabel title  = new JLabel("Department");
    title.setForeground(textColor);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0,0,2 ,0,textColor));

    String[] btns = {"Department", "Retailer", "Records"};

    JButton allRecordsBtns = new JButton();
    allRecordsBtns.setFocusPainted(false);
    allRecordsBtns.setBackground(null);
    allRecordsBtns.setForeground(null);
    allRecordsBtns.setBorder(null);
    allRecordsBtns.setEnabled(false);

    gbc.fill = GridBagConstraints.BOTH;
    gbc.anchor = GridBagConstraints.PAGE_START;
    gbc.insets = new Insets(10,0,10,0);
    gbc.weightx = 1.0;
    gbc.weighty = 0;
    gbc.gridwidth = 4;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.ipady = 35;
    panel.add(title, gbc);
    gbc.gridx = 4;
    panel.add(theme, gbc);
    gbc.ipady = 0;
    for (int i = 0; i < btns.length; i++) {
      JButton btn = new JButton(btns[i]);
      btn.setFocusPainted(false);
      btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn.setBorder(BorderFactory.createLineBorder(textColor, 2));
      btn.setBackground(null);
      btn.setForeground(textColor);
      btn.setPreferredSize(new Dimension(50, 35));
      if (btn.getText().equals("Department")) {
        btn.setBackground(textColor);
        btn.setForeground(mainColor);
      }
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Retailer")){
            frame.setVisible(false);
            retailerContainer(true);
          } else if (btn.getText().equals("Records")) {
            frame.setVisible(false);
            recordsContainer(true);
          }
        }
      });
      gbc.insets = new Insets(10,0,10,0);
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      panel.add(btn, gbc);
    }
    gbc.insets = new Insets(10,10,10,10);
    gbc.gridy = 1;
    gbc.gridx = 3;
    panel.add(allRecordsBtns, gbc);
    inputContainer(gbc, panel, "department");
    frame.add(panel, BorderLayout.CENTER);
    frame.setLocationRelativeTo(null);
    frame.setVisible(visiblity);
  }

  //  Home page
  public void homePage() {
    JFrame frame = new JFrame("Shop | Home");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    JPanel headText = new JPanel();
    headText.setSize(400, 300);

    JLabel headLabel = new JLabel("<html><center>Hey! User</center>Welcome to our Shop!</html>");
    headLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
    headLabel.setForeground(textColor);

    JLabel paragraphLabel = new JLabel("<html>Welcome to our shop, Your One-Stop Destination for <center> Unique Finds and Everyday Essentials</center><html>");
    paragraphLabel.setForeground(lowOpaqColor);
    paragraphLabel.setFont(new Font("Arial", Font.PLAIN, 15));

    JButton getStartedButton = new JButton("Get Started ➙");
    getStartedButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    getStartedButton.setPreferredSize(new Dimension(250, 38));
    getStartedButton.setBackground(secondaryColor);
    getStartedButton.setForeground(Color.BLACK);

    getStartedButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        departmentContainer(true);
      }
    });

    getStartedButton.setBorder(border);
    getStartedButton.setFocusPainted(false);

    JPanel panel = new JPanel();
    panel.setLayout(layout);
    panel.setOpaque(true);
    panel.setBackground(mainColor);

    gbc.gridwidth = 2;
    panel.add(headLabel, gbc);
    gbc.insets = new Insets(10, 0, 10, 0);
    gbc.gridy = 1;
    panel.add(paragraphLabel, gbc);
    gbc.gridy = 2;
    gbc.insets = new Insets(20, 0, 10, 0);
    panel.add(getStartedButton, gbc);
    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    StoreGUI storeGUI = new StoreGUI();
    if(isDarkMode){
      applyDarkMode();
    }else{
      applyLightMode();
    }
    storeGUI.homePage();
  }
}