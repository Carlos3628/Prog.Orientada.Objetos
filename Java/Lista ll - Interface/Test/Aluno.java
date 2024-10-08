public class Aluno extends Pessoa implements Falante {

    @Override
    public void falar() {
        // TODO Auto-generated method stub
        System.out.println("Olá eu sou aluno de MAC");
    }

    @Override
    public String seuIdioma() {
        // TODO Auto-generated method stub
        return "Portugues";
    }
    
    public void identificarSe(){
        System.out.println("Eu sou o aluno " + this.nome);
    }
}
