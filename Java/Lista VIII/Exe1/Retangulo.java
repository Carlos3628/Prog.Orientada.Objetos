public class Retangulo extends TwoDShape {
    
    public Retangulo(double largura, double altura){
        super(largura, altura);
    }

    public boolean Quadrado(double largura, double altura){
        if(largura==altura){
            return true;
        }
        else{
            return false;
        }
    }

    public double area(double largura, double altura){
        return altura * largura;
    }
}
