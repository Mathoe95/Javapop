/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Esta clase contiene los metodos y atributos de una venta
 * @author mark_
 */
public class Ventas implements Serializable {

    //atributos de ventas
    private Cliente comprador;
    private Cliente vendedor;
    private Producto producto;
    private LocalDate fecha;

    /**
     * Metodo constructor con parametros
     * @param comprador cliente que compra el producto.
     * @param vendedor vendedor que compra el producto.
     * @param producto el producto que se ha vendido o comprado.
     * @param fecha fecha de la venta.
     */
    //constructor de ventas
    public Ventas(Cliente comprador, Cliente vendedor, Producto producto, LocalDate fecha) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.fecha = LocalDate.now();
        this.producto = producto;
    }

    public Cliente getClienteC() {
        return comprador;
    }

    public void setClienteC(Cliente comprador) {
        this.comprador = comprador;
    }

    public Cliente getClienteV() {
        return vendedor;
    }

    public void setClienteV(Cliente vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProductoV() {
        return producto;
    }
    //metodos de ventas
    
    /**
     * Metodo en el que generamos una venta con ciertos parametros introducidos.Generamos un fichero txt con los nombres ,dni y fechas de los parametros introducidos.
     * @param vendedor cliente que vende el producto que le pertenece.
     * @param comprador cliente que compra el prodcuto del vendedor.
     * @param miproducto producto que se vende o compra.
     * @throws IOException error en la entrada/salida.
     */
    
    /*
    En este metodo generamos una ficha .txt y se guarda en ella los datos que hemos metido como parametro de vendedor , comprador y producto.
    En la ficha se guarda los datos del vendedor y comprador(dni y nombre) y el producto que se ha vendido.
    El nombre de los archivos .txt se va a ir sumando con el atributo static identificador , para que cada venta sea unica y se imprima identificador.txt
     */
    public static void generarVentas(Cliente vendedor, Cliente comprador, Producto miproducto) throws IOException {
        String ficheroFactura = "./Facturas/" + (miproducto.getTitulo()+"-"+comprador.getDni()+"-"+ LocalDate.now() + ".txt");
        File carpetaFactura = new File("./Facturas");
        try {
            if (carpetaFactura.exists()) {
                
                FileWriter ruta = new FileWriter(ficheroFactura);
                PrintWriter salida = new PrintWriter(new BufferedWriter(ruta));
                salida.println("------Producto-------");
                salida.println(miproducto.toString());
                salida.println("------Fecha-------");
                salida.println("Fecha de la venta:" + " " + LocalDate.now());
                salida.println("------Datos del vendedor-------");
                salida.println("Nombre:" + " " + vendedor.getNombre() + " " + "Dni:" + vendedor.getDni());
                salida.println("------Datos del comprador-------");
                salida.println("Nombre:" + " " + comprador.getNombre() + " " + "Dni:" + comprador.getDni());
                salida.close();
                Utilidades.registroVenta(comprador, vendedor, miproducto, LocalDate.now());
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());

        }
    }

    @Override
    public String toString() {
        return "Ventas{" + "comprador=" + comprador + ", vendedor=" + vendedor + ", producto=" + producto + ", fecha=" + fecha + '}';
    }

}
