/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rover.rubrica.views;

import com.rover.rubrica.data.DataManager;
import com.rover.rubrica.models.Persona;
import com.rover.rubrica.models.Rubrica;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simone
 */
public class Home extends javax.swing.JFrame {

    DataManager dataManager;
    Rubrica rubrica;
    
    public Home(DataManager dm) {
        initComponents();
        this.dataManager = dm;
        this.rubrica = dm.getAllData();
        aggiornaLista();
    }
    
    public boolean aggiungiContatto(Persona p) {
        boolean check = this.rubrica.aggiungiContatto(p);
        aggiornaLista();
        return check;
    }
    
    public boolean rimuoviContatto(Persona p) {
        boolean check = this.rubrica.rimuoviContatto(p);
        aggiornaLista();
        return check;
    }
    
    public boolean hasTelefono(String telefono) {
        return this.rubrica.hasTelefono(telefono);
    }
    
    private void aggiornaLista() {
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0); // clear table

        if (this.rubrica == null) {
            return;
        }
        
        Iterator<Persona> iterator = this.rubrica.getRubrica();
        Persona p;
        while (iterator.hasNext()) {
            p = iterator.next();
            model.addRow(new Object[]{p.getNome(), p.getCognome(), p.getTelefono()});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cognome", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");

        jMenuItem1.setText("Salva");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Aggiorna");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Esci");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Aggiungi contatto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Modifica contatto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Elimina contatto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // SALVA
        if (this.rubrica == null){
            JOptionPane.showMessageDialog(this, "Non ci sono dati da salvare");
            return;
        }
        boolean check = this.dataManager.saveAll(this.rubrica);
        
        if (!check) {
            JOptionPane.showMessageDialog(this, "Qualcosa è andato storto");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Salvataggio eseguito");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // ELIMINA CONTATTO
        DefaultTableModel table = (DefaultTableModel) this.jTable1.getModel();
        int selectedRow = this.jTable1.getSelectedRow();
        
        if (selectedRow == -1) {
            // no row selected, show pop-up
            JOptionPane.showMessageDialog(this, "Non è stato selezionato un contatto da eliminare");
            return;
        }
        
        String telefono = this.jTable1.getValueAt(selectedRow, 2).toString();
        Persona p = this.rubrica.getPersona(telefono);
        
        // confirm pop-up
        int esito = JOptionPane.showConfirmDialog(this, "Eliminare il contatto " + p.getNome() + " " + p.getCognome());
        if (esito == JOptionPane.NO_OPTION || esito == JOptionPane.CANCEL_OPTION || esito == JOptionPane.CLOSED_OPTION) {
            return;
        }
        
        this.rubrica.rimuoviContatto(p);    // logical remove
        this.dataManager.deletePersona(p);  // physical remove
        
        table.removeRow(selectedRow);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // MODIFICA CONTATTO
        DefaultTableModel table = (DefaultTableModel) this.jTable1.getModel();
        int selectedRow = this.jTable1.getSelectedRow();
        
        if (selectedRow == -1) {
            // no row selected, show pop-up
            JOptionPane.showMessageDialog(this, "Non è stato selezionato un contatto da modificare");
            return;
        }
        
        // get Persona data
        String telefono = this.jTable1.getValueAt(selectedRow, 2).toString();
        Persona p = this.rubrica.getPersona(telefono);
        
        // mostra editor con campi compilati
        Editor e = new Editor(this, this.dataManager, p);
        e.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // AGGIUNGI CONTATTO
        Editor e = new Editor(this, this.dataManager);
        e.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // AGGIORNA
        
        // leggi dal dataManager
        this.rubrica = this.dataManager.getAllData();
        
        aggiornaLista();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // ESCI
        Login l = new Login(this.dataManager);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
