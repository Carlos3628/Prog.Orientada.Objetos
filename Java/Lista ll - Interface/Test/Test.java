public class Test {
    public static void main(String[] args){
        Falante f1,f2;    //Declara dois tipos de falantes, intrevistados.
        f1 = new Aluno();  //Define o primeiro falante como aluno
        f2 = new Robo();   //Define o segundo falante como robo
        Entrevistador e = new Entrevistador();  //instancia um entrevistador
        e.entrevista(f1);  //Faz o entrevistador entrevistar o aluno
        System.out.println(" ----------");  //Pula uma linha para seguir em frente, questao de organização visual
        e.entrevista(f2); //Entresvistador entrevista o robo
    }
}
