package university.managment.system;

import com.toedter.calendar.JDateChooser;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentLeave extends JFrame implements ActionListener {
    Choice crollno;
    Choice ctime;
    JDateChooser dcdate;
    JButton submit;
    JButton cancel;

    StudentLeave() {
        this.setSize(500, 550);
        this.setLocation(550, 100);
        this.setLayout((LayoutManager)null);
        this.getContentPane().setBackground(Color.WHITE);
     
        // initial heading
        JLabel heading = new JLabel("Apply Leave (Student)");
        heading.setBounds(40, 50, 300, 30);
        heading.setFont(new Font("Tahoma", 1, 20));
        this.add(heading);
      
        // search by roll no label
        JLabel lblrollno = new JLabel("Search by Roll Number");
        lblrollno.setBounds(60, 100, 200, 20);
        lblrollno.setFont(new Font("Tahoma", 0, 18));
        this.add(lblrollno);
        this.crollno = new Choice();
        this.crollno.setBounds(60, 130, 200, 20);
        this.add(this.crollno);

        // to handle exception of sql
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");

            while(rs.next()) {
                this.crollno.add(rs.getString("rollno"));
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        // date label
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 20);
        lbldate.setFont(new Font("Tahoma", 0, 18));
        this.add(lbldate);
        
        // date chooser
        this.dcdate = new JDateChooser();
        this.dcdate.setBounds(60, 210, 200, 25);
        this.add(this.dcdate);
        
        // label of time duration
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200, 20);
        lbltime.setFont(new Font("Tahoma", 0, 18));
        this.add(lbltime);
      
        this.ctime = new Choice();
        this.ctime.setBounds(60, 290, 200, 20);
        this.ctime.add("Full Day");
        this.ctime.add("Half Day");
        this.add(this.ctime);
    
        // button of submit
        this.submit = new JButton("Submit");
        this.submit.setBounds(60, 350, 100, 25);
        this.submit.setBackground(Color.BLACK);
        this.submit.setForeground(Color.WHITE);
        this.submit.addActionListener(this);
        this.submit.setFont(new Font("Tahoma", 1, 15));
        this.add(this.submit);
       
          // button of cancel
        
        this.cancel = new JButton("Cancel");
        this.cancel.setBounds(200, 350, 100, 25);
        this.cancel.setBackground(Color.BLACK);
        this.cancel.setForeground(Color.WHITE);
        this.cancel.addActionListener(this);
        this.cancel.setFont(new Font("Tahoma", 1, 15));
        this.add(this.cancel);
        this.setVisible(true);
    }

    // event listerners. Performed when button are clicks
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.submit) {
            String rollno = this.crollno.getSelectedItem();
            String date = ((JTextField)this.dcdate.getDateEditor().getUiComponent()).getText();
            String duration = this.ctime.getSelectedItem();
            String query = "insert into studentleave values('" + rollno + "', '" + date + "', '" + duration + "')";

            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog((Component)null, "Leave Confirmed");
                this.setVisible(false);
            } catch (Exception var7) {
                var7.printStackTrace();
            }
        } else {
            this.setVisible(false);
        }

    }
 
    // main method 
    
    public static void main(String[] args) {
        new StudentLeave();// object 
    }
}
