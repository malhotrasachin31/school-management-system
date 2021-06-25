package schoolsystem;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class mainpage extends JFrame
{
    JPanel p1,p2,p3,p4,p5,p6,p7,p8;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    JButton att,att2,eve;
    JTable event;
    Font f1=new Font("times new roman",Font.BOLD,15);
     Font fa=new Font("Arial",Font.BOLD,15);
     Font fb=new Font("Arial",Font.BOLD,25);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,100);
    mainpage()
    {
         p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Delhi Public School Management System");
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
                System.exit(0);
            }
        });
     
        p3=new JPanel();
        p3.setLayout(null);
        p3.setBounds(430,90,350,150);
        p3.setBackground(new Color(40,198,250));
        add(p3);
        
        
        
        JLabel count=new JLabel("Teachers");
        count.setBounds(20,60,300,30);
        count.setForeground(Color.WHITE);
        count.setFont(f3);
        p3.add(count);
        
        JLabel no=new JLabel();
        no.setBounds(190,40,300,80);
        no.setForeground(Color.WHITE);
        no.setFont(f5);
        p3.add(no);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from MANAGEMENTOFTEACHERS ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
         p4=new JPanel();
        p4.setBounds(800,90,350,150);
        p4.setLayout(null);
        p4.setBackground(Color.ORANGE);
        add(p4);
        
         JLabel count2=new JLabel("Students");
        count2.setBounds(20,60,300,30);
        count2.setForeground(Color.WHITE);
        count2.setFont(f3);
        p4.add(count2);
        
        JLabel no2=new JLabel();
        no2.setBounds(190,40,300,80);
        no2.setForeground(Color.WHITE);
        no2.setFont(f5);
        p4.add(no2);
        
         
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from NURSERY";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no2.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
        p5=new JPanel();
        p5.setBounds(1170,90,350,150);
        p5.setLayout(null);
        p5.setBackground(new Color(0,204,102));
        add(p5);
        
        JLabel count3=new JLabel("Classes");
        count3.setBounds(20,60,300,30);
        count3.setForeground(Color.WHITE);
        count3.setFont(f3);
        p5.add(count3);
        
        JLabel no3=new JLabel("38");
        no3.setBounds(190,40,300,80);
        no3.setForeground(Color.WHITE);
        no3.setFont(f5);
        p5.add(no3);
        
         p6=new JPanel();
        p6.setBounds(1540,90,350,150);
        p6.setLayout(null);
        p6.setBackground(new Color(204,0,0));
        add(p6);
        
         JLabel count4=new JLabel("Holidays");
        count4.setBounds(20,60,300,30);
        count4.setForeground(Color.WHITE);
        count4.setFont(f3);
        p6.add(count4);
        
        JLabel no4=new JLabel();
        no4.setBounds(190,40,300,80);
        no4.setForeground(Color.WHITE);
        no4.setFont(f5);
        p6.add(no4);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from  HOLIDAYSLIST";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no4.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
        
        
        p8=new JPanel();
        p8.setBounds(1540,260,350,70);
        p8.setBackground(Color.WHITE);
        p8.setLayout(null);
        add(p8);
        
        JLabel ho=new JLabel("Holidays This year 2020");
        ho.setBounds(1540,320,350,70);
        ho.setForeground(Color.RED);
        ho.setFont(fb);
        ho.setLayout(null);
        add(ho);
        
        att=new JButton("Show Teachers Attendence");
        att.setBounds(5,5,340,25);
        att.setFocusable(false);
        att.setBackground(Color.ORANGE);
        att.setForeground(Color.BLACK);
        att.setFont(f1);
        p8.add(att);
        att.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new attendanceofteachersinfo().setVisible(true);
                dispose();
            }
        });
        
        
        att2=new JButton("Show Students Attendence");
        att2.setBounds(5,40,340,25);
        att2.setFocusable(false);
        att2.setBackground(Color.ORANGE);
        att2.setForeground(Color.BLACK);
        att2.setFont(f1);
        p8.add(att2);
        att2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new attendenceofstudentsinfo().setVisible(true);
             
            }
        });
        
        
        JTable tab=new JTable();
        tab.setBounds(1540,380,350,700);
        tab.setBackground(Color.WHITE);
        tab.setLayout(null);
        tab.setFont(fa);
        tab.setRowHeight(tab.getRowCount()+26);
        tab.setForeground(Color.BLACK);
        add(tab);
        
         try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from HOLIDAYSLIST";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            tab.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
        
        p7=new JPanel();
        p7.setBounds(430,260,1090,70);
        p7.setBackground(Color.WHITE);
        p7.setLayout(null);
        add(p7);
        
        JLabel wel=new JLabel("WELCOME,");
        wel.setBounds(20,4,400,65);
        wel.setFont(f4);
        wel.setForeground(new Color(0,0,0));
        p7.add(wel);
       
         JLabel name=new JLabel();
        name.setBounds(355,4,300,65);
        name.setFont(f4);
        name.setForeground(new Color(65,225,185));
        p7.add(name);
        
        eve=new JButton("Delete Event");
        eve.setBounds(870,20,200,30);
        eve.setForeground(new Color(0,0,0));
        eve.setFocusable(false);
        eve.setFont(f1);
        eve.setBackground(Color.ORANGE);
        p7.add(eve);
        eve.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new deleteeve().setVisible(true);
            }
        });
        
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from LOGIN";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            if(rs.next())
            {
                name.setText(rs.getString("name"));
            }
        }catch(Exception ex){System.out.println(ex);};
        
       
        
        p2=new JPanel();
        p2.setBounds(0,40,400,1080);
        p2.setBackground(Color.BLACK);
        p2.setLayout(null);
        add(p2);
       
        String str="\n\nDelhi Public School\nSafdarjung,New delhi 110087\nSenior Secondary School\n\nWE BELIEVE IN EXCELLENCE";
        
        JTextArea t1=new JTextArea();
        t1.setBounds(165,20,240,150);
        t1.setBackground(Color.BLACK);
        t1.setEditable(false);
        t1.setFont(f1);
        t1.setForeground(Color.WHITE);
        t1.setText(str);
        t1.setLayout(null);
        p2.add(t1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/dps.png"));
        Image i5=i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel();
        l2.setBounds(5,20,150,150);
        l2.setIcon(i6);
        p2.add(l2);
     
        b1=new JButton("Admissions");
        b1.setBounds(10,300,380,40);
        b1.setForeground(new Color(0,0,0));
        b1.setFocusable(false);
        b1.setFont(f2);
        b1.setBackground(Color.ORANGE);
        p2.add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new admissions().setVisible(true);
                dispose();
            }
        });
        
        
        b2=new JButton("All Teachers Information"); 
        b2.setBounds(10,345,380,40);
        b2.setForeground(new Color(0,0,0));
        b2.setFocusable(false);
        b2.setFont(f2);
        b2.setBackground(Color.ORANGE);
        p2.add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new allteachersinfo().setVisible(true);
                dispose();
            }
        });
        
        b3=new JButton("Classes and Subjects");
        b3.setBounds(10,390,380,40);
        b3.setForeground(new Color(0,0,0));
        b3.setFocusable(false);
        b3.setFont(f2);
        b3.setBackground(Color.ORANGE);
        p2.add(b3);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new classesandsubjects().setVisible(true);
                dispose();
            }
        });
        
        b4=new JButton("Attendence of Teachers");
        b4.setBounds(10,435,380,40);
        b4.setForeground(new Color(0,0,0));
        b4.setFocusable(false);
        b4.setFont(f2);
        b4.setBackground(Color.ORANGE);
        p2.add(b4); 
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new attendenceofteachers().setVisible(true);
             
            }
        });
        
        
        b5=new JButton("Attendence of Students");
        b5.setBounds(10,480,380,40);
        b5.setForeground(new Color(0,0,0));
        b5.setFocusable(false);
        b5.setFont(f2);
        b5.setBackground(Color.ORANGE);
        p2.add(b5);
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new attendenceofstudents().setVisible(true);
             
            }
        });
        
        
        
       
        
        b7=new JButton("Class Reports and Results");
        b7.setBounds(10,525,380,40);
        b7.setForeground(new Color(0,0,0));
        b7.setFocusable(false);
        b7.setFont(f2);
        b7.setBackground(Color.ORANGE);
        p2.add(b7); 
         b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new classreports().setVisible(true);
                dispose();
            }
        });
        
        
        
        b8=new JButton("Library Management ");
        b8.setBounds(10,570,380,40);
        b8.setForeground(new Color(0,0,0));
        b8.setFocusable(false);
        b8.setFont(f2);
        b8.setBackground(Color.ORANGE);
        p2.add(b8); 
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new library().setVisible(true);
            }
        });
        
        b9=new JButton("About Sports Inventory ");
        b9.setBounds(10,615,380,40);
        b9.setForeground(new Color(0,0,0));
        b9.setFocusable(false);
        b9.setFont(f2);
        b9.setBackground(Color.ORANGE);
        p2.add(b9);
        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new sportsinventory().setVisible(true);
            }
        });
        
        b10=new JButton("Manage Transport Services");
        b10.setBounds(10,660,380,40);
        b10.setForeground(new Color(0,0,0));
        b10.setFocusable(false);
        b10.setFont(f2);
        b10.setBackground(Color.ORANGE);
        p2.add(b10);
        b10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new driverandtransport().setVisible(true);
                dispose();
            }
        });
        
        
        b11=new JButton("Add Events");
        b11.setBounds(10,705,380,40);
        b11.setForeground(new Color(0,0,0));
        b11.setFocusable(false);
        b11.setFont(f2);
        b11.setBackground(Color.ORANGE);
        p2.add(b11);
        b11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new manageevents().setVisible(true);
            }
        });
        
        JLabel le=new JLabel("Upcomming Week Events");
        le.setBounds(430,350,400,35);
        le.setForeground(Color.magenta);
        le.setFont(f3);
        le.setLayout(null);
        add(le);
        
        
        event=new JTable();
        event.setBackground(Color.WHITE);
        event.setFont(f3);
        event.setRowHeight(event.getColumnCount()+50);
        event.setBounds(430,400,1090,350);
        add(event);
        
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String st="select * from EVENT";
            pst=con.prepareStatement(st);
            rs=pst.executeQuery();
            event.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception ex){System.out.println(ex);};
        
        
        
        
        b12=new JButton("Non Teaching Staffs");
        b12.setBounds(10,750,380,40);
        b12.setForeground(new Color(0,0,0));
        b12.setFocusable(false);
        b12.setFont(f2);
        b12.setBackground(Color.ORANGE);
        p2.add(b12);
        b12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new nonteachingstaffs().setVisible(true);
             
            }
        });
        
        
        b13=new JButton("Managing Teaching Staff");
        b13.setBounds(10,795,380,40);
        b13.setForeground(new Color(0,0,0));
        b13.setFocusable(false);
        b13.setFont(f2);
        b13.setBackground(Color.ORANGE);
        p2.add(b13);
        b13.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new manageteachingstaff().setVisible(true);
                dispose();
            }
        });
        
        b14=new JButton("Show Time Table");
        b14.setBounds(10,840,380,40);
        b14.setForeground(new Color(0,0,0));
        b14.setFocusable(false);
        b14.setFont(f2);
        b14.setBackground(Color.ORANGE);
        p2.add(b14); 
          b14.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new timetable().setVisible(true);
                dispose();
            }
        });
                  
        
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("E");
        String date=sdf.format(d);
        String time=sdf2.format(d);
      
        
        JLabel l5=new JLabel();
        l5.setText(date);
        l5.setForeground(new Color(65,185,225));
        l5.setFont(f3);
        l5.setBounds(70,980,200,50);
        p2.add(l5);
        
        ImageIcon cal=new ImageIcon(ClassLoader.getSystemResource("images/cal.png"));
        Image cal2=cal.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon cal3=new ImageIcon(cal2);
        JLabel l6=new JLabel();
        l6.setIcon(cal3);
        l6.setBounds(10,980,50,50);
        p2.add(l6);
        
        JLabel l8=new JLabel();
        l8.setText(time);
        l8.setBounds(300,980,150,50);
        l8.setForeground(Color.WHITE);
        l8.setFont(f3);
        p2.add(l8);
        
         ImageIcon ia=new ImageIcon(ClassLoader.getSystemResource("images/school.png"));
        Image ib=ia.getImage().getScaledInstance(1200,300, Image.SCALE_DEFAULT);
        ImageIcon ic=new ImageIcon(ib);
        JLabel a1=new JLabel();
        a1.setBounds(400,780,1200,300);
        a1.setIcon(ic);
        add(a1);
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
           getContentPane().setBackground(new Color(173,216,230));
        setUndecorated(true);
    }
    public static void main(String args[])
    {
        new mainpage().setVisible(true);
    }
}
