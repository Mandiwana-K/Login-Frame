
package za.ac.tut;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class PasswordGUI extends JFrame{
    //declaring panels
    private JPanel headingPnl;
    private JPanel mainPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel buttonPnl;
    private JPanel userAndPassPnl;
    
    //declaring labels
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    //declaring text fields
    private JTextField usernameTf;
    private JPasswordField passwordTf;
        
    //declaring buttons
    private JButton submitBtn;
    
    public PasswordGUI() {
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(400,200);
        setResizable(false);
        setBackground(Color.blue);
        
        
        // create the panels
        usernamePnl =new JPanel(new FlowLayout());
        passwordPnl =new JPanel(new FlowLayout());
        
        userAndPassPnl = new JPanel(new GridLayout(2,1));
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        buttonPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //setting text
        submitBtn = new JButton("Submit");
        headingLbl = new JLabel("Login details");
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        //create text field
        usernameTf = new JTextField(20);
        passwordTf = new JPasswordField(8);
        
        // adding to panels
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTf);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTf);
        
        userAndPassPnl.add(usernamePnl);
        userAndPassPnl.add(passwordPnl);
        
        headingPnl.add(headingLbl);
        
        buttonPnl.add(submitBtn);
        
        //add all panels to main panel
        mainPnl.add(headingPnl,BorderLayout.NORTH);
        mainPnl.add(userAndPassPnl,BorderLayout.CENTER);
        mainPnl.add(buttonPnl,BorderLayout.SOUTH);
         
        //add main panel to the frame
        add(mainPnl,BorderLayout.CENTER);
        
        //make frame visible
        setVisible(true);
    }
    
}
