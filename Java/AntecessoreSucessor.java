import java.util.Scanner;

public class AntecessoreSucessor {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int antecessor;
        int sucessor;
        int numero;

        System.out.printf("Digite um numero:");
        numero = sc.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("Antecessor é %d%n", antecessor);
        System.out.printf("Sucessor é %d%n", sucessor);

        sc.close();

    }
    
}
