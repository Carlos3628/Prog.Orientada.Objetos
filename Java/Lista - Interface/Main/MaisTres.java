public class MaisTres implements Series {
    private int inicio = 0;
    private int valor = 0;

    @Override
    public int getNext() {
        // TODO Auto-generated method stub
        this.valor = this.valor + 3;
        return this.valor;
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        this.valor = this.inicio;
        System.out.println("Resetado: " + this.valor);
    }

    @Override
    public void setStart(int x) {
        // TODO Auto-generated method stub
        this.inicio = x;
        this.valor = x;
        System.out.println(x);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Classe que gera uma serie de numeros com tres unidades de diferenca,";
    }
    
}
