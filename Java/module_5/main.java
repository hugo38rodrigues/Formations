package module_5;

public class main {
    static void afficherBonjour(String nom){
        System.out.println("Bonjour " + nom + " !" );
    }
    
    static double calculerAire(double rayon){
        return Math.PI*rayon*rayon;
    }

    static double calculerMoyenn(double[]notes){
        double somme = 0;
        for(double note: notes) somme+=note;
        return somme/notes.length;
    }
    public static void main(String[] args) {
        afficherBonjour("Jean");
        double aire = calculerAire(5.0);
        System.out.println("Aire: "+ aire);
        double[] mesNotes = {15,12,18,14};
        System.out.println("Moyennes : " + calculerMoyenn(mesNotes));
    }
}
