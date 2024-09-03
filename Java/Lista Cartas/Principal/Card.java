public class Card {
    private Naipe naipe;
    private Valor valor;

    public Card(Naipe n, Valor v){
        this.naipe = n;
        this.valor = v;
    }

    public String toString(){
        return v + " de " + n;
    }
}