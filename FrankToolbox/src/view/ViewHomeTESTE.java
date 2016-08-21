/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Util.Internal;

/**
 *
 * @author Paulo Soza
 */
public class ViewHomeTESTE extends javax.swing.JInternalFrame
{

    /**
     * Creates new form ViewHome
     */
    public ViewHomeTESTE() {
        initComponents();
        Internal.retiraBotao(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneHome = new javax.swing.JDesktopPane();

        ViewHome viewHome = new ViewHome();
        jDesktopPaneHome.setSelectedFrame(viewHome);

        javax.swing.GroupLayout jDesktopPaneHomeLayout = new javax.swing.GroupLayout(jDesktopPaneHome);
        jDesktopPaneHome.setLayout(jDesktopPaneHomeLayout);
        jDesktopPaneHomeLayout.setHorizontalGroup(
            jDesktopPaneHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneHomeLayout.setVerticalGroup(
            jDesktopPaneHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneHome)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPaneHome;
    // End of variables declaration//GEN-END:variables
}
