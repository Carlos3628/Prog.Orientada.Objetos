public class Bike extends Veiculo {
    
    public Bike(){
        System.out.println("E uma bicicleta.");
    }

    @Override
    public void verificar(){
        System.out.println("Verificar bicicleta.");
    }

    @Override
    public void ajustar(){
        System.out.println("Ajustar bicicleta.");
    }

    @Override
    public void limpar(){
        System.out.println("Limpar bicicleta.");
    }
}
