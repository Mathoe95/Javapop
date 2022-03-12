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
public class VentanaClienteProfesionalMisProductos extends javax.swing.JFrame {

    private ArrayList<Producto> proaux;
    private ListIterator<Producto> li;
    private Producto objpro;

    private ClienteProfesional objclip;

    /**
     * Creates new form VentanaClienteProfesional
     */
    public VentanaClienteProfesionalMisProductos() {
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
     * Constructor con el parametro cliente profesinal.
     *
     * @param cli cliente profesional que hemos introducido o cargado
     * anteriormente , mediante el boton que ha llamado a esta ventana.
     */
    public VentanaClienteProfesionalMisProductos(ClienteProfesional cli) {
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
        objclip = cli;
        consultarTodo();

    }

    /**
     * Metodo que consulta los datos que tenemos de todos los productos y los
     * guarda en un ListIterator, para que despues compruebe si esta vacio y si
     * no , entonces que los muestre.
     */
    private void consultarTodo() {
        try {
            proaux = objclip.getMisproducto();
            li = proaux.listIterator();

            if (proaux.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay productos", "Error", JOptionPane.INFORMATION_MESSAGE);
                siguiente.setEnabled(false);
                anterior.setEnabled(false);
                baja.setEnabled(false);
                urgente.setEnabled(false);
            } else {
                siguiente.setEnabled(true);
                anterior.setEnabled(true);

            }
            if (li.hasNext()) {
                objpro = (Producto) li.next();
            }
            if (objpro != null) {
                presenta(objpro);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error:" + e.toString());
        }
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
        PanelProductos.urgente.setSelected(pro.isUrgente());
        PanelProductos.vendedor.setText(pro.getVendedor());
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
        urgente = new javax.swing.JButton();
        jLabelNombre1 = new javax.swing.JLabel();
        baja = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        buscar = new javax.swing.JMenu();
        verproducto = new javax.swing.JMenuItem();
        alta_barra = new javax.swing.JMenuItem();
        busqueda = new javax.swing.JMenuItem();
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

        urgente.setBackground(new java.awt.Color(0, 102, 153));
        urgente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        urgente.setText("Urgente");
        urgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urgenteActionPerformed(evt);
            }
        });

        jLabelNombre1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombre1.setText("MIS PRODUCTOS");

        baja.setBackground(new java.awt.Color(0, 102, 153));
        baja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        baja.setText("Baja");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        buscar.setText("Producto");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        verproducto.setText("Ver Productos");
        verproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verproductoActionPerformed(evt);
            }
        });
        buscar.add(verproducto);

        alta_barra.setText("Alta");
        alta_barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_barraActionPerformed(evt);
            }
        });
        buscar.add(alta_barra);

        busqueda.setText("Busqueda");
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        buscar.add(busqueda);

        jMenuBar1.add(buscar);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNombre1)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(urgente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siguiente)
                                .addGap(50, 50, 50)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(siguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urgente)
                    .addComponent(Cerrar)
                    .addComponent(baja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * nos envia a la venta de los productos en venta.
     *
     * @param evt
     */
    private void verproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verproductoActionPerformed
        // TODO add your handling code here:
        VentanaClienteProfesional v = new VentanaClienteProfesional(objclip);
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_verproductoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed
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
     * Metodo que comprueba si el producto es urgente,si no lo es entonces lo
     * marca como urgente y llama al metodo de productoUrgente para que le cobre
     * al cliente profesional y lo ponga urgente.
     *
     * @param evt
     */
    private void urgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urgenteActionPerformed
        // TODO add your handling code here:
        if (PanelProductos.urgente.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ya esta urgente!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            objpro.productoUrgente(objclip);
            JOptionPane.showMessageDialog(this, "Se ha puesto correctamente como urgente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Se le ha cargado 5€ a la tarjeta:" + objclip.getTarjetaCredito(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Le queda en la cuenta:" + objclip.getSaldo() + "€", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            if (li.hasNext()) {
                objpro = li.next();
                if (objpro != null) {
                    presenta(objpro);
                }
            }
            if (li.hasPrevious()) {
                objpro = li.previous();
                if (objpro != null) {
                    presenta(objpro);
                }
            }
        }
    }//GEN-LAST:event_urgenteActionPerformed
    /**
     * Nos envia a dar de alta a los productos del cliente profesional.
     *
     * @param evt
     */
    private void alta_barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_barraActionPerformed
        // TODO add your handling code here:
        VentanaAltaProductoClienteProfesional v1 = new VentanaAltaProductoClienteProfesional(objclip);
        this.dispose();
        v1.setVisible(true);
    }//GEN-LAST:event_alta_barraActionPerformed
    /**
     * Ventana para buscar ciertos productos.
     *
     * @param evt
     */
    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
        VentanaClienteProfesionalBusqueda v = new VentanaClienteProfesionalBusqueda(objclip);
        this.dispose();
        v.setVisible(true);

    }//GEN-LAST:event_busquedaActionPerformed
    /**
     * Metodo para dar de baja a un producto que tiene el cliente profesional,
     * llamando al metodo del cliente para dar de baja y el parametro del
     * producto a dar de baja.
     *
     * @param evt
     */
    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        // TODO add your handling code here:
        if (objpro != null) {
            li.remove();
            objclip.bajaProductoCliente(objpro);
            JOptionPane.showMessageDialog(this, "Se ha dado de baja correctamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado el producto!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        if (li.hasNext()) {
            objpro = (Producto) li.next();
            if (objpro != null) {
                presenta(objpro);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (li.hasPrevious()) {
            objpro = (Producto) li.previous();
            if (objpro != null) {
                presenta(objpro);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bajaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalMisProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalMisProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalMisProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClienteProfesionalMisProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaClienteProfesionalMisProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Busqueda1;
    javax.swing.JButton Cerrar;
    private javax.swing.JMenuItem EditarDatosAdicionales;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Titulo;
    private javax.swing.JMenuItem alta_barra;
    javax.swing.JButton anterior;
    javax.swing.JButton baja;
    private javax.swing.JMenu buscar;
    private javax.swing.JMenuItem busqueda;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JMenuBar jMenuBar1;
    private ventanas.PanelProductos panelProductos;
    javax.swing.JButton siguiente;
    javax.swing.JButton urgente;
    private javax.swing.JMenuItem verproducto;
    // End of variables declaration//GEN-END:variables
}
