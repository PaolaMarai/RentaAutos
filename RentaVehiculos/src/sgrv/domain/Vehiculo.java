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
public class Vehiculo {
    private int numMotor;
    private String tipo;
    private int numPasajeros;
    private int numCilindros;
    private double precio;
    private String marca;
    private double kilometraje;
    private String color;
    private String modelo;
    private String matricula;
    private String estado;

    public Vehiculo(int numMotor, String tipo, int numPasajeros, int numCilindros, double precio, String marca, double kilometraje, String color, String modelo, String matricula) {
        this.numMotor = numMotor;
        this.tipo = tipo;
        this.numPasajeros = numPasajeros;
        this.numCilindros = numCilindros;
        this.precio = precio;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
        estado="Disponible";
    }


    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
