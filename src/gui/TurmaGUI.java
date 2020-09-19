package gui;

import gui.CursoGUI;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import turma.*;

public class TurmaGUI extends javax.swing.JFrame {
    private Turma turma = null;
    private Aluno a;
    
    public TurmaGUI() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    public TurmaGUI(Turma turma){
        this.turma = turma;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        media = new javax.swing.JTextField();
        Adicionar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        infTurma = new javax.swing.JLabel();
        contadorMax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setText("Matrícula:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Média:");

        matricula.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                matriculaInputMethodTextChanged(evt);
            }
        });
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });

        media.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mediaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mediaFocusLost(evt);
            }
        });
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaActionPerformed(evt);
            }
        });

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
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
        jTable1.setEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        infTurma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(infTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(contadorMax, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Adicionar)
                                .addGap(18, 18, 18)
                                .addComponent(Remover))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contadorMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remover)
                    .addComponent(Adicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void matriculaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_matriculaInputMethodTextChanged
        
    }//GEN-LAST:event_matriculaInputMethodTextChanged

    private DefaultTableModel criaModeloTabela(){
        jTable1.setEnabled(true);
        DefaultTableModel model = new DefaultTableModel(preencheTabela(), new String [] {"Matricula", "Nome", "Média"}){
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
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
        // TODO add your handling code here:
        a = new Aluno();
        a.setMatricula(Integer.parseInt(matricula.getText()));
        a.setNome(nome.getText());
        if(Float.parseFloat(media.getText())<=10&&Float.parseFloat(media.getText())>=0){
            a.setMedia(Float.parseFloat(media.getText()));
            turma.adicionar(a);
            jTable1.setModel(criaModeloTabela());
            contadorMax.setText((turma.getAlunos().size())+"/"+turma.getMaxAlunos()+" Alunos");
            matricula.setText("");
            nome.setText("");
            media.setText("");
            matricula.requestFocus();
        }
        else
            JOptionPane.showMessageDialog(null, "A média deve ser entre 0 e 10");
    }//GEN-LAST:event_AdicionarActionPerformed

    private void mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaActionPerformed

    private void mediaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mediaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaFocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Remover.setEnabled(true);
        matricula.setText(Integer.toString((Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
        nome.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        media.setText(Float.toString((Float)jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
        turma.remover(Integer.parseInt(matricula.getText()));
        jTable1.setModel(criaModeloTabela());
        contadorMax.setText((turma.getAlunos().size())+"/"+turma.getMaxAlunos()+" Alunos");
        matricula.setText("");
        nome.setText("");
        media.setText("");
        matricula.requestFocus();
    }//GEN-LAST:event_RemoverActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusLost

    private void mediaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mediaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaFocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jTable1.setModel(criaModeloTabela());
        infTurma.setText(turma.getNomeTurma());
        contadorMax.setText((turma.getAlunos().size())+"/"+turma.getMaxAlunos()+" Alunos");
    }//GEN-LAST:event_formComponentShown

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    public Object[][] preencheTabela(){
        Object[][] obj = new Object[turma.getAlunos().size()][3];
        int i=0;
        for (Aluno b: turma.getAlunos()){
            obj[i][0]= b.getMatricula();
            obj[i][1]= b.getNome();
            obj[i][2]=b.getMedia();
            i++;
        }
        return obj;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton Remover;
    private javax.swing.JLabel contadorMax;
    private javax.swing.JLabel infTurma;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField media;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
