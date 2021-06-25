package schoolsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class manageteachingstaff extends JFrame
{
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("Times new roman",Font.BOLD,90);
    JButton submit;
    JButton b1,b2,b4;
    JTable table,table2;
    JPanel p1,p2,p3,p4;
    JTextField t1,t2,t3,t4,t5,t6,t9,t8,t10;
    JRadioButton male,female,other;
    JComboBox c1,t7,ca;
    manageteachingstaff()
    {
         p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label1=new JLabel("Delhi Public School");
        label1.setBounds(650,80,900,60);
        label1.setForeground(Color.BLACK);
        label1.setFont(f5);
        add(label1);
        
        JLabel sc=new JLabel("Saharanpur Zila,New Delhi 110084,Near Saharanpur Metro Station");
        sc.setBounds(550,170,1000,50);
        sc.setForeground(Color.BLACK);
        sc.setFont(f3);
        add(sc);
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("E");
        String time=sdf2.format(d);
        String date=sdf.format(d);
        
        JLabel l8=new JLabel();
        l8.setText(time);
        l8.setBounds(1620,58,150,40);
        l8.setForeground(Color.ORANGE);
        l8.setFont(f3);
        add(l8);
        
        JLabel l5=new JLabel();
        l5.setText(date);
        l5.setForeground(Color.BLACK);
        l5.setFont(f3);
        l5.setBounds(1720,58,200,40);
        add(l5);
        
        JLabel label=new JLabel("Management of All Teaching staffs");
        label.setBounds(800,8,500,30);
        label.setForeground(Color.BLACK);
        label.setFont(f2);
        p1.add(label);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/first.png"));
        Image i2=i1.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setBounds(1885,5,30,30);
        l1.setIcon(i3);
        p1.add(l1);
        p1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new mainpage().setVisible(true);
                dispose();
            }
        });
        
        p2=new JPanel();
        p2.setBounds(20,280,1000,750);
        p2.setBackground(Color.WHITE);
        p2.setLayout(null);
        add(p2);
        
        JLabel l2=new JLabel("Enter the Details of the Faculty");
        l2.setForeground(Color.BLACK);
        l2.setFont(f4);
        l2.setBounds(75,10,850,80);
        p2.add(l2);
        
        JLabel Fname=new JLabel("First Name");
        Fname.setForeground(new Color(40,198,250));
        Fname.setFont(f3);
        Fname.setBounds(50,150,200,30);
        p2.add(Fname);
        
        t1=new JTextField();
        t1.setForeground(new Color(0,0,0));
        t1.setFont(f2);
        t1.setBounds(240,150,200,30);
        p2.add(t1);
        
        JLabel Lname=new JLabel("Last Name");
        Lname.setForeground(new Color(40,198,250));
        Lname.setFont(f3);
        Lname.setBounds(550,150,200,30);
        p2.add(Lname);
        
        t2=new JTextField();
        t2.setForeground(new Color(0,0,0));
        t2.setFont(f2);
        t2.setBounds(730,150,200,30);
        p2.add(t2);
        
        JLabel age=new JLabel("Age");
        age.setForeground(new Color(40,198,250));
        age.setFont(f3);
        age.setBounds(50,220,200,40);
        p2.add(age);
        
        t3=new JTextField();
        t3.setForeground(new Color(0,0,0));
        t3.setFont(f2);
        t3.setBounds(240,220,50,30);
        p2.add(t3);
        
        JLabel sex=new JLabel("Sex");
        sex.setForeground(new Color(40,198,250));
        sex.setFont(f3);
        sex.setBounds(550,220,200,40);
        p2.add(sex);
        
        male=new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(650,220,100,40);
        male.setFocusable(false);
        male.setFont(f2);
        p2.add(male);
        male.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                if(male.isSelected())
                {
                    male.setSelected(true);
                    female.setSelected(false);
                }
                if(!male.isSelected())
                {
                    male.setSelected(false);
                    female.setSelected(true);
                }
            }
        });
       
        female=new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(750,220,100,40);
        female.setFocusable(false);
        female.setFont(f2);
        p2.add(female);
        female.addMouseListener(new MouseAdapter()
                {
                    public void mouseClicked(MouseEvent me)
                    {
                       if(female.isSelected())
                       {
                            male.setSelected(false);
                            female.setSelected(true);
                       }
                       if(!female.isSelected())
                       {
                            male.setSelected(true);
                            female.setSelected(false);
                       }
                    }
                });
        
        JLabel address=new JLabel("Address");
        address.setForeground(new Color(40,198,250));
        address.setFont(f3);
        address.setBounds(50,290,200,40);
        p2.add(address);
        
        t4=new JTextField();
        t4.setForeground(new Color(0,0,0));
        t4.setFont(f2);
        t4.setBounds(240,290,690,30);
        p2.add(t4);
        
        JLabel tel=new JLabel("Phone No.");
        tel.setForeground(new Color(40,198,250));
        tel.setFont(f3);
        tel.setBounds(50,360,200,40);
        p2.add(tel);
        
        t5=new JTextField();
        t5.setForeground(new Color(0,0,0));
        t5.setFont(f2);
        t5.setBounds(240,360,200,30);
        p2.add(t5);
        
        JLabel email=new JLabel("E-mail ID");
        email.setForeground(new Color(40,198,250));
        email.setFont(f3);
        email.setBounds(50,430,200,40);
        p2.add(email);
        
        t6=new JTextField();
        t6.setForeground(new Color(0,0,0));
        t6.setFont(f2);
        t6.setBounds(240,430,400,30);
        p2.add(t6);
        
        JLabel alottedclass=new JLabel("Class Teacher Of");
        alottedclass.setForeground(new Color(40,198,250));
        alottedclass.setFont(f3);
        alottedclass.setBounds(50,500,250,40);
        p2.add(alottedclass);
        
        t7=new JComboBox();
        t7.setForeground(new Color(0,0,0));
        t7.addItem("Nursery");
        t7.addItem("U.K.G");
        t7.addItem("1st A");
        t7.addItem("1st B");
        t7.addItem("1st C");
        t7.addItem("2nd A");
        t7.addItem("2nd B");
        t7.addItem("2nd C");
        t7.addItem("3rd A");
        t7.addItem("3rd B");
        t7.addItem("3rd C");
        t7.addItem("4th A");
        t7.addItem("4th B");
        t7.addItem("4th C");
        t7.addItem("5th A");
        t7.addItem("5th B");
        t7.addItem("5th C");
        t7.addItem("6th A");
        t7.addItem("6th B");
        t7.addItem("6th C");
        t7.addItem("7th A");
        t7.addItem("7th B");
        t7.addItem("7th C");
        t7.addItem("8th A");
        t7.addItem("8th B");
        t7.addItem("8th C");
        t7.addItem("9th A");
        t7.addItem("9th B");
        t7.addItem("9th C");
        t7.addItem("10th A");
        t7.addItem("10th B");
        t7.addItem("!0th C");
        t7.addItem("11th A");
        t7.addItem("11th B");
        t7.addItem("11th C");
        t7.addItem("12th A");
        t7.addItem("12th B");
        t7.addItem("12th C");
        t7.addItem("none");
        t7.setFont(f2);
        t7.setBackground(Color.WHITE);
        t7.setBounds(350,500,200,30);
        p2.add(t7);
        
        JLabel cl=new JLabel("Class Alotted");
        cl.setForeground(new Color(40,198,250));
        cl.setFont(f3);
        cl.setBounds(50,640,250,40);
        p2.add(cl);
        
        ca=new JComboBox();
        ca.setForeground(new Color(0,0,0));
        ca.addItem("Nursery");
        ca.addItem("U.K.G");
        ca.addItem("1st A");
        ca.addItem("1st B");
        ca.addItem("1st C");
        ca.addItem("2nd A");
        ca.addItem("2nd B");
        ca.addItem("2nd C");
        ca.addItem("3rd A");
        ca.addItem("3rd B");
        ca.addItem("3rd C");
        ca.addItem("4th A");
        ca.addItem("4th B");
        ca.addItem("4th C");
        ca.addItem("5th A");
        ca.addItem("5th B");
        ca.addItem("5th C");
        ca.addItem("6th A");
        ca.addItem("6th B");
        ca.addItem("6th C");
        ca.addItem("7th A");
        ca.addItem("7th B");
        ca.addItem("7th C");
        ca.addItem("8th A");
        ca.addItem("8th B");
        ca.addItem("8th C");
        ca.addItem("9th A");
        ca.addItem("9th B");
        ca.addItem("9th C");
        ca.addItem("10th A");
        ca.addItem("10th B");
        ca.addItem("!0th C");
        ca.addItem("11th A");
        ca.addItem("11th B");
        ca.addItem("11th C");
        ca.addItem("12th A");
        ca.addItem("12th B");
        ca.addItem("12th C");
        ca.addItem("none");
        ca.setFont(f2);
        ca.setBackground(Color.WHITE);
        ca.setBounds(350,640,200,30);
        p2.add(ca);
        
        JLabel subject=new JLabel("Allotted Subject");
        subject.setForeground(new Color(40,198,250));
        subject.setFont(f3);
        subject.setBounds(50,570,300,40);
        p2.add(subject);
        
        c1=new JComboBox();
        
        c1.setForeground(new Color(0,0,0));
        c1.addItem("English");
        c1.addItem("Hindi");
        c1.addItem("Maths");
        c1.addItem("Science");
        c1.addItem("Social Science");
        c1.addItem("Computer");
        c1.addItem("Economics");
        c1.addItem("Physics");
        c1.addItem("Chemistry");
        c1.addItem("Accounts");
        c1.addItem("Biology");
        c1.addItem("Java");
        c1.addItem("Sports");
        c1.addItem("Sanskrit");
        c1.addItem("Buisness Studies");
        c1.addItem("Drawing");
        c1.addItem("All");
        c1.setFont(f2);
        c1.setBounds(350,570,200,30);
        c1.setBackground(Color.WHITE);
        p2.add(c1);
        
        submit=new JButton("Add Details");
        submit.setBackground(Color.ORANGE);
        submit.setFocusable(false);
        submit.setForeground(new Color(0,0,0));
        submit.setBounds(450,690,200,30);
        submit.setFont(f2);
        p2.add(submit);
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String Male="Male";
                String female="Female";
                try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    String str="insert  into MANAGEMENTOFTEACHERS values(?,?,?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3, t3.getText());
                    if(male.isSelected())
                    {
                        pst.setString(4,Male);
                    }
                    if(!male.isSelected())
                    {
                        pst.setString(4, female);
                    }
                    pst.setString(5, t4.getText());
                    pst.setString(6, t5.getText());
                    pst.setString(7, t6.getText());
                    pst.setString(8, t7.getSelectedItem().toString());
                    pst.setString(9, c1.getSelectedItem().toString());
                    pst.setString(10, ca.getSelectedItem().toString());
                    int a=pst.executeUpdate();
                    pst.close();
                    con.close();
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                    t5.setText(null);
                    t6.setText(null);
                   

                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/dps.png"));
         Image i0=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i11=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i11);
        l.setBounds(20,50,200,200);
        add(l);
        
        p3=new JPanel();
        p3.setBounds(1025,280,875,750);
        p3.setBackground(Color.WHITE);
        p3.setLayout(null);
        add(p3);
        
        JLabel search=new JLabel("Search The Faculty");
        search.setForeground(Color.BLACK);
        search.setFont(f4);
        search.setBounds(180,10,550,80);
        p3.add(search);
        
        JLabel name=new JLabel("First Name");
        name.setForeground(new Color(40,198,250));
        name.setFont(f3);
        name.setBounds(20,150,200,30);
        p3.add(name);
        
        t8=new JTextField();
        t8.setForeground(new Color(0,0,0));
        t8.setFont(f2);
        t8.setBounds(200,150,200,30);
        p3.add(t8);
        
        
        
        b1=new JButton("Search by Name");
        b1.setFocusable(false);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setFont(f2);
        b1.setBounds(50,690,200,30);
        p3.add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from MANAGEMENTOFTEACHERS where FIRSTNAME = ? AND LASTNAME = ?";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t8.getText());
                    pst.setString(2, t10.getText());
                     rs=pst.executeQuery();
                     table.setModel(DbUtils.resultSetToTableModel(rs));
                    pst.close();
                    con.close();
                   

                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
       
        
        table=new JTable();
        table.setBackground(new Color(40,198,250));
        table.setForeground(Color.BLACK);
        table.setFont(f1);
        table.setRowHeight(table.getRowCount()+30);
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setBounds(20,210,835,430);
        p3.add(table);
  
        JLabel last=new JLabel("Last Name");
        last.setBounds(450,150,200,30);
        last.setForeground(new Color(40,198,250));
        last.setFont(f3);
        p3.add(last); 
        
        t10=new JTextField();
        t10.setForeground(new Color(0,0,0));
        t10.setFont(f2);
        t10.setBounds(630,150,200,30);
        p3.add(t10);
        
        
        
        b4=new JButton("Delete Details");
        b4.setFocusable(false);
        b4.setBackground(Color.ORANGE);
        b4.setForeground(Color.BLACK);
        b4.setFont(f2);
        b4.setBounds(620,690,200,30);
        p3.add(b4);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                DefaultTableModel model=(DefaultTableModel) table.getModel();
                
                try{
                    int SelectedRowIndex=table.getSelectedRow();
                    model.removeRow(SelectedRowIndex);
                     Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    String str="DELETE  FROM MANAGEMENTOFTEACHERS where FIRSTNAME =? AND LASTNAME= ?";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t8.getText());
                    pst.setString(2, t10.getText());
                    int a=pst.executeUpdate();
                    pst.close();
                    con.close();
                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(40,198,250));
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new manageteachingstaff().setVisible(true);
 }
}
