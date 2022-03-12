/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Esta clase contiene los metodos y atributos de un producto.
 * @author mark_
 */
public class Producto implements Serializable {

    //atributos de los productos
    private String titulo;
    private String descripcion;
    private String categoria;
    private String estadoProducto;
    private double precioProducto;
    private LocalDate fechaPublicacion;
    private int ubicacion;
    private String imagen;
    private boolean urgente;
    private String vendedor;

    /**
     * Metodo constructor con parametros
     * @param titulo titulo del producto.
     * @param descripcion descripcion del producto.
     * @param categoria tipo de categoria que pertenece el producto.
     * @param estadoProducto estado del producto.
     * @param precioProducto precio de venta del producto.
     * @param ubicacion codigo postal donde esta ubicado el producto.
     * @param imagen imagen del producto.
     * @param urgente saber si es urgente la venta del producto.
     * @param dni dni del vendedor al que pertenece el producto.
     */
    //constructor de los productos
    public Producto(String titulo, String descripcion, String categoria, String estadoProducto, double precioProducto, int ubicacion, String imagen, boolean urgente, String dni) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estadoProducto = estadoProducto;
        this.precioProducto = precioProducto;
        this.fechaPublicacion = LocalDate.now();
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.urgente = urgente;
        this.vendedor = dni;
    }

    //metodos de los productos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setTipoCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getVendedor() {
        return vendedor;
    }

    /**
     * Metodo de comprobacion de si el producto del cliente es true , entonces no se marcara como urgente.Si es false , entonces se marcara como true,se le cobrara una cuota al cliente y pasara a urgente.
     * @param cliente cliente al que pertenece ese producto.
     * @return regresa si es urgente el producto.
     */
    
    /*Este metodo es el de producto urgente y primero tiene un cliente profesional como parametro(tiene el producto a la venta).
      Lo que hace es que si el producto es urgente(boolean true) y ha pasado los 7 dias de que sea urgente , pase a false y deje de ser urgente.
      Tambien cada vez que le demos al producto urgente , se le debe de cobrar 5 € al saldo del cliente profesional pero con la condicion de que tenga al menos 5 € en la cuenta.
      Si esto no pasa pues entonces no se le podra cobrar nada y el producto no sera urgente.*/
    public boolean productoUrgente(Cliente cliente) {
        LocalDate fechaVencimiento = fechaPublicacion.plusDays(7);
        if (urgente == true && fechaVencimiento.isBefore(fechaPublicacion)) {
            urgente = false;
            //System.out.println("Producto urgente expirado");

        } else if (cliente.getSaldo() < 5) {
            //System.out.println("Lo sentimos" + " " + cliente.getNombre() + " pero su saldo no tiene el minimo requerido....");

        } else {
            int coste = 5;
            int resultado = cliente.getSaldo() - coste;
            cliente.setSaldo(resultado);
            urgente = true;
            setFechaPublicacion(LocalDate.now());
            //System.out.println("Producto correctamente puesto como urgente" + "\n" + "Le queda en la cuenta:" + cliente.getSaldo());
        }
        return urgente;
    }
/**
 * Metodo de comprobacion de si el producto del cliente profesional es true , entonces no se marcara como urgente.Si es false , entonces se marcara como true,se le cobrara una cuota al cliente y pasara a urgente.
 * @param clienteProfesional cliente profesional al que pertenece ese producto.
 * @return regresa si es urgente el producto.
 */
    //Metodo igual que el anterior pero con clientes profesionales
    public boolean productoUrgente(ClienteProfesional clienteProfesional) {
        LocalDate fechaVencimiento = fechaPublicacion.plusDays(7);
        if (urgente == true && fechaVencimiento.isBefore(fechaPublicacion)) {
            urgente = false;
            //System.out.println("Producto urgente expirado");

        } else if (clienteProfesional.getSaldo() < 5) {
            //System.out.println("Lo sentimos" + " " + clienteProfesional.getNombre() + " pero su saldo no tiene el minimo requerido....");

        } else {
            int coste = 5;
            int resultado = clienteProfesional.getSaldo() - coste;
            clienteProfesional.setSaldo(resultado);
            urgente = true;
            setFechaPublicacion(LocalDate.now());
            //System.out.println("Producto correctamente puesto como urgente" + "\n" + "Le queda en la cuenta:" + clienteProfesional.getSaldo());
        }
        return urgente;
    }

    @Override
    public String toString() {
        return "Producto{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", categoria=" + categoria + ", estadoProducto=" + estadoProducto + ", precioProducto=" + precioProducto + ", fechaPublicacion=" + fechaPublicacion + ", ubicacion=" + ubicacion + ", imagen=" + imagen + ", urgente=" + urgente + ", vendedor=" + vendedor + '}';
    }

}
