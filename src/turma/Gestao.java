package turma;

import java.util.Vector;
import turma.*;

public class Gestao {
    private Vector<Curso> cursos = new Vector<Curso>();
    
    public Gestao(){

    }

    public Vector<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Vector<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void adicionar(Curso a) {       
        cursos.add(a);
    }
    
    public boolean remover(String nomeCurso){
        for(int i=0;i<cursos.size();i++){
                Curso atual = cursos.get(i);
                if ((atual.getNomeCurso()).equals(nomeCurso)){
                    cursos.remove(i);
                    return true;
                }
        }
        return false;
    }
}


