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
import sgrv.datasource.BaseDatos;
import sgrv.domain.Administrador;
import sgrv.domain.Usuario;
/**
 *
 * @author marai
 */
public class AdministradorDAO implements IAdministradorDAO{

    @Override
    public Administrador obtenerAdministrador(String correo) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
