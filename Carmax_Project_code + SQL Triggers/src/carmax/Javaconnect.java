/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmax;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Javaconnect {
   
    /**
     *
     * @return
     */
    public static Connection ConnectrDb() {
          Connection con;
     try{
         Class.forName("oracle.jdbc.driver.OracleDriver");  
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Suraj","jayshree123456");  
  return con;
     }
    catch (ClassNotFoundException | SQLException e) {
       JOptionPane.showMessageDialog(null, e); 
    }
         return null;

    }

 
}
  
   

