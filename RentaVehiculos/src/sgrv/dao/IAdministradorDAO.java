/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.dao;
import  sgrv.domain.Administrador;
/**
 *
 * @author marai
 */
public interface IAdministradorDAO {
    Administrador compruebaAdministrador(String correo);
}
