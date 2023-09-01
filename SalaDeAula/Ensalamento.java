public class Ensalamento{
    
    public static final int a = 13;
    public static final int b = 3;
    public static void main(String[] args){
        Aluno vetorAluno[] = new Aluno[a];
        String[] nome = {"Alfredo", "Peterson", "Wendel", "Ian", "Debra", "Luana", "Bruno", "Romeu", "Julieta", "Maria", "Capitú", "Bentinho", "Amélia"};
        Professor vetorProfessores[] = new Professor[b];
        String[] professores = {"Mia", "Saulo", "Paula"};
        String[] disciplinas = {"POO", "Estrutura de Dados", "BI"};
        for(int i = 0; i < a; i++){
            if( i%2 == 0){
                vetorAluno[i] = new Aluno(nome[i], "Administração");
            }
            else{
                vetorAluno[i] = new Aluno(nome[i], "Ciência da Computação");
            }
        }
        System.out.println("Alunos: ");
        for(int i=0; i < a; i++){
            vetorAluno[i].imprimirAlunos();
        }
        
        for(int i = 0; i < b; i++){
            vetorProfessores[i] = new Professor(professores[i], disciplinas[i]);
        }
        
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////");
        System.out.println("Professores: ");
        for(int i=0; i < b; i++){
            vetorProfessores[i].imprimirProfessores();
        }


    }
}