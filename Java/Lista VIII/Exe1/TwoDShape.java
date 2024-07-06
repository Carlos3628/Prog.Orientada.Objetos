public class TwoDShape {
    private double largura;
    private double altura;

    public TwoDShape(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }

    public void print(){
        System.out.println("Largura e altura = " + this.largura + " e " + this.altura);
    }

    public double getLargura(){
        return this.largura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }
}