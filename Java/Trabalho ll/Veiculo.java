public class Veiculo {
    protected String modelo;
    protected double preco;

    public Veiculo(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void dados(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preco: " + this.preco);
    }
}