package operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int numero = 4;
        // mesma coisa que numero = numero + 2;
        //System.out.println(numero += 2);

        System.out.println(numero *= 2);
        System.out.println(numero = numero * 2);
    }
}