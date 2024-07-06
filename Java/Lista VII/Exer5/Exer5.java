public class Exer5 {
    public static void main(String[] args){
        int[] array = {56, 43, 22, 19, 6};
        int x = 6;
        int diferenca = 0;
        int aux = 0;
        int par1 = 0;
        int par2 = 0;
        for(int i=0; i<(array.length - 1); i++){
            if(array[i]<array[i+1]){
                diferenca = array[i+1]-array[i];
            }
            else{
                diferenca = array[i]-array[i+1];
            }
            if(diferenca>aux){
                par1 = array[i];
                par2 = array[i+1];
                aux = diferenca;
            }
        }
        System.out.println("Par com maior diferenca no array: " + par1 + " / " + par2);
        System.out.println("Difernca de " + aux + " casas.");

        int crescente = 0;
        int decrescente = 0;
        for(int i=0; i<(array.length - 1); i++){
            if(array[i]<array[i+1]){
                crescente++;
            }
            else{
                decrescente++;
            }
        }
        if(crescente==(array.length - 1)){
            System.out.println("Array Crescente");
        }
        else{
            if(decrescente==(array.length - 1)){
                System.out.println("Array Decrescente");
            }
            else{
                System.out.println("Array nao ordenado");
            }
        }
        int maior = 0;
        int menor = 0;
        int igual = 0;
        for(int v: array){
            if(v==x){
                igual++;
            }
            else{
                if(v>x){
                    maior++;
                }
                else{
                    menor++;
                }
            }
        }
        System.out.println("A " + maior + " numeros maiores que x, " + menor + " menores e " + igual + " iguais.");
    }
}
