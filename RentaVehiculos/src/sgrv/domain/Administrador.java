/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.domain;

/**
 *
 * @author marai
 */
public class Administrador {
    private int numPersonal;
    private String nombreCompleto;
    private String correo;

    public Administrador(int numPersonal, String nombreCompleto, String correo) {
        this.numPersonal = numPersonal;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
    }

    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
