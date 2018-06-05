package sgrv.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
     private static Connection conexion;    
     
    private static void makeConnection(){
        try {
            String url= "jdbc:mysql://localhost/";
            String properties="?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String databaseName = "rentabd";
            String userName = "root";
            String password = "";
       
            conexion = (Connection)DriverManager.getConnection(url+databaseName+properties,userName,password);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static Connection getDataBaseConnection() {        
        makeConnection();
        return BaseDatos.conexion;
 
    }
    
    public static void closeConnection(){
        if(conexion!=null){
            try {
                if(!conexion.isClosed()){
                    conexion.close();                
                }
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}