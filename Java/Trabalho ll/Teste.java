public class Teste {
    public static void main(String[] args){
        Cliente carlos = new Cliente("Carlos Bassani", "139061479-40");
        Veiculo[] carlosVeiculos = new Veiculo[2];
        Pedido[] carlosPedidos = new Pedido[2];
        carlosVeiculos[0] = new Carro("BMW M4", 300000, 2020);
        carlosVeiculos[1] = new Moto("Kawasaki Ninja", 100000, 0);
        carlosPedidos[0] = new Pedido(1, carlos, carlosVeiculos[0]);
        carlosPedidos[1] = new Pedido(2, carlos, carlosVeiculos[1]);
        System.out.println("Informacoes dos Pedidos:");
        carlosPedidos[0].printDados();
        carlosPedidos[1].printDados();
        System.out.println();

        Cliente alex = new Cliente("Alex Xela", "Nao informado");
        Veiculo[] alexVeiculos = new Veiculo[2];
        Pedido[] alexPedidos = new Pedido[2];
        alexVeiculos[0] = new Carro("Kia Sportage", 150000, 2018);
        alexVeiculos[1] = new Moto("Pop 100", 5000, 100000);
        alexPedidos[0] = new Pedido(3, alex, alexVeiculos[0]);
        alexPedidos[1] = new Pedido(4, alex, alexVeiculos[1]);
        System.out.println("Informacoes dos Pedidos:");
        alexPedidos[0].printDados();
        alexPedidos[1].printDados();
        System.out.println();

        Cliente eric = new Cliente("Eric", "No Serasa");
        Veiculo[] ericVeiculos = new Veiculo[2];
        Pedido[] ericPedidos = new Pedido[2];
        ericVeiculos[0] = new Carro("Cadete", 10000, 1995);
        ericVeiculos[1] = new Moto("XJ 6", 15000, 150000);
        ericPedidos[0] = new Pedido(5, eric, ericVeiculos[0]);
        ericPedidos[1] = new Pedido(6, eric, ericVeiculos[1]);
        System.out.println("Informacoes dos Pedidos:");
        ericPedidos[0].printDados();
        ericPedidos[1].printDados();
    }
}
