
package university.managment.system;

import java.sql.*;

public class Connection {
    
    Connection c;
    Statement s;
    Connection(){
        try{
            
             class.forName("com.mysql.cj.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/");
             s = c.createStatement();
        }catch(Exception e){
                e.printStackTrace();
        }
    }
}
