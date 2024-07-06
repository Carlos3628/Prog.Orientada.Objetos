public class Exer6 {
    public static void main(String[] args){
        int n1 = 1, n2 = 3, n3 = 5;
        int v1 = 1, v2 = 4, v3 = 9;
        System.out.println("Soma: " + Soma(n1,n2,n3));
        System.out.println("Soma: " + Soma(v1, v2, v3));
    }

    public static int Soma(int ... numeros){
        int soma = 0;
        for(int i: numeros){
            soma = soma + i;
        }
        return soma;
    }
}
