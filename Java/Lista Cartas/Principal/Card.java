public class Card{
    private Naipe naipe;
    private Valor valor;
    public int compra = 1;

    public Card(Naipe n, Valor v){
        this.naipe = n;
        this.valor = v;
    }

    public String toString(){
        return this.valor + " de " + this.naipe;
    }

    public int camprado(){
        this.compra = 0;
        return this.compra;
    }
}