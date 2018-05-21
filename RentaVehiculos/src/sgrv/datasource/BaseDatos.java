package sgrv.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
     private static Connection connection;    
    
    private static void makeConnection(){
        try {
            
            String url= "jdbc:mysql://localhost/";
            String databaseName = "rebtaBD";
            String userName = "root";
            String password = "zS16011716.";
       
            connection = (Connection)DriverManager.getConnection(url+databaseName,userName,password);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static Connection getDataBaseConnection() {        
        makeConnection();
        return BaseDatos.connection;
 
    }
    
    public static void closeConnection(){
        if(connection!=null){
            try {
                if(!connection.isClosed()){
                    connection.close();                
                }
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
