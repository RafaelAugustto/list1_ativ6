import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Requisito 01: Peça o raio de um círculo
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o raio do círculo: ");
        double raio = sc.nextDouble();

        sc.close();

        //Requisito 02: Calcular a área do círculo
        double area = Math.PI * Math.pow(raio, 2);
        System.out.print("A área do círculo de raio " + raio + " é igual a " + area);
    }
}