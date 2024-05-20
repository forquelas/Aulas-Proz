import java.util.Scanner;

public class ReajusteDeSaldo {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double saldo;
        double SaldoReajustado;

        System.out.println("Informe um saldo:");
        saldo = sc.nextDouble();

        SaldoReajustado = saldo * 0.01 + saldo;
        System.out.printf("%.2f", SaldoReajustado);

        sc.close();

    }
}
