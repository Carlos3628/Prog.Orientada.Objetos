public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void printDados(){
        System.out.println("Cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}