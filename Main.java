import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame {
    private JLabel Welcome;
    private JPasswordField Password;
    private JButton Button;
    private JPanel MainPanel;
    private JList AddBook;
    private JButton AddButton;
    private JList ReturnBook;
    private JButton ReturnButton;
    private JList SearchBook;
    private JButton SearchButton;
    private JComboBox QuantityAdd;
    private JComboBox QuantityRemoved;
    private JTextField BookName;
    private JTextField Username;
    private JButton LogoutButton;
    private JButton CreateAccountButton;
    private JTextField BarcodeAdd;
    private JTextField BarcodeRemove;
    private JRadioButton BookButton;

    public Main () {
        setContentPane(MainPanel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024,640);
        setLocationRelativeTo(null);
        setVisible(true);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Welcome User");
            }
        });

        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Book Added Successfully");
            }
        });

        ReturnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Book Returned Successfully");
            }
        });

        SearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Book Found");
            }
        });

        QuantityAdd.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged( ItemEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Quantity Added");
            }
        });

        QuantityRemoved.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged( ItemEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Quantity Removed");
            }
        });

        BookName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Use the radiobutton to select book");
            }
        });

        Username.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Please Enter Username (User1)");
            }
        });

        Password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Enter Your Password (Library1)");
            }
        });

        LogoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Logged Out Successfully");
            }
        });

        CreateAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"What type of Account do you want to use? (Admin/Employee/User)");
            }
        });

        BarcodeAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Scan Barcode to Add");
            }
        });

        BarcodeRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Scan Barcode to Remove");
            }
        });

        BookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Proceed to Add/Return Button for Checkout");
            }
        });
    }
    public static void main( String[] args ) {
        new Main();
    }
}