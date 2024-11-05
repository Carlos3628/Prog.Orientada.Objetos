import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void matricularAluno(Aluno aluno, Curso curso) throws CursoLotadoException {
        curso.matricular(aluno);
    }

    public String buscarAluno(String nome) throws AlunoNaoEncontradoException {
        for(Aluno v: alunos){
            if(v.getNome()==nome){
                return nome + " encontrado";
            }
        }
        throw new AlunoNaoEncontradoException();
    }

    public String buscarProfessor(String nome) throws AlunoNaoEncontradoException {
        for(Professor f: professores){
            if(f.getNome()==nome){
                return nome + " encontrado";
            }
        }
        throw new AlunoNaoEncontradoException();
    }
}
