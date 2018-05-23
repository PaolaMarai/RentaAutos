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
public interface VehiculoDAO {
    void insertar(Vehiculo a);
    void modificar(Vehiculo a);
    void eliminar(Vehiculo a);
    List<Vehiculo> obtenerTodos(); //Obtener todos los vehiculos.
    Vehiculo obtener(int numMotor); //obtener apartir del numero de motor
}
