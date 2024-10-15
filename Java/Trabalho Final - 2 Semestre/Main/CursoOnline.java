public class CursoOnline extends Curso {
    private int contador = 0;

    @Override
    public void matricula(int numMatricula){
        Matricula[] matriculaOnline = new Matricula[5];
        matriculaOnline[this.contador] = new Matricula(numMatricula);
        this.contador++;
    }
}
