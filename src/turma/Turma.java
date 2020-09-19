package turma;

import java.util.Vector;
import javax.security.auth.Refreshable;
import javax.swing.JTable;

public class Turma {
    private int maxAlunos;
    private Vector<Aluno> alunos = new Vector<Aluno>();
    private String nomeTurma;

    public Turma() {
    }
    
    public Turma(String nomeTurma, int n){
        this.nomeTurma = nomeTurma;
        this.maxAlunos= n;
    }
    
    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public boolean adicionar(Aluno a){
        if (alunos.size()<maxAlunos){
            for(int i=0;i<alunos.size();i++){
                Aluno atual = alunos.get(i);
                if (atual.getMatricula()==a.getMatricula())
                    return false;
            }
            alunos.add(a);
        }
        return false;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public Vector<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Vector<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public boolean remover(int matricula){
        for(int i=0;i<alunos.size();i++){
                Aluno corrente = alunos.get(i);
                if (corrente.getMatricula()==matricula){
                    alunos.remove(i);
                    return true;
                }
        }
        return false;
    }
    
    public void imprimir(){
        for(int i=0;i<alunos.size();i++){
                Aluno atual = alunos.get(i);
                System.out.println(atual.getNome());
                System.out.println(atual.getMatricula());
                System.out.println(atual.getMedia());
        }
    }
}
