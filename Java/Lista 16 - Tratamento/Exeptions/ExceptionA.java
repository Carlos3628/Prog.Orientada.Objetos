public class ExceptionA extends Exception {
    
    public void erroB() throws ExceptionB {
        throw new ExceptionB();
    }

    public void erroC() throws ExceptionC {
        throw new ExceptionC();
    }
}
