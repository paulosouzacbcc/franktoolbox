/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Util.FileSystemModel;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.io.File;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

/**
 *
 * @author maverick
 */
public final class ViewPrincipal extends javax.swing.JFrame
{

    public static final ViewImportarArquivo viewImportarArquivo = new ViewImportarArquivo();
    public static final ViewHome viewHome = new ViewHome();
    public static final ViewFiltrar viewFiltrar = new ViewFiltrar();
    public static final ViewMontador viewMontador = new ViewMontador();
    ViewWorkspace viewWorkspace = new ViewWorkspace(null, true);

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        initComponents();
        iniciarTelas();
        trocaTelas(viewHome);

    }

    public void setInvisibleBarraHorizontal() {

        jButtonBinning.setVisible(false);
        jButtonFiltrar.setVisible(false);
        jButtonMontar.setVisible(false);
        jButtonVisualizar.setVisible(false);
        showLogoLabiocadHome();

    }

    public void showLogoLabiocadHome() {
        jLabelLogoLabiocad.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jPanelBarraHorizontal = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonMontar = new javax.swing.JButton();
        jButtonBinning = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jLabelLogoLabiocad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPanePrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home45x45.png"))); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filter-icon45x45.png"))); // NOI18N
        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButtonMontar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/genetics45x45.png"))); // NOI18N
        jButtonMontar.setText("Montar");
        jButtonMontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMontarActionPerformed(evt);
            }
        });

        jButtonBinning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DNA45x45.png"))); // NOI18N
        jButtonBinning.setText("Binning");

        jButtonVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DNA_analysis45x45.png"))); // NOI18N
        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jLabelLogoLabiocad.setVisible(false);
        jLabelLogoLabiocad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoLabiocad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/labiocad250x37.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBarraHorizontalLayout = new javax.swing.GroupLayout(jPanelBarraHorizontal);
        jPanelBarraHorizontal.setLayout(jPanelBarraHorizontalLayout);
        jPanelBarraHorizontalLayout.setHorizontalGroup(
            jPanelBarraHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraHorizontalLayout.createSequentialGroup()
                .addComponent(jButtonHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabelLogoLabiocad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMontar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBinning)
                .addContainerGap())
        );
        jPanelBarraHorizontalLayout.setVerticalGroup(
            jPanelBarraHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarraHorizontalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHome)
                .addGap(20, 20, 20))
            .addGroup(jPanelBarraHorizontalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBarraHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBinning)
                    .addComponent(jButtonMontar)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jButtonVisualizar)
                    .addGroup(jPanelBarraHorizontalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelLogoLabiocad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTree2.setModel(new FileSystemModel(new File("/home/maverick/Documentos")));
        jTree2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree2);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Importar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configurações");

        jMenuItem2.setText("Workspace");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPanePrincipal))
            .addComponent(jPanelBarraHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelBarraHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPanePrincipal)
                    .addComponent(jScrollPane2)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        trocaTelas(viewHome);
        setInvisibleBarraHorizontal();

    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        trocaTelas(viewFiltrar);
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonMontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMontarActionPerformed
        trocaTelas(viewMontador);
    }//GEN-LAST:event_jButtonMontarActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        JOptionPane.showMessageDialog(null, "teste");
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        viewWorkspace.setVisible(true);
        createRoot(viewWorkspace.getPath());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTree2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree2MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {

            jTree2.addMouseListener(new MouseAdapter()
            {
                public void mousePressed(MouseEvent e) {
                    if (SwingUtilities.isRightMouseButton(e)) {
                        TreePath path = jTree2.getPathForLocation(e.getX(), e.getY());
                        Rectangle pathBounds = jTree2.getUI().getPathBounds(jTree2, path);
                        if (pathBounds != null && pathBounds.contains(e.getX(), e.getY())) {
                            JPopupMenu menu = new JPopupMenu();
                            menu.add(new JMenuItem("Criar Pasta"));
                            menu.add(new JMenuItem("Remover Pasta"));
                            menu.show(jTree2, pathBounds.x, pathBounds.y + pathBounds.height);

                        }
                    }
                }
            });
            System.out.println(jTree2.getClosestRowForLocation(evt.getX(), evt.getY()));
            jTree2.setSelectionRow(jTree2.getClosestRowForLocation(evt.getX(), evt.getY()));

            TreePath s = jTree2.getSelectionPath();
        }

    }//GEN-LAST:event_jTree2MouseClicked

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    public void createRoot(String path) {
        jTree2.setModel(new FileSystemModel(new File(path)));
        jScrollPane2.setViewportView(jTree2);
    }

    public static void trocaTelas(JInternalFrame tela) {

        viewImportarArquivo.setVisible(false);
        viewHome.setVisible(false);
        viewFiltrar.setVisible(false);
        viewMontador.setVisible(false);

        if (tela != null) {
            tela.setVisible(true);
            try {
                tela.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.err.println(" Exception maximizar internal\n " + ex);
            }
        }
    }

    public void iniciarTelas() {

        jDesktopPanePrincipal.add(viewImportarArquivo);
        jDesktopPanePrincipal.add(viewHome);
        jDesktopPanePrincipal.add(viewFiltrar);
        jDesktopPanePrincipal.add(viewMontador);

        try {

            viewImportarArquivo.setMaximum(true);
            viewHome.setMaximum(true);
            viewFiltrar.setMaximum(true);
            viewMontador.setMaximum(true);

        } catch (PropertyVetoException e) {
            System.err.println(" Exception maximizar internal\n " + e);
        }
    }

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBinning;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonMontar;
    private javax.swing.JButton jButtonVisualizar;
    public static javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JLabel jLabelLogoLabiocad;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelBarraHorizontal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree2;
    // End of variables declaration//GEN-END:variables
}
