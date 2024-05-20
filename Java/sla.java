import java.io.IOException;
import java.util.Scanner;

public class sla {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            String conceito;

            if (N >= 90 && N <= 100) {
                conceito = "A";
            } else if (N >= 80 && N <= 89) {
                conceito = "B";
            } else if (N >= 70 && N <= 79) {
                conceito = "C";
            } else if (N >= 60 && N <= 69) {
                conceito = "D";
            } else {
                conceito = "E";
            }

            System.out.println(conceito);
        }

        scanner.close();
    }
}

 