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
public class Pedido {
   private int numPedido;
   private String fecha;
   private double precioFinal;
   private double iva;

    public Pedido(int numPedido, double iva, double precioFinal, String fecha) {
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.precioFinal = precioFinal;
        this.iva = iva;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public double getIva() {
        return iva;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public String getFecha() {
        return fecha;
    }  
}
