public class Livro extends Produto {
    private String autor;
    private int pag;

    public Livro(String autor, int pag, double preco, String nome){
        super(nome, preco);
        this.autor = autor;
        this.pag = pag;
    }

    public boolean ehExtenso(){
        if(this.pag>100){
            return  true;
        }
        else{
            return false;
        }
    }

    //Livros a 50 conto? Ta barato dms... kkk

    @Override
    public boolean ehCaro(){
        if(preco>100){
            return true;
        }
        else{
            return false;
        }
    }
}
