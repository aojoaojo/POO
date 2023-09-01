public class Main{

    public static void main(String[] args){

        double lado = 5;
        double ladoMaior = 7;
        Quadrado teste = new Quadrado(lado);
        teste.imprimirArea();
        teste.imprimirPerimetro();

        Circulo teste2 = new Circulo(lado);
        teste2.imprimirAreaCirculo();
        teste2.imprimirPerimetroCirculo();
        teste2.imprimirTamanhoLadoCirculo();

        Retangulo teste3 = new Retangulo(ladoMaior, lado);
        teste3.imprimirArea();
        teste3.imprimirPerimetro();
        teste3.imprimirTamanhoLado();

        Triangulo teste4 = new Triangulo(ladoMaior, lado);
        teste4.imprimirAreaTriangulo();
        teste4.imprimirBaseEAlturaTriangulo();

    }
}