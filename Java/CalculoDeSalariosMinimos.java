import java.util.Scanner;

public class CalculoDeSalariosMinimos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double SalarioMinimo;
        double SalarioUsuario;
        double TotalSalario;

        System.out.print("Digite seu salario minimo: ");
        SalarioMinimo = sc.nextDouble();

        System.out.print("O salario do usuario é: ");
        SalarioUsuario = sc.nextDouble();

        TotalSalario = SalarioUsuario / SalarioMinimo;

        System.out.printf("A quantidade de salarios minimos é: %.2f", TotalSalario);     
        
        sc.close();
    }

}
