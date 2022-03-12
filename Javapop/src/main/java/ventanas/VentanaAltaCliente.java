/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import excepciones.CampoVacio;
import java.awt.image.BufferedImage;
import java.io.File;
import javapop.Cliente;
import javapop.Utilidades;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author mark_
 */
public class VentanaAltaCliente extends javax.swing.JFrame {

    /**
     * Constructor sin parametro.
     */
    public VentanaAltaCliente() {
        initComponents();
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("..\\Javapop\\src\\main\\java\\imagenes\\logotipo.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La imagen no se ha podido cargar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        setIconImage(image);
        Titulo.setText(Utilidades.getTituloValidacion());
        Fecha.setText(Utilidades.getFechaActual());
        setTitle(Utilidades.getTitulo());
        this.setVisible(true);
        Utilidades.cargarDatosCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDni = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelClave = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelTarjetaBancaria = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Dni = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        CodigoPostal = new javax.swing.JTextField();
        Ciudad = new javax.swing.JTextField();
        TarjetaBancaria = new javax.swing.JTextField();
        jLabelSaldo = new javax.swing.JLabel();
        Saldo = new javax.swing.JTextField();
        Clave = new javax.swing.JPasswordField();
        Atras = new javax.swing.JButton();
        Fecha = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlTitulo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        JlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlTitulo.setText("Alta de Cliente");

        jLabelDni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDni.setText("Dni:");

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCorreo.setText("Correo:");

        jLabelClave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelClave.setText("Clave:");

        jLabelCodigoPostal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCodigoPostal.setText("Codigo Postal:");

        jLabelCiudad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCiudad.setText("Ciudad:");

        jLabelTarjetaBancaria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTarjetaBancaria.setText("Tarjeta Bancaria:");

        Nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Dni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Correo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CodigoPostal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Ciudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TarjetaBancaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelSaldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSaldo.setText("Saldo:");

        Saldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Clave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTarjetaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TarjetaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTarjetaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TarjetaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Atras.setBackground(new java.awt.Color(255, 51, 51));
        Atras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Fecha.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("FechaActual");

        Titulo.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo.setText("Javapop");
        Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Enviar.setBackground(new java.awt.Color(0, 102, 102));
        Enviar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Enviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(Atras)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(Enviar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Volvemos a la venta de validacion del cliente.
     *
     * @param evt
     */
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        VentanaValidacionCliente v1 = new VentanaValidacionCliente();
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed
    /**
     * Metodo que comprueba que no esten vacio los campos a rellenar y si que no
     * este registrado el cliente. Despues recorremos los clientes y
     * introducimos el cliente en el sistema con el parametro que hemos
     * instanciado anteriormente. Finalmente nos vamos a la venta de validacion
     * del cliente y guardamos los datos.
     *
     * @param evt
     */
    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // TODO add your handling code here:
        try {

            if (Nombre.getText().isEmpty() || Dni.getText().isEmpty() || Correo.getText().isEmpty() || Clave.getText().isEmpty() || CodigoPostal.getText().isEmpty()
                    || Ciudad.getText().isEmpty() || Dni.getText().isEmpty()) {
                throw new CampoVacio();
            } else {
                for (int i = 0; i < Utilidades.getClientes().size(); i++) {
                    if (Utilidades.getClientes().get(i).getDni().equals(Dni.getText()) || Utilidades.getClientes().get(i).getCorreo().equals(Correo.getText())){
                        JOptionPane.showMessageDialog(this, "El cliente ya esta registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }  for (Cliente c : Utilidades.getClientes()) {
                    if (!c.equals(Dni.getText()) || !c.equals(Correo.getText())) {
                        Long tarjeta = Long.parseLong(TarjetaBancaria.getText());
                        int codigo = Integer.parseInt(CodigoPostal.getText());
                        int saldo_int = Integer.parseInt(Saldo.getText());
                        Cliente objcli = new Cliente(Correo.getText(), Clave.getText(), Dni.getText(), Nombre.getText(), codigo, Ciudad.getText(), tarjeta, saldo_int);
                        Utilidades.altaCliente(objcli);
                        Utilidades.guardarDatosCliente();
                        JOptionPane.showMessageDialog(this, "Se ha guardado correctamente.", "Correcto!", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        this.dispose();
                        VentanaValidacionCliente v = new VentanaValidacionCliente();
                        v.setVisible(true);
                        break;
                    }
                }
            }
        } catch (CampoVacio e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El formato de los campos no es el correcto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAltaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAltaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton Atras;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JPasswordField Clave;
    private javax.swing.JTextField CodigoPostal;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Dni;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel JlTitulo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Saldo;
    private javax.swing.JTextField TarjetaBancaria;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelTarjetaBancaria;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
