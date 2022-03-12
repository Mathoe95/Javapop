/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta clase contiene los metodos y atributos de un cliente
 * @author mark_
 */
public class Cliente implements Serializable, Comparable<Cliente> {

    //atributos de los clientes
    private String correo;
    private String clave;
    private String dni;
    private String nombre;
    private int codigoPostal;
    private String ciudad;
    private long tarjetaCredito;
    private int saldo;
    private ArrayList<Producto> misproducto;
    private Producto producto;

    /**
     * Metodo constructor con parametros
     * @param correo correo del cliente
     * @param clave clave del cliente
     * @param dni dni del cliente
     * @param nombre nombre del cliente
     * @param codigoPostal codigo postal del cliente
     * @param ciudad ciudad del cliente
     * @param tarjetaCredito tarjeta de credito del cliente
     * @param saldo  saldo del cliente
     */
    public Cliente(String correo, String clave, String dni, String nombre, int codigoPostal, String ciudad, long tarjetaCredito, int saldo) {
        this.correo = correo;
        this.clave = clave;
        this.dni = dni;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.tarjetaCredito = tarjetaCredito;
        this.saldo = saldo;
        misproducto = new ArrayList<>();

    }

    //metodos de los clientes
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(long tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Producto> getMisproducto() {
        return misproducto;
    }

    public void setMisproducto(ArrayList<Producto> misproducto) {
        this.misproducto = misproducto;
    }
    
    /**
     * Metodo para dar de alta en el arraylist los productos que queremos que tenga el cliente y comprobar que este no lo contenga previamente.
     * @param Miproducto es el producto que esta dado de alta anteriormente en el sistema, para que el cliente lo de alta como suyo.
     */
    public void altaProductoCliente(Producto Miproducto) {
        if (!misproducto.contains(Miproducto)) {
            misproducto.add(Miproducto);
        }
    }

    /**
     * Metodo para dar de baja en el arraylist los productos de los cliente ,pero,antes comprobamos que lo tiene.
     * @param Miproducto producto que va a dar de baja del cliente y le pertenece.
     */
    public void bajaProductoCliente(Producto Miproducto) {
        if (misproducto.contains(Miproducto)) {
            misproducto.remove(Miproducto);
        }
    }

    
    /**
     * Metodo en el que el cliente realiza la venta,comprobando si ha sido confirmada esa venta.Una vez que ha sido confirmada , se realiza la venta del producto,generando la venta y dando de baja al producto.
     * @param vendedor tipo de cliente en el que es el vendedor del producto.
     * @param comprador tipo de cliente en el que es el comprador del producto
     * @param miproducto producto que se va a vender.
     * @param confirmacion confirmacion de que esta dispuesto a comprar ese producto el comprador.
     * @throws IOException error en la entrada/salida.
     */
    /*
    En este metodo lo que hacemos es vender el producto del cliente, introducimos el vendedor que tiene el producto, el comprador , el producto que queremos vender y la confirmacion
    de que el comprador realmente quiere comprar dicho producto.
    Dentro del metodo realizamos un if para comprobar que es cierto la confirmacion y que el vendedor tiene el producto en venta.Si esto es cierto , llamamos al metodo de generarventas
    de la clase ventas , que nos genera una ficha de la venta con los datos de los vendedor , comprador y el producto que se han generado en la venta.Despues le damos de baja al producto
    del vendedor y del sistema.Finalmente le mostramos que ha sido correctamente vendido.
    Si no se cumple las condidicones,entonces saldra por pantalla que no se ha podido vender el producto.
     */
    public void vendeProducto(Cliente vendedor, Cliente comprador, Producto miproducto, String confirmacion) throws IOException {
        if (confirmacion.equals("si") && vendedor.misproducto.contains(miproducto)) {
            Ventas.generarVentas(vendedor, comprador, miproducto);
            bajaProductoCliente(miproducto);
            //Utilidades.generarProductos();
            //System.out.println(vendedor.getNombre() + " " + "tienes el producto " + miproducto.getTitulo() + " " + "correctamente vendido!");
        } else {
           // System.out.println("Lo sentimos pero el producto no se puede vender...");
        }
    }
    
/**
 * Metodo en el que se compra el producto,nos envia al metodo venderProducto.
 * @param vendedor tipo de cliente en el que es el vendedor del producto.
 * @param comprador tipo de cliente en el que es el comprador del producto
 * @param miproducto producto que se va a comprar.
 * @throws IOException error en la entrada/salida.
 */
    /*
    En este metodo realizamos la compra de un producto metiendo el vendedor que tiene el producto , el comprador interesado y el producto a comprar.
    Comprobamos si el vendedor tiene en venta el producto.Si es cierto encontes llamamos al metodo de la misma clase venderProducto y le metemos los parametros anteriores con 
    una variante que es "si" que siginifica que el comprador confirma que quiere comprar ese producto.
    Si no tiene el producto el vendedor,entonces no se puede realizar la venta.
     */
    public void compraProducto(Cliente vendedor, Cliente comprador, Producto miproducto) throws IOException {
        if (vendedor.misproducto.contains(miproducto)) {
            vendeProducto(vendedor, comprador, miproducto, "si");
        } else {
            //System.out.println(vendedor.getNombre() + " " + "no tiene el producto que quieres comprar....");
        }
    }


//comparador de clientes por dni
    @Override
    public int compareTo(Cliente c) {
        return this.dni.compareTo(c.getDni());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;

        }
        final Cliente other = (Cliente) obj;
        if ((this.dni == null) ? (other.dni != null) : !this.dni.equals(other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.dni != null ? this.dni.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", clave=" + clave + ", dni=" + dni + ", nombre=" + nombre + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", tarjetaCredito=" + tarjetaCredito + "saldo=" + saldo + '}'
                + "\n" + misproducto.toString();
    }
}
