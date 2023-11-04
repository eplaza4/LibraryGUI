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
    private JTextField FileAdd;
    private JTextField BarcodeRemove;
    private JRadioButton BookButton;
    private JButton CheckoutButton;

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
                JOptionPane.showMessageDialog(Main.this,"Checked In (Due date is null)");
            }
        });

        ReturnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Checked Out");
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
                JOptionPane.showMessageDialog(Main.this,"Title not found");
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

        FileAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"File not found");
            }
        });

        BarcodeRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Barcode not found");
            }
        });

        BookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Proceed to Checkout Button");
            }
        });

        CheckoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog(Main.this,"Checked Out Due by 12/1/2023 (4 Weeks from Current Date) (Book already checked out) ");
            }
        });
    }
    public static void main( String[] args ) {
        new Main();
    }
}