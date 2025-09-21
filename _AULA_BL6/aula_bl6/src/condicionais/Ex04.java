package condicionais;


import java.util.Scanner;

public class Ex04{

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = leia.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = leia.nextLine().toLowerCase();

        System.out.print("Digite a terceira palavra: ");
        String palavra3 = leia.nextLine().toLowerCase();

        // Estrutura principal
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("Águia");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("Pomba");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("Homem");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("Pulga");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("Lagarta");
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("Minhoca");
                }
            }
        } else {
            System.out.println("Animal não identificado.");
        }
    }
}