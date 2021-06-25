package schoolsystem;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.proteanit.sql.DbUtils;

public class driverandtransport extends JFrame
{
    JPanel p1,p2,p3,p4,p5,p6,p7,p8;
    JButton ba;
    JButton att,att2,eve;
    JTable event,table5;
    Font f1=new Font("times new roman",Font.BOLD,15);
     Font fa=new Font("Arial",Font.BOLD,15);
     Font fb=new Font("Arial",Font.BOLD,25);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,100);
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,ta,tb,tc,td;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JComboBox ca,cb;
    
    driverandtransport()
    {
         p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Driver And Transport Management Service System");
        label.setBounds(800,8,500,20);
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
     
        p3=new JPanel();
        p3.setLayout(null);
        p3.setBounds(810,60,350,150);
        p3.setBackground(new Color(40,198,250));
        add(p3);
        
      
        
        JLabel count=new JLabel("Students By Buses");
        count.setBounds(20,60,300,30);
        count.setForeground(Color.WHITE);
        count.setFont(f2);
        p3.add(count);
        
        JLabel no=new JLabel();
        no.setBounds(210,40,300,80);
        no.setForeground(Color.WHITE);
        no.setFont(f5);
        p3.add(no);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from CONVENCE where TYPEOFCONVENCE='Bus'  ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
        p4=new JPanel();
        p4.setBounds(0,40,790,587);
        p4.setLayout(new GridLayout(1,1));
        p4.setBackground(Color.WHITE);
        add(p4);
        
        
        
        JTable table=new JTable();
        table.setFont(f2);
        table.setRowHeight(table.getColumnCount()+30);
        p4.add(table);
        
        p5=new JPanel();
        p5.setBounds(1180,60,350,150);
        p5.setLayout(null);
        p5.setBackground(new Color(0,204,102));
        add(p5);
        
       
        
        JScrollPane jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p4.add(jsp);
        
           JLabel no3=new JLabel();
        no3.setBounds(190,40,300,80);
        no3.setForeground(Color.WHITE);
        no3.setFont(f5);
        p5.add(no3);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from CONVENCE where TYPEOFCONVENCE= 'Van' ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no3.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
     
        
        JLabel count3=new JLabel("Students By Van");
        count3.setBounds(20,60,300,30);
        count3.setForeground(Color.WHITE);
        count3.setFont(f2);
        p5.add(count3);
        
       
        
         p6=new JPanel();
        p6.setBounds(1550,60,350,150);
        p6.setLayout(null);
        p6.setBackground(new Color(204,0,0));
        add(p6);
        
         JLabel count4=new JLabel("Total Information");
        count4.setBounds(20,60,300,30);
        count4.setForeground(Color.WHITE);
        count4.setFont(f2);
        p6.add(count4);
        
        JLabel no4=new JLabel();
        no4.setBounds(240,40,300,80);
        no4.setForeground(Color.WHITE);
        no4.setFont(f5);
        p6.add(no4);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from CONVENCE";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no4.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
        
        
        p8=new JPanel();
        p8.setBounds(810,260,1090,400);
        p8.setBackground(Color.WHITE);
        p8.setLayout(null);
        add(p8);
        
          ImageIcon i41=new ImageIcon(ClassLoader.getSystemResource("images/add.jpg"));
          Image i15=i41.getImage().getScaledInstance(500,350,Image.SCALE_DEFAULT);
          ImageIcon i16=new ImageIcon(i15);
          JLabel l12=new JLabel("");
          l12.setIcon(i16);
          l12.setBounds(570,20,500,350);
          p8.add(l12);     
        
        
        JLabel teachers=new JLabel("Adding Details");
        teachers.setBounds(70,10,550,70);
        teachers.setFont(f4);
        p8.add(teachers);
        
        JLabel name=new JLabel("Type Of Convence");
        name.setBounds(60,100,200,30);
        name.setFont(f2);
        p8.add(name);
        
        t1=new JTextField();
        t1.setBounds(250,100,300,30);
        t1.setFont(f2);
        p8.add(t1);
        
        JLabel id=new JLabel("Vehicle No");
        id.setBounds(60,150,200,30);
        id.setFont(f2);
        p8.add(id);
        
         t2=new JTextField();
        t2.setBounds(250,150,300,30);
        t2.setFont(f2);
        p8.add(t2);
        
        JLabel Date=new JLabel("Name");
        Date.setBounds(60,200,200,30);
        Date.setFont(f2);
        p8.add(Date);
        
         t3=new JTextField();
        t3.setBounds(250,200,300,30);
        t3.setFont(f2);
        p8.add(t3);
        
         JLabel bn=new JLabel("Class");
        bn.setBounds(60,250,200,30);
        bn.setFont(f2);
        p8.add(bn);
        
         ca=new JComboBox();
         ca.setBackground(Color.WHITE);
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
        ca.setBounds(250,250,300,30);
        ca.setFont(f2);
        p8.add(ca);
        
         
         JLabel bn1=new JLabel("Student/Teacher");
        bn1.setBounds(60,300,250,30);
        bn1.setFont(f2);
        p8.add(bn1);
        
        cb=new JComboBox();
        cb.addItem("Teacher");
        cb.addItem("Student");
        cb.setBackground(Color.WHITE);
        cb.setBounds(250,300,300,30);
        cb.setFont(f2);
        p8.add(cb);
        
        b1=new JButton("ADD");
        b1.setBounds(80,350,200,30);
        b1.setFont(f1);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        p8.add(b1);
        b1.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent ae)
            {
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="insert into  CONVENCE values (?,?,?,?,?) ";
                   
                   pst=con.prepareStatement(str);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3, t3.getText());
                    pst.setString(4, ca.getSelectedItem().toString());
                    pst.setString(5, cb.getSelectedItem().toString());
                    int a=pst.executeUpdate();  
                    new driverandtransport().setVisible(true);
                   pst.executeUpdate();
                    pst.close();
                    con.close();
                   t1.setText(null);
                   t2.setText(null);
                   t3.setText(null);
                
                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        att=new JButton("Show All Information ");
        att.setBounds(810,220,350,25);
        att.setFocusable(false);
        att.setBackground(Color.ORANGE);
        att.setForeground(Color.BLACK);
        att.setFont(f1);
        add(att);
        att.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from CONVENCE ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
         
       JPanel p6=new JPanel();
        p6.setBounds(0,660,790,400);
        p6.setBackground(Color.WHITE);
        p6.setLayout(null);
        add(p6);
        
        
           ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/lo.png"));
         Image i0=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i11=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i11);
        l.setBounds(550,150,200,200);
        p6.add(l);
        
          JLabel teachers21=new JLabel("ADD DRIVER");
        teachers21.setBounds(80,10,500,70);
        teachers21.setFont(f4);
        p6.add(teachers21);
        
        JLabel name21=new JLabel("Vehicle");
        name21.setBounds(60,100,200,30);
        name21.setFont(f2);
        p6.add(name21);
        
        ta=new JTextField();
        ta.setBounds(220,100,250,30);
        ta.setFont(f2);
        p6.add(ta);
        
        JLabel id12=new JLabel("Vehicle No");
        id12.setBounds(60,150,200,30);
        id12.setFont(f2);
        p6.add(id12);
        
         tb=new JTextField();
        tb.setBounds(220,150,250,30);
        tb.setFont(f2);
        p6.add(tb);
        
        JLabel Date12=new JLabel("Driver Namer");
        Date12.setBounds(60,200,200,30);
        Date12.setFont(f2);
        p6.add(Date12);
        
         tc=new JTextField();
        tc.setBounds(220,200,250,30);
        tc.setFont(f2);
        p6.add(tc);
        
        JLabel Date121=new JLabel("Driver Number");
        Date121.setBounds(60,250,200,30);
        Date121.setFont(f2);
        p6.add(Date121);
        
         td=new JTextField();
        td.setBounds(220,250,250,30);
        td.setFont(f2);
        p6.add(td);
        
        ba=new JButton("Add");
        ba.setBounds(70,350,385,25);
        ba.setFocusable(false);
        ba.setBackground(Color.ORANGE);
        ba.setForeground(Color.BLACK);
        ba.setFont(f1);
        p6.add(ba);
        ba.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent ae)
         {
             try{
                  Class.forName("org.apache.derby.jdbc.ClientDriver");
                  Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                  PreparedStatement pst=null;
                  String str3="insert into DRIVERINFO values(?,?,?,?) ";
                   pst=con.prepareStatement(str3);
                   pst.setString(1, ta.getText());
                   pst.setString(2, tb.getText());
                   pst.setString(3, tc.getText());
                    pst.setString(4, td.getText());
                    int d=pst.executeUpdate();
                    dispose();
                    new driverandtransport().setVisible(true);
                    ta.setText(null);
                    tb.setText(null);
                    tc.setText(null);
                    td.setText(null);
             }catch(Exception ex){System.out.println(ex);};
         }
        });
        
        
         b5=new JButton("Show All information about Bus Drivers");
        b5.setBounds(10,630,375,25);
        b5.setFocusable(false);
        b5.setBackground(Color.ORANGE);
        b5.setForeground(Color.BLACK);
        b5.setFont(f1);
        add(b5);
         b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from DRIVERINFO where VEHICLE = 'Bus' ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        b6=new JButton("Show Information About van Drivers");
        b6.setBounds(400,630,375,25);
        b6.setFocusable(false);
        b6.setBackground(Color.ORANGE);
        b6.setForeground(Color.BLACK);
        b6.setFont(f1);
        add(b6);
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from  DRIVERINFO where VEHICLE = 'Van' ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        
        
        
        
        att2=new JButton("Show All Information About Vans");
        att2.setBounds(1180,220,350,25);
        att2.setFocusable(false);
        att2.setBackground(Color.ORANGE);
        att2.setForeground(Color.BLACK);
        att2.setFont(f1);
        add(att2);
        att2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from CONVENCE where TYPEOFCONVENCE= 'Van' ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        
        eve=new JButton("Show All information About Buses");
        eve.setBounds(1550,220,350,25);
        eve.setFocusable(false);
        eve.setBackground(Color.ORANGE);
        eve.setForeground(Color.BLACK);
        eve.setFont(f1);
        add(eve);
        eve.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from CONVENCE  where TYPEOFCONVENCE= 'Bus' ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
       
         ImageIcon squats=new ImageIcon(ClassLoader.getSystemResource("images/dps4.jpg"));
        Image squats2=squats.getImage().getScaledInstance(1090, 390, Image.SCALE_DEFAULT);
        ImageIcon squats3=new ImageIcon(squats2);
        JLabel l13=new JLabel("");
        l13.setIcon(squats3);
        l13.setBounds(810,670,1090,390);
        add(l13);
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         getContentPane().setBackground(new Color(173,216,230));
        setUndecorated(true);
    }
    public static void main(String args[])
    {
        new driverandtransport().setVisible(true);
    }
}
