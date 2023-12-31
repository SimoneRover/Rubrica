/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rover.rubrica.views;

import com.rover.rubrica.data.DataManager;
import com.rover.rubrica.models.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Simone
 */
public class Editor extends javax.swing.JFrame {

    private final Home homeWindow;
    private final Persona old;
    private final DataManager dm;
    
    public Editor(Home h, DataManager dm) {
        initComponents();
        this.old = null;
        this.homeWindow = h;
        this.dm = dm;
    }
    
    public Editor(Home h, DataManager dm, String nome, String cognome, String indirizzo, String telefono, int eta){
        initComponents();
        
        this.jTextField1.setText(nome);
        this.jTextField2.setText(cognome);
        this.jTextField3.setText(indirizzo);
        this.jTextField4.setText(telefono);
        this.jTextField5.setText(Integer.toString(eta));
        
        this.old = new Persona(nome, cognome, indirizzo, telefono, eta);
        this.homeWindow = h;
        this.dm = dm;
    }
    
    public Editor(Home h, DataManager dm, Persona p){
        initComponents();
        
        this.jTextField1.setText(p.getNome());
        this.jTextField2.setText(p.getCognome());
        this.jTextField3.setText(p.getIndirizzo());
        this.jTextField4.setText(p.getTelefono());
        this.jTextField5.setText(Integer.toString(p.getEta()));
        
        this.old = p;
        this.homeWindow = h;
        this.dm = dm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("Cognome");

        jLabel3.setText("Indirizzo");

        jLabel4.setText("Telefono");

        jLabel5.setText("Età");

        jButton1.setText("Annulla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ANNULLA
        this.homeWindow.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // SALVA
        
        // check data
        String nome = this.jTextField1.getText();
        String cognome = this.jTextField2.getText();
        String indirizzo = this.jTextField3.getText();
        String telefono = this.jTextField4.getText();
        String eta = this.jTextField5.getText();
        
        if (nome.isBlank() || cognome.isBlank() || indirizzo.isBlank() || telefono.isBlank() || eta.isBlank()) {
            // show error pop-up
            JOptionPane.showMessageDialog(this, "Inserire tutti i campi");
            return;
        }
        
        // check eta field
        int intEta;
        try {
            intEta = Integer.parseInt(eta);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Età deve essere un numero intero");
            return;
        }
        
        // check telefono field
        try {
            Integer.parseUnsignedInt(telefono);
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Telefono deve essere un numero valido");
            return;
        }
        
        // call save method from homeWindow with data
        Persona p = new Persona(nome, cognome, indirizzo, telefono, intEta);
        boolean check;
        
        if (this.old == null) {
            // new
            // controlla telefono
            if (!this.homeWindow.hasTelefono(p.getTelefono())){
                check = this.homeWindow.aggiungiContatto(p);
                this.dm.savePersonaData(p);
                JOptionPane.showMessageDialog(this, "Contatto aggiunto");
            } else {
                JOptionPane.showMessageDialog(this, "Numero già presente");
                return;
            }
        } else {
            // modify
            if (!p.getTelefono().equals(this.old.getTelefono())){
                // telefono cambiato, check presenza
                if (!this.homeWindow.hasTelefono(p.getTelefono())){
                    this.homeWindow.rimuoviContatto(this.old);
                    this.dm.deletePersona(this.old);
                    check = this.homeWindow.aggiungiContatto(p);
                    this.dm.savePersonaData(p);
                    JOptionPane.showMessageDialog(this, "Contatto modificato");
                } else {
                    JOptionPane.showMessageDialog(this, "Numero già presente");
                    return;
                }
            } else {
                // telefono non cambiato, modifica dati
                this.homeWindow.rimuoviContatto(this.old);
                this.dm.deletePersona(this.old);
                check = this.homeWindow.aggiungiContatto(p);
                this.dm.savePersonaData(p);
                JOptionPane.showMessageDialog(this, "Contatto modificato");
            }  
        }
        
        if (!check) {
            JOptionPane.showMessageDialog(this, "Errore nell'aggiunto contatto");
        }
        
        this.homeWindow.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
