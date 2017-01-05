/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.Alert;
import util.Internal;
import static view.ViewNewbler.jTableInputNewbler;

/**
 *
 * @author paulosouza
 */
public class ViewSpades extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewSpades
     */
    
    FileNameExtensionFilter filter = new FileNameExtensionFilter("FASTA files", "fastq", "fasta", "sff");
    
    ArrayList<String> arrayListPathFile = new ArrayList<>();
    ArrayList<String> arrayListPathFileName = new ArrayList<>();
    ArrayList<String> arrayListTypeLibrary = new ArrayList<>();
    
    int resultado;


    public ViewSpades() {
        initComponents();
        Internal.retiraBotao(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxBiblioteca = new javax.swing.JComboBox<>();
        jComboBoxTecnologia = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPaneInput = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInputSPAdes = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPaneBasic = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPaneAdvanced = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldKmer = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBoxCoverage = new javax.swing.JComboBox<>();
        jTextFieldCoverage = new javax.swing.JTextField();
        jScrollPanePipeline = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jComboBoxRestartFrom = new javax.swing.JComboBox<>();
        jTextFieldRestartFrom = new javax.swing.JTextField();
        jButtonProcessar = new javax.swing.JButton();

        jComboBoxBiblioteca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single-read", "Paired-end", "Mate-pair", "High-quality mate-pair", "Lucigen NxSeq® Long Mate Pair" }));

        jComboBoxTecnologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ion Torrent", "PacBio", "454", "Iillumina" }));

        jTableInputSPAdes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Arquivo", "Tipo de Biblioteca", "Tecnologia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableInputSPAdes);
        if (jTableInputSPAdes.getColumnModel().getColumnCount() > 0) {
            jTableInputSPAdes.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor (jComboBoxBiblioteca));
            jTableInputSPAdes.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(jComboBoxTecnologia)
            );
        }

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos15x15.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus15.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(0, 162, Short.MAX_VALUE))
        );

        jScrollPaneInput.setViewportView(jPanel4);

        jTabbedPane2.addTab("Input", jScrollPaneInput);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SPAdes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Output directory: ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pasta15x15.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        jScrollPaneBasic.setViewportView(jPanel1);

        jTabbedPane2.addTab("Basic Options", jScrollPaneBasic);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SPAdes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Threads:");

        jLabel3.setText("Memory:");

        jLabel4.setText("Directory for temporary files:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pasta15x15.png"))); // NOI18N

        jLabel5.setText("PHRED quality offset:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "auto-detected", "33", "64" }));

        jLabel6.setText("Coverage cutoff value:");

        jLabel7.setText("K-mer");

        jTextFieldKmer.setEditable(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus15.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBoxCoverage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "off", "auto", "number" }));
        jComboBoxCoverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCoverageActionPerformed(evt);
            }
        });

        jTextFieldCoverage.setVisible(false);
        jTextFieldCoverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoverageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextFieldKmer)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxCoverage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldKmer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jScrollPaneAdvanced.setViewportView(jPanel2);

        jTabbedPane2.addTab("Advanced Options", jScrollPaneAdvanced);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SPAdes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheckBox1.setText("--only-error-correction");

        jCheckBox2.setText("--only-assembler");

        jCheckBox3.setText("--careful");

        jCheckBox4.setText("--continue");

        jCheckBox5.setText("--disable-gzip-output");

        jCheckBox6.setText("--disable-rr");

        jCheckBox7.setText("--restart-from");

        jComboBoxRestartFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ec", "as", "k-mer", "mc" }));
        jComboBoxRestartFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRestartFromActionPerformed(evt);
            }
        });

        jTextFieldRestartFrom.setVisible(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRestartFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRestartFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(542, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jComboBoxRestartFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRestartFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jScrollPanePipeline.setViewportView(jPanel3);

        jTabbedPane2.addTab("Pipeline Options", jScrollPanePipeline);

        jButtonProcessar.setText("Processar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonProcessar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProcessar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ViewInputNumberKMer viewInputNumberKMer = new ViewInputNumberKMer(null, true);
        viewInputNumberKMer.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        JFileChooser chooserDiretorio = new JFileChooser(ViewPrincipal.ROOTWOKSPACE);
        chooserDiretorio.setDialogTitle("Escolha o arquivo que deseja importar.");
        chooserDiretorio.setFileFilter(filter);
        resultado = chooserDiretorio.showOpenDialog(getParent());
        
        if (resultado == JFileChooser.APPROVE_OPTION) {

            File selectedFile = chooserDiretorio.getSelectedFile();
            arrayListPathFile.add(selectedFile.toString());
            arrayListPathFileName.add(selectedFile.getName());
            
            ((DefaultTableModel) jTableInputSPAdes.getModel()).addRow(new Object[]{});
            jTableInputSPAdes.setValueAt(selectedFile.getName(), arrayListPathFile.size() - 1, 0);
            jTableInputSPAdes.setValueAt("Single-read", arrayListPathFile.size() - 1, 1);
            jTableInputSPAdes.setValueAt("Ion Torrent", arrayListPathFile.size() - 1, 2);
            
            
            
        } else if (resultado == JFileChooser.CANCEL_OPTION)
            System.out.println("Cancelado.");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
            if (jTableInputSPAdes.getSelectedRow() == -1 ){
            Alert.warning("Você deve selecionar uma linha na tabela", "Excluir linha");
            return;
        }
        
       ((DefaultTableModel) jTableInputSPAdes.getModel()).removeRow(jTableInputSPAdes.getSelectedRow());
        arrayListPathFile.remove(jTableInputSPAdes.getSelectedRow() + 1);
        arrayListPathFileName.remove(jTableInputSPAdes.getSelectedRow() + 1);
        
        System.out.println(arrayListPathFileName);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldCoverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoverageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCoverageActionPerformed

    private void jComboBoxCoverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCoverageActionPerformed
        if (jComboBoxCoverage.getSelectedItem().equals("number")){
            jTextFieldCoverage.setVisible(true);
        }else {
            jTextFieldCoverage.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxCoverageActionPerformed

    private void jComboBoxRestartFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRestartFromActionPerformed
        if (jComboBoxRestartFrom.getSelectedItem().equals("k-mer")){
            jTextFieldRestartFrom.setVisible(true);
        }else {
            jTextFieldRestartFrom.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxRestartFromActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonProcessar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxBiblioteca;
    private javax.swing.JComboBox<String> jComboBoxCoverage;
    private javax.swing.JComboBox<String> jComboBoxRestartFrom;
    private javax.swing.JComboBox<String> jComboBoxTecnologia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneAdvanced;
    private javax.swing.JScrollPane jScrollPaneBasic;
    private javax.swing.JScrollPane jScrollPaneInput;
    private javax.swing.JScrollPane jScrollPanePipeline;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableInputSPAdes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldCoverage;
    public static javax.swing.JTextField jTextFieldKmer;
    private javax.swing.JTextField jTextFieldRestartFrom;
    // End of variables declaration//GEN-END:variables
}
