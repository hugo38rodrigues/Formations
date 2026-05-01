public class Declaration {
    public static void main(String[] args) {
        // 2.1.1 Déclaration et initialisation
        // Déclaration seule
        int nombre;

        // Déclaration + initialisation
        int age = 25;
        double salaire = 2500.50;
        boolean estEtudiant = true;
        char initiale='J';
        //Déclaration multiples du meme type
        int x=10, y=20, z=30;
        // Constantes (mot-clé final)
        final double PI = 3.14159265;
        final int MAX_ETUDIANTS = 30;
        //PI = 3.14; // ERREUR : impossible de modifier une constante
        
        // 2.1.2 Le type String (type référence)
        String nom = "Jean";
        String prenom = "Dupont";

        // Concaténation avec +
        String nomComplet = prenom + " " + nom;  // "Jean Dupont"

        // Méthodes utiles
        int longueur = nom.length();           // 4
        String majuscules = nom.toUpperCase();  // "JEAN"
        String minuscules = nom.toLowerCase();  // "jean"
        char premier = nom.charAt(0);           // 'J'
        boolean contient = nom.contains("ea");  // true
        String remplace = nom.replace("e", "a"); // "Jaan"
        
        // 2.2 Cours : Les opérateurs
        // 2.2.1 Opérateurs arithmétiques
        int a = 17, b = 5;
        int somme = a + b;       // 22
        int difference = a - b;  // 12
        int produit = a * b;     // 85
        int quotient = a / b;    // 3 (division entière !)
        int reste = a % b;       // 2 (modulo)

        // // Attention : division entre entiers = résultat entier
        double resultat = 17.0 / 5;  // 3.4 (un des opérandes est double)
        int d = 5;
        int f = d++;  
        int g = ++d;   
        System.out.println("d: "+d);
        System.out.println("f: "+f);
        System.out.println("g: "+ g);
        
    

    }
}