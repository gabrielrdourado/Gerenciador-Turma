package gui;

import gui.TurmaGUI;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import turma.*;

public class CursoGUI extends javax.swing.JFrame {
    private Curso curso;
    private TurmaGUI turma;
    private Turma a;
    
    public CursoGUI() {
        this.setLocationRelativeTo(null);
        initComponents();
    }
    
    public CursoGUI(Curso curso) {
        this.curso = curso;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Adicionar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeTurma = new javax.swing.JTextField();
        QtdAluno = new javax.swing.JTextField();
        infCurso = new javax.swing.JLabel();
        contadorMax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Turmas");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
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
                "Turma", "Max Alunos"
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
        jTable1.setEnabled(false);
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

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.setEnabled(false);
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        Editar.setText("Editar Turma");
        Editar.setEnabled(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome da Turma:");

        jLabel3.setText("Max de Alunos:");

        nomeTurma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeTurmaFocusGained(evt);
            }
        });

        QtdAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                QtdAlunoFocusLost(evt);
            }
        });
        QtdAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtdAlunoActionPerformed(evt);
            }
        });

        infCurso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(infCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(contadorMax, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QtdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Adicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Remover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Editar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contadorMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(QtdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adicionar)
                    .addComponent(Remover)
                    .addComponent(Editar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel criaModeloTabela(){
        jTable1.setEnabled(true);
        DefaultTableModel model = new DefaultTableModel(preencheTabela(), new String [] {"Turma", "Max Alunos"}){
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
    
    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
            if(Integer.parseInt(QtdAluno.getText())>=10 && Integer.parseInt(QtdAluno.getText())<=50){
                a = new Turma();
                a.setMaxAlunos(Integer.parseInt(QtdAluno.getText()));
                a.setNomeTurma(nomeTurma.getText());
       
                curso.adicionar(a);
                jTable1.setModel(criaModeloTabela());
                nomeTurma.setText("");
                QtdAluno.setText("");
                nomeTurma.requestFocus();
            }
            else
                JOptionPane.showMessageDialog(null, "É necessario uma turma com no minímo 10 alunos e no máximo 50 alunos.");
            
            contadorMax.setText((curso.getTurma().size())+"/"+curso.getMaxTurmas()+" Turmas");
    }//GEN-LAST:event_AdicionarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        curso.remover(nomeTurma.getText());
        jTable1.setModel(criaModeloTabela());
        nomeTurma.setText("");
        QtdAluno.setText("");
        nomeTurma.requestFocus();
        contadorMax.setText((curso.getTurma().size())+"/"+curso.getMaxTurmas()+" Turmas");
    }//GEN-LAST:event_RemoverActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int i=0;
        do{
            Turma atual = curso.getTurma().get(i);
            if ((atual.getNomeTurma()).equals(nomeTurma.getText())){
                this.a = atual;
                turma = new TurmaGUI(a);
                nomeTurma.setText("");
                QtdAluno.setText("");
                turma.setLocationRelativeTo(CursoGUI.this);
                turma.setVisible(true);
            }
            i++;
        }while(i<curso.getTurma().size());
        
        nomeTurma.setText("");
        QtdAluno.setText("");
    }//GEN-LAST:event_EditarActionPerformed

    private void QtdAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtdAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtdAlunoActionPerformed

    private void QtdAlunoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QtdAlunoFocusLost
        
    }//GEN-LAST:event_QtdAlunoFocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Editar.setEnabled(true);
        Remover.setEnabled(true);
        nomeTurma.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        QtdAluno.setText(Integer.toString((Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void nomeTurmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTurmaFocusGained

    }//GEN-LAST:event_nomeTurmaFocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        infCurso.setText(curso.getNomeCurso());
        jTable1.setModel(criaModeloTabela());
        contadorMax.setText((curso.getTurma().size())+"/"+curso.getMaxTurmas()+" Turmas");
    }//GEN-LAST:event_formComponentShown

    public Object[][] preencheTabela(){
        Object[][] obj = new Object[curso.getTurma().size()][2];
        int i=0;
        for (Turma b: curso.getTurma()){
            obj[i][0]= b.getNomeTurma();
            obj[i][1]= b.getMaxAlunos();
            i++;
        }
        return obj;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Adicionar;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField QtdAluno;
    private javax.swing.JButton Remover;
    private javax.swing.JLabel contadorMax;
    private javax.swing.JLabel infCurso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeTurma;
    // End of variables declaration//GEN-END:variables
}
