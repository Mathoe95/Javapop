/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Esta clase contiene los metodos y atributos para realizar operaciones
 * complementarias en el programa.
 *
 * @author mark_
 */
public class Utilidades {
//atributos

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    private static ArrayList<Producto> productos = new ArrayList<>();

    private static ArrayList<ClienteProfesional> clientesprofesionales = new ArrayList<>();

    private static ArrayList<Ventas> ventas = new ArrayList<>();
    
    private static ArrayList<Producto> buscadorProductosTotal = new ArrayList<>();

//metodos
    public static void setClientes(ArrayList<Cliente> c) {
        clientes = c;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientesProfesionales(ArrayList<ClienteProfesional> cp) {
        clientesprofesionales = cp;
    }

    public static ArrayList<ClienteProfesional> getClientesProfesionales() {
        return clientesprofesionales;
    }

    public static ArrayList<Producto> getBuscadorProductosTotal() {
        return buscadorProductosTotal;
    }

    public static void setProductos(ArrayList<Producto> p) {
        productos = p;
    }

    public static ArrayList<Producto> getProductos() {
        productos.clear();
        generarProductos();
        return productos;
    }

    public static void setVentas(ArrayList<Ventas> v) {
        ventas = v;
    }

    public static ArrayList<Ventas> getVentas() {
        return ventas;
    }

 

    /**
     * Metodo para comprobar e iniciar sesion en el programa
     *
     * @param clave clave del usuario que metemos como un String.
     * @param correo correo del usuario que metemos como un String.
     */
    public static void inicioSesion(String clave, String correo) {
        // TODO add your handling code here:
        if (correo.equals("admin@javapop.com") && clave.equals("admin")) {
            System.out.println("Bienvenido administrador!");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getCorreo().equals(correo)
                        && clientes.get(i).getClave().equals(clave)) {
                    System.out.println("El usuario:" + clientes.get(i).getNombre() + " " + "se ha conectado correctamente!");
                }
            }
            for (int i = 0; i < clientesprofesionales.size(); i++) {
                if (clientesprofesionales.get(i).getCorreo().equals(correo)
                        && clientesprofesionales.get(i).getClave().equals(clave)) {
                    System.out.println("El usuario:" + clientesprofesionales.get(i).getNombre() + " " + "se ha conectado correctamente!");
                }
            }
        }
    }

    /**
     * Metodo de dar alta a los productos en el sistema
     *
     * @param objpro producto que vamos a dar de alta en el sistema.
     * @return regresa si se ha añadido un true y si no un false.
     */
    public static boolean altaProducto(Producto objpro) {
        if (!productos.contains(objpro)) {
            productos.add(objpro);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para dar de baja a los clientes y sus productos
     *
     * @param objcli cliente que va a dar de baja todos sus productos.
     */
    public static void bajaProductosCliente(Cliente objcli) {
        ArrayList<Producto> productosC = objcli.getMisproducto();
        for (int i = 0; i < productosC.size(); i++) {
            productosC.remove(i);
        }
    }

    /**
     * Metodo para generar los productos de los clientes. Se agregan los
     * productos de cada cliente a un arraylist llamado productos.
     */
    public static void generarProductos() {
        for (Cliente c : clientes) {
            productos.addAll(c.getMisproducto());
        }
        for (ClienteProfesional cp : clientesprofesionales) {
            productos.addAll(cp.getMisproducto());
        }
    }

    /**
     * Metodo para dar de alta a los clientes en el programa
     *
     * @param objcli cliente que se va a dar de alta en el sistema.
     * @return true si se ha añadido correctamente y false si no.
     */
    public static boolean altaCliente(Cliente objcli) {
        if (!clientes.contains(objcli)) {
            clientes.add(objcli);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para dar de alta a los clientes profesionales en el programa
     *
     * @param objclip cliente profesional que se va a dar de alta en el sistema.
     * @return true si se ha añadido correctamente y false si no.
     */
    public static boolean altaClienteProfesional(ClienteProfesional objclip) {
        if (!clientesprofesionales.contains(objclip)) {
            clientesprofesionales.add(objclip);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para dar de baja los clientes del sistema
     *
     * @param objcli cliente que se va a dar de baja en el sistema.
     * @return true si se ha dado de baja correctamente y false si no.
     */
    public static boolean bajaCliente(Cliente objcli) {
        if (clientes.contains(objcli)) {
            clientes.remove(objcli);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para dar de baja los clientes profesionales del sistema
     *
     * @param objclip cliente profesional que se va a dar de baja en el sistema.
     * @return true si se ha dado de baja correctamente y false si no.
     */
    public static boolean bajaClienteProfesional(ClienteProfesional objclip) {
        if (clientesprofesionales.contains(objclip)) {
            clientesprofesionales.remove(objclip);
            return true;
        } else {
            return false;
        }
    }

    /**
     * metodo para registrar la venta que se ha realizado entre un vendedor ,
     * comprador , el producto y la fecha de esta. Añadimos en el arrayList de
     * ventas el objeto ventas que se ha creado , para regitrar y guardar la
     * venta.
     *
     * @param comprador comprador que ha intervenido en la compra del producto.
     * @param vendedor vendedor que ha intervenido en la compra del producto.
     * @param miproducto producto que se ha comprado o vendido.
     * @param fecha fecha de la venta.
     */
    public static void registroVenta(Cliente comprador, Cliente vendedor, Producto miproducto, LocalDate fecha) {
        // TODO add your handling code here:
        Ventas objvent = new Ventas(comprador, vendedor, miproducto, fecha);
            ventas.add(objvent);
            //System.out.println("Venta correctamente dada de alta");
            //System.out.println("Error de alta."); 
    }

    /**
     * Metodo de consulta de todos los usuarios dados de alta en el sistema
     */
    public static void consultarUsuarios() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
        for (int i = 0; i < clientesprofesionales.size(); i++) {
            System.out.println(clientesprofesionales.get(i).toString());
        }
    }

    /**
     * Metodo de consulta de los productos que estan dados de alta en el sistema
     */
    public static void consultarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }

    /**
     * Metodo para consultar todas las ventas que estan dados de alta en el
     * sistema
     */
    public static void consultaVentas() {
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(ventas.get(i).toString());
        }
    }

    /**
     * Metodo de consulta de ventas por una fecha determinada o todas las ventas
     * realizadas
     *
     * @param fecha fecha que se consulta.
     */
    public static void consultaVentasFecha(LocalDate fecha) {
        ArrayList<Ventas> ventasPorFecha = new ArrayList<>();
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getFecha().equals(fecha)) {
                ventasPorFecha.add(ventas.get(i));
            }
        }
        for (int i = 0; i < ventasPorFecha.size(); i++) {
            System.out.println("Comprador: " + ventasPorFecha.get(i).getClienteC() + " Vendedor: " + ventasPorFecha.get(i).getClienteV() + " Fecha: " + ventasPorFecha.get(i).getFecha());
        }
    }

    /**
     * Metodo para cargar los datos de los clientes que hemos guardado en un
     * archivo .dat
     */
    public static void cargarDatosCliente() {
        try {
            if (clientes.isEmpty()) {
                try (FileInputStream istreampro = new FileInputStream("clientes.dat")) {
                    ObjectInputStream oispro = new ObjectInputStream(istreampro);
                    clientes = (ArrayList) oispro.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }

    /**
     * Metodo para guardar los datos de los clientes en un archivo .dat
     */
    public static void guardarDatosCliente() {
        try {
            if (!clientes.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("clientes.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(clientes);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }

    }

    /**
     * Metodo para cargar los datos de los clientes profesionales en un archivo
     * .dat
     */
    public static void cargarDatosClienteProfesional() {
        try {
            if (clientesprofesionales.isEmpty()) {
                try (FileInputStream istreampro = new FileInputStream("clientesprofesionales.dat")) {
                    ObjectInputStream oispro = new ObjectInputStream(istreampro);
                    clientesprofesionales = (ArrayList) oispro.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }

    /**
     * Metodo para guardar los datos de los clientes profesionales en un archivo
     * .dat
     */
    public static void guardarDatosClienteProfesional() {
        try {
            if (!clientesprofesionales.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("clientesprofesionales.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(clientesprofesionales);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }

    }

    /**
     * Metodo para cargar los datos de los productos en un archivo .dat
     */
    public static void cargarDatosProducto() {
        try {
            if (productos.isEmpty()) {
                try (FileInputStream istreampro = new FileInputStream("productos.dat")) {
                    ObjectInputStream oispro = new ObjectInputStream(istreampro);
                    productos = (ArrayList) oispro.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }

    /**
     * Metodo para guardar los datos de los productos en un archivo .dat
     */
    public static void guardarDatosProducto() {
        try {
            if (!productos.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("productos.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(productos);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }

    }

    /**
     * Metodo para cargar los datos de las ventas en un archivo .dat
     */
    public static void cargarDatosVentas() {
        try {
            if (ventas.isEmpty()) {
                try (FileInputStream istreampro = new FileInputStream("ventas.dat")) {
                    ObjectInputStream oispro = new ObjectInputStream(istreampro);
                    ventas = (ArrayList) oispro.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }

    /**
     * Metodo para guardar los datos de las ventas en un archivo .dat
     */
    public static void guardarDatosVentas() {
        try {
            if (!ventas.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("ventas.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(ventas);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }

    }

    /**
     * Metodo en el que comprobamos si ha pasado 30 dias desde que el cliente se
     * ha dado de alta en el sistema. Si ha superado estos 30 dias entonces , le
     * cobramos una cuota de 30€ y le modificamos la fecha para que pasen otros
     * 30 dias.
     *
     * @param clienteprofesional cliente profesional que comprabamos la cuota
     * mensual.
     */
    public static void cuotaMensual(ClienteProfesional clienteprofesional) {
        LocalDate fechaMensual = clienteprofesional.getFechaApertura().plusDays(30);
        if (fechaMensual.isAfter(clienteprofesional.getFechaApertura())) {
            System.out.println(clienteprofesional.getNombre() + " " + "no se puede cargar la cuota menusal a su cuenta bancaria:" + clienteprofesional.getTarjetaCredito() + ",debido a que aun esta vigente la mensualidad anterior...");
        } else if (clienteprofesional.getSaldo() < 30) {
            System.out.println(clienteprofesional.getNombre() + " " + "no tiene el suficiente saldo en su cuenta bancaria:" + clienteprofesional.getTarjetaCredito() + "\n" + "Su saldo es de:" + clienteprofesional.getSaldo());
        } else {
            int cuota = 30;
            int resultado = clienteprofesional.getSaldo() - cuota;
            clienteprofesional.setSaldo(resultado);
            clienteprofesional.setFechaApertura(LocalDate.now());
            System.out.println(clienteprofesional.getNombre() + " " + "se le ha cargado 30€ a la siguiente cuenta bancaria:" + clienteprofesional.getTarjetaCredito() + "\n" + "Su saldo es de:" + clienteprofesional.getSaldo());
        }
    }

    /**
     * Metodo para buscar un producto por su titulo , categoria y codigo postal
     *
     * @param titulo titulo del producto a buscar mediante un Sring.
     * @param categoria categoria del producto a buscar mediante un Sring.
     * @param codigoPostal codigo postal del producto a buscar mediante un int.
     * @return 
     */
    /*
    Si no se introduce nada en titulo , buscamos los que coincidan con la categoria y los intoducimos en un arrayList,
    despues comprobamos que no este vacio. Si no esta vacio entonces los ordenamos por urgentes , muy proximo, proximo y no proximo y igual pero con no urgentes.
    Si se introduce un titulo , entonces se busca por titutlo , categoria y codigo postal. Depues se realiza lo mismo que la busqueda anterior.
     */
    public static boolean buscarProductos(String titulo, String categoria, int codigoPostal) {

        ArrayList<Producto> productos = getProductos();

        ArrayList<Producto> buscadorProductos = new ArrayList<>();
        ArrayList<Producto> buscadorProductosNoUrgentes = new ArrayList<>();
        ArrayList<Producto> buscadorProductosUrgentes = new ArrayList<>();

        ArrayList<Producto> buscadorProductosUrgentesOrdenadosM = new ArrayList<>();
        ArrayList<Producto> buscadorProductosUrgentesOrdenadosP = new ArrayList<>();
        ArrayList<Producto> buscadorProductosUrgentesOrdenadosN = new ArrayList<>();

        ArrayList<Producto> buscadorProductosNoUrgentesOrdenadosM = new ArrayList<>();
        ArrayList<Producto> buscadorProductosNoUrgentesOrdenadosP = new ArrayList<>();
        ArrayList<Producto> buscadorProductosNoUrgentesOrdenadosN = new ArrayList<>();
        
        boolean encontrado = false;
        
        if (titulo.equals("")) {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getCategoria().equals(categoria)) {
                    buscadorProductos.add(productos.get(i));
                }
            }
            if (buscadorProductos.isEmpty()) {
                //System.out.println("Lo sentimos pero no se ha encontrado ningun producto con la categoria:" + " " + categoria);
                encontrado = false;
            } else {
                for (int i = 0; i < buscadorProductos.size(); i++) {
                    if (buscadorProductos.get(i).isUrgente()) {
                        buscadorProductosUrgentes.add(0, buscadorProductos.get(i));
                    } else {
                        buscadorProductosNoUrgentes.add(0, buscadorProductos.get(i));
                    }
                }
                for (int i = 0; i < buscadorProductosUrgentes.size(); i++) {
                    int CodigoPostalMuyProximo = codigoPostal / 100;
                    int CodigoPostalUusarioMuyProximo = (buscadorProductosUrgentes.get(i).getUbicacion()) / 100;

                    int CodigoPostalProximo = codigoPostal / 1000;
                    int CodigoPostalUusarioProximo = (buscadorProductosUrgentes.get(i).getUbicacion()) / 1000;

                    if (CodigoPostalMuyProximo == CodigoPostalUusarioMuyProximo) {
                        buscadorProductosUrgentesOrdenadosM.add(buscadorProductosUrgentes.get(i));
                    } else if (CodigoPostalProximo == CodigoPostalUusarioProximo) {
                        buscadorProductosUrgentesOrdenadosP.add(buscadorProductosUrgentes.get(i));
                    } else {
                        buscadorProductosUrgentesOrdenadosN.add(buscadorProductosUrgentes.get(i));
                    }
                }
                for (int i = 0; i < buscadorProductosNoUrgentes.size(); i++) {
                    int CodigoPostalMuyProximo = codigoPostal / 100;
                    int CodigoPostalUusarioMuyProximo = (buscadorProductosNoUrgentes.get(i).getUbicacion()) / 100;

                    int CodigoPostalProximo = codigoPostal / 1000;
                    int CodigoPostalUusarioProximo = (buscadorProductosNoUrgentes.get(i).getUbicacion()) / 1000;

                    if (CodigoPostalMuyProximo == CodigoPostalUusarioMuyProximo) {
                        buscadorProductosNoUrgentesOrdenadosM.add(buscadorProductosNoUrgentes.get(i));
                    } else if (CodigoPostalProximo == CodigoPostalUusarioProximo) {
                        buscadorProductosNoUrgentesOrdenadosP.add(buscadorProductosNoUrgentes.get(i));
                    } else {
                        buscadorProductosNoUrgentesOrdenadosN.add(buscadorProductosNoUrgentes.get(i));
                    }
                }
                buscadorProductosTotal.clear();
                buscadorProductosTotal.addAll(buscadorProductosUrgentesOrdenadosM);
                buscadorProductosTotal.addAll(buscadorProductosUrgentesOrdenadosP);
                buscadorProductosTotal.addAll(buscadorProductosUrgentesOrdenadosN);
                buscadorProductosTotal.addAll(buscadorProductosNoUrgentesOrdenadosM);
                buscadorProductosTotal.addAll(buscadorProductosNoUrgentesOrdenadosP);
                buscadorProductosTotal.addAll(buscadorProductosNoUrgentesOrdenadosN);

                encontrado = true;
            }
            
        } else {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getCategoria().equals(categoria) && productos.get(i).getTitulo().equals(titulo)) {
                    buscadorProductos.add(productos.get(i));
                }
            }
            if (buscadorProductos.isEmpty()) {
                //System.out.println("Lo sentimos pero no se ha encontrado ningun producto con el titulo:" + " " + titulo + "y categoria:" + " " + categoria); 
                encontrado = false;
            } else {
                for (int i = 0; i < buscadorProductos.size(); i++) {
                    if (buscadorProductos.get(i).isUrgente()) {
                        buscadorProductosUrgentes.add(0, buscadorProductos.get(i));
                    } else {
                        buscadorProductosNoUrgentes.add(0, buscadorProductos.get(i));
                    }
                }
                for (int i = 0; i < buscadorProductosUrgentes.size(); i++) {
                    int CodigoPostalMuyProximo = codigoPostal / 100;
                    int CodigoPostalUusarioMuyProximo = (buscadorProductosUrgentes.get(i).getUbicacion()) / 100;

                    int CodigoPostalProximo = codigoPostal / 1000;
                    int CodigoPostalUusarioProximo = (buscadorProductosUrgentes.get(i).getUbicacion()) / 1000;

                    if (CodigoPostalMuyProximo == CodigoPostalUusarioMuyProximo) {
                        buscadorProductosUrgentesOrdenadosM.add(buscadorProductosUrgentes.get(i));
                    } else if (CodigoPostalProximo == CodigoPostalUusarioProximo) {
                        buscadorProductosUrgentesOrdenadosP.add(buscadorProductosUrgentes.get(i));
                    } else {
                        buscadorProductosUrgentesOrdenadosN.add(buscadorProductosUrgentes.get(i));
                    }
                }
                for (int i = 0; i < buscadorProductosNoUrgentes.size(); i++) {
                    int CodigoPostalMuyProximo = codigoPostal / 100;
                    int CodigoPostalUusarioMuyProximo = (buscadorProductosNoUrgentes.get(i).getUbicacion()) / 100;

                    int CodigoPostalProximo = codigoPostal / 1000;
                    int CodigoPostalUusarioProximo = (buscadorProductosNoUrgentes.get(i).getUbicacion()) / 1000;

                    if (CodigoPostalMuyProximo == CodigoPostalUusarioMuyProximo) {
                        buscadorProductosNoUrgentesOrdenadosM.add(buscadorProductosNoUrgentes.get(i));
                    } else if (CodigoPostalProximo == CodigoPostalUusarioProximo) {
                        buscadorProductosNoUrgentesOrdenadosP.add(buscadorProductosNoUrgentes.get(i));
                    } else {
                        buscadorProductosNoUrgentesOrdenadosN.add(buscadorProductosNoUrgentes.get(i));
                    }
                }
                buscadorProductosTotal.clear();
                buscadorProductosTotal.addAll(buscadorProductosUrgentesOrdenadosM);
                buscadorProductosTotal.addAll(buscadorProductosUrgentesOrdenadosP);
                buscadorProductosTotal.addAll(buscadorProductosUrgentesOrdenadosN);
                buscadorProductosTotal.addAll(buscadorProductosNoUrgentesOrdenadosM);
                buscadorProductosTotal.addAll(buscadorProductosNoUrgentesOrdenadosP);
                buscadorProductosTotal.addAll(buscadorProductosNoUrgentesOrdenadosN);
                
                encontrado = true;
            }
        }
        return encontrado;
    } 

    /**
     * Metodo para devolver un titulo
     *
     * @return regresa el titulo de la aplicacion
     */
    public static String getTituloAplicacion() {

        return "Aplicacion de javapop";

    }

    /**
     * Metodo para devolver un titulo
     *
     * @return regresa el titulo de ingreso y registro
     */
    public static String getTituloValidacion() {

        return "Sistema de Ingreso y Registro";

    }

    /**
     * Metodo para devolver un titulo
     *
     * @return regresa javapop
     */
    public static String getTitulo() {

        return "javapop";

    }

    /**
     * Metodo que devuelve una fecha
     *
     * @return regresa la fecha actual
     */
    public static String getFechaActual() {

        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter fechaCorta = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return fechaActual.format(fechaCorta);
    }

}
