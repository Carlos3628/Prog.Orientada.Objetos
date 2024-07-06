public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public boolean ehCaro(){
        if(this.preco>50.0){
            return true;
        }
        else{
            return false;
        }
    }
}
