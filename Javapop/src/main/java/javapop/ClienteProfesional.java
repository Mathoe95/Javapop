/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;

/**
 * Esta clase contiene los metodos y atributos de un cliente profesional
 * @author mark_
 */
public class ClienteProfesional extends Cliente implements Serializable{

    //atributos de los clientes profesionales
    private String descripcion;
    private LocalTime horarioApertura;
    private int telefono;
    private String web;
    private LocalDate fechaApertura;

    /**
     * Metodo constructor con parametros
     * @param descripcion descripcion de la tienda de el cliente profesional.
     * @param horarioApertura horario de apertura de la tienda.
     * @param telefono telefono de la tienda.
     * @param web web de la tienda.
     * @param correo correo del cliente profesional.
     * @param clave clave del cliente profesional.
     * @param dni dni del cliente profesional.
     * @param nombre nombre del cliente profesional.
     * @param codigoPostal codigo postal del cliente profesional.
     * @param ciudad ciudad del cliente profesional.
     * @param tarjetaCredito tarjeta de credito del cliente profesional.
     * @param saldo saldo de la tarjeta
     */
    //constructor de los clientes profesionales
    public ClienteProfesional(String descripcion, LocalTime horarioApertura, int telefono, String web, String correo, String clave, String dni, String nombre, int codigoPostal, String ciudad, long tarjetaCredito, int saldo) {
        super(correo, clave, dni, nombre, codigoPostal, ciudad, tarjetaCredito,saldo);
        this.descripcion = descripcion;
        this.horarioApertura = horarioApertura;
        this.telefono = telefono;
        this.web = web;
        this.fechaApertura = LocalDate.now();

    }

    //metodos de los clientes profesionales
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * Metodo en el que metemos por parametros lo datos que queremos modificar del cliente profesional y mediante los metodos set metemos los datos modificados.
     * @param clientep es el cliente profesional que vamos a modificar los datos.
     * @param descripcion descripcion que vamos a modificar del cliente profesional.
     * @param horarioApertura horario de apertura que vamos a modificar del cliente profesional
     * @param telefono telefono que vamos a modificar del cliente profesional
     * @param web web que vamos a modificar del cliente profesional
     */
    public void modificarDatos(ClienteProfesional clientep, String descripcion, LocalTime horarioApertura, int telefono, String web) {
        clientep.setDescripcion(descripcion);
        clientep.setHorarioApertura(horarioApertura);
        clientep.setTelefono(telefono);
        clientep.setWeb(web);
    }

    @Override
    public String toString() {
        return super.toString() + "#Cliente Profesional {" + "descripcion=" + descripcion + ", horarioApertura=" + horarioApertura + ", telefono=" + telefono + ", web=" + web +", fechaApertura=" + fechaApertura + '}';
    }

}
