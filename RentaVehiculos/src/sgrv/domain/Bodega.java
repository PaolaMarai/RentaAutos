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
public class Bodega {
    private int numBodega;
    private String direccion;
    private String ciudad;

    public Bodega(int numBodega, String direccion, String ciudad) {
        this.numBodega = numBodega;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumBodega() {
        return numBodega;
    }

    public void setNumBodega(int numBodega) {
        this.numBodega = numBodega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
