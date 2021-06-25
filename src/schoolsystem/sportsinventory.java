package schoolsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class sportsinventory extends JFrame
{
      JPanel p1,p2,p3;
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,250);
   JTextField t1,t4,t5;
   JButton b1,b2;
   JComboBox ca;
   
    sportsinventory()
    {
        p1=new JPanel();
        p1.setBackground(Color.ORANGE);
        p1.setBounds(0,0,1600,30);
        p1.setLayout(null);
        add(p1);
        
         
        JLabel label=new JLabel("Sports Inventory and Management System");
        label.setBounds(600,0,600,30);
        label.setForeground(Color.BLACK);
        label.setFont(f2);
        p1.add(label);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/first.png"));
        Image i2=i1.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setBounds(1575,5,20,20);
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
        p2.setBackground(Color.WHITE);
        p2.setBounds(20,100,790,680);
        p2.setLayout(new GridLayout(1,1));
        add(p2);
        
        t1=new JTextField();
        t1.setBounds(20,50,500,40);
        t1.setBackground(Color.WHITE);
        t1.setFont(f2);
        add(t1);
        
        JTable table=new JTable();
        table.setFont(f1);
        table.setRowHeight(table.getColumnCount()+30);
        p2.add(table);
        
        
        JScrollPane jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p2.add(jsp);
         
        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("images/sea.jpg"));
        Image i12=i11.getImage().getScaledInstance(38,36, Image.SCALE_DEFAULT);
        ImageIcon i13=new ImageIcon(i12);
        JLabel l11=new JLabel();
        l11.setBounds(520,52,38,36);
        l11.setIcon(i13);
        add(l11);
        l11.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from SPORTS where ITEMNAME = ? ";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t1.getText());
                     rs=pst.executeQuery();
                     table.setModel(DbUtils.resultSetToTableModel(rs));
                    pst.close();
                    con.close();
                   

                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        b1=new JButton("Show all Items");
        b1.setBounds(610,50,200,40);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.ORANGE);
        b1.setFocusable(false);
        b1.setFont(f1);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from SPORTS ";
                    pst=con.prepareStatement(str);
                     rs=pst.executeQuery();
                     table.setModel(DbUtils.resultSetToTableModel(rs));
                    pst.close();
                    con.close();
                   

                }catch(Exception ex){System.out.println(ex);};
            }
        });
        p3=new JPanel();
        p3.setBackground(Color.WHITE);
        p3.setBounds(820,50,760,730);
        p3.setLayout(null);
        add(p3);
        
         JLabel search=new JLabel("Make your Inventory");
        search.setForeground(Color.BLACK);
        search.setFont(f4);
        search.setBounds(120,10,550,80);
        p3.add(search);
        
         JLabel address=new JLabel("Item Name");
        address.setForeground(Color.BLACK);
        address.setFont(f2);
        address.setBounds(20,150,200,30);
        p3.add(address);
        
        t4=new JTextField();
        t4.setForeground(new Color(0,0,0));
        t4.setFont(f2);
        t4.setBounds(200,150,200,30);
        p3.add(t4);
        
        JLabel address1=new JLabel("Game");
        address1.setForeground(Color.BLACK);
        address1.setFont(f2);
        address1.setBounds(460,150,200,30);
        p3.add(address1);
        
         ca=new JComboBox();
        ca.setForeground(new Color(0,0,0));
        ca.addItem("Cricket");
        ca.addItem("Badminton");
        ca.addItem("Tennis");
        ca.addItem("VolleyBall");
        ca.addItem("Table Tennis");
        ca.addItem("Pool");
        ca.addItem("Basket Ball");
        ca.setFont(f2);
        ca.setBackground(Color.WHITE);
        ca.setBounds(550,150,200,30);
        p3.add(ca);
        
        b2=new JButton("Add To Inventory");
        b2.setBounds(550,200,200,30);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.ORANGE);
        b2.setFocusable(false);
        b2.setFont(f1);
        p3.add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="insert into SPORTS values (?,?,?) ";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t4.getText());
                    pst.setString(2,t5.getText());
                    pst.setString(3, ca.getSelectedItem().toString());
                    int a=pst.executeUpdate();
                    pst.close();
                    con.close();
                   t4.setText(null);
                   t5.setText(null);

                }catch(Exception ex){System.out.println(ex);};
            }
            
         });
        JLabel tel=new JLabel("No. of Items");
        tel.setForeground(Color.BLACK);
        tel.setFont(f2);
        tel.setBounds(20,200,200,30);
        p3.add(tel);
        
        t5=new JTextField();
        t5.setForeground(new Color(0,0,0));
        t5.setFont(f2);
        t5.setBounds(200,200,200,30);
        p3.add(t5);
        
        
        
         ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("images/sp.jpg"));
        Image i112=i111.getImage().getScaledInstance(760,550, Image.SCALE_DEFAULT);
        ImageIcon i113=new ImageIcon(i112);
        JLabel l111=new JLabel();
        l111.setBounds(0,250,760,550);
        l111.setIcon(i113);
        p3.add(l111);
        
        setSize(1600,800);
        setLocation(175,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(40,198,250));
    }
    public static void main(String args[])
    {
        new sportsinventory().setVisible(true);
    }
}
