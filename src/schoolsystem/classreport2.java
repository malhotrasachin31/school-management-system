package schoolsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class classreport2 extends JFrame 
{
    JPanel p1,p2;
     Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,250);
    classreport2()
    {
       
         p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        p2=new JPanel();
        p2.setBounds(10,50,1900,1020);
        p2.setBackground(Color.WHITE);
        p2.setLayout(new GridLayout(1,1));
        add(p2);
      
        JTable table=new JTable();
        table.setFont(f1);
        table.setRowHeight(table.getColumnCount()+30);
        p2.add(table);
        
        
        JScrollPane jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p2.add(jsp);
         
          try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from RESULT ";
                    pst=con.prepareStatement(str);
                     rs=pst.executeQuery();
                     table.setModel(DbUtils.resultSetToTableModel(rs));
                    pst.close();
                    con.close();
                   

                }catch(Exception ex){System.out.println(ex);};
        
        JLabel label=new JLabel("Accademic Reports of the Students");
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
               new classreports2().setVisible(true);
                dispose();
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
     new classreport2().setVisible(true);
 }
}
