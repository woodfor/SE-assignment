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
    private JPanel panel_create;
    private JCheckBox M_D_Checkbox;
    private JTextField m_c_pn;
    private JTextField m_c_pq;
    private JTextField m_c_mdate;
    private JTextField m_c_expdate;
    private JList m_e_list;
    private JPanel panel_Edit;

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

        owner_manage_interface();
        create_face();
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
                panel1.setVisible(true);
                //owner_manage_interface();

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

    private void due(String a)
    {
        JOptionPane.showMessageDialog(this, a, "Warning",
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void Owner_Back (MouseEvent evt) {
        login_pannel();
    }

    private void login_pannel()
    {   
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

    private void owner_manage_interface()
    {

        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JLabel label1;

        //this.setTitle("Manage");
        //this.setSize(500,400);
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
        panel1.setVisible(false);

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(label1);
        contentPane.add(panel1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLocationRelativeTo(null);
        // this.pack();
        //this.setVisible(true);

    }

    public void loginout(MouseEvent evt)
    {
        panel1.setVisible(false);
        Panel_login.setVisible(true);
    }

    public void Create(MouseEvent evt)
    {
        panel1.setVisible(false);
        panel_create.setVisible(true);
    }

    private void create_face()
    {
        JButton button1;
        JButton button2;
        JLabel label1;
        JLabel label2;
        JLabel label3;
        JLabel label4;
        JLabel label5;

        this.setTitle("GUI_project");
        this.setSize(500,400);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(62,298,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Confirm");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Confirm_product_info(evt);
                }
            });

        button2 = new JButton();
        button2.setBounds(185,298,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Back");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Back_to_manage(evt);
                }
            });

        M_D_Checkbox = new JCheckBox();
        M_D_Checkbox.setBounds(213,238,90,35);
        M_D_Checkbox.setBackground(new Color(214,217,223));
        M_D_Checkbox.setForeground(new Color(0,0,0));
        M_D_Checkbox.setEnabled(true);
        M_D_Checkbox.setFont(new Font("sansserif",0,12));
        M_D_Checkbox.setText("");
        M_D_Checkbox.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(48,30,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Product Name:");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(48,80,111,32);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Product Quantity:");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(48,180,92,38);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Exp. Date:");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(48,130,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Mfg.Date:");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(48,240,108,31);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Donate to Charity");
        label5.setVisible(true);

        panel_create = new JPanel(null);
        panel_create.setBorder(BorderFactory.createEtchedBorder(1));
        panel_create.setBounds(85,26,349,356);
        panel_create.setBackground(new Color(214,217,223));
        panel_create.setForeground(new Color(0,0,0));
        panel_create.setEnabled(true);
        panel_create.setFont(new Font("sansserif",0,12));
        panel_create.setVisible(false);

        m_c_pn = new JTextField();
        m_c_pn.setBounds(180,30,104,34);
        m_c_pn.setBackground(new Color(255,255,255));
        m_c_pn.setForeground(new Color(0,0,0));
        m_c_pn.setEnabled(true);
        m_c_pn.setFont(new Font("sansserif",0,12));
        m_c_pn.setText("");
        m_c_pn.setVisible(true);

        m_c_pq = new JTextField();
        m_c_pq.setBounds(180,80,104,34);
        m_c_pq.setBackground(new Color(255,255,255));
        m_c_pq.setForeground(new Color(0,0,0));
        m_c_pq.setEnabled(true);
        m_c_pq.setFont(new Font("SansSerif",0,12));
        m_c_pq.setText("E.g: 12 KG");
        m_c_pq.setVisible(true);

        m_c_mdate = new JTextField();
        m_c_mdate.setBounds(180,180,104,34);
        m_c_mdate.setBackground(new Color(255,255,255));
        m_c_mdate.setForeground(new Color(0,0,0));
        m_c_mdate.setEnabled(true);
        m_c_mdate.setFont(new Font("sansserif",0,12));
        m_c_mdate.setText("E.g: 01-08-2019");
        m_c_mdate.setVisible(true);

        m_c_expdate = new JTextField();
        m_c_expdate.setBounds(180,130,104,34);
        m_c_expdate.setBackground(new Color(255,255,255));
        m_c_expdate.setForeground(new Color(0,0,0));
        m_c_expdate.setEnabled(true);
        m_c_expdate.setFont(new Font("sansserif",0,12));
        m_c_expdate.setText("E.g: 01-08-2018");
        m_c_expdate.setVisible(true);

        //adding components to contentPane panel
        panel_create.add(button1);
        panel_create.add(button2);
        panel_create.add(M_D_Checkbox);
        panel_create.add(label1);
        panel_create.add(label2);
        panel_create.add(label3);
        panel_create.add(label4);
        panel_create.add(label5);
        panel_create.add(m_c_pn);
        panel_create.add(m_c_pq);
        panel_create.add(m_c_mdate);
        panel_create.add(m_c_expdate);
        contentPane.add(panel_create);

        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }

    private void Confirm_product_info (MouseEvent evt) {
        //TODO
    }

    private void Back_to_manage (MouseEvent evt) 
    {
        panel_create.setVisible(false);
        panel1.setVisible(true);
    }

    public void Edit(MouseEvent evt)
    {
        JLabel label6;
        JTextField textfield6;
        this.setTitle("edit");
        this.setSize(609,662);
        label6 = new JLabel();
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(609,662));
        contentPane.setBackground(new Color(192,192,192));
        label6.setBounds(130,85,90,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Search:");
        label6.setVisible(true);

        m_e_list = new JList();
        m_e_list.setBounds(47,156,461,164);
        m_e_list.setBackground(new Color(255,255,255));
        m_e_list.setForeground(new Color(0,0,0));
        m_e_list.setEnabled(true);
        m_e_list.setFont(new Font("sansserif",0,12));
        m_e_list.setVisible(true);
        JScrollPane scrollPane = new JScrollPane(m_e_list);

        panel_Edit = new JPanel(null);
        panel_Edit.setBorder(BorderFactory.createEtchedBorder(1));
        panel_Edit.setBounds(28,129,550,391);
        panel_Edit.setBackground(new Color(214,217,223));
        panel_Edit.setForeground(new Color(0,0,0));
        panel_Edit.setEnabled(true);
        panel_Edit.setFont(new Font("sansserif",0,12));
        panel_Edit.setVisible(true);

        textfield6 = new JTextField();
        textfield6.setBounds(255,85,160,37);
        textfield6.setBackground(new Color(255,255,255));
        textfield6.setForeground(new Color(0,0,0));
        textfield6.setEnabled(true);
        textfield6.setFont(new Font("sansserif",0,12));
        textfield6.setText("");
        textfield6.setVisible(true);
        textfield6.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent evt){

                }
            });

        //adding components to contentPane panel
        panel_Edit.add(label6);
        panel_Edit.add(m_e_list);
        contentPane.add(panel_Edit);
        panel_Edit.add(textfield6);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public void Remove(MouseEvent evt)
    {

        due("Hello");
    }

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