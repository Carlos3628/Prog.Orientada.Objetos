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
                
        Aluno aluno1 = new Aluno("Joao");
        universidade.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno("Carlos");
        universidade.adicionarAluno(aluno2);

        Aluno aluno3 = new Aluno("Rebeca");
        universidade.adicionarAluno(aluno3);
                
        Curso curso1 = new CursoPresencial("Engenharia", "Curso de Engenharia", 360, professor1, 2);
        universidade.adicionarCurso(curso1);

        Curso curso2 = new CursoOnline("Engenharia", "Engenharia Online", 360, professor1);
        universidade.adicionarCurso(curso2);
                
        try {
                universidade.matricularAluno(aluno1, curso1);
                universidade.matricularAluno(aluno2, curso1);
                //universidade.matricularAluno(aluno3, curso1);
                universidade.matricularAluno(aluno3, curso2);
                System.out.println(universidade.buscarAluno("Joao"));
                System.out.println(universidade.buscarProfessor("Maria"));
        } 
        catch (CursoLotadoException e) {
                System.out.println("Curso Lotado.");
        }
        catch (AlunoNaoEncontradoException e){
                System.out.println("Pessoa nao encontrada");
        }
   }
}
