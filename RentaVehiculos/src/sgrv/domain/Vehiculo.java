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
    private String marca;
    private float kilometraje;
    private String color;
    private String modelo;
    private String matricula;
    private int numPasajeros;
    private int numCilindros;
    private float precio;
    private String estado;
    private String locacion;

    
    public Vehiculo(int numMotor, String tipo, int numPasajeros, int numCilindros, float precio, String marca, float kilometraje, String color, String modelo, String matricula) {
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

    public Vehiculo(int numMotor, String tipo, String marca, String color, String modelo, int numPasajeros, float precio, String locacion) {
        this.numMotor = numMotor;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.numPasajeros = numPasajeros;
        this.precio = precio;
        this.locacion = locacion;
    }

   

    public Vehiculo(){
    }

    public int getNumMotor() {
        return numMotor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public float getKilometraje() {
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

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public float getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKilometraje(float kilometraje) {
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

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }
   
}
