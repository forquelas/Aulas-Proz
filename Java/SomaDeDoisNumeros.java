import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N1;
        int N2;
        int total;
        
        System.out.println("Insira o primeiro numero:");
        N1 = sc.nextInt();

        System.out.println("Insira o segundo numero:");
        N2 = sc.nextInt();
        
        total = N1 + N2;

        System.out.printf("A soma dos numeros é: %d", total);

        sc.close();
    }
}
