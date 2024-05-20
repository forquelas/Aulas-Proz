import java.util.Scanner;

public class ConversaoDeIdadeEmDias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ano;
        int mes;
        int dias;
        int total;

        System.out.println("anos:");
        ano = sc.nextInt();

        System.out.println("mes:");
        mes = sc.nextInt();

        System.out.println("dias:");
        dias = sc.nextInt();

        total = (ano * 365) + (mes * 30) + dias;
        System.out.println(total);

        sc.close();

    }
}
