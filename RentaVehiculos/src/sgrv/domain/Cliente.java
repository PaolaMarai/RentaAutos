/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.domain;

import java.util.ArrayList;

/**
 *
 * @author marai
 */
public class Cliente {
    private String rfc;
    private String nombreCompleto;
    private ArrayList telefono;
    private String correo;
    private String direccion;

    public Cliente(String rfc, String nombreCompleto, ArrayList telefono, String correo, String direccion) {
        this.rfc = rfc;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTelefono(ArrayList telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public ArrayList getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
