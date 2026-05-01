package module_3;

import java.util.Random;
import java.util.Scanner;

public class GameQuestion {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int tentatives = 0;
        System.out.println("Deviner le nombre entre 1 et 100 ? ");
        int proposition;
        do{

            System.out.print("Votre proposition ? ");

            proposition = sc.nextInt();
            tentatives++;
            if(proposition<secret) {
                System.out.println("C'est plus grand");
            }else if(proposition> secret){
                System.out.println("C'est plus petit ");
            }
            
            
        }while (proposition!= secret);

        System.out.println("Bravo ! Trouvé en " + tentatives + " tentatives !");
            sc.close();
        

    }
}
