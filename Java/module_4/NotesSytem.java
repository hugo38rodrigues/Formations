import java.util.Scanner;

public class NotesSytem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre d'étudiant: ");
        int nbEtudiants = sc.nextInt();
        System.out.print("Nombre de matières: ");
        int nbMatieres = sc.nextInt();
        sc.nextLine();

        String[] noms = new String[nbEtudiants];
        String[] matieres = new String[nbMatieres];
        double [][] notes = new double[nbEtudiants][nbMatieres];
        
        for(int j = 0; j < nbMatieres; j++){
            System.out.print("Nom de la matieres" + (j+1) + ":");
            matieres[j]=sc.nextLine();
        }

        // Saisie des noms et notes
        for (int i = 0; i < nbEtudiants; i++) {
            System.out.print("\nNom étudiant " + (i+1) + " : ");
            noms[i] = sc.nextLine();
            for (int j = 0; j < nbMatieres; j++) {
                System.out.print("  Note en " + matieres[j] + " : ");
                notes[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        // Affichage du bulletin
        System.out.println("\n========== BULLETIN DE CLASSE ==========");
        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println("\n--- " + noms[i] + " ---");
            double somme = 0;
            for (int j = 0; j < nbMatieres; j++) {
                System.out.println("  " + matieres[j] + " : " + notes[i][j]);
                somme += notes[i][j];
            }
            double moy = somme / nbMatieres;
            System.out.printf("  Moyenne : %.2f%n", moy);
            if (moy >= 16) System.out.println("  Mention : Très Bien");
            else if (moy >= 14) System.out.println("  Mention : Bien");
            else if (moy >= 12) System.out.println("  Mention : Assez Bien");
            else if (moy >= 10) System.out.println("  Mention : Passable");
            else System.out.println("  Résultat : Ajourné");
        }

        // Moyennes par matière
        System.out.println("\n========== MOYENNES PAR MATIÈRE ==========");
        for (int j = 0; j < nbMatieres; j++) {
            double somme = 0;
            double min = 20, max = 0;
            for (int i = 0; i < nbEtudiants; i++) {
                somme += notes[i][j];
                if (notes[i][j] < min) min = notes[i][j];
                if (notes[i][j] > max) max = notes[i][j];
            }
            System.out.printf("%s : Moy=%.2f | Min=%.1f | Max=%.1f%n",
                matieres[j], somme/nbEtudiants, min, max);
        }
        sc.close();
    
    }
}