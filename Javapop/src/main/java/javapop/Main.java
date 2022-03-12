/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author mark_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ClienteProfesional pepe = new ClienteProfesional("Tienda de ropa", LocalTime.of(10, 00), 915426422, "ropa@gmail.com", "pepe@hotmail.com", "pepeitooo", "87767g", "pepe", 23442, "fuenlabrada", 231231321, 100);
        ClienteProfesional juan = new ClienteProfesional("Tienda de coches", LocalTime.of(10, 15), 915456422, "motosfacil@gmail.com", "juan@hotmail.com", "juanitooo", "22267g", "juan", 33442, "getafe", 132231321, 140);

        //clientes
        Cliente pepito = new Cliente("pepito@hotmail.com", "pepeelbueno", "41123332p", "pepito", 28991, "Fuenlabrada", 54556523, 110);
        Cliente marcos = new Cliente("marcos@hotmail.com", "marcoooo", "2212332f", "marcos", 27991, "Leganes", 22256523, 100);
        Cliente ana = new Cliente("ana@hotmail.com", "anita", "1112332a", "ana", 27981, "Leganes", 11156523, 75);

        //Productos
        Producto lenovo = new Producto("Movil lenovo", "Movil sin camara", "Moviles y telefonia", "Como nuevo", 80.50, 21943, "lenovo.png", false, "1112332a");
        Producto movil = new Producto("Movil xiaomi", "Movil con camara", "Moviles y telefonia", "Nuevo", 111.22, 28742, "xiaomi.png", false, "2212332f");
        Producto samsung = new Producto("Movil samsung", "Movil 4k", "Moviles y telefonia", "Nuevo", 51.55, 11242, "samsung.png", false, "1112332a");
        Producto lg = new Producto("Movil lg", "Movil con video", "Moviles y telefonia", "Nuevo", 58.55, 28942, "lg.png", false, "2212332f");
        Producto moda = new Producto("Pantalones Primark", "pantalon vaquero", "Moda y accesorio", "Como nuevo", 11.25, 28741, "moda.png", false, "41123332p");
        Producto camiseta = new Producto("Camiseta nike", "camiseta vintage", "Moda y accesorio", "Como nuevo", 61.25, 28555, "camiseta.png", true, "87767g");
        Producto camisa = new Producto("Camisa", "camisa street", "Moda y accesorio", "Como nuevo", 21.25, 28991, "camisa.png", true, "41123332p");
        Producto gorro = new Producto("gorro", "gorro colorido", "Moda y accesorio", "Nuevo", 44.25, 23441, "gorro.png", false, "87767g");
        Producto zapatillas = new Producto("zapatillas", "zapas molonas", "Moda y accesorio", "Nuevo", 10.95, 33440, "zapatillas.png", true, "22267g");
        Producto calcetines = new Producto("calcetines", "calcetines primark", "Moda y accesorio", "Como nuevo", 20.95, 33440, "calcetines.png", false, "22267g");
        
        Utilidades.altaClienteProfesional(pepe);
        Utilidades.altaClienteProfesional(juan);

        Utilidades.altaCliente(pepito);
        Utilidades.altaCliente(marcos);
        Utilidades.altaCliente(ana);

        juan.altaProductoCliente(zapatillas);
        juan.altaProductoCliente(calcetines);
        
        pepito.altaProductoCliente(moda);
        pepito.altaProductoCliente(camisa);

        pepe.altaProductoCliente(camiseta);
        pepe.altaProductoCliente(gorro);

        marcos.altaProductoCliente(movil);
        marcos.altaProductoCliente(lg);

        ana.altaProductoCliente(samsung);
        ana.altaProductoCliente(lenovo);

        moda.productoUrgente(pepe);
        lg.productoUrgente(marcos);

        marcos.vendeProducto(marcos, pepe, movil, "si");
        //Utilidades.consultarUsuarios();
        //Utilidades.consultarProductos();
        //Utilidades.consultaVentas();
        System.out.println(Utilidades.getProductos());
        Utilidades.consultaVentasFecha(LocalDate.of(2020, Month.MAY, 05));
        Utilidades.inicioSesion("marcoooo", "marcos@hotmail.com");
        Utilidades.inicioSesion("admin", "admin@javapop.com");
        //Utilidades.buscarProductos("", "Moviles y telefonia", 28943);

        Utilidades.cuotaMensual(pepe);
        pepe.modificarDatos(pepe, "Tienda de motos", LocalTime.of(11, 15), 912355445, "runrun@hotmail.com");

        Utilidades.guardarDatosCliente();
        Utilidades.guardarDatosClienteProfesional();
        Utilidades.guardarDatosProducto();
        Utilidades.guardarDatosVentas();
    }
}
