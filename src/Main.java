
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class Main extends javax.swing.JFrame {
    ArrayList<Animal> AnimalList;
    
        public void UpdateAnimals(){ //este metodo atualiza a tabela de animais encontrados, criando um modelo recebendo oq foi escrito e aplicando esse modelo nessta tabela
            DefaultTableModel model = new DefaultTableModel(new Object[] {"Especie","Pais Encontrado"},0);
        
        for(int i=0;i<AnimalList.size();i++){
            Object linha[] =new Object[]{AnimalList.get(i).getAnimal(),
                                         AnimalList.get(i).getPais()};
            
            model.addRow(linha);
        }
        Animal_table.setModel(model);
        
    }
    
    
    public Main() {
        initComponents();
        AnimalList = new ArrayList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Animal_table = new javax.swing.JTable();
        Found_Animals = new javax.swing.JLabel();
        Create_panel = new javax.swing.JPanel();
        lb_espc = new javax.swing.JLabel();
        lb_found = new javax.swing.JLabel();
        espc_txt = new javax.swing.JTextField();
        found_txt = new javax.swing.JTextField();
        button_panel = new javax.swing.JPanel();
        BCreate = new javax.swing.JButton();
        BDelete = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        Credits = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(64, 34, 64));

        Animal_table.setBackground(new java.awt.Color(255, 137, 255));
        Animal_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Animal_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Especie", "Pais Encontrado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Animal_table.setGridColor(new java.awt.Color(255, 148, 255));
        Animal_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Animal_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Animal_table);

        Found_Animals.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Found_Animals.setForeground(new java.awt.Color(255, 255, 255));
        Found_Animals.setText("Animais Registrados");
        Found_Animals.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Create_panel.setBackground(new java.awt.Color(255, 137, 255));
        Create_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_espc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_espc.setForeground(new java.awt.Color(102, 0, 102));
        lb_espc.setText("Especie :");

        lb_found.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_found.setForeground(new java.awt.Color(102, 0, 102));
        lb_found.setText("Encontrado:");

        espc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espc_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Create_panelLayout = new javax.swing.GroupLayout(Create_panel);
        Create_panel.setLayout(Create_panelLayout);
        Create_panelLayout.setHorizontalGroup(
            Create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Create_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Create_panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lb_espc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Create_panelLayout.createSequentialGroup()
                        .addComponent(lb_found)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(found_txt)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        Create_panelLayout.setVerticalGroup(
            Create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Create_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_espc))
                .addGap(21, 21, 21)
                .addGroup(Create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_found)
                    .addComponent(found_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        button_panel.setBackground(new java.awt.Color(255, 137, 255));
        button_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BCreate.setBackground(new java.awt.Color(116, 44, 116));
        BCreate.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BCreate.setForeground(new java.awt.Color(255, 255, 255));
        BCreate.setText("Criar");
        BCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCreateActionPerformed(evt);
            }
        });

        BDelete.setBackground(new java.awt.Color(116, 44, 116));
        BDelete.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BDelete.setForeground(new java.awt.Color(255, 255, 255));
        BDelete.setText("Deletar");
        BDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteActionPerformed(evt);
            }
        });

        BEdit.setBackground(new java.awt.Color(116, 44, 116));
        BEdit.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BEdit.setForeground(new java.awt.Color(255, 255, 255));
        BEdit.setText("Editar");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        Credits.setBackground(new java.awt.Color(116, 44, 116));
        Credits.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Credits.setForeground(new java.awt.Color(255, 255, 0));
        Credits.setText("Creditos");
        Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout button_panelLayout = new javax.swing.GroupLayout(button_panel);
        button_panel.setLayout(button_panelLayout);
        button_panelLayout.setHorizontalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        button_panelLayout.setVerticalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCreate)
                    .addComponent(BEdit))
                .addGap(18, 18, 18)
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BDelete)
                    .addComponent(Credits))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Found_Animals)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Found_Animals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCreateActionPerformed
        Animal A = new Animal(espc_txt.getText(),found_txt.getText());
        AnimalList.add(A);
        
        UpdateAnimals();
        
        espc_txt.setText("");
        found_txt.setText("");
    }//GEN-LAST:event_BCreateActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
       int index = Animal_table.getSelectedRow();
            AnimalList.get(index).setAnimal(espc_txt.getText());
            AnimalList.get(index).setPais(found_txt.getText());
        
        UpdateAnimals();    
        espc_txt.setText("");
        found_txt.setText("");
    }//GEN-LAST:event_BEditActionPerformed

    private void BDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteActionPerformed
        int index = Animal_table.getSelectedRow();
        if(index>=0 && index<AnimalList.size()){ //verifica se  a linha é valida
            AnimalList.remove(index);
        }
        UpdateAnimals();
    }//GEN-LAST:event_BDeleteActionPerformed

    private void CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsActionPerformed
       JOptionPane.showMessageDialog(rootPane,"Vitoria Carvalho - 29446961 \n Victor Soriano - 30549822 ","Grupo",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_CreditsActionPerformed

    private void espc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espc_txtActionPerformed

    private void Animal_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Animal_tableMouseClicked
        int index = Animal_table.getSelectedRow();
        if(index>=0 && index<AnimalList.size()){ 
            Animal A = AnimalList.get(index);

            espc_txt.setText(A.getAnimal()); 
            found_txt.setText(A.getPais());}
    }//GEN-LAST:event_Animal_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Animal_table;
    private javax.swing.JButton BCreate;
    private javax.swing.JButton BDelete;
    private javax.swing.JButton BEdit;
    private javax.swing.JPanel Create_panel;
    private javax.swing.JButton Credits;
    private javax.swing.JLabel Found_Animals;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel button_panel;
    private javax.swing.JTextField espc_txt;
    private javax.swing.JTextField found_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_espc;
    private javax.swing.JLabel lb_found;
    // End of variables declaration//GEN-END:variables
}