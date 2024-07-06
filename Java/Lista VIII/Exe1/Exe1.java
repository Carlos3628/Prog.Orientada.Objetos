public class Exe1 {
    public static void main(String[] args){
        /* Triangulo t1 = new Triangulo(4.0,4.0);
        Triangulo t2 = new Triangulo(8.0,12.0);
        t1.setEstilo("Cheio");
        t2.setEstilo("Contorno");
        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.print();
        System.out.println("Area = " + t1.area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.print();
        System.out.println("Area = " + t2.area()); */

        //Atividade b e d)
        Retangulo ret = new Retangulo(4.0,4.0);
        Retangulo ret2 = new Retangulo(4.0,6.0);
        System.out.println("Retangulo 1 e quadrado: " + ret.Quadrado(ret.getLargura(),ret.getAltura()));
        System.out.println("Area do Retangulo 1: " + ret.area(ret.getLargura(),ret.getAltura()));
        System.out.println("Retangulo 2 e quadrado: " + ret2.Quadrado(ret2.getLargura(),ret2.getAltura()));
        System.out.println("Area do Retangulo 2: " + ret2.area(ret2.getLargura(),ret2.getAltura()));
        ret.setAltura(8.0);
        ret.setLargura(6.0);
        ret2.setAltura(10.0);
        ret2.setLargura(10.0);
        System.out.println();
        System.out.println("Apos mudanca por modificadores:");
        System.out.println("Retangulo 1 e quadrado: " + ret.Quadrado(ret.getLargura(),ret.getAltura()));
        System.out.println("Area do Retangulo 1: " + ret.area(ret.getLargura(),ret.getAltura()));
        System.out.println("Retangulo 2 e quadrado: " + ret2.Quadrado(ret2.getLargura(),ret2.getAltura()));
        System.out.println("Area do Retangulo 2: " + ret2.area(ret2.getLargura(),ret2.getAltura()));
    }
}