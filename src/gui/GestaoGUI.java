package gui;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import turma.*;

public class GestaoGUI extends javax.swing.JFrame {
    private Gestao gestao = new Gestao();
    private CursoGUI curso;
    private Curso a;
    
    public GestaoGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarCurso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nomeCurso = new javax.swing.JTextField();
        maxTurmas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adicionarCurso = new javax.swing.JButton();
        removerCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Cursos");

        editarCurso.setText("Editar Curso");
        editarCurso.setEnabled(false);
        editarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCursoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Curso", "Max Turmas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setText("Nome do Curso:");

        jLabel3.setText("Max de Turmas:");

        adicionarCurso.setText("Adicionar");
        adicionarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCursoActionPerformed(evt);
            }
        });

        removerCurso.setText("Remover");
        removerCurso.setEnabled(false);
        removerCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(adicionarCurso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(removerCurso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(editarCurso))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarCurso)
                    .addComponent(removerCurso)
                    .addComponent(editarCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCursoActionPerformed
        if (maxTurmas.getText().isEmpty())
            return;
        else{
            if(Integer.parseInt(maxTurmas.getText())<=10 && Integer.parseInt(maxTurmas.getText())>0){
                a = new Curso();
                a.setMaxTurmas(Integer.parseInt(maxTurmas.getText()));
                a.setNomeCurso(nomeCurso.getText());
                gestao.adicionar(a);
                jTable1.setModel(criaModeloTabela());
                nomeCurso.setText("");
                maxTurmas.setText("");
                nomeCurso.requestFocus();
            }
            else
                JOptionPane.showMessageDialog(null, "Só é possível cadastrar no máximo 10 Turmas");
        }
    }//GEN-LAST:event_adicionarCursoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        removerCurso.setEnabled(true);
        editarCurso.setEnabled(true);
        nomeCurso.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        maxTurmas.setText(Integer.toString((Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void removerCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCursoActionPerformed
        gestao.remover(nomeCurso.getText());
        jTable1.setModel(criaModeloTabela());
        nomeCurso.setText("");
        maxTurmas.setText("");
        nomeCurso.requestFocus();
    }//GEN-LAST:event_removerCursoActionPerformed

    private void editarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCursoActionPerformed
        int i=0;
        do{
            Curso atual = gestao.getCursos().get(i);
            if ((atual.getNomeCurso()).equals(nomeCurso.getText())){
                this.a = atual;
                curso = new CursoGUI(a);
                nomeCurso.setText("");
                maxTurmas.setText("");
                curso.setLocationRelativeTo(GestaoGUI.this);
                curso.setVisible(true);
            }
            i++;
        }while(i<gestao.getCursos().size());
        
        nomeCurso.setText("");
        maxTurmas.setText("");
    }//GEN-LAST:event_editarCursoActionPerformed

    private DefaultTableModel criaModeloTabela(){
    jTable1.setEnabled(true);
    DefaultTableModel model = new DefaultTableModel(preencheTabela(), new String [] {"Curso", "Max Turmas"}){
    Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class
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
    };
return model;
    }
    
    public Object[][] preencheTabela(){
        Object[][] obj = new Object[gestao.getCursos().size()][2];
        int i=0;
        for (Curso b: gestao.getCursos()){
            obj[i][0]= b.getNomeCurso();
            obj[i][1]= b.getMaxTurmas();
            i++;
        }
        return obj;
    }
    
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
            java.util.logging.Logger.getLogger(GestaoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestaoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestaoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestaoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarCurso;
    private javax.swing.JButton editarCurso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField maxTurmas;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JButton removerCurso;
    // End of variables declaration//GEN-END:variables
}
