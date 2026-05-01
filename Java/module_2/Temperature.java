import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Temperature en Celsius: ");
        double newTempC = scanner.nextDouble();

        System.out.print("Temperature en Fahrenheit: ");
        double newTempF = scanner.nextDouble();

        double tempF = newTempC * 9/5 + 32;
        double tempC = (newTempF - 32) * 5/9;
        
        System.out.printf("F°: " + tempF);
        System.out.printf("C°: " + tempC);
        
        scanner.close();

    }
}
