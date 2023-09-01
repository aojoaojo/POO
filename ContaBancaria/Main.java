public class Main{

    public static final int a = 3;
    public static void main(String[] args) {
        int g = 5;
        System.out.println();
        System.out.println(2 * ++g +8);
        System.out.println();
        Conta vetor[] = new Conta[a];
        String[] nomes = {"Alana", "Paulo", "Dylan"};
        int[] agencias = {1234, 5354, 1100};
        int[] numeros = {5694, 400, 57};
        double[] saldos = {300.10, 12.0, 1205.74};

        for (int i = 0; i < a; i++) {
            vetor[i] = new Conta(nomes[i], agencias[i], numeros[i], saldos[i]);
        }
        
        for(int i = 0; i<a; i++){
            vetor[i].imprimirConta();
        }
    }


}