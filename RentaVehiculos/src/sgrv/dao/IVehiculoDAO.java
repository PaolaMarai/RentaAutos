/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.dao;

import java.util.List;
import sgrv.domain.Vehiculo;

/**
 *
 * @author Cesar Diaz
 */
public interface IVehiculoDAO {
    void agregarVehiculo(Vehiculo vehiculo);
    List<Vehiculo> obtenerTodos();
    List<Vehiculo> obtenerPorMarca(String marca);
    List<Vehiculo> obtenerPorTipo(String tipo);
    List<Vehiculo> obtenerPorModelo(String modelo);
    List<Vehiculo> obtenerPorColor(String color);
    List<Vehiculo> obtenerPorPrecio(String precio);
    List<Vehiculo> obtenerPorNoCilindros(String cilindros);
    List<Vehiculo> obtenerPorNoPasajeros(String pasajeros);
}
