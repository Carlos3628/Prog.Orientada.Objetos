public class TestaConta {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Jeremias", "Antunes");
        Conta conta1 = new Conta(3954, 8000, 2000, cliente1);
        try{
            conta1.saca(-15000);
        }
        catch(IllegalArgumentException IllegalArgumentException){
            System.out.println("Saldo insuficiente!");
        }
        catch(ValorNegativoException ValorNegativoException){
            System.out.println(ValorNegativoException);
        }
        System.out.println("Dados conta 1: " + "\n" + conta1.toString());
    }
}