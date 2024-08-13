import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class StoreGUI  {
  public static boolean isDarkMode = true;
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

  public static ArrayList<Store> storeList = new ArrayList<>();

  public static void moreMenuBtns(JComboBox values, Frame frame){
    values.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(values.getSelectedItem().toString().equals("Department record")){
          frame.setVisible(false);
          retailerRecordsContainer(false);
          departmentRecordsContainer(true);

        }else if(values.getSelectedItem().toString().equals("Retailer record")){
          frame.setVisible(false);
          departmentRecordsContainer(false);
          retailerRecordsContainer(true);

        }
      }
    });
  }
  public static void inputContainer(GridBagConstraints gbc, JPanel panel, String type) {
    JLabel storeIdLbl = new JLabel("Id *");
    storeIdLbl.setForeground(lowOpaqColor);
    storeIdLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
    JLabel storeNameLbl = new JLabel("Name *");
    storeNameLbl.setForeground(lowOpaqColor);
    storeNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
    JLabel storeLocationLbl = new JLabel("Location *");
    storeLocationLbl.setForeground(lowOpaqColor);
    storeLocationLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
    JLabel storeTotalSaleLbl = new JLabel("Total sales *");
    storeTotalSaleLbl.setForeground(lowOpaqColor);
    storeTotalSaleLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
    JLabel storeTotalDiscountLbl = new JLabel("Total discount *");
    storeTotalDiscountLbl.setForeground(lowOpaqColor);
    storeTotalDiscountLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
    JLabel productNameLbl = new JLabel("Product Name *");
    productNameLbl.setForeground(lowOpaqColor);
    productNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));

    JLabel vatIncPriceLbl = new JLabel("Vat Inclusive Price *");
    vatIncPriceLbl.setForeground(lowOpaqColor);
    vatIncPriceLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));

    JLabel markedPriceLbl = new JLabel("Marked price *");
    markedPriceLbl.setForeground(lowOpaqColor);
    markedPriceLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
    JLabel purchaseYearLbl = new JLabel("Purchase year *");
    purchaseYearLbl.setForeground(lowOpaqColor);
    purchaseYearLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));

    JLabel loyaltyPointLbl = new JLabel("Loyalty Point");
    loyaltyPointLbl.setForeground(lowOpaqColor);
    loyaltyPointLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));

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

    JTextField vatIncPriceTf = new JTextField();
    vatIncPriceTf.setForeground(textColor);
    vatIncPriceTf.setBackground(inputColor);
    vatIncPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));

    JTextField markedPriceTf = new JTextField();
    markedPriceTf.setForeground(textColor);
    markedPriceTf.setBackground(inputColor);
    markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));

    JTextField loyaltyPointTf = new JTextField();
    loyaltyPointTf.setForeground(textColor);
    loyaltyPointTf.setBackground(inputColor);
    loyaltyPointTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));

    String[] openinghours = new String[25];
    openinghours[0] = "Opening Hour";
    for (int i = 1; i <= 24; i++) {
      if (i>=12){
        openinghours[i] = String.format(i + " PM");
      }else{
        openinghours[i] = String.format(i + " AM");
      }
    }

    String[] closinghours = new String[25];
    closinghours[0] = "Closing Hour";
    for (int i = 1; i <= 24; i++) {
      if (i>=12){
        closinghours[i] = String.format(i + " PM");
      }else{
        closinghours[i] = String.format(i + " AM");
      }
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
    JButton setLoyaltyPoint = new JButton("Set Loyalty");
    setLoyaltyPoint.setFocusPainted(false);
    setLoyaltyPoint.setCursor(new Cursor(Cursor.HAND_CURSOR));
    setLoyaltyPoint.setBorder(border);
    setLoyaltyPoint.setBackground(secondaryColor);
    setLoyaltyPoint.setForeground(mainColor);
    setLoyaltyPoint.setPreferredSize(new Dimension(100, 30));
    JButton removeProduct = new JButton("Remove product");
    removeProduct.setPreferredSize(new Dimension(100, 30));
    removeProduct.setFocusPainted(false);
    removeProduct.setCursor(new Cursor(Cursor.HAND_CURSOR));
    removeProduct.setBorder(border);
    removeProduct.setBackground(null);
    removeProduct.setForeground(secondaryColor);

    JCheckBox salesPaymentOption = new JCheckBox("DEPARTMENT".equals(type.toUpperCase())?"Is in sale":"Is payment online");
    salesPaymentOption.setBackground(null);
    salesPaymentOption.setForeground(lowOpaqColor);
    salesPaymentOption.setBorder(null);
    salesPaymentOption.setFocusPainted(false);
    salesPaymentOption.setPreferredSize(new Dimension(100, 35));

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
    JLabel vatIncPriceErrorLbl = new JLabel();
    vatIncPriceErrorLbl.setForeground(Color.RED);
    vatIncPriceErrorLbl.setFont(new Font("Arial", Font.PLAIN, 10));

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

//    Product name/vat inc price
    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridy = 8;
    gbc.gridx = 3;
    if ("DEPARTMENT".equals(type.toUpperCase())){
      panel.add(productNameLbl, gbc);
      gbc.gridy = 9;
      panel.add(productNameTf, gbc);
      gbc.gridy = 10;
      gbc.insets = new Insets(8, 5, -15, 5);
      panel.add(storePNameErrorLbl, gbc);
    }else{
      panel.add(vatIncPriceLbl, gbc);
      gbc.gridy = 9;
      panel.add(vatIncPriceTf, gbc);
      gbc.gridy = 10;
      gbc.insets = new Insets(8, 5, -15, 5);
      panel.add(vatIncPriceErrorLbl, gbc);
    }

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
      gbc.gridy = 11;
      gbc.gridx = 3;
      panel.add(loyaltyPointLbl, gbc);
      gbc.gridwidth = 1;
      gbc.gridy = 12;
      gbc.gridx = 3;
      panel.add(loyaltyPointTf, gbc);
      gbc.gridx = 4;
      gbc.gridy = 11;
      panel.add(purchaseYearLbl, gbc);
      gbc.gridy = 12;
      panel.add(years,gbc);
      addBtn.setText("Add Retailer");
    } else if ("department".equals(type)) {
      addBtn.setText("Add Department");
    }

//    Is paymnet Online
    gbc.insets = new Insets(15, 5, -15, 5);    gbc.insets = new Insets(15, 5, -15, 5);
    gbc.gridy = 14;
    gbc.gridx = 0;
    panel.add(salesPaymentOption, gbc);

//    Call to action buttons
    gbc.insets = new Insets(30, 5, 10, 5);
    if ("DEPARTMENT".equals(type.toUpperCase())){
      gbc.ipady = 2;
      gbc.gridwidth = 1;
      gbc.gridy = 15;
      gbc.gridx = 2;
      panel.add(clearBtn, gbc);
      gbc.gridx = 3;
      panel.add(calculateDiscount, gbc);
    }else if("RETAILER".equals(type.toUpperCase())){
      gbc.gridwidth = 1;
      gbc.ipady = 2;
      gbc.gridy = 15;
      gbc.gridx = 1;
      panel.add(clearBtn, gbc);
      gbc.gridx = 2;
      panel.add(removeProduct, gbc);
      gbc.gridx = 3;
      panel.add(setLoyaltyPoint, gbc);
    }

    gbc.gridx = 4;
    panel.add(addBtn, gbc);

    clearBtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        storeIdTf.setText("");
        storeNameTf.setText("");
        storeNameErrorLbl.setText("");
        storeLocationTf.setText("");
        storeLocationErrorLbl.setText("");
        productNameTf.setText("");
        markedPriceTf.setText("");
        vatIncPriceTf.setText("");
        storeTotalSaleTf.setText("");
        storeTotalDiscountTf.setText("");
        storeDiscountErrorLbl.setText("");
        storeTotalSaleTf.setText("");
        storeSalesErrorLbl.setText("");
        storeTotalDiscountTf.setText("");
        storeSalesErrorLbl.setText("");
      }
    });
    addBtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        boolean isValid = true;
        String storeId = (String) storeIdTf.getText();
        String storeName = (String) storeNameTf.getText();
        String location = (String) storeLocationTf.getText();
        String totalSale = (String) storeTotalSaleTf.getText();
        String totalDiscount = (String) storeTotalDiscountTf.getText();
        String productName = (String) productNameTf.getText();
        String markedPrice = (String) markedPriceTf.getText();
        String vatIncPrice = (String) vatIncPriceTf.getText();
        boolean isPayment = (boolean) salesPaymentOption.isSelected();
        String open = (String) openingHour.getSelectedItem();
        String close = (String) closingHour.getSelectedItem();

        //validating store id
        boolean isIdNumber = true;
        try {
          Integer.parseInt(storeId);
        } catch (Exception _) {
          isIdNumber = false;
        }

        //validating totalSale
        boolean isTotalSaleNumber = true;
        try {
          Integer.parseInt(totalSale);
        } catch (Exception _) {
          isTotalSaleNumber = false;
        }

        //validating total discount
        boolean isTotalDiscountNumber = true;
        try {
          Integer.parseInt(totalDiscount);
        } catch (Exception _) {
          isTotalDiscountNumber = false;
        }

        //validating marked price
        boolean isMarkedPriceNumber = true;
        try {
          Integer.parseInt(markedPrice);
        } catch (Exception _) {
          isMarkedPriceNumber = false;
        }

        //validating vatIncPrice price
        boolean isVatIncPriceNumber = true;
        try {
          Integer.parseInt(vatIncPrice);
        } catch (Exception _) {
          isVatIncPriceNumber = false;
        }

        if ((markedPrice == null || markedPrice.isEmpty()) &&
                (productName == null || productName.isEmpty()) &&
                (totalDiscount == null || totalDiscount.isEmpty()) &&
                (totalSale == null || totalSale.isEmpty()) &&
                (location == null || location.isEmpty()) &&
                (storeName == null || storeName.isEmpty()) &&
                (storeId == null || storeId.isEmpty())
        ) {
          JOptionPane.showMessageDialog(panel, "Please fill all the fields", "Empty input field error!!", JOptionPane.ERROR_MESSAGE);
        } else {
          if (storeId == null || storeId.isEmpty()) {
            storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeIdErrorLbl.setText("Invalid store id!!");
            isValid = false;
          } else {
            if (isIdNumber) {
              storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
              storeIdErrorLbl.setText("");

            } else {
              storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              storeIdErrorLbl.setText("Enter number only!");
              isValid = false;
            }
          }

          if (openinghours[0].equals(open) || closinghours[0].equals(close)) {
            JOptionPane.showMessageDialog(panel, "Please choose opening and closing hour", "Hour option error!!", JOptionPane.ERROR_MESSAGE);
            openingHour.setBackground(Color.RED);
            closingHour.setBackground(Color.RED);
            openingHour.setForeground(Color.WHITE);
            closingHour.setForeground(Color.WHITE);
            isValid = false;
          } else {
            openingHour.setBackground(comboboxBg);
            closingHour.setBackground(comboboxBg);
            openingHour.setForeground(mainColor);
            closingHour.setForeground(mainColor);

          }

          if (storeName == null || storeName.isEmpty()) {
            storeNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeNameErrorLbl.setText("Invalid store name!!");
            isValid = false;
          } else {
            storeNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
            storeNameErrorLbl.setText("");

          }


          if (location == null || location.isEmpty()) {
            storeLocationTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeLocationErrorLbl.setText("Invalid store location!!");
            isValid = false;
          } else {
            storeLocationTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
            storeLocationErrorLbl.setText("");

          }


          if (totalSale == null || totalSale.isEmpty()) {
            storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeSalesErrorLbl.setText("Invalid store sale amount!!");
            isValid = false;
          } else {
            if (isTotalSaleNumber) {
              storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
              storeSalesErrorLbl.setText("");

            } else {
              storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              storeSalesErrorLbl.setText("Invalid input enter sales in number!!");
              isValid = false;
            }
          }


          if (totalDiscount == null || totalDiscount.isEmpty()) {
            storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeDiscountErrorLbl.setText("Invalid store discount!!");
            isValid = false;
          } else {
            if (isTotalDiscountNumber) {
              storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
              storeDiscountErrorLbl.setText("");

            } else {
              storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              storeDiscountErrorLbl.setText("Invalid input enter discount in number!!");
              isValid = false;
            }
          }

          if("DEPARTMENT".equals(type.toUpperCase())) {
            if (productName == null || productName.isEmpty()) {
              productNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              storePNameErrorLbl.setText("Invalid product name!!");
              isValid = false;
            } else {
              productNameTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
              storePNameErrorLbl.setText("");

            }
          }
          if("RETAILER".equals(type.toUpperCase())){
            if (vatIncPrice == null || vatIncPrice.isEmpty()) {
              vatIncPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              vatIncPriceErrorLbl.setText("Invalid Vat Inc price!!");
              isValid = false;
            } else {
              if (!isVatIncPriceNumber) {
                vatIncPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                vatIncPriceErrorLbl.setText("Invalid input enter vat in number!!");
                isValid = false;
              } else {
                vatIncPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
                vatIncPriceErrorLbl.setText("");
              }
            }
          }



          if (markedPrice.isEmpty()) {
            markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeMPriceErrorLbl.setText("Invalid marked price!!");
            isValid = false;
          } else {
            if (!isMarkedPriceNumber) {
              markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              storeMPriceErrorLbl.setText("Invalid input enter marked price in number!!");
              isValid = false;
            } else {
              markedPriceTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
              storeMPriceErrorLbl.setText("");
            }
          }


          if (!isValid) {
            JOptionPane.showMessageDialog(panel, "Please fill all the fields", "Empty input field error!!", JOptionPane.ERROR_MESSAGE);
          } else {
            boolean storeExists = false;

            // Check if the store ID already exists
            for (Store data : storeList) {
              if (data.getStoreId() == Integer.parseInt(storeId)) {
                storeExists = true;
                break;
              }
            }

            if (storeExists) {
              storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
              storeIdErrorLbl.setText("Store id exists!!");
            } else {
              storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
              storeIdErrorLbl.setText("");

              if ("DEPARTMENT".equals(type.toUpperCase())) {
                storeList.add(new Department(
                        Integer.parseInt(storeId),
                        storeName,
                        location,
                        open + " to " + close,
                        Double.parseDouble(totalSale),
                        Double.parseDouble(totalDiscount),
                        productName,
                        Double.parseDouble(markedPrice)
                ));
                JOptionPane.showMessageDialog(panel, "Thank you for adding department!!", "Success!!", JOptionPane.INFORMATION_MESSAGE);
              } else if ("RETAILER".equals(type.toUpperCase())) {
                Integer selectedYear = (Integer) years.getSelectedItem();
                storeList.add(new Retailer(
                        Integer.parseInt(storeId),
                        storeName,
                        location,
                        open + " to " + close,
                        Double.parseDouble(totalSale),
                        Double.parseDouble(totalDiscount),
                        Integer.parseInt(vatIncPrice),
                        isPayment,
                        String.valueOf(selectedYear)
                ));
                JOptionPane.showMessageDialog(panel, "Thank you for adding retailer!!", "Success!!", JOptionPane.INFORMATION_MESSAGE);
              }
            }
          }
        }
      }
    });

    setLoyaltyPoint.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        if (storeList.isEmpty()) {
          JOptionPane.showMessageDialog(panel, "No records in the list to calculate loyalty points!!", "404 Not found!", JOptionPane.ERROR_MESSAGE);
        }else{
          boolean isIdAvailable = false;
          boolean isInstance = false;
          for (Store data : storeList) {
            if (data instanceof Retailer) {
              isInstance = true;
              if (storeIdTf.getText() == null || storeIdTf.getText().isEmpty()) {
                storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                storeIdErrorLbl.setText("Invalid store id!!");
              } else {
                boolean isIdNumber = true;
                try {
                  Integer.parseInt(storeIdTf.getText());
                } catch (Exception _) {
                  isIdNumber = false;
                }
                if (isIdNumber) {
                  storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
                  storeIdErrorLbl.setText("");
                  if (String.valueOf(data.getStoreId()).equals(storeIdTf.getText())) {
                    isIdAvailable = true;
                    ((Retailer) data).setLoyaltyPoints(((Retailer) data).isPaymentOnline(), ((Retailer) data).getVatInclusivePrice());
                    JOptionPane.showMessageDialog(panel, ((Retailer) data).getLoyaltyPoints() + " loyalty points has ben added successfully!", "Success!", JOptionPane.NO_OPTION);
                  }
                } else {
                  storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                  storeIdErrorLbl.setText("Enter number only!");
                }
              }
            }
          }
          if(!isInstance){
            JOptionPane.showMessageDialog(panel, "No retailer records in the list to calculate loyalty points!!", "404 Not found!", JOptionPane.ERROR_MESSAGE);
          }
          if (isIdAvailable) {
            storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lowOpaqColor));
            storeIdErrorLbl.setText("");
          }else{
            storeIdTf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            storeIdErrorLbl.setText("Id not found!");
          }
        }
      }
    });
    calculateDiscount.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (Store data : storeList) {
          if (data instanceof Department){
            ((Department) data).calculateDiscountPrice(Double.parseDouble(String.valueOf(((Department) data).getMarkedPrice())), salesPaymentOption.isSelected());
            System.out.println(data.getTotalDiscount());
          }
        }
      }
    });
  }

  public static void retailerContainer(boolean visibility){
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

    JLabel theme = new JLabel("Dark mode", JLabel.RIGHT);
    theme.setForeground(textColor);
    theme.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, textColor));
    theme.setCursor(new Cursor(Cursor.HAND_CURSOR));

    JLabel title  = new JLabel("Retailer");
    title.setForeground(textColor);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0,0,2 ,0,textColor));

    theme.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (isDarkMode){
          applyLightMode();
          theme.setText("Light mode");
          isDarkMode = false;
        }else{
          applyDarkMode();
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

    if(isDarkMode){
      theme.setText("Dark mode");
      applyDarkMode();
    }else{
      theme.setText("Light mode");
      applyLightMode();
    }
    String[] menuStr = {"More","Department record", "Retailer record"};
    JComboBox<String> menuCB = new JComboBox<>(menuStr);
    menuCB.setPreferredSize(new Dimension(100, 35));
    menuCB.setBackground(mainColor);
    menuCB.setForeground(textColor);
    moreMenuBtns(menuCB, frame);
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
    gbc.gridwidth = 4;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.ipady = 25;
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
      btn.setPreferredSize(new Dimension(100, 35));
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
            allRecordsContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.insets = new Insets(0, 0, 30, 0);
      panel.add(btn, gbc);
    }
    gbc.insets = new Insets(0, 10, 30, 0);
    gbc.gridy = 1;
    gbc.gridx = 2;
    panel.add(allRecordsBtns, gbc);

    gbc.gridx = 3;
    panel.add(menuCB, gbc);



    inputContainer(gbc, panel, "retailer");

    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(visibility);
  }
  public static void allRecordsContainer(boolean visibility) {
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

    JLabel noRecords = new JLabel("No records found!!", JLabel.CENTER);
    noRecords.setForeground(lowOpaqColor);
    noRecords.setFont(new Font("Arial", Font.PLAIN, 20));
    noRecords.setOpaque(true);
    noRecords.setBackground(mainColor);

    String[] menuStr = {"More","Department record", "Retailer record"};
    JComboBox<String> menuCB = new JComboBox<>(menuStr);
    menuCB.setPreferredSize(new Dimension(100, 35));
    menuCB.setBackground(mainColor);
    menuCB.setForeground(textColor);
    moreMenuBtns(menuCB, frame);
    String[] btns = {"Department", "Retailer", "Records"};

    gbc.fill = GridBagConstraints.HORIZONTAL;
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
      btn.setPreferredSize(new Dimension(100, 35));
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
    gbc.insets = new Insets(0, 5, 0, 0);
    gbc.gridx = 3;
    topPanel.add(menuCB, gbc);

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
    String[][] data = new String[storeList.size()][14];

    int i = 0;
    for (Store storeData : storeList) {
      if (storeData instanceof Department) {
        data[i][0] = String.valueOf(storeData.getStoreId());
        data[i][1] = storeData.getStoreName();
        data[i][2] = storeData.getLocation();
        data[i][3] = storeData.getOpeningHour();
        data[i][4] = String.valueOf(storeData.getTotalSales());
        data[i][5] = String.valueOf(storeData.getTotalDiscount());
        data[i][6] = ((Department) storeData).getProductName();
        data[i][7] = String.valueOf(((Department) storeData).getMarkedPrice());
        data[i][8] = "Department";
        data[i][9] = "-";
        data[i][10] = "-";
        data[i][11] = "-";
      } else if (storeData instanceof Retailer) {
        data[i][0] = String.valueOf(storeData.getStoreId());
        data[i][1] = storeData.getStoreName();
        data[i][2] = storeData.getLocation();
        data[i][3] = storeData.getOpeningHour();
        data[i][4] = String.valueOf(storeData.getTotalSales());
        data[i][5] = String.valueOf(storeData.getTotalDiscount());
        data[i][6] = "X";
        data[i][7] = "X";
        data[i][8] = "Retailer";
        data[i][9] = ((Retailer) storeData).getPurchasedYear();
        data[i][10] = String.valueOf(((Retailer) storeData).getLoyaltyPoints());
        data[i][11] = String.valueOf(((Retailer) storeData).getVatInclusivePrice());
      }
      i++;
    }

    String[] columnNames = {"Store Id", "Name", "Location", "Opening Hour", "Sales", "Discount", "Product name", "Marked price", "Type", "Purchase Year", "Loyalty point","VAT"};
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

//     Add panels to the frame
    frame.add(topPanel, BorderLayout.NORTH);
    if(storeList.isEmpty()){
      frame.add(noRecords, BorderLayout.CENTER);
    }else{
      frame.add(bottomPanel, BorderLayout.CENTER);
    }


    frame.setLocationRelativeTo(null);
    frame.setVisible(visibility);
  }
  public static void departmentRecordsContainer(boolean visibility) {
    JFrame frame = new JFrame("Store | Department records");
    frame.setSize(1100, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Top panel for title and buttons
    JPanel topPanel = new JPanel(new GridBagLayout());
    topPanel.setOpaque(true);
    topPanel.setBackground(mainColor);
    GridBagConstraints gbc = new GridBagConstraints();
    topPanel.setBorder(new EmptyBorder(30, 30, 30, 30));

    JLabel title = new JLabel("Department Records");
    title.setForeground(textColor);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, textColor));

    JLabel noRecords = new JLabel("No department records found!!", JLabel.CENTER);
    noRecords.setForeground(lowOpaqColor);
    noRecords.setFont(new Font("Arial", Font.PLAIN, 20));
    noRecords.setOpaque(true);
    noRecords.setBackground(mainColor);

    String[] menuStr = {"More","Department record", "Retailer record"};
    JComboBox<String> menuCB = new JComboBox<>(menuStr);
    menuCB.setPreferredSize(new Dimension(100, 35));
    menuCB.setBackground(Color.WHITE);
    menuCB.setForeground(Color.BLACK);
    menuCB.setSelectedItem("Department record");
    moreMenuBtns(menuCB, frame);
    String[] btns = {"Department", "Retailer", "Records"};

    gbc.fill = GridBagConstraints.HORIZONTAL;
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
      btn.setPreferredSize(new Dimension(100, 35));
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Retailer")) {
            frame.setVisible(false);
            retailerContainer(true);
          } else if (btn.getText().equals("Department")) {
            frame.setVisible(false);
            departmentContainer(true);
          }else{
            frame.setVisible(false);
            allRecordsContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.insets = new Insets(0, 0, 5, 0);
      topPanel.add(btn, gbc);
    }
    gbc.insets = new Insets(0, 5, 0, 0);
    gbc.gridx = 3;
    topPanel.add(menuCB, gbc);

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
    int departmentCount = 0;
    for (Store storeData : storeList) {
      if (storeData instanceof Department) {
        departmentCount++;
      }
    }

    String[][] data = new String[departmentCount][9];
    int i = 0;
    for (Store storeData : storeList) {
      if (storeData instanceof Department) {
        data[i][0] = String.valueOf(storeData.getStoreId());
        data[i][1] = storeData.getStoreName();
        data[i][2] = storeData.getLocation();
        data[i][3] = storeData.getOpeningHour();
        data[i][4] = String.valueOf(storeData.getTotalSales());
        data[i][5] = String.valueOf(storeData.getTotalDiscount());
        data[i][6] = ((Department) storeData).getProductName();
        data[i][7] = String.valueOf(((Department) storeData).getMarkedPrice());
        data[i][8] = String.valueOf(((Department) storeData).isInSales());
        i++;
      }
    }

    String[] columnNames = {"Store Id", "Name", "Location", "Opening Hour", "Sales", "Discount", "Product name", "Marked price", "Availability"};
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

//     Add panels to the frame
    frame.add(topPanel, BorderLayout.NORTH);
    if(storeList.isEmpty() || departmentCount == 0){
      frame.add(noRecords, BorderLayout.CENTER);
    }else{
      frame.add(bottomPanel, BorderLayout.CENTER);
    }


    frame.setLocationRelativeTo(null);
    frame.setVisible(visibility);
  }

  public static void retailerRecordsContainer(boolean visibility) {
    JFrame frame = new JFrame("Store | Retailer records");
    frame.setSize(1100, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Top panel for title and buttons
    JPanel topPanel = new JPanel(new GridBagLayout());
    topPanel.setOpaque(true);
    topPanel.setBackground(mainColor);
    GridBagConstraints gbc = new GridBagConstraints();
    topPanel.setBorder(new EmptyBorder(30, 30, 30, 30));

    JLabel title = new JLabel("Retailer Records");
    title.setForeground(textColor);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, textColor));

    JLabel noRecords = new JLabel("No retailer records found!!", JLabel.CENTER);
    noRecords.setForeground(lowOpaqColor);
    noRecords.setFont(new Font("Arial", Font.PLAIN, 20));
    noRecords.setOpaque(true);
    noRecords.setBackground(mainColor);

    String[] menuStr = {"More","Department record", "Retailer record"};
    JComboBox<String> menuCB = new JComboBox<>(menuStr);
    menuCB.setPreferredSize(new Dimension(100, 35));
    menuCB.setBackground(Color.WHITE);
    menuCB.setForeground(Color.BLACK);
    menuCB.setSelectedItem("Retailer record");
    moreMenuBtns(menuCB, frame);
    String[] btns = {"Department", "Retailer", "Records"};

    gbc.fill = GridBagConstraints.HORIZONTAL;
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
      btn.setPreferredSize(new Dimension(100, 35));
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Retailer")) {
            frame.setVisible(false);
            retailerContainer(true);
          } else if (btn.getText().equals("Department")) {
            frame.setVisible(false);
            departmentContainer(true);
          }else{
            frame.setVisible(false);
            allRecordsContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.insets = new Insets(0, 0, 5, 0);
      topPanel.add(btn, gbc);
    }
    gbc.insets = new Insets(0, 5, 0, 0);
    gbc.gridx = 3;
    topPanel.add(menuCB, gbc);

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
    int retailerCount = 0;
    for (Store storeData : storeList) {
      if (storeData instanceof Retailer) {
        retailerCount++;
      }
    }
    String[][] data = new String[retailerCount][10];
    int i = 0;
    for (Store storeData : storeList) {
      if (storeData instanceof Retailer) {
        data[i][0] = String.valueOf(storeData.getStoreId());
        data[i][1] = storeData.getStoreName();
        data[i][2] = storeData.getLocation();
        data[i][3] = storeData.getOpeningHour();
        data[i][4] = String.valueOf(storeData.getTotalSales());
        data[i][5] = String.valueOf(storeData.getTotalDiscount());
        data[i][6] = String.valueOf(((Retailer) storeData).getVatInclusivePrice());
        data[i][7] = String.valueOf(((Retailer) storeData).isPaymentOnline());
        data[i][8] = ((Retailer) storeData).getPurchasedYear();
        data[i][9] = String.valueOf(((Retailer) storeData).getLoyaltyPoints());
        i++;
      }
    }

    String[] columnNames = {"Store Id", "Name", "Location", "Opening Hour", "Sales", "Discount", "VAT", "Payment online", "Purchase year", "Loyalty points"};
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

//     Add panels to the frame
    frame.add(topPanel, BorderLayout.NORTH);
    if(storeList.isEmpty() || retailerCount == 0){
      frame.add(noRecords, BorderLayout.CENTER);
    }else{
      frame.add(bottomPanel, BorderLayout.CENTER);
    }

    frame.setLocationRelativeTo(null);
    frame.setVisible(visibility);
  }


  public static void departmentContainer(boolean visibility){
    JFrame frame = new JFrame("Store | Department");
    frame.setSize(850, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel theme = new JLabel("Dark mode", JLabel.RIGHT);
    theme.setForeground(textColor);
    theme.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, textColor));
    theme.setCursor(new Cursor(Cursor.HAND_CURSOR));

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

    theme.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (isDarkMode){
          applyLightMode();
          theme.setText("Light mode");
          isDarkMode = false;
        }else{
          applyDarkMode();
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
    if(isDarkMode){
      theme.setText("Dark mode");
      applyDarkMode();
    }else{
      theme.setText("Light mode");
      applyLightMode();
    }

    String[] menuStr = {"More","Department record", "Retailer record"};
    JComboBox<String> menuCB = new JComboBox<>(menuStr);
    menuCB.setPreferredSize(new Dimension(80, 35));
    menuCB.setBackground(mainColor);
    menuCB.setForeground(textColor);

    moreMenuBtns(menuCB, frame);

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
      btn.setPreferredSize(new Dimension(100, 35));
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
            allRecordsContainer(true);
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
    gbc.gridx = 2;
    panel.add(allRecordsBtns, gbc);
    gbc.gridy = 1;
    gbc.gridx = 3;
    panel.add(menuCB, gbc);
    inputContainer(gbc, panel, "department");
    frame.add(panel, BorderLayout.CENTER);
    frame.setLocationRelativeTo(null);
    frame.setVisible(visibility);
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
    getStartedButton.setPreferredSize(new Dimension(270, 38));
    getStartedButton.setBackground(secondaryColor);
    getStartedButton.setForeground(Color.BLACK);

    JButton themeMode = new JButton("☀️");
    themeMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
    themeMode.setPreferredSize(new Dimension(40, 38));
    themeMode.setBackground(null);
    themeMode.setForeground(secondaryColor);
    themeMode.setBorder(border);
    themeMode.setFocusPainted(false);
    themeMode.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (isDarkMode){
          themeMode.setText("☀️");
          isDarkMode = false;
          applyLightMode();
        }else{
          themeMode.setText("🌙");
          isDarkMode = true;
          applyDarkMode();
        }
      }
    });
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

    gbc.gridwidth = 3;
    panel.add(headLabel, gbc);
    gbc.insets = new Insets(10, 0, 10, 0);
    gbc.gridy = 1;
    panel.add(paragraphLabel, gbc);
    gbc.gridy = 2;
    gbc.insets = new Insets(20, 10, 10, 0);
    gbc.gridwidth = 2;
    panel.add(getStartedButton, gbc);
    gbc.gridy = 2;
    gbc.gridx = 2;
    gbc.gridwidth = 1;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(themeMode, gbc);

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