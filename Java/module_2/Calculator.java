import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisiser un nombre a: ");
        int numberA = scanner.nextInt();
        
        System.out.println("Saisiser un nombre b: ");
        int numberB = scanner.nextInt();

        int amount = numberA+numberB;
        System.out.println("Voicis la somme: " + amount);

        int diff = numberA-numberB;
        System.out.println("Voicis la diff: " + diff);

        int produit = numberA*numberB;
        System.out.println("Voicis la produit: " + produit);

        if (numberB != 0) {
            System.out.println("Quotient : " + (numberA / numberB));
            System.out.println("Reste : " + (numberA % numberB));
        } else {
            System.out.println("Division par zéro impossible !");

        }
        
        scanner.close();

    }
}
