import java.util.Scanner;

public class PiRayon {
    public static void main(String[] args) {
        
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Rayon d'un cercle: ");
        int rayon = scanner.nextInt();
        System.out.printf("Périmètre: " + 2 * PI * rayon);
        System.out.printf("Aire: " +  PI * rayon * rayon);
        scanner.close();
    }
}
