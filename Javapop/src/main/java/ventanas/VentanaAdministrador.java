/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.ListIterator;
import javapop.Cliente;
import javapop.ClienteProfesional;
import javapop.Utilidades;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author mark_
 */
public class VentanaAdministrador extends javax.swing.JFrame {

    private ArrayList<Cliente> procli;
    private ListIterator<Cliente> lic;

    private ArrayList<ClienteProfesional> procp;
    private ListIterator<ClienteProfesional> licp;

    private Cliente objcli;
    private ClienteProfesional objclip;

    /**
     * Constructor sin parametro.
     */
    public VentanaAdministrador() {
        initComponents();
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("..\\Javapop\\src\\main\\java\\imagenes\\logotipo.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La imagen no se ha podido cargar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        setIconImage(image);
        Titulo.setText(Utilidades.getTituloAplicacion());
        Fecha.setText(Utilidades.getFechaActual());
        setTitle(Utilidades.getTitulo());
        this.setVisible(true);
        Utilidades.cargarDatosCliente();
        Utilidades.cargarDatosClienteProfesional();
        Utilidades.cargarDatosProducto();
        Utilidades.cargarDatosVentas();
        consultarTodoCliente();

    }

    /**
     * Metodo que consulta los datos que tenemos de todos los clientes y los
     * guarda en un ListIterator, para que despues compruebe si esta vacio y si
     * no , entonces que los muestre.
     */
    private void consultarTodoCliente() {
        try {
            procli = Utilidades.getClientes();
            lic = procli.listIterator();

            if (procli.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                siguiente.setEnabled(false);
                anterior.setEnabled(false);
                baja.setEnabled(false);
                return;
            } else {
                siguiente.setEnabled(true);
                anterior.setEnabled(true);
                baja.setEnabled(true);

            }
            if (lic.hasNext()) {
                objcli = (Cliente) lic.next();
            }
            if (objcli != null) {
                presentaCliente(objcli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro:" + e.toString());
        }
    }

    /**
     * Mostramos al cliente con sus datos.
     *
     * @param cli cliente que va a mostrar sus datos.
     */
    private void presentaCliente(Cliente cli) {
        nombre.setText(cli.getNombre());
        dni.setText(cli.getDni());
        correo.setText(cli.getCorreo());
        clave.setText(cli.getClave());
        ciudad.setText(cli.getCiudad());
        saldo.setText(String.valueOf(cli.getSaldo()));
        codigoPostal.setText(String.valueOf(cli.getCodigoPostal()));
        tarjeta.setText(String.valueOf(cli.getTarjetaCredito()));

    }

    /**
     * Metodo que consulta los datos que tenemos de todos los clientes
     * profesionales y los guarda en un ListIterator, para que despues compruebe
     * si esta vacio y si no , entonces que los muestre.
     */
    private void consultarTodoClienteProfesional() {
        try {
            procp = Utilidades.getClientesProfesionales();
            licp = procp.listIterator();

            if (procp.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                siguiente.setEnabled(false);
                anterior.setEnabled(false);
                baja.setEnabled(false);
                return;
            } else {
                siguiente.setEnabled(true);
                anterior.setEnabled(true);
                baja.setEnabled(true);

            }
            if (licp.hasNext()) {
                objclip = (ClienteProfesional) licp.next();
            }
            if (objclip != null) {
                presentaClienteProfesional(objclip);
            } else {
                JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro:" + e.toString());
        }
    }

    /**
     * Mostramos al cliente profesional con sus datos.
     *
     * @param cli cliente profesional que va a mostrar sus datos.
     */
    private void presentaClienteProfesional(ClienteProfesional cli) {
        nombre.setText(cli.getNombre());
        dni.setText(cli.getDni());
        correo.setText(cli.getCorreo());
        clave.setText(cli.getClave());
        ciudad.setText(cli.getCiudad());
        saldo.setText(String.valueOf(cli.getSaldo()));
        codigoPostal.setText(String.valueOf(cli.getCodigoPostal()));
        tarjeta.setText(String.valueOf(cli.getTarjetaCredito()));
        Descripcion.setText(cli.getDescripcion());
        HorarioApertura.setText(String.valueOf(cli.getHorarioApertura()));
        Telefono.setText(String.valueOf(cli.getTelefono()));
        Web.setText(cli.getWeb());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();
        JlTitulo = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        baja = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelDni5 = new javax.swing.JLabel();
        jLabelNombre6 = new javax.swing.JLabel();
        jLabelCorreo5 = new javax.swing.JLabel();
        jLabelClave5 = new javax.swing.JLabel();
        jLabelCodigoPostal5 = new javax.swing.JLabel();
        jLabelCiudad5 = new javax.swing.JLabel();
        jLabelTarjetaBancaria5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        codigoPostal = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        tarjeta = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabelDni6 = new javax.swing.JLabel();
        jLabelNombre7 = new javax.swing.JLabel();
        jLabelCorreo6 = new javax.swing.JLabel();
        jLabelClave6 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        HorarioApertura = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Web = new javax.swing.JTextField();
        jLabelClave7 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabelSaldo5 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Productos = new javax.swing.JMenu();
        ListadoP = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenu();
        Mostrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo.setText("Javapop");
        Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Fecha.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("FechaActual");

        Cerrar.setBackground(new java.awt.Color(255, 51, 51));
        Cerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cerrar.setText("Guardar y Salir");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        JlTitulo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        JlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlTitulo.setText("Listado de usuarios");

        anterior.setBackground(new java.awt.Color(0, 255, 51));
        anterior.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        anterior.setText("Ant");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setBackground(new java.awt.Color(0, 255, 51));
        siguiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        siguiente.setText("Sig");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        baja.setBackground(new java.awt.Color(0, 102, 153));
        baja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        baja.setText("Baja");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        jLabelDni5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDni5.setText("Dni:");

        jLabelNombre6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombre6.setText("Nombre:");

        jLabelCorreo5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCorreo5.setText("Correo:");

        jLabelClave5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelClave5.setText("Clave:");

        jLabelCodigoPostal5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCodigoPostal5.setText("Codigo Postal:");

        jLabelCiudad5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCiudad5.setText("Ciudad:");

        jLabelTarjetaBancaria5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTarjetaBancaria5.setText("Tarjeta Bancaria:");

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        dni.setEditable(false);
        dni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        correo.setEditable(false);
        correo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        codigoPostal.setEditable(false);
        codigoPostal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ciudad.setEditable(false);
        ciudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tarjeta.setEditable(false);
        tarjeta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelDni6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDni6.setText("Horario de apertura:");

        jLabelNombre7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombre7.setText("Descripcion:");

        jLabelCorreo6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCorreo6.setText("Telefono:");

        jLabelClave6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelClave6.setText("Web:");

        Descripcion.setEditable(false);
        Descripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionActionPerformed(evt);
            }
        });

        HorarioApertura.setEditable(false);
        HorarioApertura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Telefono.setEditable(false);
        Telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Web.setEditable(false);
        Web.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelClave7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelClave7.setText("Tipo de usuario");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Cliente Profesional", " " }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelDni6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HorarioApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelCorreo6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelClave6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Web, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelClave7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorarioApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClave6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Web, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelClave7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabelSaldo5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSaldo5.setText("Saldo:");

        saldo.setEditable(false);
        saldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        clave.setEditable(false);
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelDni5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCorreo5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelClave5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clave))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCodigoPostal5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCiudad5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelTarjetaBancaria5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelSaldo5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDni5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreo5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClave5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigoPostal5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCiudad5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaldo5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTarjetaBancaria5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Productos.setText("Productos");

        ListadoP.setText("Listado");
        ListadoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoPActionPerformed(evt);
            }
        });
        Productos.add(ListadoP);

        jMenuBar1.add(Productos);

        Ventas.setText("Ventas");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        Ventas.add(Mostrar);

        jMenuBar1.add(Ventas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(baja)
                        .addGap(157, 157, 157)
                        .addComponent(Cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguiente)
                        .addGap(166, 166, 166)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(JlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cerrar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anterior)
                            .addComponent(siguiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(baja)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Cerrar la aplicacion y guardar los datos de los clientes.
     *
     * @param evt
     */
    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        Utilidades.guardarDatosCliente();
        Utilidades.guardarDatosClienteProfesional();
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed
    /**
     * Nos lleva a la ventana de todos los productos de la aplicacion.
     *
     * @param evt
     */
    private void ListadoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoPActionPerformed
        // TODO add your handling code here:
        VentanaAdministradorProductos v = new VentanaAdministradorProductos();
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_ListadoPActionPerformed
    /**
     * Recorrer hacia adelante el LisIterator con los clientes y mostrarlo.
     *
     * @param evt
     */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        if (tipo.getSelectedItem().equals("Cliente")) {
            if (lic.hasNext()) {
                objcli = lic.next();
                if (objcli != null) {
                    presentaCliente(objcli);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            if (licp.hasNext()) {
                objclip = licp.next();
                if (objclip != null) {
                    presentaClienteProfesional(objclip);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_siguienteActionPerformed
    /**
     * Recorrer hacia atras el LisIterator con los clientes y mostrarlo.
     *
     * @param evt
     */
    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        if (tipo.getSelectedItem().equals("Cliente")) {
            if (lic.hasPrevious()) {
                objcli = lic.previous();
                if (objcli != null) {
                    presentaCliente(objcli);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            if (licp.hasPrevious()) {
                objclip = licp.previous();
                if (objclip != null) {
                    presentaClienteProfesional(objclip);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_anteriorActionPerformed
    /**
     * Metodo en el que comprobamos si esta selecionado un cliente o un cliente
     * profesional,despues dara de baja los productos del cliente y lo
     * eliminaremos del LisIterator anterior.
     *
     * @param evt
     */
    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        // TODO add your handling code here:
        if (tipo.getSelectedItem().equals("Cliente")) {
            if (objcli != null) {
                Utilidades.bajaProductosCliente(objcli);
                lic.remove();
                JOptionPane.showMessageDialog(this, objcli.getNombre() + " " + "se ha dado de baja correctamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado la persona!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
            if (lic.hasNext()) {
                objcli = (Cliente) lic.next();
                if (objcli != null) {
                    presentaCliente(objcli);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (lic.hasPrevious()) {
                objcli = (Cliente) lic.previous();
                if (objcli != null) {
                    presentaCliente(objcli);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            if (objclip != null) {
                Utilidades.bajaProductosCliente(objclip);
                licp.remove();
                JOptionPane.showMessageDialog(this, objclip.getNombre() + " " + "se ha dado de baja correctamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                if (licp.hasNext()) {
                    objclip = (ClienteProfesional) licp.next();
                    if (objclip != null) {
                        presentaClienteProfesional(objclip);
                    } else {
                        JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                if (licp.hasPrevious()) {
                    objclip = (ClienteProfesional) licp.previous();
                    if (objclip != null) {
                        presentaClienteProfesional(objclip);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No hay personas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado la persona!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bajaActionPerformed
    /**
     * Comrueba que tipo de cliente esta seleccionado para despues mostar sus
     * datos.
     *
     * @param evt
     */
    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
        if (tipo.getSelectedItem().equals("Cliente")) {
            Descripcion.setText("");
            HorarioApertura.setText("");
            Telefono.setText("");
            Web.setText("");
            consultarTodoCliente();
        } else {
            consultarTodoClienteProfesional();
        }
    }//GEN-LAST:event_tipoActionPerformed
    /**
     * Nos envia a que nos muestren todas las ventas que se han realizado en la
     * aplicacion.
     *
     * @param evt
     */
    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        VentanaAdministradorVentas v = new VentanaAdministradorVentas();
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_MostrarActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministrador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton Cerrar;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTextField HorarioApertura;
    private javax.swing.JLabel JlTitulo;
    private javax.swing.JMenuItem ListadoP;
    private javax.swing.JMenuItem Mostrar;
    private javax.swing.JMenu Productos;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel Titulo;
    private javax.swing.JMenu Ventas;
    private javax.swing.JTextField Web;
    javax.swing.JButton anterior;
    javax.swing.JButton baja;
    private javax.swing.JTextField ciudad;
    private javax.swing.JPasswordField clave;
    private javax.swing.JTextField codigoPostal;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabelCiudad5;
    private javax.swing.JLabel jLabelClave5;
    private javax.swing.JLabel jLabelClave6;
    private javax.swing.JLabel jLabelClave7;
    private javax.swing.JLabel jLabelCodigoPostal5;
    private javax.swing.JLabel jLabelCorreo5;
    private javax.swing.JLabel jLabelCorreo6;
    private javax.swing.JLabel jLabelDni5;
    private javax.swing.JLabel jLabelDni6;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre7;
    private javax.swing.JLabel jLabelSaldo5;
    private javax.swing.JLabel jLabelTarjetaBancaria5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField saldo;
    javax.swing.JButton siguiente;
    private javax.swing.JTextField tarjeta;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables

}
