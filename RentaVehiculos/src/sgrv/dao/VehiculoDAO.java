/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.dao;

import java.util.List;
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
    private ArrayList<Vehiculo> listaVehiculos;
    private String query;
    private Connection connection;
        
    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        query="INSERT INTO vehiculos(numMotor, tipo, matricula, modelo, kilometraje, marca, color, numPasajeros, numCilindros, estado, precio, Pedidos_nomPedido, Bodegas_idBodega) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorMarca(String marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorModelo(String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorPrecio(String precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorNoCilindros(String cilindros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> obtenerPorNoPasajeros(String pasajeros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
