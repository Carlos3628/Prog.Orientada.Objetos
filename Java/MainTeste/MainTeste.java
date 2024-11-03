enum StatusMatricula {
        EM_CURSO,
        CONCLUIDO,
        TRANCADO
}

public class MainTeste {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
                
        Professor professor1 = new Professor("Maria");
        universidade.adicionarProfessor(professor1);
                
        Aluno aluno1 = new Aluno("João");
        universidade.adicionarAluno(aluno1);
                
        Curso curso1 = new CursoPresencial("Engenharia", "Curso de Engenharia", 360, professor1, 30);
        universidade.adicionarCurso(curso1);
                
        try {
                universidade.matricularAluno(aluno1, curso1);
                System.out.println("Aluno matriculado com sucesso!");
        } catch (CursoLotadoException e) {
                System.out.println("Curso Lotado.");
        }
   }
}
