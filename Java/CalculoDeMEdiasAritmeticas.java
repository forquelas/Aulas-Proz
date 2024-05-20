public class CalculoDeMEdiasAritmeticas {
    public static void main (String[] args){
        double media1 = (8 + 9 + 7) /3;
        double media2 = (4 + 5 + 6) /3;
        double SomaDasMedias = (media1 + media2);
        double MediaDasMedias = (SomaDasMedias / 2);
        
        System.out.printf("Media1 = %.1f%n", media1);
        System.out.printf("Media2 = %.1f%n", media2);
        System.out.printf("A soma das medias = %.1f%n", SomaDasMedias);
        System.out.printf("Soma das medias = %.1f%n", MediaDasMedias);
    }
    
}
