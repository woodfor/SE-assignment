/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class GUI_project extends JFrame {
    private JMenuBar menuBar;
    private JTextField Account_input;
    private JButton Exit;
    private JButton Login;
    private JPanel Panel_login;
    private JButton Register;
    private JLabel label_Acc;
    private JLabel label_Password;
    private JButton Owner_reg;
    private JButton User_reg;
    private JPasswordField passwordfield_main;
    private JButton Owner_OK;
    private JTextField Owner_Pass;
    private JTextField Owner_account;
    private JButton Back;
    private JButton Owner_Back;
    private JLabel Owner_label1;
    private JLabel Owner_label2;
    private JLabel label_own_reg;
    private JButton User_OK;
    private Controllor ctrl;
    private JPanel panel1;
    //Constructor 
    public GUI_project(){
        ctrl = new Controllor();
        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        Account_input = new JTextField();
        Account_input.setBounds(150,37,125,30);
        Account_input.setBackground(new Color(255,255,255));
        Account_input.setForeground(new Color(0,0,0));
        Account_input.setEnabled(true);
        Account_input.setFont(new Font("sansserif",0,12));
        Account_input.setText("");
        Account_input.setVisible(true);

        Exit = new JButton();
        Exit.setBounds(231,125,90,35);
        Exit.setBackground(new Color(214,217,223));
        Exit.setForeground(new Color(0,0,0));
        Exit.setEnabled(true);
        Exit.setFont(new Font("sansserif",0,12));
        Exit.setText("Exit");
        Exit.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Exit.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Exit(evt);
                }
            });

        Login = new JButton();
        Login.setBounds(12,128,90,35);
        Login.setBackground(new Color(214,217,223));
        Login.setForeground(new Color(0,0,0));
        Login.setEnabled(true);
        Login.setFont(new Font("sansserif",0,12));
        Login.setText("Login");
        Login.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Login.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Login_click(evt);
                }
            });

        Panel_login = new JPanel(null);
        Panel_login.setBorder(BorderFactory.createEtchedBorder(1));
        Panel_login.setBounds(98,117,326,180);
        Panel_login.setBackground(new Color(214,217,223));
        Panel_login.setForeground(new Color(0,0,0));
        Panel_login.setEnabled(true);
        Panel_login.setFont(new Font("sansserif",0,12));
        Panel_login.setVisible(true);

        Register = new JButton();
        Register.setBounds(121,127,90,35);
        Register.setBackground(new Color(214,217,223));
        Register.setForeground(new Color(0,0,0));
        Register.setEnabled(true);
        Register.setFont(new Font("sansserif",0,12));
        Register.setText("Register");
        Register.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Register.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Register_button(evt);
                }
            });

        label_Acc = new JLabel();
        label_Acc.setBounds(52,38,90,35);
        label_Acc.setBackground(new Color(214,217,223));
        label_Acc.setForeground(new Color(0,0,0));
        label_Acc.setEnabled(true);
        label_Acc.setFont(new Font("sansserif",0,12));
        label_Acc.setText("Account:");
        label_Acc.setVisible(true);

        label_Password = new JLabel();
        label_Password.setBounds(52,77,90,35);
        label_Password.setBackground(new Color(214,217,223));
        label_Password.setForeground(new Color(0,0,0));
        label_Password.setEnabled(true);
        label_Password.setFont(new Font("sansserif",0,12));
        label_Password.setText("Password:");
        label_Password.setVisible(true);

        passwordfield_main = new JPasswordField();
        passwordfield_main.setBounds(150,81,126,30);
        passwordfield_main.setBackground(new Color(214,217,223));
        passwordfield_main.setForeground(new Color(0,0,0));
        passwordfield_main.setEnabled(true);
        passwordfield_main.setFont(new Font("sansserif",0,12));
        passwordfield_main.setVisible(true);

        //adding components to contentPane panel
        Panel_login.add(Account_input);
        Panel_login.add(Exit);
        Panel_login.add(Login);
        contentPane.add(Panel_login);
        Panel_login.add(Register);
        Panel_login.add(label_Acc);
        Panel_login.add(label_Password);
        Panel_login.add(passwordfield_main);

        Owner_reg = new JButton();
        Owner_reg.setBounds(13,72,90,35);
        Owner_reg.setBackground(new Color(214,217,223));
        Owner_reg.setForeground(new Color(0,0,0));
        Owner_reg.setEnabled(true);
        Owner_reg.setFont(new Font("sansserif",0,12));
        Owner_reg.setText("Owner");
        Owner_reg.setVisible(true);

        Back = new JButton();
        Back.setBounds(224,72,90,35);
        Back.setBackground(new Color(214,217,223));
        Back.setForeground(new Color(0,0,0));
        Back.setEnabled(true);
        Back.setFont(new Font("sansserif",0,12));
        Back.setText("Back");
        Back.setVisible(true);
        Back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Back_reg_click(evt);
                }
            });
        //Set methods for mouse events
        //Call defined methods
        Owner_reg.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Owner_reg_click(evt);
                }
            });

        User_reg = new JButton();
        User_reg.setBounds(118,72,90,35);
        User_reg.setBackground(new Color(214,217,223));
        User_reg.setForeground(new Color(0,0,0));
        User_reg.setEnabled(true);
        User_reg.setFont(new Font("sansserif",0,12));
        User_reg.setText("User");
        User_reg.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        User_reg.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    User_reg_click(evt);
                }
            });

        Owner_Back = new JButton();
        Owner_Back.setBounds(179,134,90,35);
        Owner_Back.setBackground(new Color(214,217,223));
        Owner_Back.setForeground(new Color(0,0,0));
        Owner_Back.setEnabled(true);
        Owner_Back.setFont(new Font("sansserif",0,12));
        Owner_Back.setText("Back");
        Owner_Back.setVisible(true);
        Owner_Back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Owner_Back(evt);
                }
            });

        Owner_OK = new JButton();
        Owner_OK.setBounds(58,134,90,35);
        Owner_OK.setBackground(new Color(214,217,223));
        Owner_OK.setForeground(new Color(0,0,0));
        Owner_OK.setEnabled(true);
        Owner_OK.setFont(new Font("sansserif",0,12));
        Owner_OK.setText("OK");
        Owner_OK.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Owner_OK.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Owner_ok(evt);
                }
            });

        User_OK = new JButton();
        User_OK.setBounds(58,134,90,35);
        User_OK.setBackground(new Color(214,217,223));
        User_OK.setForeground(new Color(0,0,0));
        User_OK.setEnabled(true);
        User_OK.setFont(new Font("sansserif",0,12));
        User_OK.setText("OK");
        User_OK.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        User_OK.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    User_ok(evt);
                }
            });

        Owner_Pass = new JTextField();
        Owner_Pass.setBounds(156,88,123,33);
        Owner_Pass.setBackground(new Color(255,255,255));
        Owner_Pass.setForeground(new Color(0,0,0));
        Owner_Pass.setEnabled(true);
        Owner_Pass.setFont(new Font("sansserif",0,12));
        Owner_Pass.setText("");
        Owner_Pass.setVisible(true);

        Owner_account = new JTextField();
        Owner_account.setBounds(156,50,124,32);
        Owner_account.setBackground(new Color(255,255,255));
        Owner_account.setForeground(new Color(0,0,0));
        Owner_account.setEnabled(true);
        Owner_account.setFont(new Font("sansserif",0,12));
        Owner_account.setText("");
        Owner_account.setVisible(true);

        Owner_label1 = new JLabel();
        Owner_label1.setBounds(56,48,90,35);
        Owner_label1.setBackground(new Color(214,217,223));
        Owner_label1.setForeground(new Color(0,0,0));
        Owner_label1.setEnabled(true);
        Owner_label1.setFont(new Font("sansserif",0,12));
        Owner_label1.setText("Account:");
        Owner_label1.setVisible(true);

        Owner_label2 = new JLabel();
        Owner_label2.setBounds(56,87,90,35);
        Owner_label2.setBackground(new Color(214,217,223));
        Owner_label2.setForeground(new Color(0,0,0));
        Owner_label2.setEnabled(true);
        Owner_label2.setFont(new Font("sansserif",0,12));
        Owner_label2.setText("Password");
        Owner_label2.setVisible(true);

        label_own_reg = new JLabel();
        label_own_reg.setBounds(11,13,90,35);
        label_own_reg.setBackground(new Color(214,217,223));
        label_own_reg.setForeground(new Color(0,0,0));
        label_own_reg.setEnabled(true);
        label_own_reg.setFont(new Font("sansserif",0,12));
        label_own_reg.setText("User Register");
        label_own_reg.setVisible(true);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method mouseClicked for Exit
    private void Exit (MouseEvent evt) {
        System.exit(0);
    }

    //Method mouseClicked for Login
    private void Login_click (MouseEvent evt) {
        if (Account_input.getText().trim().equals("")
        || Account_input.getText().length()==0 || String.valueOf( passwordfield_main.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(this, "Input something", "Warning",
                JOptionPane.INFORMATION_MESSAGE);
            this.Account_input.requestFocus();//获取焦点
            return;
        }
        else
        {
            String whole = Account_input.getText().trim() + "/" + String.valueOf(passwordfield_main.getPassword());
            //System.out.println(whole);
            if(whole.equals("admin/pass"))
            {
                JOptionPane.showMessageDialog(this,  "Welcome login in", "Owner Admin",
                    JOptionPane.INFORMATION_MESSAGE);
                Panel_login.setVisible(false);               
                owner_manage_interface();

            }
            else
            if(ctrl.login_validation(whole))
            {
                JOptionPane.showMessageDialog(this, Account_input.getText().trim() + " Welcome login in", "Hello",
                    JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                due("Check your account information");
            }

        }
    }

    private void owner_manage_interface()
    {
        JMenuBar menuBar;
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JLabel label1;
        
        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        //generateMenu();
        //this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(69,62,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Create");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Create(evt);
                }
            });

        button2 = new JButton();
        button2.setBounds(69,117,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Edit");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Edit(evt);
                }
            });

        button3 = new JButton();
        button3.setBounds(69,170,90,35);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Remove");
        button3.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Remove(evt);
                }
            });

        button4 = new JButton();
        button4.setBounds(69,222,90,35);
        button4.setBackground(new Color(214,217,223));
        button4.setForeground(new Color(0,0,0));
        button4.setEnabled(true);
        button4.setFont(new Font("sansserif",0,12));
        button4.setText("Log out");
        button4.setVisible(true);
        button4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginout(evt);
            }
        });

        label1 = new JLabel();
        label1.setBounds(13,18,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Manage Menu");
        label1.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(123,68,227,289);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(label1);
        contentPane.add(panel1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }

    public void loginout(MouseEvent evt)
    {
       panel1.setVisible(false);
        Panel_login.setVisible(true);
    }
    
    public void Create(MouseEvent evt)
    {

        due("Hello");
    }

    public void Edit(MouseEvent evt)
    {

        due("Hello");
    }

    public void Remove(MouseEvent evt)
    {

        due("Hello");
    }

    //Method mouseClicked for Register
    private void Register_button (MouseEvent evt) {
        Panel_login.removeAll();
        Panel_login.repaint();
        label_own_reg.setText("User Register");
        Panel_login.add(Owner_Back);
        Panel_login.add(User_OK);
        Panel_login.add(Owner_Pass);
        Panel_login.add(Owner_account);
        Panel_login.add(Owner_label1);
        Panel_login.add(Owner_label2);
        Panel_login.add(label_own_reg);
        Panel_login.repaint();
    }

    private void Owner_reg_click (MouseEvent evt) {
        Panel_login.removeAll();
        Panel_login.repaint();

        label_own_reg.setText("User Register");
        Panel_login.add(Owner_Back);
        Panel_login.add(User_OK);
        Panel_login.add(Owner_Pass);
        Panel_login.add(Owner_account);
        Panel_login.add(Owner_label1);
        Panel_login.add(Owner_label2);
        Panel_login.add(label_own_reg);
    }

    private void User_ok (MouseEvent evt)
    {
        String a = Owner_account.getText().trim();
        String b = Owner_Pass.getText().trim();

        if (a.isEmpty()||b.isEmpty())    
        {
            due("Input something");
            this.Owner_account.requestFocus();//获取焦点          
        }
        else
        {
            if (a.charAt(0) == '-' || a.charAt(a.length()-1) == '-' || a.length() > 15 || a.length() < 2)
            { due("No '-' in head and tail and 2 <= length < 15 characters");

                this.Owner_account.requestFocus();
            }
            else
            {
                if(b.length() > 15)
                {
                    due("Password length < 15");
                }
                else
                {
                    if(ctrl.customerlist(a+"/"+b))
                    {
                        JOptionPane.showMessageDialog(this, "User account registered", "Congratulation",
                            JOptionPane.INFORMATION_MESSAGE);
                            login_pannel();
                    }
                    else
                    {
                        due("Account been taken");
                    }

                }
            }
        }
    }

    //Method mouseClicked for Owner_OK
    private void Owner_ok (MouseEvent evt) 
    {
        String a = Owner_account.getText().trim();
        String b = Owner_Pass.getText().trim();

        if (a.isEmpty()||b.isEmpty())    
        {
            due("Input something");
            this.Owner_account.requestFocus();//获取焦点          
        }
        else
        {
            if (a.charAt(0) == '-' || a.charAt(a.length()-1) == '-' || a.length() > 15 || a.length() < 2)
            { due("No '-' in head and tail and 2 <= length < 15 characters");

                this.Owner_account.requestFocus();
            }
            else
            {
                if(b.length() > 15)
                {
                    due("Password length < 15");
                }
                else
                {
                    if(ctrl.ownerlist(a+"/"+b))
                    {
                        JOptionPane.showMessageDialog(this, "Owner account registered", "Congratulation",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        due("Account been taken");
                    }

                    //记得清空
                }
            }
        }

        //TODO
    }

    private void due(String a)
    {
        JOptionPane.showMessageDialog(this, a, "Warning",
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void Owner_Back (MouseEvent evt) {
        Panel_login.removeAll();
        Panel_login.repaint();
        Panel_login.add(Account_input);
        Panel_login.add(Exit);
        Panel_login.add(Login);       
        Panel_login.add(Register);
        Panel_login.add(label_Acc);
        Panel_login.add(label_Password);
        Panel_login.add(passwordfield_main);
        Panel_login.repaint();
    }
    
    private void login_pannel()
    {   Panel_login.removeAll();
        Panel_login.repaint();
        Panel_login.add(Account_input);
        Panel_login.add(Exit);
        Panel_login.add(Login);       
        Panel_login.add(Register);
        Panel_login.add(label_Acc);
        Panel_login.add(label_Password);
        Panel_login.add(passwordfield_main);
        Panel_login.repaint();
    }

    private void User_reg_click (MouseEvent evt) {
        Panel_login.removeAll();
        Panel_login.repaint();

        label_own_reg.setText("User Register");
        Panel_login.add(Owner_Back);
        Panel_login.add(User_OK);
        Panel_login.add(Owner_Pass);
        Panel_login.add(Owner_account);
        Panel_login.add(Owner_label1);
        Panel_login.add(Owner_label2);
        Panel_login.add(label_own_reg);
    }

    //Method mouseClicked for Back
    private void Back_reg_click (MouseEvent evt) {
        Panel_login.removeAll();
        Panel_login.repaint();
        Panel_login.add(Account_input);
        Panel_login.add(Exit);
        Panel_login.add(Login);       
        Panel_login.add(Register);
        Panel_login.add(label_Acc);
        Panel_login.add(label_Password);
        Panel_login.add(passwordfield_main);
        Panel_login.repaint();

    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu about = new JMenu("About");

        JMenuItem verson = new JMenuItem("Verson   ");
        JMenuItem help = new JMenuItem("Help   ");
        JMenuItem exit = new JMenuItem("Exit   ");

        about.add(verson);
        about.add(help);
        about.add(exit);

        menuBar.add(about);
    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new GUI_project();
                }
            });
    }

}