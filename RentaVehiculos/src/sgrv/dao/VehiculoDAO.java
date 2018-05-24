/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sgrv.domain.Vehiculo;
import sgrv.datasource.BaseDatos;

/**
 *
 * @author marai
 */
public class VehiculoDAO implements IVehiculoDAO{

    public static void agregarVehiculo(VehiculoDAO v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private ArrayList<Vehiculo> listaVehiculos;
    private String query;
    private Connection connection;
        
    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        query="INSERT INTO vehiculos(numMotor, tipo, matricula, modelo, kilometraje, marca, color, numPasajeos, numCilindros, estado, precio, Pedidos_nomPedido, Bodegas_idBodega) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1, vehiculo.getNumMotor());
            statement.setString(2, "%"+vehiculo.getTipo()+"%");
            statement.setString(3, "%"+vehiculo.getMatricula()+"%");
            statement.setString(4, "%"+vehiculo.getModelo()+"%");
            statement.setFloat(5, vehiculo.getKilometraje());
            statement.setString(6, "%"+vehiculo.getMarca()+"%");
            statement.setString(7, "%"+vehiculo.getColor()+"%");
            statement.setInt(8, vehiculo.getNumPasajeros());
            statement.setInt(9, vehiculo.getNumCilindros());
            statement.setString(10, "%"+vehiculo.getEstado()+"%");
            statement.setFloat(11, vehiculo.getPrecio());
            statement.setInt(12, 1);
            statement.setInt(13, 1);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
   }

    @Override
    public List<Vehiculo> obtenerTodos() {
        listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;
    }

    @Override
    public List<Vehiculo> obtenerPorMarca(String marca) {
      listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.marca= ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, marca);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;  
    }

    @Override
    public List<Vehiculo> obtenerPorTipo(String tipo) {
   listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.tipo= ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, tipo);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;  
    }

    @Override
    public List<Vehiculo> obtenerPorModelo(String modelo) {
         listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.modelo= ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, modelo);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;  
    }

    @Override
    public List<Vehiculo> obtenerPorColor(String color) {
         listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.color= ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, color);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;  
    }

    @Override
    public List<Vehiculo> obtenerPorPrecio(float precio) {
         listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.precio <= ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setFloat(1, precio);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;  
    }

    @Override
    public List<Vehiculo> obtenerPorNoCilindros(int cilindros) {
         listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.numCilindros = ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1, cilindros);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;
    }

    @Override
    public List<Vehiculo> obtenerPorNoPasajeros(int pasajeros) {
         listaVehiculos= new ArrayList<>();
        query="select numMotor, tipo,precio, marca, numPasajeos, ciudad from vehiculos v, bodegas b where v.Bodegas_idBodega=b.idBodega and v.numPasajeos <= ?";
        connection=BaseDatos.getDataBaseConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1, pasajeros);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Vehiculo vehiculo = new Vehiculo(result.getInt("numMotor"), result.getString("tipo"), result.getString("marca"), result.getInt("numPasajeos"), result.getFloat("precio"),result.getString("ciudad"));
                listaVehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BaseDatos.closeConnection();
        }
         return listaVehiculos;
    }
    
}
