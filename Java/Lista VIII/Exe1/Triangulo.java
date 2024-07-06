public class Triangulo extends TwoDShape {
    private String estilo;

    public Triangulo(double largura, double altura){
        super(largura, altura);
    }
    
    public double area(double largura, double altura){
        return (largura * altura) / 2;
    }

    public void mostraEstilo() {
        System.out.println("Triangulo = " + this.estilo);
    }

    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
}
    