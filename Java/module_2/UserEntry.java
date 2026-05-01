import java.util.Scanner;  // Import nécessaire !

public class UserEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre taille (en m) : ");
        double taille = scanner.nextDouble();

        System.out.println("Bonjour " + nom + ", vous avez " + age + " ans !");

        scanner.close();  // Toujours fermer le Scanner
    }
}