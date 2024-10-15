public class CursoPresencial extends Curso {
    private int contador = 0;

    @Override
    public void matricula(int numMatricula){
        if(this.contador<=5){
            Matricula[] matriculaPresencial = new Matricula[3];
            matriculaPresencial[this.contador] = new Matricula(numMatricula);
            this.contador++;
        }
    }
}
