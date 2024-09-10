public class Principal{
    public static void main(String[] args){
        Baralho deck = new Baralho();
        deck.embaralhar();

        System.out.println("Carta comprada: " + deck.comprar());
        System.out.println("Carta comprada: " + deck.comprar());
        System.out.println("Carta comprada: " + deck.comprar());
        System.out.println("Carta comprada: " + deck.comprar());
        System.out.println("Carta comprada: " + deck.comprar());

        System.out.println("Cartas restantes: " + deck.cartasRestantes());
    }
}