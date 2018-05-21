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
public class Factura {
    private int numFactura;
    private String fechaFactura;
    private String fechaVencimiento;
    private String comentarios;

    public Factura(int numFactura, String fechaFactura, String fechaVencimiento, String comentarios) {
        this.numFactura = numFactura;
        this.fechaFactura = fechaFactura;
        this.fechaVencimiento = fechaVencimiento;
        this.comentarios = comentarios;
    }


    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
}
