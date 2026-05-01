package module_3;

public class StarGenerator {
    public static void main(String[] args) {
        int taille = 5;
        // // Triangle rectangle
        // System.out.println("--- Triangle rectangle ---");
        // for(int i = 1; i <= taille; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }
        // System.out.println("\n--- Pyramide ---");
        // for (int i = 1; i <= taille; i++){
        //     for(int j = 0; j< taille - i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j<2*i - 1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        System.out.println("\n--- Losange ---");
        for(int i = 1; i<= taille; i++){
            for (int j = 0; j < taille - i; j++) System.out.print(" ");
            for (int j = 0; j <2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = taille - 1; i >= 1; i--){
            for (int j = 0; j < taille - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
