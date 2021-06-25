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
import net.proteanit.sql.DbUtils;

public class attendenceofstudentsinfo extends JFrame
{
    JPanel p1;
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,250);
    JTable table;
    JButton b1;
    JComboBox ca;
    
    
    attendenceofstudentsinfo()
    {
    
    p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Attendence of Students");
        label.setBounds(900,8,500,20);
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
        ca.setFont(f2);
        ca.setBounds(420,70,200,30);
        ca.setBackground(Color.WHITE);
        add(ca);
        
        
        b1=new JButton("Show The Attendence Reports");
        b1.setBounds(700,70,300,30);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        b1.setFont(f1);
        add(b1);
        
        
        
        
        JPanel p3=new JPanel();
        p3.setBounds(420,140,1480,900);
        p3.setLayout(new GridLayout(1,1));
        p3.setBackground(new Color(40,198,250));
        add(p3);
        
        JTable t1=new JTable();
        t1.setRowHeight(t1.getColumnCount()+20);
        p3.add(t1);
        
        
       JScrollPane jsp=new JScrollPane(t1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p3.add(jsp);
        
       JPanel p2=new JPanel();
        p2.setBounds(0,0,400,1080);
        p2.setLayout(null);
        p2.setBackground(new Color(40,198,250));
        add(p2);
        
        
        
        JLabel t=new JLabel("Total");
        t.setBounds(120,130,350,80);
        t.setFont(f4);
        t.setForeground(Color.WHITE);
        p2.add(t);
        
        JLabel all=new JLabel("Attendence");
        all.setBounds(60,200,350,80);
        all.setFont(f4);
        all.setForeground(Color.WHITE);
        p2.add(all);
        
        
        
        JLabel no=new JLabel("");
        no.setBounds(50,500,350,200);
        no.setForeground(Color.WHITE);
        no.setFont(f5);
        p2.add(no);
        
       b1.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent ae)
           {
                 try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String st="select * from customer";
            pst=con.prepareStatement(st);
            pst.setString(1, ca.getSelectedItem().toString());
            rs=pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(rs));  
            
        }catch(Exception ex){System.out.print(ex);};
           }
       });
      
        
        
         try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count (*) from ATTENDENCEOFS ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        
    }
    public static void main(String args[])
    {
    new attendenceofstudentsinfo().setVisible(true);
     }
}
