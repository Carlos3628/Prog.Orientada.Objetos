public class Robo implements Falante {

    @Override
    public void falar() {
        // TODO Auto-generated method stub
        System.out.println("Olá eu sou um robo.");
    }

    @Override
    public String seuIdioma() {
        // TODO Auto-generated method stub
        return "Binário";
    }
    
    public void reboot(){
        System.out.println("Realizando um reboot...");
    }
}
