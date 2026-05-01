package module_3;

import java.util.Scanner;

public class ImpairOrPair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez rentrez un nombre: ");
        int number = scanner.nextInt();
        
        System.out.println(number+" est " + (number%2 == 0 ? "Paire" : "Impair"));
        System.out.println(number+" est " + (number > 0 ? "Positif" : "Négatif"));
        System.out.println(number+" est " + (number % 3 == 0 ? "divisible par 3" : "non divisible par 3"));
        
        scanner.close();
    }
}