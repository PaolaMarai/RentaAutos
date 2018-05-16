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
   private double iva;
   private double descuento;
   private double precioFinal;
   private String fecha;

    public Pedido(int numPedido, double iva, double descuento, double precioFinal, String fecha) {
        this.numPedido = numPedido;
        this.iva = iva;
        this.descuento = descuento;
        this.precioFinal = precioFinal;
        this.fecha = fecha;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
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

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public String getFecha() {
        return fecha;
    }
   
   
}
