import java.util.Scanner;

public class payrollCalculator {

    public static void main(String[] args) {
        final double TAUX_SECU = 0.22;       // 22% charges sociales
        final double TAUX_RETRAITE = 0.10;    // 10% cotisation retraite
        final double TAUX_CSG = 0.098;        // 9.8% CSG
        final double HEURES_NORMALES = 35.0;
        final double TAUX_HEURES_SUP = 1.25;  // Majoration 25%

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CALCUL DE PAIE ===");
        System.out.print("Nom de l'employé : ");
        String name = scanner.nextLine();
        System.out.print("Taux horaire (euro) :  ");
        double tauxHoraire = scanner.nextDouble();
        System.out.print("Heure travaillées cette semaine : ");
        double heuresTravaillees = scanner.nextDouble();
        // calcul heures normales et suplémentaire
        double heuresNormales = Math.min(heuresTravaillees, HEURES_NORMALES);
        double heuresSup = Math.max(0, heuresTravaillees - HEURES_NORMALES);
        // Salaire brut
        double salaireBrutNormal = heuresNormales * tauxHoraire;
        double salaireBrutSup = heuresSup * tauxHoraire * TAUX_HEURES_SUP;
        double salaireBrut = salaireBrutNormal + salaireBrutSup;
        double chargesSecu = salaireBrut * TAUX_SECU;
        double chargesRetraite = salaireBrut * TAUX_RETRAITE;
        double chargesCSG = salaireBrut * TAUX_CSG;
        double totalCharges = chargesCSG + chargesRetraite + chargesSecu;

        double salaireNet = salaireBrut - totalCharges;

        System.out.println("\n=== FICHE DE PAIE ===");
        System.out.println("Employé : " + name);
        System.out.println("Heures normales : " + heuresNormales + "h");
        System.out.println("Heures sup : " + heuresSup + "h");
        System.out.println("---");
        System.out.println("Salaire brut : " + salaireBrut + " euros");
        System.out.println("  Charges sécu : -" + chargesSecu + " euros");
        System.out.println("  Retraite : -" + chargesRetraite + " euros");
        System.out.println("  CSG : -" + chargesCSG + " euros");
        System.out.println("---");
        System.out.println("SALAIRE NET : " + salaireNet + " euros");
        System.out.println("====================");

        scanner.close();

    }
}