/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import java.util.ArrayList;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
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
import javax.swing.Action;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public  class GUI_project  {
    private JMenuBar menuBar;
    private JPanel Panel_login;
    private Controllor ctrl;
<<<<<<< HEAD
    

    //Constructor 
    public GUI_project(){
    	ctrl = new Controllor();
        login_face();
    }
    private void login_face()
    {
=======
    private JPanel panel1;

    //Constructor 
    public GUI_project(){
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        JTextField Account_input;
        JButton Exit;
        JButton Login;

        JButton Register;
        JLabel label_Acc;
        JLabel label_Password;
        JButton Owner_reg;
        JButton User_reg;
        JPasswordField passwordfield_main;
        JButton Owner_OK;
<<<<<<< HEAD
        
        
        
        JLabel label_own_reg;
        
        
=======
        JTextField Owner_Pass;
        JTextField Owner_account;
        JButton Back;
        JButton Owner_Back;
        JLabel Owner_label1;
        JLabel Owner_label2;
        JLabel label_own_reg;
        JButton User_OK;
        ctrl = new Controllor();
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        JFrame frame = new JFrame("GUI_project");

        frame.setSize(1000,1000);
        //menu generate method
        generateMenu();
        frame.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,600));
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
                    System.exit(0);
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
        passwordfield_main = new JPasswordField();
        passwordfield_main.setBounds(150,81,126,30);
        passwordfield_main.setBackground(new Color(214,217,223));
        passwordfield_main.setForeground(new Color(0,0,0));
        passwordfield_main.setEnabled(true);
        passwordfield_main.setFont(new Font("sansserif",0,12));
        passwordfield_main.setVisible(true);
        Login.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    if (Account_input.getText().trim().equals("")
                    || Account_input.getText().length()==0 || String.valueOf( passwordfield_main.getPassword()).equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Input something", "Warning",
                            JOptionPane.INFORMATION_MESSAGE);
<<<<<<< HEAD
                        Account_input.requestFocus();
=======
                        Account_input.requestFocus();//获取焦点
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                        return;
                    }
                    else
                    {
                        String whole = Account_input.getText().trim() + "/" + String.valueOf(passwordfield_main.getPassword());
                        //System.out.println(whole);
                        if(whole.equals("a/a"))
                        {
                            JOptionPane.showMessageDialog(null,  "Welcome login in", "Owner Admin",
                                JOptionPane.INFORMATION_MESSAGE);
<<<<<<< HEAD
                             
                            manageMenu();
                            frame.dispose();
=======
                            Panel_login.setVisible(false); 
                            panel1.setVisible(true);

                            //owner_manage_interface();
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f

                        }
                        else
                        if(ctrl.login_validation(whole))
                        {
                            JOptionPane.showMessageDialog(null, Account_input.getText().trim() + " Welcome login in", "Hello",
                                JOptionPane.INFORMATION_MESSAGE);
<<<<<<< HEAD
                            userMenu();
                            frame.dispose();
=======

>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                        }
                        else
                        {
                            due("Check your account information");
                        }

                    }
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

        //adding components to contentPane panel
        Panel_login.add(Account_input);
        Panel_login.add(Exit);
        Panel_login.add(Login);

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

       

        label_own_reg = new JLabel();
        label_own_reg.setBounds(11,13,90,35);
        label_own_reg.setBackground(new Color(214,217,223));
        label_own_reg.setForeground(new Color(0,0,0));
        label_own_reg.setEnabled(true);
        label_own_reg.setFont(new Font("sansserif",0,12));
        label_own_reg.setText("User Register");
        label_own_reg.setVisible(true);
        Register.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    reg_Interface();
                }
            });
        contentPane.add(Panel_login);
        

        //adding panel to JFrame and seting of window position and close operation
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    
    private void due(String a)
    {
        JOptionPane.showMessageDialog(null, a, "Warning",
            JOptionPane.INFORMATION_MESSAGE);
    }
    private void due(String b, String a)
    {
    	JOptionPane.showMessageDialog(null, a, b,
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void reg_Interface()
    {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        
        JButton Owner_Back;
        JLabel Owner_label1;
        JLabel Owner_label2;
        JButton User_OK;
        JTextField Owner_Pass;
        JTextField Owner_account;
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,600));
        contentPane.setBackground(new Color(192,192,192));
         Owner_Back = new JButton();
        Owner_Back.setBounds(179,230,90,35);
        Owner_Back.setBackground(new Color(214,217,223));
        Owner_Back.setForeground(new Color(0,0,0));
        Owner_Back.setEnabled(true);
        Owner_Back.setFont(new Font("sansserif",0,12));
        Owner_Back.setText("Cancel");
        Owner_Back.setVisible(true);
        Owner_Back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
<<<<<<< HEAD
                   frame.dispose(); 
=======
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
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                }
            });

        User_OK = new JButton();
        User_OK.setBounds(58,230,90,35);
        User_OK.setBackground(new Color(214,217,223));
        User_OK.setForeground(new Color(0,0,0));
        User_OK.setEnabled(true);
        User_OK.setFont(new Font("sansserif",0,12));
        User_OK.setText("OK");
        User_OK.setVisible(true);
        Owner_Pass = new JTextField();
<<<<<<< HEAD
        Owner_Pass.setBounds(156,80,123,33);
=======
        Owner_Pass.setBounds(156,88,123,33);
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        Owner_Pass.setBackground(new Color(255,255,255));
        Owner_Pass.setForeground(new Color(0,0,0));
        Owner_Pass.setEnabled(true);
        Owner_Pass.setFont(new Font("sansserif",0,12));
        Owner_Pass.setText("");
        Owner_Pass.setVisible(true);

        Owner_account = new JTextField();
<<<<<<< HEAD
        Owner_account.setBounds(156,30,124,32);
=======
        Owner_account.setBounds(156,50,124,32);
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        Owner_account.setBackground(new Color(255,255,255));
        Owner_account.setForeground(new Color(0,0,0));
        Owner_account.setEnabled(true);
        Owner_account.setFont(new Font("sansserif",0,12));
        Owner_account.setText("");
        Owner_account.setVisible(true);
<<<<<<< HEAD
        
        JTextField address = new JTextField();       
        address.setBounds(156,130,123,33);
        address.setBackground(new Color(255,255,255));
        address.setForeground(new Color(0,0,0));
        address.setEnabled(true);
        address.setFont(new Font("sansserif",0,12));
        address.setText("");
        address.setVisible(true);

        JTextField payment = new JTextField();
        payment.setBounds(156,180,124,32);
        payment.setBackground(new Color(255,255,255));
        payment.setForeground(new Color(0,0,0));
        payment.setEnabled(true);
        payment.setFont(new Font("sansserif",0,12));
        payment.setText("");
        payment.setVisible(true);
        
=======
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        User_OK.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    String a = Owner_account.getText().trim();
                    String b = Owner_Pass.getText().trim();
                    String c = address.getText().trim();
                    String d = payment.getText().trim();
                    if (a.isEmpty()||b.isEmpty()||c.isEmpty()||d.isEmpty())    
                    {
                        due("Input something");
                        Owner_account.requestFocus();         
                    }
                    else
                    {
                        if (a.charAt(0) == '-' || a.charAt(a.length()-1) == '-' || a.length() > 15 || a.length() < 2)
                        { due("No '-' in head and tail and 2 <= length < 15 characters");

                            Owner_account.requestFocus();
                        }
                        else
                        {
                            if(b.length() > 15)
                            {
                                due("Password length < 15");
                            }
                            else
                            {
                                if(ctrl.addCustomerList(a+"/"+b+"/"+c+"/"+"d"))
                                {
                                    JOptionPane.showMessageDialog(null, "User account registered", "Congratulation",
                                        JOptionPane.INFORMATION_MESSAGE);
<<<<<<< HEAD
                                    frame.dispose();    
                                   
=======
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
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                                }
                                else
                                {
                                    due("Account been taken");
                                }

                            }
                        }
                    }
                }
            });

        Owner_label1 = new JLabel();
        Owner_label1.setBounds(56,30,90,35);
        Owner_label1.setBackground(new Color(214,217,223));
        Owner_label1.setForeground(new Color(0,0,0));
        Owner_label1.setEnabled(true);
        Owner_label1.setFont(new Font("sansserif",0,12));
        Owner_label1.setText("Account:");
        Owner_label1.setVisible(true);

        Owner_label2 = new JLabel();
        Owner_label2.setBounds(56,80,90,35);
        Owner_label2.setBackground(new Color(214,217,223));
        Owner_label2.setForeground(new Color(0,0,0));
        Owner_label2.setEnabled(true);
        Owner_label2.setFont(new Font("sansserif",0,12));
        Owner_label2.setText("Password");
        Owner_label2.setVisible(true);
        
        JLabel addlabel = new JLabel();
        addlabel.setBounds(56,130,90,35);
        addlabel.setBackground(new Color(214,217,223));
        addlabel.setForeground(new Color(0,0,0));
        addlabel.setEnabled(true);
        addlabel.setFont(new Font("sansserif",0,12));
        addlabel.setText("Address");
        addlabel.setVisible(true);
        
        JLabel paylabel = new JLabel();
        paylabel.setBounds(56,180,90,35);
        paylabel.setBackground(new Color(214,217,223));
        paylabel.setForeground(new Color(0,0,0));
        paylabel.setEnabled(true);
        paylabel.setFont(new Font("sansserif",0,12));
        paylabel.setText("payment");
        paylabel.setVisible(true);
        
        JPanel panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(28,129,550,391);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        //adding components to contentPane panel
        panel1.add(Owner_Back);
        panel1.add(Owner_label1);
        panel1.add(paylabel);
        panel1.add(addlabel);
        panel1.add(Owner_label2);
        panel1.add(User_OK);
        panel1.add(Owner_Pass);
        panel1.add(Owner_account);
        panel1.add(payment);
        panel1.add(address);
        
        contentPane.add(panel1);

<<<<<<< HEAD
=======
        label_own_reg = new JLabel();
        label_own_reg.setBounds(11,13,90,35);
        label_own_reg.setBackground(new Color(214,217,223));
        label_own_reg.setForeground(new Color(0,0,0));
        label_own_reg.setEnabled(true);
        label_own_reg.setFont(new Font("sansserif",0,12));
        label_own_reg.setText("User Register");
        label_own_reg.setVisible(true);
        Register.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
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
            });
        contentPane.add(Panel_login);
        owner_manage_interface(contentPane);

>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        //adding panel to JFrame and seting of window position and close operation
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
<<<<<<< HEAD
    }

    private void owner_manage_interface()
=======

    }
    //Method mouseClicked for Exit

    //Method mouseClicked for Register
    private void due(String a)
    {
        JOptionPane.showMessageDialog(null, a, "Warning",
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void owner_manage_interface(JPanel a)
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    {
        JPanel panel1;
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JLabel label1;
<<<<<<< HEAD
        
        JFrame frame = new JFrame("Manage");
        frame.setSize(600,600);
        JPanel contentPane = new JPanel(null);
=======

        //menu generate method
        //generateMenu();
        //this.setJMenuBar(menuBar);

        //pane with null layout
        //JPanel contentPane = new JPanel(null);
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f

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
<<<<<<< HEAD
                    create_face("","", "12", "10", "01-01-2018", "01-01-2019", "Yes", "100", "Create");
=======
                    create_face("", "12", "10", "01-01-2018", "01-01-2019", "Yes", "100", "Create");
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
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
        //edit
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    edit_face("Edit");
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
        //remove
        button3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    edit_face("Remove");
                }
            });

        button4 = new JButton();
        button4.setBounds(69,222,90,35);
        button4.setBackground(new Color(214,217,223));
        button4.setForeground(new Color(0,0,0));
        button4.setEnabled(true);
        button4.setFont(new Font("sansserif",0,12));
        button4.setText("Back");
        button4.setVisible(true);
        button4.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {                    
                    manageMenu();
                    frame.dispose();
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
        
        contentPane.setPreferredSize(new Dimension(600,600));
        contentPane.setBackground(new Color(192,192,192));        
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(label1);
        contentPane.add(panel1);
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        //adding panel to JFrame and seting of window position and close operation

    }

    private void edit_face(String a)
<<<<<<< HEAD
    {
        JFrame frame = new JFrame(a);
        JButton back;
        JList m_e_list;
        JTextField textfield6;
        JPanel panel_Edit;
        JLabel label6 = new JLabel();
        frame.setSize(600, 600);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,600));
        contentPane.setBackground(new Color(192,192,192));
        back = new JButton();
        back.setBounds(200,350,90,35);
        back.setBackground(new Color(214,217,223));
        back.setForeground(new Color(0,0,0));
        back.setEnabled(true);
        back.setFont(new Font("sansserif",0,12));
        back.setText("Back");
        back.setVisible(true);
        back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    frame.dispose();
                }
            });

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

        DefaultListModel<String> model = new DefaultListModel<>();
        textfield6.addCaretListener(new CaretListener() {
                public void caretUpdate(CaretEvent ce)
                {
                    if(a.equals("Edit")||a.equals("Remove")||a.equals("SP"))
                    {
                    model.clear();
                    m_e_list.setModel(model);
                    ArrayList<String> temp = new ArrayList<String>();
                    if(textfield6.getText().trim().isEmpty())
                    {
                    	 temp = ctrl.findProduct();                                        
                         for(String item : temp)
                         {
                             if(model.contains(item))
                             {}
                             else
                                 model.addElement(item);
                         }
                         m_e_list.setModel(model);
                    }
                    else{
                        temp = ctrl.findProduct(textfield6.getText().trim());                                        
                        for(String item : temp)
                        {
                            if(model.contains(item))
                            {}
                            else
                                model.addElement(item);
                        }
                        m_e_list.setModel(model);

                    }
                }
                if(a.equals("MA"))
                {
                     model.clear();
                    m_e_list.setModel(model);
                    ArrayList<String> temp = new ArrayList<String>();
                    if(textfield6.getText().trim().isEmpty())
                    {
                    }
                     else{
                        temp = ctrl.containAccount(textfield6.getText().trim());                                        
                        for(String item : temp)
                        {
                            if(model.contains(item))
                            {}
                            else
                                model.addElement(item);
                        }
                        m_e_list.setModel(model);

                    }
                }
                
                if(a.equals("UserSearch"))
                {
                	 model.clear();
                     m_e_list.setModel(model);
                     ArrayList<String> temp = new ArrayList<String>();
                     if(textfield6.getText().trim().isEmpty())
                     {
                    	 temp = ctrl.userFindProduct();                                        
                         for(String item : temp)
                         {
                             if(model.contains(item))
                             {}
                             else
                                 model.addElement(item);
                         }
                         m_e_list.setModel(model);
                    	 
                     }
                     else{
                         temp = ctrl.userFindProduct(textfield6.getText().trim());                                        
                         for(String item : temp)
                         {
                             if(model.contains(item))
                             {}
                             else
                                 model.addElement(item);
                         }
                         m_e_list.setModel(model);

                     }
                }
                		
                if(a.equals("UserOrder"))
                {
                	 model.clear();
                     m_e_list.setModel(model);
                     ArrayList<String> temp = new ArrayList<String>();
                     
                     
                         temp = ctrl.orderList(textfield6.getText().trim());                                        
                         for(String item : temp)
                         {
                             if(model.contains(item))
                             {}
                             else
                                 model.addElement(item);
                         }
                         m_e_list.setModel(model);

                     
                }
                if(a.equals("ViewChart"))
                {

               	 model.clear();
                    m_e_list.setModel(model);
                    ArrayList<String> temp = new ArrayList<String>();
                    if(textfield6.getText().trim().isEmpty())
                    {
                   	 temp = ctrl.shopChart("");                                        
                        for(String item : temp)
                        {
                            if(model.contains(item))
                            {}
                            else
                                model.addElement(item);
                        }
                        m_e_list.setModel(model);
                   	 
                    }
                    else{
                        temp = ctrl.shopChart(textfield6.getText().trim());                                        
                        for(String item : temp)
                        {
                            if(model.contains(item))
                            {}
                            else
                                model.addElement(item);
                        }
                        m_e_list.setModel(model);

                    }
                }
                
                }
            });

        m_e_list.addMouseListener(new MouseAdapter()
            {

                public void mouseClicked(MouseEvent e)
                {

                    if(m_e_list.getSelectedIndex()!=-1)
                    {
                        if(e.getClickCount()==2)
                        {
                             String tmp = m_e_list.getSelectedValue().toString();
                             
                            if(a.equals("Edit"))
                            {
                               
                                doubleClick(tmp);
                            }
                            if(a.equals("Remove"))
                            {
                                int result = JOptionPane.showConfirmDialog(null, "Sure Remove?",
                                                        "Remove", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                                                if(result == JOptionPane.OK_OPTION)
                                                {
                                                    ctrl.removeproduct(tmp);

                                                }
                                
                            }
                            if(a.equals("MA"))
                            {
                                int result = JOptionPane.showConfirmDialog(null, "Sure Remove?",
                                                        "Remove", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                                                if(result == JOptionPane.OK_OPTION)
                                                {
                                                    ctrl.removeAC(tmp);

                                                }
                            }
                            if(a.equals("UserSearch"))
                            {
                            	String[] check = tmp.split("/");
                            	userQuantitySelection(check[0], check[1], check[2], check[3], check[4], check[5],check[6]);
                            }
                            if(a.equals("ViewChart"))
                            {
                            	String[] check = tmp.split("/");
                            	int tmpquant = Integer.parseInt(ctrl.getQuantity(check[5]))+Integer.parseInt(check[1]);
                            	String tmpid = check[5]+"/"+tmpquant;
                            	//userQuantitySelection(check[0], Integer.toString(tmpquant), check[2], check[3], check[4] ,"",check[5]);
                            	edit_Quantity(2, tmpid);
                            }
                            
                            if(a.equals("UserOrder"))
                            {
                            	int result = JOptionPane.showConfirmDialog(null, "Purchase?",
                                        "Purchase", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                                if(result == JOptionPane.OK_OPTION)
                                {
                                    ctrl.purchase(tmp);

                                }
                            }
                            
                            model.clear();
                            m_e_list.setModel(model);
                        }

                    }

                }

            });

        //adding components to contentPane panel
        JButton createOrder;
        createOrder = new JButton();
        createOrder.setBounds(30,350,140,35);
        createOrder.setBackground(new Color(214,217,223));
        createOrder.setForeground(new Color(0,0,0));
        createOrder.setEnabled(true);
        createOrder.setFont(new Font("sansserif",0,12));
        createOrder.setText("Create Order");
        createOrder.setVisible(false);
        createOrder.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    ctrl.addPListToOrder();
                    due("Congratulations","Order added");
                    frame.dispose();
                }
            });
        if(a.equals("ViewChart"))
        	createOrder.setVisible(true);
        panel_Edit.add(label6);
        panel_Edit.add(m_e_list);
        panel_Edit.add(textfield6);
        panel_Edit.add(back);
        panel_Edit.add(createOrder);
        contentPane.add(panel_Edit);
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    public void doubleClick(String a)
    {    

        String[] check = a.split("/");                      
        create_face(check[7],check[0],check[1],check[2],check[3],check[4],check[5],check[6],"Edit");
    }
    
    

    public void edit_Quantity(int a,String ID)
    {
        JFrame frame = new JFrame("Edit Quantity");
        JLabel Quantity;
        JButton button1;
        JButton button2;
        JLabel label2;
        JPanel panel1;
        JTextField textfield1;
        frame.setSize(500,400);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        Quantity = new JLabel();
        Quantity.setBounds(72,78,90,35);
        Quantity.setBackground(new Color(214,217,223));
        Quantity.setForeground(new Color(0,0,0));
        Quantity.setEnabled(true);
        Quantity.setFont(new Font("SansSerif",0,12));
        Quantity.setText("Quantity:");
        Quantity.setVisible(true);

        button1 = new JButton();
        button1.setBounds(39,161,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Confirm");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods

        button2 = new JButton();
        button2.setBounds(181,161,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Cancel");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    frame.dispose();
                }
            });

        label2 = new JLabel();
        label2.setBounds(14,12,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Edit Quantity");
        label2.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(98,78,323,233);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(180,75,100,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        JLabel availQuant= new JLabel();
    	availQuant.setBounds(100,50,140,35);
    	availQuant.setVisible(false);
    	availQuant.setBackground(new Color(255,255,255));
    	availQuant.setForeground(new Color(0,0,0));
    	availQuant.setEnabled(true);
    	availQuant.setFont(new Font("sansserif",0,12));
    	if(a==2)
    	{
    		String[] check =ID.split("/");
    		availQuant.setText("Total available: "+check[1]);
    		availQuant.setVisible(true);
    	}
    	panel1.add(availQuant);
        
        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    if(a==1)
                    {
                        if(ctrl.isInteger(textfield1.getText().trim()))
                        {
                            ctrl.EditProduct(ID,textfield1.getText().trim());
                            frame.dispose();
                        }
                        else
                        {
                            due("Input number please");

                        }
                    }
                    if(a==2)
                    {
                    	                   	                    	
                    	String[] check =ID.split("/");
                    	
                    	 if(ctrl.isInteger(textfield1.getText().trim()))
                         {
                    		 if(Integer.parseInt(textfield1.getText().trim())==0)
                    		 {
                    			 int result = JOptionPane.showConfirmDialog(null, "Remove product?",
                                         "Remove?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                                 if(result == JOptionPane.OK_OPTION)
                                 {
                                     ctrl.removeTmpproduct(check[0]);
                                     frame.dispose();

                                 }
                    		 }
                    		 else
                    		 if(Integer.parseInt(textfield1.getText().trim())<=Integer.parseInt(check[1]))
                    		 {
                    			 ctrl.editTmpProduct(check[0],textfield1.getText().trim());
                    			 ctrl.EditProduct(check[0], (Integer.parseInt(check[1])-Integer.parseInt(textfield1.getText().trim()))+"");
                    			 availQuant.setVisible(false);
                    			 due("Congratulations","Quantity changed");
                    			 frame.dispose();
                    		 }
                    		 
                    		 else
                    			 due("More than available");
                             
                             
                         }
                         else
                         {
                             due("Input number please");

                         }
                    }

                }
            });

        //adding components to contentPane panel
        panel1.add(Quantity);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(label2);
        contentPane.add(panel1);
        panel1.add(textfield1);

        //adding panel to JFrame and seting of window position and close operation
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    private void create_face(String ID, String n, String q, String p,String md,String ed,String don,String discount,String b)
    {
=======
    {
        JFrame frame = new JFrame(a);
        JButton back;
        JList m_e_list;
        JTextField textfield6;
        JPanel panel_Edit;
        JLabel label6 = new JLabel();
        frame.setSize(600, 600);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,600));
        contentPane.setBackground(new Color(192,192,192));
        back = new JButton();
        back.setBounds(200,350,90,35);
        back.setBackground(new Color(214,217,223));
        back.setForeground(new Color(0,0,0));
        back.setEnabled(true);
        back.setFont(new Font("sansserif",0,12));
        back.setText("Back");
        back.setVisible(true);
        back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    frame.dispose();
                }
            });

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

        DefaultListModel<String> model = new DefaultListModel<>();
        textfield6.addCaretListener(new CaretListener() {
                public void caretUpdate(CaretEvent ce)
                {
                    model.clear();
                    m_e_list.setModel(model);
                    ArrayList<String> temp = new ArrayList<String>();
                    if(textfield6.getText().trim().isEmpty())
                    {}
                    else{
                        temp = ctrl.findProduct(textfield6.getText().trim());                                        
                        for(String item : temp)
                        {
                            if(model.contains(item))
                            {}
                            else
                                model.addElement(item);
                        }
                        m_e_list.setModel(model);

                    }
                }
            });

        m_e_list.addMouseListener(new MouseAdapter()
            {

                public void mouseClicked(MouseEvent e)
                {

                    if(m_e_list.getSelectedIndex()!=-1)
                    {
                        if(e.getClickCount()==2)
                        {
                             String tmp = m_e_list.getSelectedValue().toString();
                            if(a.equals("Edit"))
                            {
                               
                                doubleClick(tmp);
                            }
                            if(a.equals("Remove"))
                            {
                                int result = JOptionPane.showConfirmDialog(null, "Sure Remove?",
                                                        "Remove", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                                                if(result == JOptionPane.OK_OPTION)
                                                {
                                                    ctrl.removeproduct(tmp);

                                                }
                                
                            }
                            model.clear();
                            m_e_list.setModel(model);
                        }

                    }

                }

            });

        //adding components to contentPane panel
        panel_Edit.add(label6);
        panel_Edit.add(m_e_list);
        panel_Edit.add(textfield6);
        panel_Edit.add(back);
        contentPane.add(panel_Edit);
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    public void doubleClick(String a)
    {    

        String[] check = a.split("/");                      
        create_face(check[0],check[1],check[2],check[3],check[4],check[5],check[6],"Edit");
    }
    
    

    public void edit_Quantity(int a,String b)
    {
        JFrame frame = new JFrame("Edit Quantity");
        JLabel Quantity;
        JButton button1;
        JButton button2;
        JLabel label2;
        JPanel panel1;
        JTextField textfield1;
        frame.setSize(500,400);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        Quantity = new JLabel();
        Quantity.setBounds(72,78,90,35);
        Quantity.setBackground(new Color(214,217,223));
        Quantity.setForeground(new Color(0,0,0));
        Quantity.setEnabled(true);
        Quantity.setFont(new Font("SansSerif",0,12));
        Quantity.setText("Quantity:");
        Quantity.setVisible(true);

        button1 = new JButton();
        button1.setBounds(39,161,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Confirm");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods

        button2 = new JButton();
        button2.setBounds(181,161,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Cancel");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    frame.dispose();
                }
            });

        label2 = new JLabel();
        label2.setBounds(14,12,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Edit Quantity");
        label2.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(98,78,323,233);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(180,75,90,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    if(a==1)
                    {
                        if(ctrl.isInteger(textfield1.getText().trim()))
                        {
                            ctrl.EditProduct(b,textfield1.getText().trim());
                            frame.dispose();
                        }
                        else
                        {
                            due("Input number please");

                        }
                    }

                }
            });

        //adding components to contentPane panel
        panel1.add(Quantity);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(label2);
        contentPane.add(panel1);
        panel1.add(textfield1);

        //adding panel to JFrame and seting of window position and close operation
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    private void create_face(String n, String q, String p,String md,String ed,String don,String discount,String b)
    {
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        JCheckBox m_d_Checkbox;
        JTextField m_c_pp;
        JTextField m_c_pn;
        JTextField m_c_pq;
        JTextField m_c_mdate;
        JTextField m_c_expdate;
        JTextField m_c_dis;
        JFrame frame = new JFrame(b);
        JPanel panel_create;
        JButton button1;
        JButton button2;
        JLabel label1;
        JLabel label2;
        JLabel label3;
        JLabel label4;
        JLabel label5;

        frame.setSize(600, 600);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,600));
        contentPane.setBackground(new Color(192,192,192));
        button1 = new JButton();
        button1.setBounds(62,400,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText(b);
        button1.setVisible(true);
        //Set methods for mouse events
        //create

        button2 = new JButton();
        button2.setBounds(185,400,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Cancel");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    frame.dispose();
                }
            });

        m_d_Checkbox = new JCheckBox();
        m_d_Checkbox.setBounds(213,330,90,35);
        m_d_Checkbox.setBackground(new Color(214,217,223));
        m_d_Checkbox.setForeground(new Color(0,0,0));
        m_d_Checkbox.setEnabled(true);
        m_d_Checkbox.setFont(new Font("sansserif",0,12));
        if(don.equals("Yes"))
            m_d_Checkbox.setSelected(true);
        else
            m_d_Checkbox.setSelected(false);
        m_d_Checkbox.setVisible(true);

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
        label3.setBounds(48,230,92,38);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Exp. Date:");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(48,180,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Mfg.Date:");
        label4.setVisible(true);

        JLabel label7 = new JLabel();
        label7.setBounds(300,280,90,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("%");
        label7.setVisible(true);

        JLabel dis = new JLabel();        
        dis = new JLabel();
        dis.setBounds(48,280,90,38);
        dis.setBackground(new Color(214,217,223));
        dis.setForeground(new Color(0,0,0));
        dis.setEnabled(true);
        dis.setFont(new Font("sansserif",0,12));
        dis.setText("Discount:");
        dis.setVisible(true);

        JLabel label8 = new JLabel();
        label8.setBounds(300,130,90,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("AUD");
        label8.setVisible(true);

        JLabel price = new JLabel();        
        price = new JLabel();
        price.setBounds(48,130,90,38);
        price.setBackground(new Color(214,217,223));
        price.setForeground(new Color(0,0,0));
        price.setEnabled(true);
        price.setFont(new Font("sansserif",0,12));
        price.setText("Price:");
        price.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(48,330,108,31);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Donate to Charity");
        label5.setVisible(true);

        panel_create = new JPanel(null);
        panel_create.setBorder(BorderFactory.createEtchedBorder(1));
        panel_create.setBounds(85,26,400,500);
        panel_create.setBackground(new Color(214,217,223));
        panel_create.setForeground(new Color(0,0,0));
        panel_create.setEnabled(true);
        panel_create.setFont(new Font("sansserif",0,12));
        panel_create.setVisible(true);

        m_c_pn = new JTextField();
        m_c_pn.setBounds(180,30,104,34);
        m_c_pn.setBackground(new Color(255,255,255));
        m_c_pn.setForeground(new Color(0,0,0));
        m_c_pn.setEnabled(true);
        m_c_pn.setFont(new Font("sansserif",0,12));
        m_c_pn.setText(n);
        m_c_pn.setVisible(true);

        m_c_pq = new JTextField();
        m_c_pq.setBounds(180,80,104,34);
        m_c_pq.setBackground(new Color(255,255,255));
        m_c_pq.setForeground(new Color(0,0,0));
        m_c_pq.setEnabled(true);
        m_c_pq.setFont(new Font("SansSerif",0,12));
        m_c_pq.setText(q);
        m_c_pq.setVisible(true);

        m_c_pp = new JTextField();
        m_c_pp.setBounds(180,130,104,34);
        m_c_pp.setBackground(new Color(255,255,255));
        m_c_pp.setForeground(new Color(0,0,0));
        m_c_pp.setEnabled(true);
        m_c_pp.setFont(new Font("SansSerif",0,12));
        m_c_pp.setText(p);
        m_c_pp.setVisible(true);

        m_c_mdate = new JTextField();
        m_c_mdate.setBounds(180,180,104,34);
        m_c_mdate.setBackground(new Color(255,255,255));
        m_c_mdate.setForeground(new Color(0,0,0));
        m_c_mdate.setEnabled(true);
        m_c_mdate.setFont(new Font("sansserif",0,12));
        m_c_mdate.setText(md);
        m_c_mdate.setVisible(true);

        m_c_expdate = new JTextField();
        m_c_expdate.setBounds(180,230,104,34);
        m_c_expdate.setBackground(new Color(255,255,255));
        m_c_expdate.setForeground(new Color(0,0,0));
        m_c_expdate.setEnabled(true);
        m_c_expdate.setFont(new Font("sansserif",0,12));
        m_c_expdate.setText(ed);
        m_c_expdate.setVisible(true);

        m_c_dis = new JTextField();
        m_c_dis.setBounds(180,280,104,34);
        m_c_dis.setBackground(new Color(255,255,255));
        m_c_dis.setForeground(new Color(0,0,0));
        m_c_dis.setEnabled(true);
        m_c_dis.setFont(new Font("sansserif",0,12));
        m_c_dis.setText(discount);
        m_c_dis.setVisible(true);

        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) 
                {
                    if(ctrl.isKG(m_c_pq.getText().trim()))
                    {
                        if(ctrl.isValidDate(m_c_mdate.getText().trim()) && ctrl.isValidDate(m_c_expdate.getText().trim()))
                        {
                            if(ctrl.compareDate(m_c_mdate.getText().trim(),m_c_expdate.getText().trim()))
                            {
                                if(ctrl.isInteger(m_c_dis.getText().trim()))
                                {
<<<<<<< HEAD
                                    if(ctrl.isDouble(m_c_pp.getText().trim()))
=======
                                    if(ctrl.isInteger(m_c_pp.getText().trim()))
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                                    {
                                        String checkbox;
                                        if(m_d_Checkbox.isSelected())
                                        {
                                            checkbox="Yes";
                                        }
                                        else
                                        {
                                            checkbox="No";
                                        }
                                        String a = m_c_pn.getText().trim()+"/"+m_c_pq.getText().trim()+
                                            "/"+ m_c_pp.getText().trim() + "/" + m_c_mdate.getText().trim()+"/"+m_c_expdate.getText().trim()+"/"+checkbox+"/"+
<<<<<<< HEAD
                                            m_c_dis.getText().trim();
                                        String tmp = ctrl.containProduct(a);
=======
                                            m_c_dis.getText().trim()+"%";

>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                                        if(b.equals("Create"))
                                        {

                                            
<<<<<<< HEAD
                                            if(!(tmp==null))
=======
                                            if(ctrl.containProduct(a))
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                                            {

                                                int result = JOptionPane.showConfirmDialog(null, "Item contained, Edit quantity?",
                                                        "Edit?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                                                if(result == JOptionPane.OK_OPTION)
                                                {
<<<<<<< HEAD
                                                    edit_Quantity(1,tmp);
=======
                                                    edit_Quantity(1,a);
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f

                                                }

                                            }
                                            else
                                            {
                                                ctrl.createproduct(a);
                                                due(a);
                                            }
                                        }
                                        else
                                        {
<<<<<<< HEAD
                                            ctrl.EditProduct(tmp,n,q,p,md,ed,don,discount,a);
=======
                                            ctrl.EditProduct(n,q,p,md,ed,don,discount,a);
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                                            due(a);
                                            frame.dispose();

                                        }
                                    }
                                    else
                                        due("Price issues");
                                }
                                else
                                {
                                    due("Discount issues");
                                }

                            }
                            else
                                due("Make Date after produce Date");
                        }
                        else
                        {
                            due("Date issues");
                        }
                    }
                    else
                    {
                        due("Quantity issues");
                    }

                }
            });

        //adding components to contentPane panel
        panel_create.add(button1);
        panel_create.add(button2);
        panel_create.add(m_d_Checkbox);
        panel_create.add(label1);
        panel_create.add(label2);
        panel_create.add(label3);
        panel_create.add(label4);
        panel_create.add(label5);
        panel_create.add(price);
        panel_create.add(dis);
        panel_create.add(m_c_pn);
        panel_create.add(m_c_pq);
        panel_create.add(m_c_pp);
        panel_create.add(m_c_mdate);
        panel_create.add(m_c_expdate);
        panel_create.add(m_c_dis);
        panel_create.add(label7);
        panel_create.add(label8);
        contentPane.add(panel_create);

        frame.add(contentPane);        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

<<<<<<< HEAD
    }

    public void manageMenu()
    {
        JButton button1;
        JButton button2;
        JButton button3;
        JPanel panel1;
        JFrame frame = new JFrame("ManageMenu");
        frame.setSize(500,400);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));
        button1 = new JButton();
        button1.setBounds(93,32,132,32);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Manage Product");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt)
            {
                owner_manage_interface();
                
            }
        });


        button2 = new JButton();
        button2.setBounds(93,91,132,32);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Manage Account");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt)
            {
                edit_face("MA");
            }
        });


        button3 = new JButton();
        button3.setBounds(93,155,132,32);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Logout");
        button3.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt)
            {
                
                 
                 login_face();
                 frame.dispose();
                
            }
        });


        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(95,102,326,215);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        contentPane.add(panel1);

        //adding panel to JFrame and seting of window position and close operation
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void userMenu()
    {
    	 JButton button1;
    	 JButton button2;
    	 JButton button4;
    	 JButton button5;
    	JButton button3;
    	JLabel label1;
    	 JPanel panel1;
    	 
    	 JFrame frame = new JFrame("User Menu");
    	 frame.setSize(600, 600);
    	 JPanel contentPane = new JPanel(null);
 		contentPane.setPreferredSize(new Dimension(500,400));
 		contentPane.setBackground(new Color(192,192,192));
 		button1 = new JButton();
		button1.setBounds(13,69,90,35);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("sansserif",0,12));
		button1.setText("Search");
		button1.setVisible(true);
		//Set methods for mouse events
		//Call defined methods
		button1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				edit_face("UserSearch");
			}
		});
		
		button4 = new JButton();
		button4.setBounds(13,140,90,35);
		button4.setBackground(new Color(214,217,223));
		button4.setForeground(new Color(0,0,0));
		button4.setEnabled(true);
		button4.setFont(new Font("sansserif",0,12));
		button4.setText("View chart");
		button4.setVisible(true);
		//Set methods for mouse events
		//Call defined methods
		button4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				edit_face("ViewChart");
			}
		});
		
		button5 = new JButton();
		button5.setBounds(126,140,90,35);
		button5.setBackground(new Color(214,217,223));
		button5.setForeground(new Color(0,0,0));
		button5.setEnabled(true);
		button5.setFont(new Font("sansserif",0,12));
		button5.setText("Edit Profile");
		button5.setVisible(true);
		//Set methods for mouse events
		//Call defined methods
		button5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				//edit_face("EditProfile");
			}
		});


		button2 = new JButton();
		button2.setBounds(126,69,90,35);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("sansserif",0,12));
		button2.setText("View order");
		button2.setVisible(true);
		//Set methods for mouse events
		//Call defined methods
		button2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				edit_face("UserOrder");
			}
		});


		button3 = new JButton();
		button3.setBounds(237,69,90,35);
		button3.setBackground(new Color(214,217,223));
		button3.setForeground(new Color(0,0,0));
		button3.setEnabled(true);
		button3.setFont(new Font("sansserif",0,12));
		button3.setText("logout");
		button3.setVisible(true);
		//Set methods for mouse events
		//Call defined methods
		button3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				frame.dispose();
				login_face();
			}
		});

		

		label1 = new JLabel();
		label1.setBounds(16,8,90,35);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("User");
		label1.setVisible(true);

		panel1 = new JPanel(null);
		panel1.setBorder(BorderFactory.createEtchedBorder(1));
		panel1.setBounds(74,93,400,400);
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
		panel1.add(button5);
		panel1.add(label1);
		contentPane.add(panel1);

		//adding panel to JFrame and seting of window position and close operation
		frame.add(contentPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);

=======
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    }

    public void userQuantitySelection(String n, String q, String p,String made, String expr, String disc,String ID)
    {
    	 JButton Cancel;
    	 JLabel Dis;
    	 JLabel ExprD;
    	 JLabel MD;
    	 JLabel Name;
    	 JLabel Q;
    	 JTextField QS;
    	 JLabel label1;
    	 JLabel label11;
    	 JLabel label2;
    	 JLabel label3;
    	 JLabel label4;
    	 JLabel label5;
    	 JLabel label13;
    	 JLabel price;
    	 JPanel panel1;
    	 JButton purchase;
    	 JLabel total;
    	 JFrame frame = new JFrame("Select Quantity");
    	 frame.setSize(600, 600);
    	 JPanel contentPane = new JPanel(null);
 		contentPane.setPreferredSize(new Dimension(600,600));
 		contentPane.setBackground(new Color(192,192,192));

 		Cancel = new JButton();
		Cancel.setBounds(171,338,90,35);
		Cancel.setBackground(new Color(214,217,223));
		Cancel.setForeground(new Color(0,0,0));
		Cancel.setEnabled(true);
		Cancel.setFont(new Font("sansserif",0,12));
		Cancel.setText("Cancel");
		Cancel.setVisible(true);

		
		Dis = new JLabel();
		Dis.setBounds(191,180,90,35);
		Dis.setBackground(new Color(214,217,223));
		Dis.setForeground(new Color(0,0,0));
		Dis.setEnabled(true);
		Dis.setFont(new Font("sansserif",0,12));
		Dis.setText(disc);
		Dis.setVisible(true);

		ExprD = new JLabel();
		ExprD.setBounds(191,140,90,35);
		ExprD.setBackground(new Color(214,217,223));
		ExprD.setForeground(new Color(0,0,0));
		ExprD.setEnabled(true);
		ExprD.setFont(new Font("sansserif",0,12));
		ExprD.setText(expr);
		ExprD.setVisible(true);

		MD = new JLabel();
		MD.setBounds(191,100,90,35);
		MD.setBackground(new Color(214,217,223));
		MD.setForeground(new Color(0,0,0));
		MD.setEnabled(true);
		MD.setFont(new Font("sansserif",0,12));
		MD.setText(made);
		MD.setVisible(true);

		Name = new JLabel();
		Name.setBounds(191,20,90,35);
		Name.setBackground(new Color(214,217,223));
		Name.setForeground(new Color(0,0,0));
		Name.setEnabled(true);
		Name.setFont(new Font("sansserif",0,12));
		Name.setText(n);
		Name.setVisible(true);

		Q = new JLabel();
		Q.setBounds(191,60,90,35);
		Q.setBackground(new Color(214,217,223));
		Q.setForeground(new Color(0,0,0));
		Q.setEnabled(true);
		Q.setFont(new Font("sansserif",0,12));
		Q.setText(q);
		Q.setVisible(true);

		QS = new JTextField();
		QS.setBounds(168,254,90,35);
		QS.setBackground(new Color(255,255,255));
		QS.setForeground(new Color(0,0,0));
		QS.setEnabled(true);
		QS.setFont(new Font("sansserif",0,12));
		QS.setText("");
		QS.setVisible(true);

		label1 = new JLabel();
		label1.setBounds(62,20,90,35);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("Product Name:");
		label1.setVisible(true);

		label11 = new JLabel();
		label11.setBounds(40,254,107,34);
		label11.setBackground(new Color(214,217,223));
		label11.setForeground(new Color(0,0,0));
		label11.setEnabled(true);
		label11.setFont(new Font("sansserif",0,12));
		label11.setText("Quantity Selection");
		label11.setVisible(true);

		label13 = new JLabel();
		label13.setBounds(63,214,90,35);
		label13.setBackground(new Color(214,217,223));
		label13.setForeground(new Color(0,0,0));
		label13.setEnabled(true);
		label13.setFont(new Font("sansserif",0,12));
		label13.setText("Price");
		label13.setVisible(true);

		label2 = new JLabel();
		label2.setBounds(62,59,109,33);
		label2.setBackground(new Color(214,217,223));
		label2.setForeground(new Color(0,0,0));
		label2.setEnabled(true);
		label2.setFont(new Font("sansserif",0,12));
		label2.setText("Quantity available:");
		label2.setVisible(true);

		label3 = new JLabel();
		label3.setBounds(62,100,90,35);
		label3.setBackground(new Color(214,217,223));
		label3.setForeground(new Color(0,0,0));
		label3.setEnabled(true);
		label3.setFont(new Font("sansserif",0,12));
		label3.setText("Make Date:");
		label3.setVisible(true);

		label4 = new JLabel();
		label4.setBounds(62,140,90,35);
		label4.setBackground(new Color(214,217,223));
		label4.setForeground(new Color(0,0,0));
		label4.setEnabled(true);
		label4.setFont(new Font("sansserif",0,12));
		label4.setText("Expr Date:");
		label4.setVisible(true);

		label5 = new JLabel();
		label5.setBounds(62,180,90,35);
		label5.setBackground(new Color(214,217,223));
		label5.setForeground(new Color(0,0,0));
		label5.setEnabled(true);
		label5.setFont(new Font("sansserif",0,12));
		label5.setText("Discount:");
		label5.setVisible(true);

		panel1 = new JPanel(null);
		panel1.setBorder(BorderFactory.createEtchedBorder(1));
		panel1.setBounds(95,27,297,409);
		panel1.setBackground(new Color(214,217,223));
		panel1.setForeground(new Color(0,0,0));
		panel1.setEnabled(true);
		panel1.setFont(new Font("sansserif",0,12));
		panel1.setVisible(true);

		price = new JLabel();
		price.setBounds(191,215,90,35);
		price.setBackground(new Color(214,217,223));
		price.setForeground(new Color(0,0,0));
		price.setEnabled(true);
		price.setFont(new Font("sansserif",0,12));
		price.setText(p);
		price.setVisible(true);

		purchase = new JButton();
		purchase.setBounds(16,338,120,35);
		purchase.setBackground(new Color(214,217,223));
		purchase.setForeground(new Color(0,0,0));
		purchase.setEnabled(true);
		purchase.setFont(new Font("sansserif",0,12));
		purchase.setText("Add to chart");
		purchase.setVisible(true);	//create order
		
		total = new JLabel();
		total.setBounds(108,291,150,35);
		total.setBackground(new Color(214,217,223));
		total.setForeground(new Color(0,0,0));
		total.setEnabled(true);
		total.setFont(new Font("sansserif",0,12));
		total.setText("Total:");
		total.setVisible(true);
		
		purchase.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent evt)
			{
				int result = JOptionPane.showConfirmDialog(null, "Want to buy " + QS.getText().trim() +" "+ n + " (s)",
                        "Add to chart", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
                if(result == JOptionPane.OK_OPTION)
                {
                	 String a = n+"/"+q+"/"+p+"/"+made+"/"+expr+"/"+"No"+"/"+disc+"/"+ID;
                	 int tmpa=0;
                	 int tmpb=0;
                	 String quant="";
                	 boolean tmpflag=false;
                	 try
                	 {
                		 
                		  tmpa = Integer.parseInt(q);
                		  tmpb = Integer.parseInt(QS.getText().trim());
                		  quant = Integer.toString(tmpa-tmpb);
                		  tmpflag= true;               		                 	               		 
                		
                	 }
     				catch(Exception e)
     				{
     					tmpflag = false;
     					due("Input Number");
     				}
                	 if(tmpflag)
                	 {
                	 if((tmpa-tmpb) >=0 )
            		 { 
            			 ctrl.addProductToOrder(a, QS.getText().trim());
            			 ctrl.EditProduct(ID, quant);
            			 due("Congratulations","Product added");
            			 frame.dispose();
            		 }
            		 else
            			 due("Out of Maxium");
                	 }
     				    				

                }
				
			}
		});
		
		Cancel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt){
				frame.dispose();
			}
		});
		
		QS.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent ce)
            {
            	total.setText("total:");
				try
            	{
					String tmp = disc.replace('%', ' ');
					
            	if(Integer.parseInt(QS.getText().trim()) <= Integer.parseInt(q))
            	total.setText("total: " + Integer.parseInt(QS.getText().trim())
            	*0.01
            	*Double.parseDouble((p.trim())) * Integer.parseInt(tmp.trim())
            	+ " AUD");
            	else
            		total.setText("Out of Maxium");
            	}
            	catch(Exception e)
            	{
            		
            	}
				
			}
		});

		
		

		//adding components to contentPane panel
		panel1.add(Cancel);
		panel1.add(Dis);
		panel1.add(ExprD);
		panel1.add(MD);
		panel1.add(Name);
		panel1.add(Q);
		panel1.add(QS);
		panel1.add(label1);
		panel1.add(label11);
		panel1.add(label13);
		panel1.add(label2);
		panel1.add(label3);
		panel1.add(label4);
		panel1.add(label5);
		contentPane.add(panel1);
		panel1.add(price);
		panel1.add(purchase);
		panel1.add(total);

 		//adding components to contentPane panel
 		panel1.add(Cancel);
 		panel1.add(Dis);
 		panel1.add(ExprD);
 		panel1.add(MD);
 		panel1.add(Name);
 		panel1.add(Q);
 		panel1.add(QS);
 		panel1.add(label1);
 		panel1.add(label11);
 		panel1.add(label2);
 		panel1.add(label3);
 		panel1.add(label4);
 		panel1.add(label5);
 		contentPane.add(panel1);
 		panel1.add(purchase);
 		panel1.add(total);

 		//adding panel to JFrame and seting of window position and close operation
 		frame.add(contentPane);
 		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 		frame.setLocationRelativeTo(null);
 		frame.pack();
 		frame.setVisible(true);
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