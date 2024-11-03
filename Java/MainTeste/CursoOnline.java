import java.util.ArrayList;
import java.util.List;

class CursoOnline extends Curso {
    public CursoOnline(String nome, String descricao, int cargaHoraria, Professor professor) {
        super(nome, descricao, cargaHoraria, professor);
    }
    
    @Override
    public void matricular(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }
}
