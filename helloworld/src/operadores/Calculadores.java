package operadores;

import java.util.Scanner;

public class Calculadores {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double numero1, numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = leia.nextDouble();

        System.out.println("Digite o segundo número:");
        numero2 = leia.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
        System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
        System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
        System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
        System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2) );


        leia.close();
    }







}
