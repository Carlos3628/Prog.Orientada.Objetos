public class Exer7 {
    public static void main(String[] args){
        int[][] A = {{0, 1, 2},{3, 4, 5},{6, 7, 8}};

        for (int i = 0; i < A.length; i++){ 
            System.out.println();
            for (int j = 0; j < A.length; j++){
                System.out.print(" " + A[i][j]); 
            }
        }
    }
}
