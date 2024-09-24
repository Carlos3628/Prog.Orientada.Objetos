public class TestaConta {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Jeremias", "Antunes");
        Conta conta1 = new Conta(3954, 8000, 2000, cliente1);
        try{
            conta1.saca(500);
        }
        catch(IllegalArgumentException v){
            System.out.println("Saldo insuficiente!");
        }
        catch(ValorNegativoException v){
            System.out.println(v);
        }
        System.out.println("Dados conta 1: " + "\n" + conta1.toString());
    }
}