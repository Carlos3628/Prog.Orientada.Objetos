public class Notebook extends Computador {
    private int codigo;
    
    public Notebook(){
        System.out.println("Notebook()");
        codigo = 12345;
        Ligar();
    }

    public void Ligar(){
        System.out.println("Codigo = " + codigo);
    }
}
