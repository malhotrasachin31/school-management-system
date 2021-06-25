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

public class classesandsubjects extends JFrame
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
    JComboBox ca;
    JRadioButton male,female,other;
    
    classesandsubjects()
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
        
        JLabel label=new JLabel("Information And Subjects Of Different Classes");
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
        p2.setBounds(20,260,1000,810);
        p2.setBackground(Color.WHITE);
        p2.setLayout(null);
        add(p2);
        
        table2=new JTable();
        table2.setBounds(20,100,960,610);
        table2.setForeground(Color.BLACK);
        table2.setRowHeight(table2.getColumnCount()+34);
        table2.setBackground(Color.ORANGE);
        table2.setFont(f1);
        p2.add(table2);
        
         b2=new JButton("Show");
        b2.setFocusable(false);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.BLACK);
        b2.setFont(f2);
        b2.setBounds(400,750,200,30);
        p2.add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from SUBJECT ";
                    pst=con.prepareStatement(str);
                     rs=pst.executeQuery();
                     table2.setModel(DbUtils.resultSetToTableModel(rs));
                    pst.close();
                    con.close();
                   

                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        JLabel search=new JLabel("Subjects of Different Classes");
        search.setForeground(Color.BLACK);
        search.setFont(f4);
        search.setBounds(100,10,900,80);
        p2.add(search);
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/dps.png"));
         Image i0=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i11=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i11);
        l.setBounds(20,50,200,200);
        add(l);
        
        p3=new JPanel();
        p3.setBounds(1025,260,875,100);
        p3.setBackground(Color.WHITE);
        p3.setLayout(null);
        add(p3);
        
      // grid layout
        
        p4=new JPanel();
        p4.setBounds(1025,365,875,600);
        p4.setBackground(Color.WHITE);
        p4.setLayout(new GridLayout(1,1));
        add(p4); 
        
         table=new JTable();
        table.setBackground(new Color(40,198,250));
        table.setForeground(Color.BLACK);
        table.setRowHeight(table.getRowCount()+30);
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setBounds(0,0,875,600);
        p4.add(table);
  
        
       JScrollPane jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       jsp.setBackground(Color.WHITE);
        p4.add(jsp);
        
        JPanel p5=new JPanel();
        p5.setBounds(1025,970,875,100);
        p5.setBackground(Color.WHITE);
        p5.setLayout(null);
        add(p5); 
        
        JLabel search1=new JLabel("Class Information");
        search1.setForeground(Color.BLACK);
        search1.setFont(f4);
        search1.setBounds(70,10,550,80);
        p3.add(search1);
       
        
        
        
        b1=new JButton("Search");
        b1.setFocusable(false);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setFont(f2);
        b1.setBounds(350,50,200,30);
        p5.add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from NURSERY where CLASS = ?";
                    pst=con.prepareStatement(str);
                    pst.setString(1,ca.getSelectedItem().toString());
                     rs=pst.executeQuery();
                     table.setModel(DbUtils.resultSetToTableModel(rs));
                    pst.close();
                    con.close();
                   

                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
       
        
       
        ca=new JComboBox();
        ca.setForeground(new Color(0,0,0));
        ca.setBackground(Color.WHITE);
        ca.setFont(f2);
        ca.addItem("Nursery");
        ca.addItem("UKG");
        ca.addItem("1st-A");
        ca.addItem("1st-B");
        ca.addItem("1st-C");
        ca.addItem("2nd-A");
        ca.addItem("2nd-B");
        ca.addItem("2nd-C");
        ca.addItem("3rd-A");
        ca.addItem("3rd-B");
        ca.addItem("3rd-C");
        ca.addItem("4th-A");
        ca.addItem("4th-B");
        ca.addItem("4th-C");
        ca.addItem("5th-A");
        ca.addItem("5th-B");
        ca.addItem("5th-C");
        ca.addItem("6th-A");
        ca.addItem("6th-B");
        ca.addItem("6th-C");
        ca.addItem("7th-A");
        ca.addItem("7th-B");
        ca.addItem("7th-C");
        ca.addItem("8th-A");
        ca.addItem("8th-B");
        ca.addItem("8th-C");
        ca.addItem("9th-A");
        ca.addItem("9th-B");
        ca.addItem("9th-C");
        ca.addItem("10th- A");
        ca.addItem("10th-B");
        ca.addItem("!0th-C");
        ca.addItem("11th-A");
        ca.addItem("11th-B");
        ca.addItem("11th-C");
        ca.addItem("12th-A");
        ca.addItem("12th-B");
        ca.addItem("12th-C");
        ca.setBounds(600,40,250,40);
        p3.add(ca);
        
        
        
       
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(40,198,250));
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new classesandsubjects().setVisible(true);
 }
}
