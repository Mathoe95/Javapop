/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.ListIterator;
import javapop.Ventas;
import javapop.Utilidades;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mark_
 */
public class VentanaAdministradorVentas extends javax.swing.JFrame {

    private ArrayList<Ventas> provent;
    private ArrayList<Ventas> proventaux;
    private ListIterator<Ventas> liv;
    private Ventas objvent;

    /**
     * Constructor sin parametro.
     */
    public VentanaAdministradorVentas() {
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
        consultarTodo();

    }

    /**
     * Metodo que guarda todas la ventas en un ListIterator, para que despues
     * compruebe si ha habido ventas y si las hay, que las muestre por pantalla.
     */
    private void consultarTodo() {
        try {
            provent = Utilidades.getVentas();

            liv = provent.listIterator();

            if (provent.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Error", JOptionPane.ERROR_MESSAGE);
                siguiente.setEnabled(false);
                anterior.setEnabled(false);
                buscar.setEnabled(false);
            } else {
                siguiente.setEnabled(true);
                anterior.setEnabled(true);
                buscar.setEnabled(true);

            }
            if (liv.hasNext()) {
                objvent = (Ventas) liv.next();
            }
            if (objvent != null) {
                presenta(objvent);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro:" + e.toString());
        }
    }

    private void consultarPorFecha() {
        try {

            liv = proventaux.listIterator();

            if (provent.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Error", JOptionPane.ERROR_MESSAGE);
                siguiente.setEnabled(false);
                anterior.setEnabled(false);
                buscar.setEnabled(false);
            } else {
                siguiente.setEnabled(true);
                anterior.setEnabled(true);
                buscar.setEnabled(true);

            }
            if (liv.hasNext()) {
                objvent = (Ventas) liv.next();
            }
            if (objvent != null) {
                presenta(objvent);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro:" + e.toString());
        }
    }

    /**
     * Metodo que muestra por pantalla los datos de la venta que se ha realizado
     * en la aplicacion.
     *
     * @param vent
     */
    private void presenta(Ventas vent) {
        fecha.setText(String.valueOf(vent.getFecha()));
        nombreC.setText(vent.getClienteC().getNombre());
        dniC.setText(vent.getClienteC().getDni());
        nombreV.setText(vent.getClienteV().getNombre());
        dniV.setText(vent.getClienteV().getDni());

        PanelProductos.titulo.setText(vent.getProductoV().getTitulo());
        PanelProductos.descripcion.setText(vent.getProductoV().getDescripcion());
        PanelProductos.categoria.setText(vent.getProductoV().getCategoria());
        PanelProductos.estado.setText(vent.getProductoV().getEstadoProducto());
        PanelProductos.precio.setText(String.valueOf(vent.getProductoV().getPrecioProducto()));
        PanelProductos.codigo_postal.setText(String.valueOf(vent.getProductoV().getUbicacion()));
        ImageIcon imagen1 = new ImageIcon("..\\Javapop\\src\\main\\java\\imagenes\\" + vent.getProductoV().getImagen());
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(PanelProductos.imagen.getWidth(), PanelProductos.imagen.getHeight(), Image.SCALE_DEFAULT));
        PanelProductos.imagen.setIcon(icono);
        PanelProductos.urgente.setSelected(vent.getProductoV().isUrgente());
        PanelProductos.vendedor.setText(vent.getClienteV().getDni());

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
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        panelProductos1 = new ventanas.PanelProductos();
        jPanel3 = new javax.swing.JPanel();
        fechaJ = new javax.swing.JLabel();
        nombreCJ = new javax.swing.JLabel();
        dniCJ = new javax.swing.JLabel();
        nombreVJ = new javax.swing.JLabel();
        dniVJ = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        nombreC = new javax.swing.JTextField();
        dniC = new javax.swing.JTextField();
        nombreV = new javax.swing.JTextField();
        dniV = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        fechaBusquedaJ = new javax.swing.JLabel();
        fechaCalendario = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Productos = new javax.swing.JMenu();
        ListadoP = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenu();
        ListadoU = new javax.swing.JMenuItem();

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

        fechaJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fechaJ.setText("Fecha:");

        nombreCJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nombreCJ.setText("Nombre del comprador:");

        dniCJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dniCJ.setText("Dni del comprador");

        nombreVJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nombreVJ.setText("Nombre del vendedor");

        dniVJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dniVJ.setText("Dni del vendedor:");

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        nombreC.setEditable(false);
        nombreC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        dniC.setEditable(false);
        dniC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        nombreV.setEditable(false);
        nombreV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        dniV.setEditable(false);
        dniV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        buscar.setBackground(new java.awt.Color(0, 102, 153));
        buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        fechaBusquedaJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fechaBusquedaJ.setText("Introduce una fecha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombreCJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(dniCJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreVJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dniVJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaBusquedaJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dniC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dniV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreVJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniVJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaBusquedaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos de la venta");

        Productos.setText("Productos");

        ListadoP.setText("Listado");
        ListadoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoPActionPerformed(evt);
            }
        });
        Productos.add(ListadoP);

        jMenuBar1.add(Productos);

        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        ListadoU.setText("Listado");
        ListadoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoUActionPerformed(evt);
            }
        });
        Usuarios.add(ListadoU);

        jMenuBar1.add(Usuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panelProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProductos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(siguiente))
                .addGap(23, 23, 23)
                .addComponent(Cerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Nos lleva a la ventana del administrador donde estan todos los usuarios.
     *
     * @param evt
     */
    private void ListadoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoUActionPerformed
        // TODO add your handling code here:
        VentanaAdministrador v = new VentanaAdministrador();
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_ListadoUActionPerformed
    /**
     * Cierra la aplicacion y guarda todos los datos.
     *
     * @param evt
     */
    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        Utilidades.guardarDatosCliente();
        Utilidades.guardarDatosClienteProfesional();
        Utilidades.guardarDatosProducto();
        Utilidades.guardarDatosVentas();
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosActionPerformed
    /**
     * Recorre hacia atras el LisIterator de las ventas y los va mostrando.
     *
     * @param evt
     */
    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        if (liv.hasPrevious()) {
            objvent = liv.previous();
            if (objvent != null) {
                presenta(objvent);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_anteriorActionPerformed
    /**
     * Recorre hacia adelante el LisIterator de las ventas y los va mostrando.
     *
     * @param evt
     */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        if (liv.hasNext()) {
            objvent = liv.next();
            if (objvent != null) {
                presenta(objvent);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_siguienteActionPerformed
    /**
     * Metodo que busca las ventas por una determinada fecha,primero comprueba
     * que no este vacio el campo a introducir,despues si no esta vacio, creamos
     * un arraylist para almanecar las fechas que han coincidido con la fecha
     * que hemos buscado de las ventas ya realizadas.Finalmente las muestra por
     * pantalla.
     *
     * @param evt
     */
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        if (fechaCalendario.getDatoFecha() == null) {
            JOptionPane.showMessageDialog(this, "Introduce una fecha!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<Ventas> ventasPorFecha = new ArrayList<>();
            LocalDate fechaTotal = fechaCalendario.getDatoFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            for (int i = 0; i < provent.size(); i++) {
                if (provent.get(i).getFecha().equals(fechaTotal)) {
                    ventasPorFecha.add(provent.get(i));
                }
            }

            if (ventasPorFecha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay ventas con esa fecha", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                proventaux = ventasPorFecha;
                consultarPorFecha();
            }

        }
    }//GEN-LAST:event_buscarActionPerformed
    /**
     * Nos lleva a la ventana de los productos de la aplicacion.
     *
     * @param evt
     */
    private void ListadoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoPActionPerformed
        // TODO add your handling code here:
        VentanaAdministradorProductos v = new VentanaAdministradorProductos();
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_ListadoPActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministradorVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministradorVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministradorVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministradorVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministradorVentas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton Cerrar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JMenuItem ListadoP;
    private javax.swing.JMenuItem ListadoU;
    private javax.swing.JMenu Productos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JMenu Usuarios;
    javax.swing.JButton anterior;
    javax.swing.JButton buscar;
    private javax.swing.JTextField dniC;
    private javax.swing.JLabel dniCJ;
    private javax.swing.JTextField dniV;
    private javax.swing.JLabel dniVJ;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel fechaBusquedaJ;
    private rojeru_san.componentes.RSDateChooser fechaCalendario;
    private javax.swing.JLabel fechaJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombreC;
    private javax.swing.JLabel nombreCJ;
    private javax.swing.JTextField nombreV;
    private javax.swing.JLabel nombreVJ;
    private ventanas.PanelProductos panelProductos1;
    javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables

}
