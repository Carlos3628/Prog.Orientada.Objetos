public class Teste {
    public static void main(String[] args){
        Instrumento[] music = new Instrumento[5];

        music[0] = new Corda();
        music[1] = new Percussao();
        music[2] = new Sopro();
        music[3] = new SoproMadeira();
        music[4] = new SoproMetal();
        sinfonia(music);
    }

    public static void sinfonia(Instrumento[] instrumento){
        for(int i=0; i<5; i++){
            instrumento[i].nome();
            instrumento[i].afinar();
            instrumento[i].tocar();
            System.out.println();
        }
    }
}
