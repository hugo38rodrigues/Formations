package module_3;

public class main {

    public main(String[] args) {
     
        int note = 15;

        if (note >= 16) {
            System.out.println("Très bien !");
        } else if (note >= 14) {
            System.out.println("Bien !");
        } else if (note >= 12) {
            System.out.println("Assez bien");
        } else if (note >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }

        // ternaire
        int age = 20;
        String status= (age >= 18) ? "Majeur" : "Mineur";
        System.out.println(status);

        int jour = 3;
        switch (jour) {
            case 1: System.out.println("Lundi"); break;
            case 2: System.out.println("Mardi"); break;
            case 3: System.out.println("Mercredi"); break;
            case 4: System.out.println("Jeudi"); break;
            case 5: System.out.println("Vendredi"); break;
            case 6: System.out.println("Samedi"); break;
            case 7: System.out.println("Dimanche"); break;
            default: System.out.println("Jour invalide");
        }
        int jour2 = 4;
        // Switch amélioré (Java 14+) :
        String nomJour = switch (jour2) {
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            case 3 -> "Mercredi";
            case 4, 5 -> "Jour de semaine";
            case 6, 7 -> "Weekend";
            default -> "Invalide";
        };
        System.out.print(nomJour);

        for(int i = 0; i<= 10; i++){
            System.out.println("Itération " + i);
        }

        int nombre = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }

        // Boucle while : on ne connaît pas le nombre d'itérations
        int somme = 0;
        int nombre2 = 1;
        while (somme < 100) {
            somme += nombre2;
            nombre2++;
        }
        System.out.println("Il faut additionner jusqu'à " + (nombre2-1) + " pour dépasser 100");
        System.out.println("Somme = " + somme);

        
        // Scanner scanner = new Scanner(System.in);
        // int choix;
        // do {
        //     System.out.println("Menu :");
        //     System.out.println("1. Option A");
        //     System.out.println("2. Option B");
        //     System.out.println("0. Quitter");
        //     System.out.print("Votre choix : ");
        //     choix = scanner.nextInt();

        //     switch (choix) {
        //         case 1: System.out.println("Option A sélectionnée"); break;
        //         case 2: System.out.println("Option B sélectionnée"); break;
        //         case 0: System.out.println("Au revoir !"); break;
        //         default: System.out.println("Choix invalide");
        //     }
        // } while (choix != 0);
        // scanner.close();

                // break : sort de la boucle immédiatement
        for (int i = 1; i <= 100; i++) {
            if (i * i > 50) {
                System.out.println("Premier carré > 50 : " + i + "² = " + (i*i));
                break;
            }
        }

        // continue : passe à l'itération suivante
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;  // Saute les multiples de 3
            System.out.print(i + " ");
        }
        // Affiche : 1 2 4 5 7 8 10 11 13 14 16 17 19 20
    }
}