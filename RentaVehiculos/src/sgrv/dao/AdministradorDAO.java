package sgrv.dao;

import java.util.List;
import sgrv.domain.Administrador;


public interface AdministradorDAO {
    void insertar(Administrador a);
    void modificar(Administrador a);
    void eliminar(Administrador a);
    List<Administrador> obtenerTodos(); //Obtener todos los vehiculos.
    Administrador obtener(int numPersonal); //obtener apartir del numero de motor

}
