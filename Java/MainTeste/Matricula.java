import java.util.ArrayList;
import java.util.List;

class Matricula {
    private Aluno aluno;
    private Curso curso;
    private StatusMatricula status;
    
    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.status = StatusMatricula.EM_CURSO;
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public StatusMatricula getStatus() {
        return status;
    }
    
    public void setStatus(StatusMatricula status) {
        this.status = status;
    }
}
