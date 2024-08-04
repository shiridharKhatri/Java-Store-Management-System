import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class StoreGUI {
  public static Color mainColor = new Color(27 ,27, 27);
  public static Color secondaryColor = new Color(247 ,205, 70);
  public static Color lowOpaqColor = new Color(155 ,151, 151);
  public static Color imputColor = new Color(33 ,33 ,33);
  public static Border border = BorderFactory.createLineBorder(secondaryColor, 2);
  ArrayList<Store> list = new ArrayList<Store>();

public static void inputContainer( GridBagConstraints gbc, JPanel panel, String type){
  JLabel storeIdLbl = new JLabel("Id");
  storeIdLbl.setForeground(Color.WHITE);
  storeIdLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel storeNameLbl = new JLabel("Name");
  storeNameLbl.setForeground(Color.WHITE);
  storeNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel storeLocationLbl= new JLabel("Location");
  storeLocationLbl.setForeground(Color.WHITE);
  storeLocationLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel storeOpeningHrsLbl= new JLabel("Opening Hour");
  storeOpeningHrsLbl.setForeground(Color.WHITE);
  storeOpeningHrsLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel storeTotalSaleLbl= new JLabel("Total sales");
  storeTotalSaleLbl.setForeground(Color.WHITE);
  storeTotalSaleLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel storeTotalDiscountLbl= new JLabel("Total discount");
  storeTotalDiscountLbl.setForeground(Color.WHITE);
  storeTotalDiscountLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel productNameLbl= new JLabel();
  if(type.equals("department")){
    productNameLbl.setText("Product Name");
  }else if(type.equals("retailer")){
    productNameLbl.setText("Vat Inclusive Price");
  }
  productNameLbl.setForeground(Color.WHITE);
  productNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
  JLabel markedPriceLbl= new JLabel("Marked price");
  markedPriceLbl.setForeground(Color.WHITE);
  markedPriceLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));

  JLabel purchaseYearLbl= new JLabel("Purchase year");
  purchaseYearLbl.setForeground(Color.WHITE);
  purchaseYearLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));

  JTextField storeIdTf = new JTextField();
  storeIdTf.setBackground(imputColor);
  storeIdTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  storeIdTf.setForeground(Color.WHITE);
  JTextField storeNameTf = new JTextField();
  storeNameTf.setBackground(imputColor);
  storeNameTf.setForeground(Color.WHITE);
  storeNameTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  JTextField storeLocationTf= new JTextField();
  storeLocationTf.setForeground(Color.WHITE);
  storeLocationTf.setBackground(imputColor);
  storeLocationTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  JTextField storeOpeningHrsTf= new JTextField();
  storeOpeningHrsTf.setForeground(Color.WHITE);
  storeOpeningHrsTf.setBackground(imputColor);
  storeOpeningHrsTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  JTextField storeTotalSaleTf= new JTextField();
  storeTotalSaleTf.setForeground(Color.WHITE);
  storeTotalSaleTf.setBackground(imputColor);
  storeTotalSaleTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  JTextField storeTotalDiscountTf= new JTextField();
  storeTotalDiscountTf.setForeground(Color.WHITE);
  storeTotalDiscountTf.setBackground(imputColor);
  storeTotalDiscountTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  JTextField productNameTf= new JTextField();
  productNameTf.setForeground(Color.WHITE);
  productNameTf.setBackground(imputColor);
  productNameTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));
  JTextField markedPriceTf= new JTextField();
  markedPriceTf.setForeground(Color.WHITE);
  markedPriceTf.setBackground(imputColor);
  markedPriceTf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, lowOpaqColor));

  String[] paymentOpt = {"yes", "no"};
  JComboBox paymentOnline = new JComboBox(paymentOpt);


  gbc.insets = new Insets(20, 10, -20, 5);
  gbc.fill = GridBagConstraints.BOTH;

  // Store Id
  gbc.gridx = 0;
  gbc.gridy = 2;
  gbc.gridwidth = 2;
  panel.add(storeIdLbl, gbc);
  gbc.gridy = 3;
  panel.add(storeIdTf, gbc);

  // Store Name
  gbc.gridx = 2;
  gbc.gridy = 2;
  gbc.gridwidth = 2;
  panel.add(storeNameLbl, gbc);
  gbc.gridy = 3;
  panel.add(storeNameTf, gbc);

  // Store Location
  gbc.insets = new Insets(40, 10, -40, 5);
  gbc.gridx = 0;
  gbc.gridy = 4;
  gbc.gridwidth = 2;
  panel.add(storeLocationLbl, gbc);

  gbc.gridy = 5;
  panel.add(storeLocationTf, gbc);

  // Store Opening Hour
  gbc.gridx = 2;
  gbc.gridy = 4;
  gbc.gridwidth = 2;
  panel.add(storeOpeningHrsLbl, gbc);

  gbc.gridy = 5;
  panel.add(storeOpeningHrsTf, gbc);

  // Total Sales
  gbc.insets = new Insets(60, 10, -60, 5);
  gbc.gridx = 0;
  gbc.gridy = 6;
  gbc.gridwidth = 2;
  panel.add(storeTotalSaleLbl, gbc);

  gbc.gridy = 7;
  panel.add(storeTotalSaleTf, gbc);

  // Total Discount
  gbc.gridx = 2;
  gbc.gridy = 6;
  gbc.gridwidth = 2;
  panel.add(storeTotalDiscountLbl, gbc);

  gbc.gridy = 7;
  panel.add(storeTotalDiscountTf, gbc);

  // Product Name
  gbc.insets = new Insets(80, 10, -80, 5);
  gbc.gridx = 0;
  gbc.gridy = 8;
  gbc.gridwidth = 2;
  panel.add(productNameLbl, gbc);

  gbc.gridy = 9;
  panel.add(productNameTf, gbc);

  // Marked Price
  gbc.gridx = 2;
  gbc.gridy = 8;
  gbc.gridwidth = 2;
  panel.add(markedPriceLbl, gbc);

  if (type.equals("retailer")){
    // Purchase year
    gbc.gridx = 3;
    gbc.gridy = 8;
    gbc.gridwidth = 1;
    panel.add(purchaseYearLbl, gbc);
  }

  if (type.equals("department")){
  gbc.gridy = 9;
  panel.add(markedPriceTf, gbc);
    markedPriceLbl.setText("Marked price");
  }else if (type.equals("retailer")){
    markedPriceLbl.setText("Is payment online?");
    gbc.gridy = 9;
    gbc.gridx = 2;
    gbc.gridwidth = 1;
    paymentOnline.setForeground(Color.WHITE);
    paymentOnline.setBackground(imputColor);
    paymentOnline.setBorder(null);
    panel.add(paymentOnline, gbc);
    JComboBox<Integer> years = new JComboBox<>();
    years.setForeground(Color.WHITE);
    years.setBackground(imputColor);
    years.setBorder(null);

    for (int i = 2000; i<2060; i++) {
      years.addItem(i);
    }
    gbc.gridy = 9;
    gbc.gridx = 3;
    gbc.gridwidth = 1;
    panel.add(years, gbc);
  }



}
  public static void retailerContainer(Boolean visiblity){
    JFrame frame = new JFrame("Store | Retailer");
    frame.setSize(700, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    panel.setOpaque(true);
    panel.setBackground(mainColor);
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    panel.setLayout(layout);
    panel.setBorder(new EmptyBorder(30, 30, 30, 30));
    JLabel title  = new JLabel("Retailer");
    title.setForeground(Color.WHITE);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0,0,1 ,0,lowOpaqColor));

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
    gbc.ipady = 20;
    panel.add(title, gbc);

    for (int i = 0; i < btns.length; i++) {
      JButton btn = new JButton(btns[i]);
      btn.setFocusPainted(false);
      btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn.setBorder(border);
      btn.setBackground(null);
      btn.setForeground(secondaryColor);
      if (btn.getText().equals("Retailer")) {
        btn.setBackground(secondaryColor);
        btn.setForeground(mainColor);
      }
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Department")){
            frame.setVisible(false);
            departmentContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.ipady = 15;
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
  public static void departmentContainer(Boolean visiblity){
    JFrame frame = new JFrame("Store | Department");
    frame.setSize(700, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    panel.setOpaque(true);
    panel.setBackground(mainColor);
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    panel.setLayout(layout);
    panel.setSize(700, 700);
    panel.setBorder(new EmptyBorder(30, 30, 30, 30));
    JLabel title  = new JLabel("Department");
    title.setForeground(Color.WHITE);
    title.setFont(new Font("Rockwell", Font.BOLD, 20));
    title.setOpaque(true);
    title.setBackground(null);
    title.setBorder(BorderFactory.createMatteBorder(0,0,1 ,0,lowOpaqColor));

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

    gbc.weightx = 1.0;
    gbc.weighty = 0;
    gbc.gridwidth = 4;

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.ipady = 20;
    panel.add(title, gbc);

    for (int i = 0; i < btns.length; i++) {
      JButton btn = new JButton(btns[i]);
      btn.setFocusPainted(false);
      btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn.setBorder(border);
      btn.setBackground(null);
      btn.setForeground(secondaryColor);
      if (btn.getText().equals("Department")) {
        btn.setBackground(secondaryColor);
        btn.setForeground(mainColor);
      }
      btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (btn.getText().equals("Retailer")){
            frame.setVisible(false);
            retailerContainer(true);
          }
        }
      });
      gbc.gridy = 1;
      gbc.gridx = i;
      gbc.gridwidth = 1;
      gbc.ipady = 15;
      gbc.insets = new Insets(0, 0, 30, 0);
      panel.add(btn, gbc);
    }
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
    headLabel.setForeground(Color.WHITE);

    JLabel paragraphLabel = new JLabel("<html>Welcome to our shop, Your One-Stop Destination for <center> Unique Finds and Everyday Essentials</center><html>");
    paragraphLabel.setForeground(lowOpaqColor);
    paragraphLabel.setFont(new Font("Arial", Font.PLAIN, 15));

    JButton getStartedButton = new JButton("Get Started ➙");
    getStartedButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    getStartedButton.setPreferredSize(new Dimension(250, 38));
    getStartedButton.setBackground(secondaryColor);
    getStartedButton.setForeground(new Color(27 ,27, 27));

    getStartedButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        getStartedButton.setBackground(Color.orange);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        getStartedButton.setBackground(secondaryColor);
      }

      @Override
      public void mouseClicked(MouseEvent e) {
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
    storeGUI.homePage();
  }
}