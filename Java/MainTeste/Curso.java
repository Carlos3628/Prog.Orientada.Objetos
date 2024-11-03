import java.util.ArrayList;
import java.util.List;

public class Curso implements Avaliavel {
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private Professor professor;
    protected List<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso(String nome, String descricao, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public void matricular(Aluno aluno) throws CursoLotadoException{}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void Avaliar(Aluno aluno) {
        // Implementação da avaliação do aluno
    }
}
