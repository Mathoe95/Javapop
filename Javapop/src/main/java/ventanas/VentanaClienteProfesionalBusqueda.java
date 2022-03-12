/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javapop.Producto;
import javapop.Utilidades;
import java.util.*;
import javax.swing.JOptionPane;
import javapop.ClienteProfesional;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author mark_
 */
public class VentanaClienteProfesionalBusqueda extends javax.swing.JFrame {

    private ArrayList<Producto> probu;
    private ListIterator<Producto> li;
    private Producto objpro;

    private ClienteProfesional objclip;

    /**
     * Creates new form VentanaClienteProfesional
     */
    public VentanaClienteProfesionalBusqueda() {
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
        PanelProductos.titulo.setEditable(true);
        PanelProductos.categoria.setEditable(true);
        PanelProductos.codigo_postal.setEditable(true);
        siguiente.setEnabled(false);
        anterior.setEnabled(false);
    }

    /**
     * Constructor con el parametro cliente profesinal.
     *
     * @param cli cliente profesional que hemos introducido o cargado
     * anteriormente , mediante el boton que ha llamado a esta ventana.
     */
    public VentanaClienteProfesionalBusqueda(ClienteProfesional cli) {
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
        PanelProductos.titulo.setEditable(true);
        PanelProductos.categoria.setEditable(true);
        PanelProductos.codigo_postal.setEditable(true);
        siguiente.setEnabled(false);
        anterior.setEnabled(false);
        objclip = cli;
    }

    /**
     * Metodo que muestra todo los productos con sus caracteristicas.
     *
     * @param pro producto que se va a mostrar.
     */
    private void presenta(Producto pro) {
        PanelProductos.titulo.setText(pro.getTitulo());
        PanelProductos.descripcion.setText(pro.getDescripcion());
        PanelProductos.categoria.setText(pro.getCategoria());
        PanelProductos.estado.setText(pro.getEstadoProducto());
        PanelProductos.precio.setText(String.valueOf(pro.getPrecioProducto()));
        PanelProductos.codigo_postal.setText(String.valueOf(pro.getUbicacion()));
        ImageIcon imagen1 = new ImageIcon("..\\Javapop\\src\\main\\java\\imagenes\\" + pro.getImagen());
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(PanelProductos.imagen.getWidth(), PanelProductos.imagen.getHeight(), Image.SCALE_DEFAULT));
        PanelProductos.imagen.setIcon(icono);
        PanelProductos.urgente.setSelected(String.valueOf(pro.isUrgente()).equals("true"));
        PanelProductos.vendedor.setText(pro.getVendedor());

    }

    /**
     * Metodo que consulta los datos que tenemos de todos los productos y los
     * guarda en un ListIterator, para que despues compruebe si esta vacio y si
     * no , entonces que los muestre.
     */
    private void consultarBusqueda() {
        try {
            probu = Utilidades.getBuscadorProductosTotal();
            li = probu.listIterator();

            if (probu.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay productos", "Error", JOptionPane.INFORMATION_MESSAGE);
                siguiente.setEnabled(false);
                anterior.setEnabled(false);
            } else {
                siguiente.setEnabled(true);
                anterior.setEnabled(true);

            }
            if (li.hasNext()) {
                objpro = (Producto) li.next();
            }
            if (objpro != null) {
                presenta(objpro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro:" + e.toString());
        }
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
        panelProductos = new ventanas.PanelProductos();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        alta = new javax.swing.JMenu();
        MisProductos = new javax.swing.JMenuItem();
        verproductos = new javax.swing.JMenuItem();
        alta_barra = new javax.swing.JMenuItem();
        Busqueda1 = new javax.swing.JMenu();
        EditarDatosAdicionales = new javax.swing.JMenuItem();

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
        Cerrar.setText("Salir");
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

        buscar.setBackground(new java.awt.Color(0, 102, 153));
        buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombre.setText("BUSQUEDA DE PRODUCTOS");

        borrar.setBackground(new java.awt.Color(0, 102, 153));
        borrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        borrar.setText("Limpiar");
        borrar.setToolTipText("");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        alta.setText("Producto");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });

        MisProductos.setText("Mis productos");
        MisProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisProductosActionPerformed(evt);
            }
        });
        alta.add(MisProductos);

        verproductos.setText("Ver productos");
        verproductos.setToolTipText("");
        verproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verproductosActionPerformed(evt);
            }
        });
        alta.add(verproductos);

        alta_barra.setText("Alta");
        alta_barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_barraActionPerformed(evt);
            }
        });
        alta.add(alta_barra);

        jMenuBar1.add(alta);

        Busqueda1.setText("Datos adicionales");
        Busqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda1ActionPerformed(evt);
            }
        });

        EditarDatosAdicionales.setText("Editar");
        EditarDatosAdicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDatosAdicionalesActionPerformed(evt);
            }
        });
        Busqueda1.add(EditarDatosAdicionales);

        jMenuBar1.add(Busqueda1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(anterior)
                                .addGap(159, 159, 159)
                                .addComponent(siguiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabelNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anterior)
                            .addComponent(siguiente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar)
                            .addComponent(borrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Nos envia a la ventada que tiene los productos en venta el cliente
     * profesional , mediante un parametro de cliente profesional.
     *
     * @param evt
     */
    private void MisProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisProductosActionPerformed
        // TODO add your handling code here:
        VentanaClienteProfesionalMisProductos v = new VentanaClienteProfesionalMisProductos(objclip);
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_MisProductosActionPerformed

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_altaActionPerformed
    /**
     * Cerramos la aplicacion y guardamos todos los datos.
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
    /**
     * Nos envia a la ventana de modificar los datos de un cliente profesional.
     *
     * @param evt
     */
    private void EditarDatosAdicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDatosAdicionalesActionPerformed
        // TODO add your handling code here:
        VentanaModificarDatosClienteProfesional m1 = new VentanaModificarDatosClienteProfesional(objclip);
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EditarDatosAdicionalesActionPerformed

    private void Busqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda1ActionPerformed
    /**
     * Recorrer hacia atras el LisIterator con los productos y mostrarlo.
     *
     * @param evt
     */
    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        if (li.hasPrevious()) {
            objpro = li.previous();
            if (objpro != null) {
                presenta(objpro);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_anteriorActionPerformed
    /**
     * Recorrer hacia adelante el LisIterator con los productos y mostrarlo.
     *
     * @param evt
     */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        if (li.hasNext()) {
            objpro = li.next();
            if (objpro != null) {
                presenta(objpro);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_siguienteActionPerformed
    /**
     * Metodo de buscar productos, comprobamos que no este vacio y si no lo esta
     * comprobamos si es true el metodo de buscar los productos y lo mostramos
     * con el metodo consultar busqueda. Si es false entonces es que no hemos
     * encontrado el producto con esas caracteristicas.
     *
     * @param evt
     */
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        try {
            if (PanelProductos.categoria.getText().isEmpty() || PanelProductos.codigo_postal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor rellena la casilla categoria y codigo postal", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int codigoT = Integer.parseInt(PanelProductos.codigo_postal.getText());
                if (Utilidades.buscarProductos(PanelProductos.titulo.getText(), PanelProductos.categoria.getText(), codigoT)) {
                    consultarBusqueda();
                } else {
                    JOptionPane.showMessageDialog(this, "No se han encontrado los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                    li.set(null);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El formato de los campos no es el correcto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed
    /**
     * Nos envia a dar de alta a los productos del cliente profesional.
     *
     * @param evt
     */
    private void alta_barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_barraActionPerformed
        // TODO add your handling code here:
        VentanaAltaProductoClienteProfesional v = new VentanaAltaProductoClienteProfesional(objclip);
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_alta_barraActionPerformed
    /**
     * nos envia a la venta de los productos en venta.
     *
     * @param evt
     */
    private void verproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verproductosActionPerformed
        // TODO add your handling code here:
        VentanaClienteProfesional v = new VentanaClienteProfesional(objclip);
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_verproductosActionPerformed
    /**
     * Limpiamos los datos de la busqueda.
     *
     * @param evt
     */
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        PanelProductos.titulo.setText("");
        PanelProductos.descripcion.setText("");
        PanelProductos.categoria.setText("");
        PanelProductos.estado.setText("");
        PanelProductos.precio.setText("");
        PanelProductos.codigo_postal.setText("");
        PanelProductos.imagen.setIcon(null);
        PanelProductos.urgente.setSelected(false);
        PanelProductos.vendedor.setText("");
        li.set(null);
    }//GEN-LAST:event_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaClienteProfesionalBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Busqueda1;
    javax.swing.JButton Cerrar;
    private javax.swing.JMenuItem EditarDatosAdicionales;
    private javax.swing.JLabel Fecha;
    private javax.swing.JMenuItem MisProductos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JMenu alta;
    private javax.swing.JMenuItem alta_barra;
    javax.swing.JButton anterior;
    javax.swing.JButton borrar;
    javax.swing.JButton buscar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JMenuBar jMenuBar1;
    private ventanas.PanelProductos panelProductos;
    javax.swing.JButton siguiente;
    private javax.swing.JMenuItem verproductos;
    // End of variables declaration//GEN-END:variables
}
