import java.util.ArrayList;
import java.util.List;

class CursoPresencial extends Curso {
    private int limiteVagas = 3;
        
    public CursoPresencial(String nome, String descricao, int cargaHoraria, Professor professor, int limiteVagas) {
        super(nome, descricao, cargaHoraria, professor);
        this.limiteVagas = limiteVagas;
    }
    
    @Override
    public void matricular(Aluno aluno) throws CursoLotadoException {
        if (alunosMatriculados.size() >= limiteVagas) {
            throw new CursoLotadoException();
        }
        alunosMatriculados.add(aluno);
    }
}
