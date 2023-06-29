package university.managment.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.Image;
public class Project extends JFrame {
    
Project() {
    setSize(1540, 850);
    
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);  
         add(image);
     
         JMenuBar mb = new JMenuBar();
         
         JMenu newInformation = new JMenu("New Information");
         newInformation.setForeground(Color.BLUE);
         mb.add(newInformation);
         
         JMenuItem facultyInfo = new JMenuItem( " New Facutly Information");
        facultyInfo.setBackground( Color.WHITE);
         newInformation.add(facultyInfo);
        
         JMenuItem studentInfo = new JMenuItem( " New Student Information");
        facultyInfo.setBackground( Color.WHITE);
         newInformation.add(studentInfo);
         
         // details
         JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLUE);
         mb.add(details);
         
         JMenuItem facultydetails = new JMenuItem( " View Facutly Details");
        facultydetails.setBackground( Color.WHITE);
         details.add(facultydetails);
        
         JMenuItem studentdetails = new JMenuItem( " View Student Details");
        studentdetails.setBackground( Color.WHITE);
        details.add(studentdetails);
        
         // Leave
         
          JMenu leave = new JMenu("Apply Leave");
          leave.setForeground(Color.BLUE);
         mb.add(leave);
         
         JMenuItem facultyleave = new JMenuItem( " Facutly Leave");
        facultyleave.setBackground( Color.WHITE);
         leave.add(facultyleave);
        
         JMenuItem studentleave = new JMenuItem( "  Student Leave");
        studentleave.setBackground( Color.WHITE);
         leave.add(studentleave);
         
         
         // leave details
         
           JMenu leavedetails = new JMenu(" Leave Details");
          leavedetails.setForeground(Color.BLUE);
         mb.add(leavedetails);
         
         JMenuItem facultyleavedetails = new JMenuItem( " Facutly Leave Details");
        facultyleavedetails.setBackground( Color.WHITE);
         leavedetails.add(facultyleavedetails);
        
         JMenuItem studentleavedetails = new JMenuItem( "  Student Leave Details");
        studentleavedetails.setBackground( Color.WHITE);
         leavedetails.add(studentleavedetails); 
         
         
         // Exams
           JMenu examination = new JMenu(" Exam Details");
         examination.setForeground(Color.BLUE);
         mb.add(examination);
         
         JMenuItem examdetails = new JMenuItem( " ExamResults");
        examdetails.setBackground( Color.WHITE);
        examination.add(examdetails);
        
         JMenuItem exammarks = new JMenuItem( "  Enter  Marks");
        exammarks.setBackground( Color.WHITE);
        examination.add(exammarks); 
        
        
        // Update Info
           JMenu updateinfo = new JMenu(" Update Details");
         updateinfo.setForeground(Color.BLUE);
         mb.add(updateinfo);
         
         JMenuItem updatefacultyinfo = new JMenuItem( "Update Faculty Details");
        updatefacultyinfo.setBackground( Color.WHITE);
        updateinfo.add(updatefacultyinfo);
        
         JMenuItem updatestudentinfo = new JMenuItem( "Update Student Details");
         updatestudentinfo.setBackground( Color.WHITE);
        updateinfo.add(updatestudentinfo); 
         
        
          // fee
           JMenu fee = new JMenu(" Fee Details");
         fee.setForeground(Color.BLUE);
         mb.add(fee);
         
         JMenuItem feestructure = new JMenuItem( "Fee Structure");
        feestructure.setBackground( Color.WHITE);
        fee.add(feestructure);
        
         JMenuItem feeform= new JMenuItem( " Student Fee Form ");
         feeform.setBackground( Color.WHITE);
        fee.add(feeform); 
        
        setJMenuBar(mb);
         
         
         setJMenuBar(mb);
         
        
         setVisible(true);
}    
    
public static void main(String[ ] args){
    new Project();  
}
}
