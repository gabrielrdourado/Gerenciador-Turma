package turma;

import gui.CursoGUI;
import java.util.Vector;


public class Curso {
    private String nomeCurso;
    private Vector<Turma> turmas = new Vector<Turma>();;
    private int maxTurmas;
    
    public Curso(String nomeCurso, int n) {
        this.maxTurmas = n;
        this.nomeCurso = nomeCurso;
    }

    public Curso() {
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Vector<Turma> getTurma() {
        return turmas;
    }

    public boolean adicionar(Turma a) {
        if (turmas.size()<maxTurmas)
            turmas.add(a);
        
        return false;
    }
    
    public boolean remover(String nomeTurma){
        for(int i=0;i<turmas.size();i++){
                Turma atual = turmas.get(i);
                if ((atual.getNomeTurma()).equals(nomeTurma)){
                    turmas.remove(i);
                    return true;
                }
        }
        return false;
    }

    public int getMaxTurmas() {
        return maxTurmas;
    }

    public void setMaxTurmas(int maxTurmas) {
        this.maxTurmas = maxTurmas;
    }
    
    public void imprimirDados(){
        for(int i=0;i<turmas.size();i++){
                Turma atual = turmas.get(i);
                System.out.println(atual.getNomeTurma());
                System.out.println(atual.getMaxAlunos());
        }
    }
}
