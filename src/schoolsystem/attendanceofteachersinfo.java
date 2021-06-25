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

public class attendanceofteachersinfo extends JFrame
{
    JPanel p1;
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,250);
    JTable table;
  
    attendanceofteachersinfo()
    {
    
    p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Attendence of Teachers");
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
        
        
        JPanel p3=new JPanel();
        p3.setBounds(400,40,1520,1045);
        p3.setLayout(new GridLayout(1,1));
        p3.setBackground(new Color(40,198,250));
        add(p3);
        
        JTable t1=new JTable();
        t1.setFont(f1);
        t1.setRowHeight(t1.getColumnCount()+30);
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
       
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String st="select * from ATTENDENCEOFT";
            pst=con.prepareStatement(st);
            rs=pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(rs));  
            
        }catch(Exception ex){System.out.print(ex);};
        
        
         try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count (*) from ATTENDENCEOFT ";
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
        //getContentPane().setBackground(new Color(124,155,166));
        setUndecorated(true);
        
    }
    public static void main(String args[])
    {
    new attendanceofteachersinfo().setVisible(true);
     }
}
