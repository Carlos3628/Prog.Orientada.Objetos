public class Exeptions {
    public static void main(String[] args){
        ExceptionA erro = new ExceptionA();
        try{
            erro.erroB();
        }
        catch(ExceptionB b){
            System.out.println(b);
        }
        try{
            erro.erroC();
        }
        catch(ExceptionC c){
            System.out.println(c);
        }
    }
}
