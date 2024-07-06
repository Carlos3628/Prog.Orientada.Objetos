public class Exer2 {
    public static void main(String[] args){
        Produto HotWheels = new Produto("Skyline R34", 180.0);
        System.out.println("Hot-Wheels caro: " + HotWheels.ehCaro());
        Livro livro = new Livro("Carlos", 120, 70.0, "Carlos por Carlos, as faces de Carlos");
        System.out.println("Livro extenso: " + livro.ehExtenso());
        System.out.println("Livro caro: " + livro.ehCaro());
    }
}
