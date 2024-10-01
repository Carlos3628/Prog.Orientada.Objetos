public class Main {
    public static void main(String[] args){
        MaisDois serie2 = new MaisDois();
        MaisTres serie3 = new MaisTres();
        exibeCinco(serie2);
        exibeCinco(serie3);
    }

    public static void exibeCinco(Series s){
        s.setStart(100);
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        s.reset();
        s.toString();
        System.out.println();
    }
}
