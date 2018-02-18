import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane; 
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

public class PointOfSale extends JFrame
{



   // Declare components
   private JPanel topPanel , leftPanel , rightPanel , panelButtonsUp , panelButtonsDown , panelBdLeft , panelBdRight;
   // Compontents for TOP PANEL
   private JLabel jlblTillNum , jlblTransactionNum , jlblCashierNum , jlblTime, jlblCustomerID;
   private JTextField jtfTillNum , jtfTransactionNum, jtfCashierNum , jtfTime, jtfCustomerID;
   // Components for LEFT PANEL 
   private JTextField jtfDisplay ;
   // Column names for the JTable
   private String[] columnNames = {"Item ID", "Name", "Price"};
   // Table to store out transaction items
   private JTable transactionItems;
   // Model of the table 
   private DefaultTableModel model ;
   // Add scrollable interface for the table 
   private JScrollPane scroll;
   // Componets for RIGHT PANEL
   private List <JButton> buttonList ;
         private JButton temp;

    
   public PointOfSale()
   {
      // TOP PANEL 
      topPanel = new JPanel(new FlowLayout());
      // Set border on topPanel
      topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
      // Set background color of panel
      topPanel.setBackground(Color.WHITE);
      // Create and add labels,textfields,button
      topPanel.add(jlblTillNum = new JLabel("Till"));
      topPanel.add(jtfTillNum = new JTextField(2));
      jtfTillNum.setEditable(false);
      topPanel.add(jlblTransactionNum = new JLabel("   Transaction"));
      topPanel.add(jtfTransactionNum = new JTextField(4));
      jtfTransactionNum.setEditable(false);
      topPanel.add(jlblCashierNum = new JLabel("   Cashier"));
      topPanel.add(jtfCashierNum = new JTextField(2));
      jtfCashierNum.setEditable(false);
      topPanel.add(jlblTime = new JLabel("   Time"));
      topPanel.add(jtfTime = new JTextField(12));
      jtfTime.setEditable(false);
      topPanel.add(jlblCustomerID = new JLabel("   Customer"));
      topPanel.add(jtfCustomerID = new JTextField(4));
      jtfCustomerID.setEditable(false);
      // LEFT PANEL
      leftPanel = new JPanel(new BorderLayout());
      jtfDisplay = new JTextField(20);
      leftPanel.add(jtfDisplay);
      
      model = new DefaultTableModel(25, columnNames.length) ;
      model.setColumnIdentifiers(columnNames);
      transactionItems = new JTable(model);
      scroll = new JScrollPane(transactionItems); 
      leftPanel.add(scroll, BorderLayout.SOUTH);
      // disable grid showing
      transactionItems.setShowGrid(false);
      // zero row/column intercell spacing
      transactionItems.setIntercellSpacing(new Dimension(0, 0));
      // customize the behaviour of the Scrollable interface - allow resize
       //getContentPane().add( scroll, BoxLayout.LINE_AXIS );
      // Add panel to the frame 
      add(leftPanel , BorderLayout.WEST);

      
      // Add panel to the north of the frame
      add(topPanel , BorderLayout.NORTH);
       
      // RIGHT PANEL 
      rightPanel = new JPanel(new GridLayout(2,1));
      panelButtonsUp = new JPanel();
      panelButtonsDown = new JPanel();
      panelBdLeft = new JPanel(new GridLayout(4,4,10,20));
      panelBdRight = new JPanel(new GridLayout(4,1,10,20));
      
      String [] names = {"7","8","9","QTY","4","5","6","Void","1","2","3","Void","0",".","00","COS" };
      for(int i = 0 ; i< 16 ; i++)
      {
         temp = new JButton(names[i]);
         panelBdLeft.add(temp);
             temp.setPreferredSize(new Dimension(60, 60));

      }
      
       for(int i = 0 ; i < 4 ; i++)
      {
         temp = new JButton(names[i]);
         panelBdRight.add(temp);
         temp.setPreferredSize(new Dimension(100, 60));

      }
      

      
      
      
      panelButtonsDown.add(panelBdLeft, BorderLayout.WEST);
      panelButtonsDown.add(panelBdRight, BorderLayout.CENTER);
      
      panelButtonsUp.setBackground(Color.RED);
      panelButtonsDown.setBackground(Color.GREEN);
           
      
      rightPanel.add(panelButtonsUp);
      rightPanel.add(panelButtonsDown);
      add(rightPanel , BorderLayout.EAST);

      
      
      /*rightPanel.add(jlblSignUp = new JLabel("Sign Up"));
      // Set border for label
      jlblSignUp.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
      // Set font on the label
      jlblSignUp.setFont(new Font("SanSerif", Font.BOLD, 18));
      // Create textfields
      rightPanel.add(jtfFirstName = new JTextField("Enter First Name",20));
      rightPanel.add(jtfSurname = new JTextField("Enter Surname"));
      rightPanel.add(jtfEmail = new JTextField("Enter Email"));
      rightPanel.add(jtfPassword = new JTextField("Enter Password"));
      rightPanel.add(jbtnSignUp = new JButton("Sign up"));
      jbtnSignUp.setBackground(Color.GREEN);
      jbtnSignUp.setFont(new Font("SanSerif", Font.BOLD, 18));
      // Add to the frame
      add(rightPanel , BorderLayout.EAST);
   
      //LISTENER CLASS
      // Create object of the ListenerClass 
      ListenerClass listener = new ListenerClass();
      
      // Register compnents with listener
      jtfFirstName.addActionListener(listener);
      jtfFirstName.addFocusListener(listener);
   
      jtfSurname.addActionListener(listener);
      jtfSurname.addFocusListener(listener);
     
      jtfEmail.addActionListener(listener);
      jtfEmail.addFocusListener(listener);
   
      jtfPassword.addActionListener(listener);
      jtfPassword.addFocusListener(listener);
   
      // Button listener
      jbtnSignUp.addActionListener(listener);
      jbtnLogin.addActionListener(listener);
      */
   }


 public static void main(String[] args)
   {
      // Create object of the class
      PointOfSale frame = new PointOfSale();
      // Set mouse coursor
      frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
      // Set tittle
      frame.setTitle("Point of Sale");
      // Auto size
      frame.pack();      

      // Close operation
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null);
      // Show frame
      frame.setVisible(true);
      
   }




}
