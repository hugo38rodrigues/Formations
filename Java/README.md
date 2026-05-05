# FORMATION COMPLÈTE JAVA
## Du débutant au développeur confirmé

> **Cours | Exercices corrigés | TP guidés | Projet Portfolio**
> **14 modules progressifs**

---

*Formation conçue pour un apprentissage autonome et professionnel*

> **📘 Guide d'utilisation**
> Cette formation est structurée en 14 modules progressifs. Chaque module contient : un cours théorique détaillé, des exercices avec corrections, un TP guidé pas à pas, et un mini-projet. Le Module 14 est un projet final complet pour votre portfolio. Suivez les modules dans l'ordre pour une progression optimale.

---

## Table des matières

- [MODULE 1 : Introduction à Java et environnement de développement](#module-1--introduction-à-java-et-environnement-de-développement)
- [MODULE 2 : Variables, types de données et opérateurs](#module-2--variables-types-de-données-et-opérateurs)
- [MODULE 3 : Structures de contrôle](#module-3--structures-de-contrôle)
- [MODULE 4 : Tableaux et chaînes de caractères](#module-4--tableaux-et-chaînes-de-caractères)
- [MODULE 5 : Les méthodes (fonctions)](#module-5--les-méthodes-fonctions)
- [MODULE 6 : Programmation Orientée Objet - Les bases](#module-6--programmation-orientée-objet---les-bases)
- [MODULE 7 : Héritage et Polymorphisme](#module-7--héritage-et-polymorphisme)
- [MODULE 8 : Classes abstraites et Interfaces](#module-8--classes-abstraites-et-interfaces)
- [MODULE 9 : Gestion des exceptions](#module-9--gestion-des-exceptions)
- [MODULE 10 : Les Collections (List, Set, Map)](#module-10--les-collections-list-set-map)
- [MODULE 11 : Fichiers et Entrées/Sorties (I/O)](#module-11--fichiers-et-entréessorties-io)
- [MODULE 12 : Génériques (Generics)](#module-12--génériques-generics)
- [MODULE 13 : Expressions Lambda et Streams](#module-13--expressions-lambda-et-streams)
- [MODULE 14 : Projet Final Portfolio - Gestionnaire de Tâches](#module-14--projet-final-portfolio---gestionnaire-de-tâches)

---

# MODULE 1 : Introduction à Java et environnement de développement

> **🎯 Objectifs du module**
> Comprendre l'histoire et la philosophie de Java. Installer le JDK et un IDE. Écrire, compiler et exécuter votre premier programme Java. Comprendre la structure d'un programme Java.

## 1.1 Cours : Qu'est-ce que Java ?

Java est un langage de programmation orienté objet créé par James Gosling chez Sun Microsystems en 1995. Aujourd'hui maintenu par Oracle, Java est l'un des langages les plus utilisés au monde, présent dans les applications d'entreprise, les applications Android, le Big Data, et bien plus.

### 1.1.1 Les principes fondamentaux de Java

Java repose sur un principe fondateur : **"Write Once, Run Anywhere"** (WORA). Cela signifie qu'un programme Java compilé une seule fois peut s'exécuter sur n'importe quelle machine disposant d'une JVM (Java Virtual Machine). Contrairement au C ou C++, Java ne compile pas directement en code machine natif mais en **bytecode**, un format intermédiaire interprété par la JVM.

### 1.1.2 L'écosystème Java

**JDK (Java Development Kit) :** C'est le kit complet pour développer en Java. Il contient le compilateur (javac), la JVM, les bibliothèques standard, et des outils de diagnostic. C'est ce que vous devez installer pour programmer.

**JRE (Java Runtime Environment) :** C'est l'environnement d'exécution. Il contient la JVM et les bibliothèques nécessaires pour exécuter un programme Java, mais pas le compilateur. Depuis Java 11, le JRE n'est plus distribué séparément.

**JVM (Java Virtual Machine) :** C'est le moteur qui exécute le bytecode Java. Chaque système d'exploitation a sa propre implémentation de la JVM, ce qui garantit la portabilité des programmes.

### 1.1.3 Le processus de compilation

Voici comment un programme Java est exécuté :

1. Vous écrivez du code source dans un fichier `.java`
2. Le compilateur `javac` transforme ce code en bytecode dans un fichier `.class`
3. La JVM interprète et exécute le bytecode

```
MonProgramme.java  -->  javac  -->  MonProgramme.class  -->  java  -->  Exécution
    (code source)     (compile)     (bytecode)           (JVM)      (résultat)
```

### 1.1.4 Installation de l'environnement

Pour commencer à programmer en Java, vous devez installer deux choses :

**1. Le JDK (Java 17 LTS recommandé) :** Téléchargez-le depuis le site d'Oracle (oracle.com/java) ou utilisez une distribution open-source comme Eclipse Temurin (Adoptium). Après l'installation, vérifiez avec la commande :

```bash
java --version
javac --version
```

**2. Un IDE (Environnement de Développement Intégré) :** Je recommande IntelliJ IDEA Community (gratuit) pour sa facilité d'utilisation. Eclipse et VS Code avec l'extension Java sont aussi de bons choix.

## 1.2 Cours : Structure d'un programme Java

Tout programme Java s'organise autour de **classes**. Voici la structure minimale :

```java
public class Bonjour {
    public static void main(String[] args) {
        System.out.println("Bonjour le monde !");
    }
}
```

Analysons chaque élément :

- `public class Bonjour` : Déclare une classe publique nommée Bonjour. Le nom du fichier doit correspondre exactement au nom de la classe (Bonjour.java).
- `public static void main(String[] args)` : C'est le point d'entrée du programme. La JVM cherche cette méthode pour démarrer l'exécution. Elle doit avoir exactement cette signature.
- `System.out.println()` : Affiche du texte dans la console suivi d'un retour à la ligne. `System.out.print()` fait la même chose sans retour à la ligne.

### 1.2.1 Les commentaires

Les commentaires sont essentiels pour documenter votre code :

```java
// Ceci est un commentaire sur une ligne

/* Ceci est un commentaire
   sur plusieurs lignes */

/**
 * Ceci est un commentaire Javadoc
 * utilisé pour générer la documentation
 * @author VotreNom
 */
```

### 1.2.2 Les conventions de nommage

Java a des conventions strictes que tout développeur doit respecter :

| Élément | Convention | Exemple |
|---------|-----------|---------|
| Classe | PascalCase | `MaClasse`, `Etudiant` |
| Méthode | camelCase | `calculerMoyenne()` |
| Variable | camelCase | `monAge`, `nomComplet` |
| Constante | MAJUSCULES_SNAKE | `MAX_TAILLE`, `PI` |
| Package | tout en minuscules | `com.monprojet.utils` |

## 1.3 Exercices avec corrections

> **📝 Exercice 1**
> Écrivez un programme qui affiche votre nom, votre âge et votre ville sur trois lignes séparées.

<details>
<summary>✅ Correction Exercice 1</summary>

```java
public class Presentation {
    public static void main(String[] args) {
        System.out.println("Nom : Jean Dupont");
        System.out.println("Age : 25 ans");
        System.out.println("Ville : Paris");
    }
}
```

</details>

> **📝 Exercice 2**
> Écrivez un programme qui affiche un rectangle d'étoiles de 5 colonnes et 3 lignes en utilisant uniquement `System.out.println()`.

<details>
<summary>✅ Correction Exercice 2</summary>

```java
public class Rectangle {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
    }
}
```

</details>

> **📝 Exercice 3**
> Écrivez un programme qui affiche une carte de visite formatée avec des tirets et des barres verticales.

<details>
<summary>✅ Correction Exercice 3</summary>

```java
public class CarteVisite {
    public static void main(String[] args) {
        System.out.println("+-------------------------+");
        System.out.println("|     Jean DUPONT         |");
        System.out.println("|  Développeur Java       |");
        System.out.println("|  jean@email.com         |");
        System.out.println("|  Tél: 06 12 34 56 78    |");
        System.out.println("+-------------------------+");
    }
}
```

</details>

## 1.4 TP Guidé : Mon premier programme Java

Dans ce TP, nous allons créer, compiler et exécuter un programme Java en ligne de commande, puis dans un IDE.

### Étape 1 : Créer le fichier source

Créez un dossier pour votre projet, puis un fichier `PremierProgramme.java` :

```bash
mkdir FormationJava
cd FormationJava
```

```java
public class PremierProgramme {
    public static void main(String[] args) {
        System.out.println("=== Mon Premier Programme Java ===");
        System.out.println("Bienvenue dans la formation Java !");
        System.out.println("Aujourd'hui, je fais mes premiers pas.");
        System.out.println("Java version : " + System.getProperty("java.version"));
        System.out.println("Système : " + System.getProperty("os.name"));
        System.out.println("=================================");
    }
}
```

### Étape 2 : Compiler

Ouvrez un terminal dans le dossier et tapez :

```bash
javac PremierProgramme.java
```

Si aucune erreur n'apparaît, un fichier `PremierProgramme.class` a été créé. Vérifiez :

```bash
ls -la PremierProgramme.class
```

### Étape 3 : Exécuter

```bash
java PremierProgramme

# Sortie attendue :
# === Mon Premier Programme Java ===
# Bienvenue dans la formation Java !
# Aujourd'hui, je fais mes premiers pas.
# Java version : 17.0.x
# Système : Windows 10 (ou Linux, Mac...)
# =================================
```

### Étape 4 : Expérimenter

Modifiez le programme pour ajouter d'autres informations système :

```java
// Ajoutez ces lignes dans le main :
System.out.println("Utilisateur : " + System.getProperty("user.name"));
System.out.println("Dossier : " + System.getProperty("user.dir"));
System.out.println("Mémoire max : " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + " Mo");
```

Recompilez et ré-exécutez pour voir le résultat.

> **✅ Félicitations !**
> Vous avez écrit, compilé et exécuté votre premier programme Java. Vous comprenez maintenant le cycle de développement fondamental en Java.

---

# MODULE 2 : Variables, types de données et opérateurs

> **🎯 Objectifs du module**
> Maîtriser les types primitifs et les types références. Déclarer et initialiser des variables. Utiliser les opérateurs arithmétiques, de comparaison et logiques. Comprendre le casting et la conversion de types.

## 2.1 Cours : Les types primitifs

Java est un langage **fortement typé**. Chaque variable doit avoir un type déclaré. Java dispose de 8 types primitifs :

| Type | Taille | Plage | Exemple |
|------|--------|-------|---------|
| `byte` | 1 octet | -128 à 127 | `byte age = 25;` |
| `short` | 2 octets | -32768 à 32767 | `short annee = 2024;` |
| `int` | 4 octets | -2^31 à 2^31-1 | `int population = 67000000;` |
| `long` | 8 octets | -2^63 à 2^63-1 | `long distance = 384400000L;` |
| `float` | 4 octets | ~7 décimales | `float pi = 3.14f;` |
| `double` | 8 octets | ~15 décimales | `double prix = 19.99;` |
| `boolean` | 1 bit | true / false | `boolean actif = true;` |
| `char` | 2 octets | Caractère Unicode | `char lettre = 'A';` |

### 2.1.1 Déclaration et initialisation

```java
// Déclaration seule
int nombre;

// Déclaration + initialisation
int age = 25;
double salaire = 2500.50;
boolean estEtudiant = true;
char initiale = 'J';

// Déclarations multiples du même type
int x = 10, y = 20, z = 30;

// Constantes (mot-clé final)
final double PI = 3.14159265;
final int MAX_ETUDIANTS = 30;
// PI = 3.14; // ERREUR : impossible de modifier une constante
```

### 2.1.2 Le type String (type référence)

`String` n'est pas un type primitif mais une classe. C'est le type le plus utilisé pour manipuler du texte :

```java
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
```

## 2.2 Cours : Les opérateurs

### 2.2.1 Opérateurs arithmétiques

```java
int a = 17, b = 5;
int somme = a + b;       // 22
int difference = a - b;  // 12
int produit = a * b;     // 85
int quotient = a / b;    // 3 (division entière !)
int reste = a % b;       // 2 (modulo)

// Attention : division entre entiers = résultat entier
double resultat = 17.0 / 5;  // 3.4 (un des opérandes est double)
```

### 2.2.2 Opérateurs d'incrémentation

```java
int compteur = 10;
compteur++;    // compteur = 11 (post-incrémentation)
compteur--;    // compteur = 10 (post-décrémentation)
++compteur;    // compteur = 11 (pré-incrémentation)

// Différence entre pré et post :
int x = 5;
int y = x++;   // y = 5, x = 6 (x est incrémenté APRÈS l'affectation)
int z = ++x;   // z = 7, x = 7 (x est incrémenté AVANT l'affectation)
```

### 2.2.3 Opérateurs de comparaison et logiques

```java
// Comparaison (retournent un boolean)
int age = 20;
boolean majeur = age >= 18;      // true
boolean egal = age == 20;        // true
boolean different = age != 25;   // true

// Opérateurs logiques
boolean a2 = true, b2 = false;
boolean et = a2 && b2;      // false (ET logique)
boolean ou = a2 || b2;      // true  (OU logique)
boolean non = !a2;           // false (NON logique)

// Exemple pratique
int note = 15;
boolean mention = note >= 12 && note < 14;  // false
```

### 2.2.4 Le casting (conversion de types)

```java
// Casting implicite (widening) : petit -> grand
int entier = 42;
double decimal = entier;  // 42.0 (automatique, pas de perte)

// Casting explicite (narrowing) : grand -> petit
double prix = 19.99;
int prixArrondi = (int) prix;  // 19 (troncature, perte de précision !)

// Conversion String <-> nombres
int n = Integer.parseInt("42");           // String -> int
double d = Double.parseDouble("3.14");    // String -> double
String s = String.valueOf(42);             // int -> String
String s2 = Integer.toString(42);          // int -> String (équivalent)
```

## 2.3 Cours : L'entrée utilisateur avec Scanner

```java
import java.util.Scanner;  // Import nécessaire !

public class EntreeUtilisateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre taille (en m) : ");
        double taille = scanner.nextDouble();

        System.out.println("Bonjour " + nom + ", vous avez " + age + " ans !");

        scanner.close();  // Toujours fermer le Scanner
    }
}
```

> **⚠️ Attention**
> Après un `nextInt()` ou `nextDouble()`, il reste un retour à la ligne dans le buffer. Si vous appelez `nextLine()` ensuite, il lira une chaîne vide. Solution : ajoutez un `scanner.nextLine()` supplémentaire après `nextInt()`/`nextDouble()`.

## 2.4 Exercices avec corrections

> **📝 Exercice 1**
> Écrivez un programme qui demande à l'utilisateur deux nombres entiers et affiche leur somme, différence, produit, quotient et reste de la division.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Premier nombre : ");
        int a = scanner.nextInt();
        System.out.print("Deuxième nombre : ");
        int b = scanner.nextInt();

        System.out.println("Somme : " + (a + b));
        System.out.println("Différence : " + (a - b));
        System.out.println("Produit : " + (a * b));
        if (b != 0) {
            System.out.println("Quotient : " + (a / b));
            System.out.println("Reste : " + (a % b));
        } else {
            System.out.println("Division par zéro impossible !");
        }
        scanner.close();
    }
}
```

</details>

> **📝 Exercice 2**
> Écrivez un programme qui demande le rayon d'un cercle et affiche son périmètre et son aire. (Périmètre = 2 * PI * r, Aire = PI * r²)

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;

public class Cercle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159265;

        System.out.print("Rayon du cercle : ");
        double rayon = scanner.nextDouble();

        double perimetre = 2 * PI * rayon;
        double aire = PI * rayon * rayon;

        System.out.println("Périmètre : " + perimetre);
        System.out.println("Aire : " + aire);
        scanner.close();
    }
}
```

</details>

> **📝 Exercice 3**
> Écrivez un programme qui convertit une température de Celsius en Fahrenheit et inversement. Formule : F = C × 9/5 + 32

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Température en Celsius : ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        System.out.print("Température en Fahrenheit : ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println(fahrenheit + " °F = " + celsius + " °C");
        scanner.close();
    }
}
```

</details>

## 2.5 TP Guidé : Calculateur de paie simplifié

Nous allons créer un programme qui calcule le salaire net d'un employé.

### Étape 1 : Définir les constantes

```java
import java.util.Scanner;

public class CalculPaie {
    public static void main(String[] args) {
        // Constantes
        final double TAUX_SECU = 0.22;       // 22% charges sociales
        final double TAUX_RETRAITE = 0.10;    // 10% cotisation retraite
        final double TAUX_CSG = 0.098;        // 9.8% CSG
        final double HEURES_NORMALES = 35.0;
        final double TAUX_HEURES_SUP = 1.25;  // Majoration 25%
```

### Étape 2 : Saisir les informations

```java
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCUL DE PAIE ===");
        System.out.print("Nom de l'employé : ");
        String nom = scanner.nextLine();

        System.out.print("Taux horaire (euros) : ");
        double tauxHoraire = scanner.nextDouble();

        System.out.print("Heures travaillées cette semaine : ");
        double heuresTravaillees = scanner.nextDouble();
```

### Étape 3 : Calculer le salaire brut

```java
        // Calcul des heures normales et supplémentaires
        double heuresNormales = Math.min(heuresTravaillees, HEURES_NORMALES);
        double heuresSup = Math.max(0, heuresTravaillees - HEURES_NORMALES);

        // Salaire brut
        double salaireBrutNormal = heuresNormales * tauxHoraire;
        double salaireBrutSup = heuresSup * tauxHoraire * TAUX_HEURES_SUP;
        double salaireBrut = salaireBrutNormal + salaireBrutSup;
```

### Étape 4 : Calculer les charges et le net

```java
        // Charges
        double chargesSecu = salaireBrut * TAUX_SECU;
        double chargesRetraite = salaireBrut * TAUX_RETRAITE;
        double chargesCSG = salaireBrut * TAUX_CSG;
        double totalCharges = chargesSecu + chargesRetraite + chargesCSG;

        // Salaire net
        double salaireNet = salaireBrut - totalCharges;
```

### Étape 5 : Afficher la fiche de paie

```java
        System.out.println("\n=== FICHE DE PAIE ===");
        System.out.println("Employé : " + nom);
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
```

> **✅ Bravo !**
> Vous maîtrisez maintenant les variables, les types et les opérateurs. Vous savez lire l'entrée utilisateur et effectuer des calculs.

---

# MODULE 3 : Structures de contrôle

> **🎯 Objectifs du module**
> Maîtriser les conditions (if, else, switch). Comprendre et utiliser les boucles (for, while, do-while). Utiliser break et continue. Imbriquer des structures de contrôle.

## 3.1 Cours : Les structures conditionnelles

### 3.1.1 if, else if, else

```java
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
```

### 3.1.2 L'opérateur ternaire

C'est un raccourci pour un if/else simple :

```java
int age = 20;
String statut = (age >= 18) ? "Majeur" : "Mineur";
System.out.println(statut);  // "Majeur"
```

### 3.1.3 Le switch

```java
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

// Switch amélioré (Java 14+) :
String nomJour = switch (jour) {
    case 1 -> "Lundi";
    case 2 -> "Mardi";
    case 3 -> "Mercredi";
    case 4, 5 -> "Jour de semaine";
    case 6, 7 -> "Weekend";
    default -> "Invalide";
};
```

## 3.2 Cours : Les boucles

### 3.2.1 La boucle for

```java
// Syntaxe : for (initialisation; condition; incrémentation)
for (int i = 1; i <= 10; i++) {
    System.out.println("Itération " + i);
}

// Table de multiplication
int nombre = 7;
for (int i = 1; i <= 10; i++) {
    System.out.println(nombre + " x " + i + " = " + (nombre * i));
}
```

### 3.2.2 La boucle while

```java
// Boucle while : on ne connaît pas le nombre d'itérations
int somme = 0;
int nombre2 = 1;
while (somme < 100) {
    somme += nombre2;
    nombre2++;
}
System.out.println("Il faut additionner jusqu'à " + (nombre2-1) + " pour dépasser 100");
System.out.println("Somme = " + somme);
```

### 3.2.3 La boucle do-while

La boucle do-while s'exécute **au moins une fois** avant de vérifier la condition :

```java
Scanner scanner = new Scanner(System.in);
int choix;
do {
    System.out.println("Menu :");
    System.out.println("1. Option A");
    System.out.println("2. Option B");
    System.out.println("0. Quitter");
    System.out.print("Votre choix : ");
    choix = scanner.nextInt();

    switch (choix) {
        case 1: System.out.println("Option A sélectionnée"); break;
        case 2: System.out.println("Option B sélectionnée"); break;
        case 0: System.out.println("Au revoir !"); break;
        default: System.out.println("Choix invalide");
    }
} while (choix != 0);
```

### 3.2.4 break et continue

```java
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
```

## 3.3 Exercices avec corrections

> **📝 Exercice 1**
> Écrivez un programme qui demande un nombre à l'utilisateur et affiche s'il est pair ou impair, positif ou négatif, et s'il est divisible par 3.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;
public class AnalyseNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();

        System.out.println(n + " est " + (n % 2 == 0 ? "pair" : "impair"));
        if (n > 0) System.out.println("Positif");
        else if (n < 0) System.out.println("Négatif");
        else System.out.println("Nul");
        System.out.println(n % 3 == 0 ? "Divisible par 3" : "Non divisible par 3");
        sc.close();
    }
}
```

</details>

> **📝 Exercice 2**
> Écrivez un programme qui affiche tous les nombres premiers entre 2 et 100.

<details>
<summary>✅ Correction</summary>

```java
public class NombresPremiers {
    public static void main(String[] args) {
        System.out.println("Nombres premiers entre 2 et 100 :");
        for (int n = 2; n <= 100; n++) {
            boolean estPremier = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    estPremier = false;
                    break;
                }
            }
            if (estPremier) System.out.print(n + " ");
        }
    }
}
```

</details>

> **📝 Exercice 3**
> Écrivez un programme de jeu de devinette : l'ordinateur choisit un nombre entre 1 et 100, l'utilisateur doit le deviner. Le programme indique "plus grand" ou "plus petit" et compte les tentatives.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;
import java.util.Random;

public class Devinette {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int tentatives = 0;
        int proposition;

        System.out.println("Je pense à un nombre entre 1 et 100...");
        do {
            System.out.print("Votre proposition : ");
            proposition = sc.nextInt();
            tentatives++;
            if (proposition < secret) System.out.println("C'est plus grand !");
            else if (proposition > secret) System.out.println("C'est plus petit !");
        } while (proposition != secret);

        System.out.println("Bravo ! Trouvé en " + tentatives + " tentatives !");
        sc.close();
    }
}
```

</details>

## 3.4 TP Guidé : Générateur de motifs ASCII

Nous allons créer un programme qui dessine des formes géométriques en ASCII.

### Étape 1 : Triangle rectangle

```java
public class MotifsASCII {
    public static void main(String[] args) {
        int taille = 5;

        // Triangle rectangle
        System.out.println("--- Triangle rectangle ---");
        for (int i = 1; i <= taille; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Sortie :
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
```

### Étape 2 : Pyramide centrée

```java
        System.out.println("\n--- Pyramide ---");
        for (int i = 1; i <= taille; i++) {
            // Espaces
            for (int j = 0; j < taille - i; j++) {
                System.out.print(" ");
            }
            // Étoiles
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Sortie :
        //     *
        //    ***
        //   *****
        //  *******
        // *********
```

### Étape 3 : Losange complet

```java
        System.out.println("\n--- Losange ---");
        // Partie haute
        for (int i = 1; i <= taille; i++) {
            for (int j = 0; j < taille - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        // Partie basse
        for (int i = taille - 1; i >= 1; i--) {
            for (int j = 0; j < taille - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
```

> **✅ Bravo !**
> Vous maîtrisez les structures de contrôle. Vous pouvez désormais créer des programmes avec de la logique complexe.

---

# MODULE 4 : Tableaux et chaînes de caractères

> **🎯 Objectifs du module**
> Créer et manipuler des tableaux à une et deux dimensions. Parcourir des tableaux avec les boucles. Maîtriser les méthodes de la classe String. Utiliser la classe Arrays pour les opérations courantes.

## 4.1 Cours : Les tableaux

### 4.1.1 Tableaux à une dimension

```java
// Déclaration et création
int[] notes = new int[5];        // Tableau de 5 entiers (initialisé à 0)
String[] prenoms = new String[3]; // Tableau de 3 Strings (initialisé à null)

// Déclaration + initialisation
int[] ages = {25, 30, 22, 28, 35};
String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi"};

// Accès aux éléments (indice commence à 0 !)
notes[0] = 15;  // Premier élément
notes[4] = 18;  // Dernier élément
// notes[5] = 20; // ERREUR ! ArrayIndexOutOfBoundsException

// Taille du tableau
System.out.println("Nombre d'éléments : " + notes.length);  // 5
```

### 4.1.2 Parcourir un tableau

```java
int[] notes = {15, 12, 18, 9, 14, 16};

// Boucle for classique
for (int i = 0; i < notes.length; i++) {
    System.out.println("Note " + (i+1) + " : " + notes[i]);
}

// Boucle for-each (plus simple pour lire)
for (int note : notes) {
    System.out.println("Note : " + note);
}

// Calcul de la moyenne
double somme = 0;
for (int note : notes) somme += note;
double moyenne = somme / notes.length;
System.out.println("Moyenne : " + moyenne);
```

### 4.1.3 Tableaux à deux dimensions

```java
// Matrice 3x3
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Parcourir une matrice
for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + "\t");
    }
    System.out.println();
}
```

### 4.1.4 La classe java.util.Arrays

```java
import java.util.Arrays;

int[] tab = {5, 2, 8, 1, 9, 3};

// Trier
Arrays.sort(tab);  // {1, 2, 3, 5, 8, 9}

// Afficher
System.out.println(Arrays.toString(tab));  // [1, 2, 3, 5, 8, 9]

// Rechercher (tableau doit être trié)
int index = Arrays.binarySearch(tab, 5);  // 3

// Remplir
int[] zeros = new int[10];
Arrays.fill(zeros, 0);

// Copier
int[] copie = Arrays.copyOf(tab, tab.length);

// Comparer
boolean egal = Arrays.equals(tab, copie);  // true
```

## 4.2 Cours : Manipulation avancée des Strings

```java
String texte = "  Formation Java Avancée  ";

// Suppression des espaces
String trim = texte.trim();  // "Formation Java Avancée"

// Sous-chaîne
String sub = trim.substring(10, 14);  // "Java"

// Découper
String csv = "Jean;25;Paris;Développeur";
String[] parties = csv.split(";");
// parties = ["Jean", "25", "Paris", "Développeur"]

// Joindre
String rejoint = String.join(" - ", parties);
// "Jean - 25 - Paris - Développeur"

// Comparer (JAMAIS == pour les Strings !)
String a = "Bonjour";
String b = "bonjour";
boolean egal = a.equals(b);            // false
boolean egalIgnore = a.equalsIgnoreCase(b);  // true

// StringBuilder pour la concaténation intensive
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("ligne ").append(i).append("\n");
}
String resultat = sb.toString();
```

## 4.3 Exercices avec corrections

> **📝 Exercice 1**
> Écrivez un programme qui trouve le minimum, le maximum et la moyenne d'un tableau d'entiers saisi par l'utilisateur.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;
public class StatistiquesTableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Combien de nombres ? ");
        int n = sc.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i+1) + " : ");
            tab[i] = sc.nextInt();
        }

        int min = tab[0], max = tab[0];
        double somme = 0;
        for (int val : tab) {
            if (val < min) min = val;
            if (val > max) max = val;
            somme += val;
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Moyenne : " + (somme / n));
        sc.close();
    }
}
```

</details>

> **📝 Exercice 2**
> Écrivez un programme qui inverse un tableau d'entiers (sans utiliser de tableau supplémentaire, en échangeant les éléments en place).

<details>
<summary>✅ Correction</summary>

```java
import java.util.Arrays;
public class InverserTableau {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Avant : " + Arrays.toString(tab));

        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
        System.out.println("Après : " + Arrays.toString(tab));
    }
}
```

</details>

> **📝 Exercice 3**
> Écrivez un programme qui compte le nombre d'occurrences de chaque mot dans une phrase saisie par l'utilisateur.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;
public class CompterMots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String[] mots = sc.nextLine().toLowerCase().split(" ");
        boolean[] dejaCompte = new boolean[mots.length];

        for (int i = 0; i < mots.length; i++) {
            if (dejaCompte[i]) continue;
            int count = 0;
            for (int j = i; j < mots.length; j++) {
                if (mots[j].equals(mots[i])) {
                    count++;
                    dejaCompte[j] = true;
                }
            }
            System.out.println("\"" + mots[i] + "\" : " + count + " fois");
        }
        sc.close();
    }
}
```

</details>

## 4.4 TP Guidé : Système de gestion de notes

Nous allons créer un programme complet de gestion de notes pour une classe d'étudiants.

```java
import java.util.Scanner;
import java.util.Arrays;

public class GestionNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Configuration
        System.out.print("Nombre d'étudiants : ");
        int nbEtudiants = sc.nextInt();
        System.out.print("Nombre de matières : ");
        int nbMatieres = sc.nextInt();
        sc.nextLine(); // Vider le buffer

        String[] noms = new String[nbEtudiants];
        String[] matieres = new String[nbMatieres];
        double[][] notes = new double[nbEtudiants][nbMatieres];

        // Saisie des matières
        for (int j = 0; j < nbMatieres; j++) {
            System.out.print("Nom de la matière " + (j+1) + " : ");
            matieres[j] = sc.nextLine();
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
```

> **✅ Bravo !**
> Vous maîtrisez les tableaux et les chaînes de caractères.

---

# MODULE 5 : Les méthodes (fonctions)

> **🎯 Objectifs du module**
> Comprendre le rôle des méthodes. Créer des méthodes avec et sans retour. Comprendre les paramètres et la portée des variables. Utiliser la surcharge de méthodes et la récursivité.

## 5.1 Cours : Pourquoi les méthodes ?

Les méthodes permettent de décomposer un programme en blocs réutilisables. Elles améliorent la lisibilité, évitent la duplication de code et facilitent la maintenance.

### 5.1.1 Structure d'une méthode

```java
public class Methodes {

    // Méthode sans retour (void)
    static void afficherBonjour(String nom) {
        System.out.println("Bonjour " + nom + " !");
    }

    // Méthode avec retour
    static double calculerAire(double rayon) {
        return Math.PI * rayon * rayon;
    }

    // Méthode avec plusieurs paramètres
    static double calculerMoyenne(double[] notes) {
        double somme = 0;
        for (double note : notes) somme += note;
        return somme / notes.length;
    }

    public static void main(String[] args) {
        afficherBonjour("Jean");
        double aire = calculerAire(5.0);
        System.out.println("Aire : " + aire);

        double[] mesNotes = {15, 12, 18, 14};
        System.out.println("Moyenne : " + calculerMoyenne(mesNotes));
    }
}
```

### 5.1.2 Portée des variables

```java
static void exemple() {
    int x = 10;  // Variable locale à cette méthode
    if (x > 5) {
        int y = 20;  // Variable locale au bloc if
        System.out.println(x + y);  // OK
    }
    // System.out.println(y); // ERREUR : y n'existe plus ici !
}
```

### 5.1.3 La surcharge de méthodes (overloading)

Java permet d'avoir plusieurs méthodes avec le même nom si elles ont des paramètres différents :

```java
static int additionner(int a, int b) {
    return a + b;
}

static double additionner(double a, double b) {
    return a + b;
}

static int additionner(int a, int b, int c) {
    return a + b + c;
}

// Java choisit la bonne méthode selon les arguments
additionner(3, 5);        // Appelle la version int, int
additionner(3.5, 2.1);    // Appelle la version double, double
additionner(1, 2, 3);     // Appelle la version int, int, int
```

### 5.1.4 La récursivité

```java
// Factorielle : n! = n * (n-1) * ... * 1
static long factorielle(int n) {
    if (n <= 1) return 1;          // Cas de base
    return n * factorielle(n - 1);  // Appel récursif
}

// Fibonacci : F(n) = F(n-1) + F(n-2)
static int fibonacci(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Attention : la récursivité peut être coûteuse !
// fibonacci(40) est très lent avec cette approche naïve.
```

## 5.2 Exercices avec corrections

> **📝 Exercice 1**
> Créez une méthode `estPalindrome(String mot)` qui vérifie si un mot est un palindrome. Testez avec : radar, kayak, java.

<details>
<summary>✅ Correction</summary>

```java
public class Palindrome {
    static boolean estPalindrome(String mot) {
        mot = mot.toLowerCase();
        for (int i = 0; i < mot.length() / 2; i++) {
            if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] mots = {"radar", "kayak", "java", "ressasser"};
        for (String mot : mots) {
            System.out.println(mot + " : " + (estPalindrome(mot) ? "palindrome" : "non"));
        }
    }
}
```

</details>

> **📝 Exercice 2**
> Créez une méthode `triSelection(int[] tab)` qui trie un tableau par sélection.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Arrays;
public class TriSelection {
    static void triSelection(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[indexMin]) indexMin = j;
            }
            int temp = tab[i];
            tab[i] = tab[indexMin];
            tab[indexMin] = temp;
        }
    }

    public static void main(String[] args) {
        int[] tab = {64, 25, 12, 22, 11};
        System.out.println("Avant : " + Arrays.toString(tab));
        triSelection(tab);
        System.out.println("Après : " + Arrays.toString(tab));
    }
}
```

</details>

## 5.3 TP Guidé : Bibliothèque de fonctions mathématiques

```java
public class MathUtils {

    static int pgcd(int a, int b) {
        while (b != 0) { int temp = b; b = a % b; a = temp; }
        return a;
    }

    static int ppcm(int a, int b) {
        return Math.abs(a * b) / pgcd(a, b);
    }

    static boolean estPremier(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static double puissance(double base, int exposant) {
        if (exposant == 0) return 1;
        if (exposant < 0) return 1.0 / puissance(base, -exposant);
        double demi = puissance(base, exposant / 2);
        return exposant % 2 == 0 ? demi * demi : demi * demi * base;
    }

    static int[] decomposerEnFacteurs(int n) {
        int[] facteurs = new int[100];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                facteurs[index++] = i;
                n /= i;
            }
        }
        int[] resultat = new int[index];
        System.arraycopy(facteurs, 0, resultat, 0, index);
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println("PGCD(48,18) = " + pgcd(48, 18));
        System.out.println("PPCM(12,8) = " + ppcm(12, 8));
        System.out.println("17 est premier ? " + estPremier(17));
        System.out.println("2^10 = " + puissance(2, 10));
        System.out.println("Facteurs de 360 : " + java.util.Arrays.toString(decomposerEnFacteurs(360)));
    }
}
```

> **✅ Bravo !**
> Vous savez créer et utiliser des méthodes. Nous abordons maintenant le cœur de Java : la Programmation Orientée Objet.

---

# MODULE 6 : Programmation Orientée Objet - Les bases

> **🎯 Objectifs du module**
> Comprendre les concepts de classe et d'objet. Créer des classes avec des attributs et des méthodes. Maîtriser les constructeurs. Comprendre l'encapsulation et les accesseurs (getters/setters). Utiliser le mot-clé `this` et les méthodes `toString`/`equals`.

## 6.1 Cours : Classes et Objets

La POO est le paradigme central de Java. Une **classe** est un modèle (un plan) qui définit les propriétés (attributs) et les comportements (méthodes) d'un type d'objet. Un **objet** est une instance concrète d'une classe.

### 6.1.1 Votre première classe

```java
public class Etudiant {
    // Attributs (propriétés)
    private String nom;
    private String prenom;
    private int age;
    private double[] notes;
    private int nbNotes;

    // Constructeur
    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.notes = new double[20]; // Max 20 notes
        this.nbNotes = 0;
    }

    // Getters
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }

    // Setters
    public void setAge(int age) {
        if (age > 0 && age < 120) this.age = age;
    }

    // Méthodes métier
    public void ajouterNote(double note) {
        if (note >= 0 && note <= 20 && nbNotes < notes.length) {
            notes[nbNotes++] = note;
        }
    }

    public double getMoyenne() {
        if (nbNotes == 0) return 0;
        double somme = 0;
        for (int i = 0; i < nbNotes; i++) somme += notes[i];
        return somme / nbNotes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (âge: " + age + ", moyenne: "
               + String.format("%.2f", getMoyenne()) + ")";
    }
}
```

### 6.1.2 Utiliser la classe

```java
public class TestEtudiant {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Dupont", "Jean", 20);
        Etudiant e2 = new Etudiant("Martin", "Marie", 22);

        e1.ajouterNote(15);
        e1.ajouterNote(12);
        e1.ajouterNote(18);

        e2.ajouterNote(16);
        e2.ajouterNote(14);

        System.out.println(e1);  // Appelle toString() automatiquement
        System.out.println(e2);

        System.out.println("Moyenne de " + e1.getPrenom() + " : " + e1.getMoyenne());
    }
}
```

### 6.1.3 L'encapsulation

L'encapsulation consiste à protéger les données internes d'une classe en les rendant privées (`private`) et en fournissant des méthodes publiques (getters/setters) pour y accéder de manière contrôlée.

| Modificateur | Accès |
|-------------|-------|
| `private` | Uniquement dans la classe elle-même |
| *(défaut)* | Dans le même package |
| `protected` | Même package + sous-classes |
| `public` | Partout |

### 6.1.4 Attributs et méthodes statiques

```java
public class Compteur {
    private static int totalInstances = 0;  // Partagé par toutes les instances
    private int id;

    public Compteur() {
        totalInstances++;
        this.id = totalInstances;
    }

    public static int getTotalInstances() {
        return totalInstances;  // Accessible sans créer d'objet
    }

    public String toString() { return "Compteur #" + id; }
}

// Utilisation :
Compteur c1 = new Compteur();
Compteur c2 = new Compteur();
System.out.println(Compteur.getTotalInstances());  // 2
```

## 6.2 Exercices avec corrections

> **📝 Exercice 1**
> Créez une classe `CompteBancaire` avec : titulaire (String), solde (double), un constructeur, des méthodes `deposer()`, `retirer()` (avec vérification du solde), et `afficherSolde()`.

<details>
<summary>✅ Correction</summary>

```java
public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " euros. Nouveau solde : " + solde);
        }
    }

    public boolean retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " euros. Nouveau solde : " + solde);
            return true;
        }
        System.out.println("Retrait impossible. Solde insuffisant.");
        return false;
    }

    public void afficherSolde() {
        System.out.println("Compte de " + titulaire + " : " + solde + " euros");
    }
}
```

</details>

## 6.3 TP Guidé : Gestion d'une bibliothèque

```java
public class Livre {
    private String titre;
    private String auteur;
    private int annee;
    private boolean emprunte;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.emprunte = false;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public boolean isEmprunte() { return emprunte; }

    public boolean emprunter() {
        if (!emprunte) { emprunte = true; return true; }
        return false;
    }

    public void retourner() { emprunte = false; }

    @Override
    public String toString() {
        return titre + " de " + auteur + " (" + annee + ")"
               + (emprunte ? " [EMPRUNTÉ]" : " [DISPONIBLE]");
    }
}
```

```java
public class Bibliotheque {
    private Livre[] livres;
    private int nbLivres;

    public Bibliotheque(int capacite) {
        livres = new Livre[capacite];
        nbLivres = 0;
    }

    public void ajouterLivre(Livre livre) {
        if (nbLivres < livres.length) livres[nbLivres++] = livre;
    }

    public Livre[] rechercherParAuteur(String auteur) {
        Livre[] resultats = new Livre[nbLivres];
        int count = 0;
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].getAuteur().equalsIgnoreCase(auteur))
                resultats[count++] = livres[i];
        }
        Livre[] ret = new Livre[count];
        System.arraycopy(resultats, 0, ret, 0, count);
        return ret;
    }

    public void afficherCatalogue() {
        System.out.println("=== CATALOGUE (" + nbLivres + " livres) ===");
        for (int i = 0; i < nbLivres; i++)
            System.out.println((i+1) + ". " + livres[i]);
    }
}
```

> **✅ Bravo !**
> Vous maîtrisez les bases de la POO en Java. Le module suivant introduit l'héritage et le polymorphisme.

---

# MODULE 7 : Héritage et Polymorphisme

> **🎯 Objectifs du module**
> Comprendre et implémenter l'héritage (extends). Maîtriser le polymorphisme et la redéfinition de méthodes (@Override). Utiliser super pour appeler le constructeur/méthodes parent. Comprendre le casting d'objets et l'opérateur instanceof.

## 7.1 Cours : L'héritage

L'héritage permet de créer une classe enfant qui hérite des attributs et méthodes d'une classe parent. C'est le mécanisme fondamental de la réutilisation en POO.

```java
// Classe parent (super-classe)
public class Personne {
    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void sePresenter() {
        System.out.println("Je suis " + prenom + " " + nom + ", " + age + " ans.");
    }

    @Override
    public String toString() { return prenom + " " + nom; }
}
```

```java
// Classe enfant (sous-classe)
public class Employe extends Personne {
    private String poste;
    private double salaire;

    public Employe(String nom, String prenom, int age, String poste, double salaire) {
        super(nom, prenom, age);  // Appel du constructeur parent
        this.poste = poste;
        this.salaire = salaire;
    }

    @Override  // Redéfinition de la méthode parent
    public void sePresenter() {
        super.sePresenter();  // Appel de la méthode parent
        System.out.println("Poste : " + poste + ", Salaire : " + salaire + " euros");
    }

    public double getSalaire() { return salaire; }
}
```

```java
public class Manager extends Employe {
    private int nbSubordonnes;

    public Manager(String nom, String prenom, int age, double salaire, int nbSub) {
        super(nom, prenom, age, "Manager", salaire);
        this.nbSubordonnes = nbSub;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.println("Équipe de " + nbSubordonnes + " personnes.");
    }
}
```

## 7.2 Cours : Le polymorphisme

Le polymorphisme permet de traiter des objets de classes différentes de manière uniforme via une référence de type parent :

```java
public class TestPolymorphisme {
    public static void main(String[] args) {
        // Polymorphisme : un type parent peut référencer un enfant
        Personne p1 = new Personne("Dupont", "Jean", 50);
        Personne p2 = new Employe("Martin", "Marie", 35, "Ingénieur", 4500);
        Personne p3 = new Manager("Petit", "Paul", 45, 6000, 10);

        // Tableau polymorphe
        Personne[] equipe = {p1, p2, p3};

        // Chaque objet appelle SA version de sePresenter()
        for (Personne p : equipe) {
            System.out.println("---");
            p.sePresenter();
        }

        // Vérification de type avec instanceof
        for (Personne p : equipe) {
            if (p instanceof Employe) {
                Employe e = (Employe) p;  // Downcasting
                System.out.println(p + " gagne " + e.getSalaire() + " euros");
            }
        }
    }
}
```

## 7.3 Exercices avec corrections

> **📝 Exercice 1**
> Créez une hiérarchie de classes : `Forme` (avec méthode `aire()`), `Rectangle`, `Cercle` qui héritent de Forme. Chaque sous-classe redéfinit `aire()`. Testez le polymorphisme dans un tableau.

<details>
<summary>✅ Correction</summary>

```java
public class Forme {
    protected String nom;
    public Forme(String nom) { this.nom = nom; }
    public double aire() { return 0; }
    public String toString() { return nom + " (aire=" + String.format("%.2f", aire()) + ")"; }
}

public class Rectangle extends Forme {
    private double largeur, hauteur;
    public Rectangle(double l, double h) { super("Rectangle"); largeur=l; hauteur=h; }
    @Override public double aire() { return largeur * hauteur; }
}

public class Cercle extends Forme {
    private double rayon;
    public Cercle(double r) { super("Cercle"); rayon = r; }
    @Override public double aire() { return Math.PI * rayon * rayon; }
}

// Test
Forme[] formes = { new Rectangle(5, 3), new Cercle(4), new Rectangle(10, 2) };
for (Forme f : formes) System.out.println(f);
```

</details>

## 7.4 TP Guidé : Système de véhicules

```java
public class Vehicule {
    protected String marque;
    protected int annee;
    protected double prixJour;

    public Vehicule(String marque, int annee, double prixJour) {
        this.marque = marque;
        this.annee = annee;
        this.prixJour = prixJour;
    }

    public double calculerLocation(int jours) { return prixJour * jours; }
    public String getType() { return "Véhicule"; }
    public String toString() { return getType() + " " + marque + " (" + annee + ")"; }
}

public class Voiture extends Vehicule {
    private int nbPlaces;
    public Voiture(String m, int a, double p, int places) { super(m,a,p); nbPlaces=places; }
    @Override public String getType() { return "Voiture"; }
    @Override public double calculerLocation(int jours) {
        return jours > 7 ? prixJour * jours * 0.9 : prixJour * jours; // -10% si > 7j
    }
}

public class Camion extends Vehicule {
    private double poidsMax;
    public Camion(String m, int a, double p, double poids) { super(m,a,p); poidsMax=poids; }
    @Override public String getType() { return "Camion"; }
    @Override public double calculerLocation(int jours) {
        return prixJour * jours + poidsMax * 5; // Supplément poids
    }
}
```

> **✅ Bravo !**
> L'héritage et le polymorphisme sont des piliers de Java.

---

# MODULE 8 : Classes abstraites et Interfaces

> **🎯 Objectifs du module**
> Comprendre les classes abstraites et quand les utiliser. Maîtriser les interfaces et l'implémentation multiple. Comprendre la différence entre classe abstraite et interface. Utiliser les interfaces fonctionnelles.

## 8.1 Cours : Classes abstraites

Une classe abstraite est une classe qui ne peut pas être instanciée directement. Elle sert de modèle pour ses sous-classes.

```java
public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode abstraite : doit être implémentée par les sous-classes
    public abstract String crier();
    public abstract String getEspece();

    // Méthode concrète : héritée telle quelle
    public void sePresenter() {
        System.out.println("Je suis " + nom + " le " + getEspece());
        System.out.println("Mon cri : " + crier());
    }
}

public class Chien extends Animal {
    public Chien(String nom, int age) { super(nom, age); }
    @Override public String crier() { return "Ouaf !"; }
    @Override public String getEspece() { return "chien"; }
}

public class Chat extends Animal {
    public Chat(String nom, int age) { super(nom, age); }
    @Override public String crier() { return "Miaou !"; }
    @Override public String getEspece() { return "chat"; }
}
```

## 8.2 Cours : Les interfaces

Une interface définit un **contrat** : un ensemble de méthodes qu'une classe doit implémenter. Une classe peut implémenter **plusieurs interfaces**.

```java
public interface Deplacable {
    void avancer(double distance);
    void tourner(double angle);
    double getVitesseMax();
}

public interface Rechargeable {
    void recharger();
    int getNiveauBatterie();
}

// Une classe peut implémenter plusieurs interfaces
public class VoitureElectrique extends Voiture implements Deplacable, Rechargeable {
    private int batterie = 100;

    @Override
    public void avancer(double distance) {
        batterie -= (int)(distance * 0.1);
        System.out.println("Avance de " + distance + " km. Batterie : " + batterie + "%");
    }

    @Override public void tourner(double angle) { /* ... */ }
    @Override public double getVitesseMax() { return 180; }
    @Override public void recharger() { batterie = 100; }
    @Override public int getNiveauBatterie() { return batterie; }
}
```

### 8.2.1 Méthodes par défaut (Java 8+)

```java
public interface Logger {
    void log(String message);

    // Méthode par défaut : implémentation fournie
    default void logInfo(String message) {
        log("[INFO] " + message);
    }

    default void logError(String message) {
        log("[ERREUR] " + message);
    }

    // Méthode statique dans l'interface
    static Logger consoleLogger() {
        return message -> System.out.println(message);
    }
}
```

## 8.3 Exercices avec corrections

> **📝 Exercice 1**
> Créez une classe `Produit` qui implémente `Comparable<Produit>` pour trier des produits par prix.

<details>
<summary>✅ Correction</summary>

```java
public class Produit implements Comparable<Produit> {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) { this.nom = nom; this.prix = prix; }

    @Override
    public int compareTo(Produit autre) {
        return Double.compare(this.prix, autre.prix);
    }

    public String toString() { return nom + " (" + prix + " EUR)"; }

    public static void main(String[] args) {
        Produit[] produits = {
            new Produit("Ordinateur", 999.99),
            new Produit("Souris", 29.99),
            new Produit("Clavier", 79.99)
        };
        java.util.Arrays.sort(produits);
        for (Produit p : produits) System.out.println(p);
    }
}
```

</details>

## 8.4 TP Guidé : Système de paiement

```java
public interface MoyenPaiement {
    boolean payer(double montant);
    String getDescription();
    double getSoldeDisponible();
}

public abstract class Carte implements MoyenPaiement {
    protected String numero;
    protected String titulaire;
    protected double plafond;
    protected double depenses;

    public Carte(String numero, String titulaire, double plafond) {
        this.numero = numero; this.titulaire = titulaire;
        this.plafond = plafond; this.depenses = 0;
    }

    @Override
    public boolean payer(double montant) {
        if (montant <= getSoldeDisponible()) { depenses += montant; return true; }
        return false;
    }

    @Override public double getSoldeDisponible() { return plafond - depenses; }
    protected String masquerNumero() { return "****" + numero.substring(numero.length()-4); }
}

public class CarteCredit extends Carte {
    public CarteCredit(String num, String tit, double plaf) { super(num, tit, plaf); }
    @Override public String getDescription() { return "CB " + masquerNumero(); }
}

public class PayPal implements MoyenPaiement {
    private String email;
    private double solde;

    public PayPal(String email, double solde) { this.email = email; this.solde = solde; }
    @Override public boolean payer(double montant) {
        if (montant <= solde) { solde -= montant; return true; } return false;
    }
    @Override public String getDescription() { return "PayPal (" + email + ")"; }
    @Override public double getSoldeDisponible() { return solde; }
}
```

> **✅ Bravo !**
> Vous maîtrisez les classes abstraites et les interfaces.

---

# MODULE 9 : Gestion des exceptions

> **🎯 Objectifs du module**
> Comprendre le mécanisme des exceptions. Utiliser try-catch-finally. Créer des exceptions personnalisées. Maîtriser les bonnes pratiques de gestion d'erreurs.

## 9.1 Cours : Les exceptions en Java

### 9.1.1 Hiérarchie des exceptions

```
Throwable
  +-- Error (erreurs système, ne pas attraper)
  |     +-- OutOfMemoryError
  |     +-- StackOverflowError
  +-- Exception
        +-- RuntimeException (non vérifiées / unchecked)
        |     +-- NullPointerException
        |     +-- ArrayIndexOutOfBoundsException
        |     +-- ArithmeticException
        |     +-- NumberFormatException
        +-- IOException (vérifiée / checked)
        +-- SQLException (vérifiée / checked)
```

### 9.1.2 try-catch-finally

```java
import java.util.Scanner;

public class GestionExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entrez un nombre : ");
            int nombre = Integer.parseInt(sc.nextLine());
            System.out.print("Entrez un diviseur : ");
            int diviseur = Integer.parseInt(sc.nextLine());
            int resultat = nombre / diviseur;
            System.out.println("Résultat : " + resultat);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : entrez un nombre valide !");
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro !");
        } finally {
            // Toujours exécuté, même en cas d'exception
            System.out.println("Fin du calcul.");
            sc.close();
        }
    }
}
```

### 9.1.3 Exceptions personnalisées

```java
public class SoldeInsuffisantException extends Exception {
    private double solde;
    private double montant;

    public SoldeInsuffisantException(double solde, double montant) {
        super("Solde insuffisant : " + solde + " euros, montant demandé : " + montant);
        this.solde = solde;
        this.montant = montant;
    }

    public double getSolde() { return solde; }
    public double getMontant() { return montant; }
}

// Utilisation dans une méthode :
public void retirer(double montant) throws SoldeInsuffisantException {
    if (montant > solde) throw new SoldeInsuffisantException(solde, montant);
    solde -= montant;
}
```

## 9.2 Exercices avec corrections

> **📝 Exercice 1**
> Créez un programme robuste qui lit un tableau de notes depuis l'entrée utilisateur. Gérez les cas : valeur non numérique, note hors [0,20], et tableau vide pour le calcul de la moyenne.

<details>
<summary>✅ Correction</summary>

```java
import java.util.Scanner;
import java.util.ArrayList;

public class NotesRobustes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notes = new ArrayList<>();
        System.out.println("Entrez des notes (tapez 'fin' pour terminer) :");

        while (true) {
            System.out.print("> ");
            String saisie = sc.nextLine().trim();
            if (saisie.equalsIgnoreCase("fin")) break;
            try {
                double note = Double.parseDouble(saisie);
                if (note < 0 || note > 20)
                    throw new IllegalArgumentException("Note hors limites [0-20]");
                notes.add(note);
            } catch (NumberFormatException e) {
                System.out.println("  -> Valeur non numérique, réessayez.");
            } catch (IllegalArgumentException e) {
                System.out.println("  -> " + e.getMessage());
            }
        }

        if (notes.isEmpty()) {
            System.out.println("Aucune note saisie.");
        } else {
            double somme = 0;
            for (double n : notes) somme += n;
            System.out.printf("Moyenne de %d notes : %.2f%n", notes.size(), somme/notes.size());
        }
    }
}
```

</details>

> **✅ Bravo !**
> Vous savez gérer les erreurs proprement en Java.

---

# MODULE 10 : Les Collections (List, Set, Map)

> **🎯 Objectifs du module**
> Maîtriser ArrayList, LinkedList. Utiliser HashSet, TreeSet. Comprendre HashMap, TreeMap. Choisir la bonne collection selon le besoin.

## 10.1 Cours : Le framework Collections

### 10.1.1 ArrayList

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<String> prenoms = new ArrayList<>();
prenoms.add("Alice");
prenoms.add("Bob");
prenoms.add("Charlie");
prenoms.add(1, "David");  // Insère à l'index 1

// Parcourir
for (String p : prenoms) System.out.println(p);

// Opérations courantes
prenoms.size();            // 4
prenoms.contains("Alice"); // true
prenoms.remove(0);         // Supprime l'élément à l'index 0
prenoms.remove("Bob");     // Supprime la première occurrence
prenoms.get(0);            // Accès par index
Collections.sort(prenoms); // Trier
```

### 10.1.2 HashMap

```java
import java.util.HashMap;
import java.util.Map;

HashMap<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 22);

// Accéder à une valeur
int ageAlice = ages.get("Alice");  // 25
ages.getOrDefault("David", 0);     // 0 (valeur par défaut)

// Parcourir
for (Map.Entry<String, Integer> entry : ages.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// Vérification
ages.containsKey("Alice");    // true
ages.containsValue(30);       // true
ages.size();                  // 3
```

### 10.1.3 HashSet

```java
import java.util.HashSet;

HashSet<String> ensemble = new HashSet<>();
ensemble.add("Java");
ensemble.add("Python");
ensemble.add("Java");     // Ignoré ! Pas de doublons
System.out.println(ensemble.size());  // 2

// Opérations ensemblistes
HashSet<String> a = new HashSet<>(java.util.Arrays.asList("A","B","C"));
HashSet<String> b = new HashSet<>(java.util.Arrays.asList("B","C","D"));

// Union
HashSet<String> union = new HashSet<>(a);
union.addAll(b);  // {A, B, C, D}

// Intersection
HashSet<String> inter = new HashSet<>(a);
inter.retainAll(b);  // {B, C}
```

## 10.2 Exercices avec corrections

> **📝 Exercice 1**
> Créez un programme qui lit un texte et compte la fréquence de chaque mot en utilisant une HashMap. Affichez les mots triés par fréquence décroissante.

<details>
<summary>✅ Correction</summary>

```java
import java.util.*;

public class FrequenceMots {
    public static void main(String[] args) {
        String texte = "le chat mange le poisson le chat dort le chien joue";
        String[] mots = texte.toLowerCase().split(" ");

        HashMap<String, Integer> frequences = new HashMap<>();
        for (String mot : mots) {
            frequences.put(mot, frequences.getOrDefault(mot, 0) + 1);
        }

        // Trier par fréquence décroissante
        List<Map.Entry<String, Integer>> liste = new ArrayList<>(frequences.entrySet());
        liste.sort((e1, e2) -> e2.getValue() - e1.getValue());

        for (Map.Entry<String, Integer> e : liste) {
            System.out.println(e.getKey() + " : " + e.getValue() + " fois");
        }
    }
}
```

</details>

## 10.3 TP Guidé : Gestionnaire de contacts

```java
import java.util.*;

public class GestionnaireContacts {
    private Map<String, List<String>> contacts = new TreeMap<>();

    public void ajouterContact(String nom, String telephone) {
        contacts.computeIfAbsent(nom, k -> new ArrayList<>()).add(telephone);
    }

    public List<String> rechercherContact(String nom) {
        return contacts.getOrDefault(nom, Collections.emptyList());
    }

    public void supprimerContact(String nom) { contacts.remove(nom); }

    public void afficherTous() {
        contacts.forEach((nom, tels) ->
            System.out.println(nom + " : " + String.join(", ", tels)));
    }

    public static void main(String[] args) {
        GestionnaireContacts gc = new GestionnaireContacts();
        gc.ajouterContact("Alice", "0612345678");
        gc.ajouterContact("Alice", "0698765432");
        gc.ajouterContact("Bob", "0611223344");
        gc.afficherTous();
    }
}
```

> **✅ Bravo !**
> Les collections sont des outils indispensables en Java.

---

# MODULE 11 : Fichiers et Entrées/Sorties (I/O)

> **🎯 Objectifs du module**
> Lire et écrire des fichiers texte. Utiliser BufferedReader/Writer et Scanner pour les fichiers. Gérer les fichiers avec try-with-resources. Manipuler les chemins avec java.nio.

## 11.1 Cours : Lecture et écriture de fichiers

```java
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Écrire dans un fichier
try (BufferedWriter writer = Files.newBufferedWriter(Path.of("donnees.txt"))) {
    writer.write("Ligne 1");
    writer.newLine();
    writer.write("Ligne 2");
}

// Lire un fichier ligne par ligne
try (BufferedReader reader = Files.newBufferedReader(Path.of("donnees.txt"))) {
    String ligne;
    while ((ligne = reader.readLine()) != null) {
        System.out.println(ligne);
    }
}

// Méthode rapide : lire toutes les lignes d'un coup
List<String> lignes = Files.readAllLines(Path.of("donnees.txt"));

// Méthode rapide : écrire toutes les lignes d'un coup
Files.write(Path.of("sortie.txt"), lignes);
```

### 11.1.1 Try-with-resources

Le try-with-resources ferme automatiquement les ressources même en cas d'exception :

```java
try (Scanner sc = new Scanner(new File("data.csv"))) {
    while (sc.hasNextLine()) {
        String[] colonnes = sc.nextLine().split(",");
        // Traitement...
    }
} catch (FileNotFoundException e) {
    System.out.println("Fichier introuvable : " + e.getMessage());
}
```

## 11.2 Exercices avec corrections

> **📝 Exercice 1**
> Écrivez un programme qui lit un fichier CSV contenant des étudiants (nom,prénom,note1,note2,note3) et génère un fichier de résultats avec les moyennes et les mentions.

<details>
<summary>✅ Correction</summary>

```java
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TraitementCSV {
    public static void main(String[] args) throws IOException {
        // Création du fichier test
        Files.writeString(Path.of("etudiants.csv"),
            "Dupont,Jean,15,12,18\nMartin,Marie,16,14,17\nPetit,Paul,8,9,7\n");

        List<String> lignes = Files.readAllLines(Path.of("etudiants.csv"));
        try (BufferedWriter w = Files.newBufferedWriter(Path.of("resultats.txt"))) {
            w.write("=== RÉSULTATS ===\n\n");
            for (String ligne : lignes) {
                String[] cols = ligne.split(",");
                String nom = cols[0] + " " + cols[1];
                double moy = 0;
                for (int i = 2; i < cols.length; i++)
                    moy += Double.parseDouble(cols[i]);
                moy /= (cols.length - 2);
                String mention = moy >= 16 ? "TB" : moy >= 14 ? "B" : moy >= 12 ? "AB" : moy >= 10 ? "P" : "Aj.";
                w.write(String.format("%s : %.2f (%s)%n", nom, moy, mention));
            }
        }
        System.out.println("Fichier resultats.txt généré !");
    }
}
```

</details>

> **✅ Bravo !**
> Vous savez manipuler les fichiers en Java.

---

# MODULE 12 : Génériques (Generics)

> **🎯 Objectifs du module**
> Comprendre le système de types génériques. Créer des classes et méthodes génériques. Utiliser les wildcards (?, extends, super). Appliquer les génériques aux structures de données.

## 12.1 Cours : Introduction aux génériques

```java
// Sans génériques (dangereux) :
List liste = new ArrayList();
liste.add("texte");
liste.add(42);  // Pas d'erreur à la compilation
String s = (String) liste.get(1);  // ClassCastException à l'exécution !

// Avec génériques (sûr) :
List<String> listeSure = new ArrayList<>();
listeSure.add("texte");
// listeSure.add(42);  // ERREUR à la compilation ! Bien.
String s2 = listeSure.get(0);  // Pas de cast nécessaire
```

### 12.1.1 Créer une classe générique

```java
public class Paire<A, B> {
    private A premier;
    private B second;

    public Paire(A premier, B second) {
        this.premier = premier;
        this.second = second;
    }

    public A getPremier() { return premier; }
    public B getSecond() { return second; }

    @Override
    public String toString() { return "(" + premier + ", " + second + ")"; }
}

// Utilisation :
Paire<String, Integer> note = new Paire<>("Mathématiques", 18);
Paire<String, String> ville = new Paire<>("Paris", "France");
```

### 12.1.2 Méthodes génériques

```java
public class Utils {
    // Méthode générique
    public static <T> void afficherTableau(T[] tableau) {
        for (T element : tableau) System.out.print(element + " ");
        System.out.println();
    }

    // Avec contrainte (bounded type)
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        Integer[] entiers = {1, 2, 3};
        String[] mots = {"Java", "Python"};
        afficherTableau(entiers);
        afficherTableau(mots);
        System.out.println(max(10, 20));       // 20
        System.out.println(max("abc", "xyz")); // xyz
    }
}
```

## 12.2 TP Guidé : Liste chaînée générique

```java
public class ListeChainee<T> {
    private class Noeud {
        T valeur;
        Noeud suivant;
        Noeud(T valeur) { this.valeur = valeur; this.suivant = null; }
    }

    private Noeud tete;
    private int taille;

    public ListeChainee() { tete = null; taille = 0; }

    public void ajouterDebut(T valeur) {
        Noeud nouveau = new Noeud(valeur);
        nouveau.suivant = tete;
        tete = nouveau;
        taille++;
    }

    public T get(int index) {
        if (index < 0 || index >= taille) throw new IndexOutOfBoundsException();
        Noeud courant = tete;
        for (int i = 0; i < index; i++) courant = courant.suivant;
        return courant.valeur;
    }

    public int taille() { return taille; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Noeud courant = tete;
        while (courant != null) {
            sb.append(courant.valeur);
            if (courant.suivant != null) sb.append(" -> ");
            courant = courant.suivant;
        }
        return sb.append("]").toString();
    }
}
```

> **✅ Bravo !**
> Les génériques rendent votre code plus sûr et réutilisable.

---

# MODULE 13 : Expressions Lambda et Streams

> **🎯 Objectifs du module**
> Comprendre les expressions lambda. Utiliser les interfaces fonctionnelles (Predicate, Function, Consumer). Maîtriser l'API Stream pour traiter les collections. Chaîner les opérations intermédiaires et terminales.

## 13.1 Cours : Expressions lambda

```java
// Syntaxe : (paramètres) -> expression
// Ou :      (paramètres) -> { instructions; }

import java.util.*;
import java.util.function.*;

// Avant (classe anonyme) :
Comparator<String> compAvant = new Comparator<String>() {
    @Override
    public int compare(String a, String b) { return a.length() - b.length(); }
};

// Après (lambda) :
Comparator<String> compApres = (a, b) -> a.length() - b.length();

// Interfaces fonctionnelles prédéfinies :
Predicate<Integer> estPair = n -> n % 2 == 0;
Function<String, Integer> longueur = s -> s.length();
Consumer<String> afficher = s -> System.out.println(s);
Supplier<Double> aleatoire = () -> Math.random();

// Utilisation :
System.out.println(estPair.test(4));   // true
System.out.println(longueur.apply("Java")); // 4
afficher.accept("Bonjour");  // Bonjour
```

## 13.2 Cours : L'API Stream

```java
import java.util.*;
import java.util.stream.*;

List<String> noms = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Anna");

// Filtrer, transformer, collecter
List<String> resultat = noms.stream()
    .filter(n -> n.startsWith("A"))    // Garde ceux qui commencent par A
    .map(String::toUpperCase)           // Transforme en majuscules
    .sorted()                           // Trie
    .collect(Collectors.toList());      // Collecte dans une liste
// resultat = [ALICE, ANNA]

// Opérations numériques
List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

int somme = nombres.stream().mapToInt(Integer::intValue).sum();
OptionalDouble moy = nombres.stream().mapToInt(Integer::intValue).average();
int max = nombres.stream().mapToInt(Integer::intValue).max().orElse(0);

// Grouper par critère
Map<Character, List<String>> parLettre = noms.stream()
    .collect(Collectors.groupingBy(n -> n.charAt(0)));
// {A=[Alice, Anna], B=[Bob], C=[Charlie], D=[David], E=[Eve]}

// Compter
long nbAvecA = noms.stream().filter(n -> n.contains("a")).count();
```

## 13.3 Exercices avec corrections

> **📝 Exercice 1**
> Donnée : une liste de produits (nom, prix, catégorie). Utilisez les Streams pour : trouver le produit le plus cher, calculer le prix moyen par catégorie, et lister les produits de moins de 50€ triés par prix.

<details>
<summary>✅ Correction</summary>

```java
import java.util.*;
import java.util.stream.*;

public class StreamsProduits {
    record Produit(String nom, double prix, String categorie) {}

    public static void main(String[] args) {
        List<Produit> produits = List.of(
            new Produit("Souris", 29.99, "Périphérique"),
            new Produit("Clavier", 79.99, "Périphérique"),
            new Produit("Écran", 299.99, "Affichage"),
            new Produit("RAM 16Go", 45.00, "Composant"),
            new Produit("SSD 1To", 89.99, "Composant"));

        // Produit le plus cher
        produits.stream().max(Comparator.comparing(Produit::prix))
            .ifPresent(p -> System.out.println("Plus cher : " + p));

        // Prix moyen par catégorie
        produits.stream()
            .collect(Collectors.groupingBy(Produit::categorie,
                Collectors.averagingDouble(Produit::prix)))
            .forEach((cat, moy) -> System.out.printf("%s : %.2f EUR%n", cat, moy));

        // Produits < 50 EUR
        produits.stream().filter(p -> p.prix() < 50)
            .sorted(Comparator.comparing(Produit::prix))
            .forEach(p -> System.out.println(p.nom() + " : " + p.prix()));
    }
}
```

</details>

> **✅ Bravo !**
> Les lambdas et les Streams modernisent votre code Java. Il est temps pour le projet final !

---

# MODULE 14 : Projet Final Portfolio - Gestionnaire de Tâches

> **🔴 Objectif du projet**
> Créer une application complète de gestion de tâches (TODO list avancée) en ligne de commande qui reprend **TOUTES** les notions vues dans les 13 modules précédents. Ce projet est conçu pour être présenté dans votre portfolio de développeur.

## 14.1 Cahier des charges

L'application doit permettre de :

1. Créer, modifier, supprimer des tâches
2. Organiser les tâches par catégories et priorités
3. Filtrer et rechercher des tâches
4. Sauvegarder et charger les données depuis un fichier
5. Afficher des statistiques

## 14.2 Architecture du projet

Le projet se compose de 6 fichiers Java, chacun utilisant des notions spécifiques :

| Fichier | Notions utilisées |
|---------|------------------|
| `Priorite.java` | Enum (constantes) |
| `Tache.java` | Classe, encapsulation, Comparable, toString |
| `TacheException.java` | Exception personnalisée |
| `GestionnaireTaches.java` | Collections, Génériques, Streams, Fichiers I/O |
| `StatistiquesService.java` | Streams avancés, Map, Lambda |
| `Application.java` | Scanner, menu, boucle do-while, try-catch |

## 14.3 Code complet guidé

### 14.3.1 Priorite.java - L'énumération

```java
public enum Priorite {
    BASSE("Basse", 1),
    MOYENNE("Moyenne", 2),
    HAUTE("Haute", 3),
    CRITIQUE("Critique", 4);

    private final String label;
    private final int niveau;

    Priorite(String label, int niveau) {
        this.label = label;
        this.niveau = niveau;
    }

    public String getLabel() { return label; }
    public int getNiveau() { return niveau; }

    @Override
    public String toString() { return label; }
}
```

### 14.3.2 Tache.java - La classe principale

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tache implements Comparable<Tache> {
    private static int compteur = 0;
    private final int id;
    private String titre;
    private String description;
    private String categorie;
    private Priorite priorite;
    private boolean terminee;
    private LocalDate dateCreation;
    private LocalDate dateEcheance;

    public Tache(String titre, String description, String categorie,
                 Priorite priorite, LocalDate dateEcheance) {
        this.id = ++compteur;
        this.titre = titre;
        this.description = description;
        this.categorie = categorie;
        this.priorite = priorite;
        this.terminee = false;
        this.dateCreation = LocalDate.now();
        this.dateEcheance = dateEcheance;
    }

    // Getters et Setters
    public int getId() { return id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public String getDescription() { return description; }
    public String getCategorie() { return categorie; }
    public Priorite getPriorite() { return priorite; }
    public void setPriorite(Priorite p) { this.priorite = p; }
    public boolean isTerminee() { return terminee; }
    public void setTerminee(boolean t) { this.terminee = t; }
    public LocalDate getDateEcheance() { return dateEcheance; }

    public boolean isEnRetard() {
        return !terminee && dateEcheance != null && LocalDate.now().isAfter(dateEcheance);
    }

    @Override
    public int compareTo(Tache autre) {
        return Integer.compare(autre.priorite.getNiveau(), this.priorite.getNiveau());
    }

    // Sérialisation pour sauvegarde fichier
    public String toCSV() {
        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
        return String.join(";", String.valueOf(id), titre, description, categorie,
            priorite.name(), String.valueOf(terminee),
            dateCreation.format(fmt),
            dateEcheance != null ? dateEcheance.format(fmt) : "");
    }

    public static Tache fromCSV(String ligne) {
        String[] parts = ligne.split(";", -1);
        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
        Tache t = new Tache(parts[1], parts[2], parts[3],
            Priorite.valueOf(parts[4]),
            parts[7].isEmpty() ? null : LocalDate.parse(parts[7], fmt));
        t.terminee = Boolean.parseBoolean(parts[5]);
        return t;
    }

    @Override
    public String toString() {
        String status = terminee ? "[OK]" : isEnRetard() ? "[RETARD]" : "[ ]";
        return String.format("%s #%d [%s] %s - %s", status, id, priorite, titre, categorie);
    }
}
```

### 14.3.3 TacheException.java

```java
public class TacheException extends Exception {
    public TacheException(String message) { super(message); }
}
```

### 14.3.4 GestionnaireTaches.java - Le cœur du système

```java
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class GestionnaireTaches {
    private List<Tache> taches;
    private static final String FICHIER = "taches.csv";

    public GestionnaireTaches() {
        taches = new ArrayList<>();
        charger();
    }

    public void ajouter(Tache tache) { taches.add(tache); sauvegarder(); }

    public void supprimer(int id) throws TacheException {
        boolean removed = taches.removeIf(t -> t.getId() == id);
        if (!removed) throw new TacheException("Tâche #" + id + " introuvable");
        sauvegarder();
    }

    public Tache trouverParId(int id) throws TacheException {
        return taches.stream().filter(t -> t.getId() == id).findFirst()
            .orElseThrow(() -> new TacheException("Tâche #" + id + " introuvable"));
    }

    public List<Tache> filtrerParCategorie(String cat) {
        return taches.stream()
            .filter(t -> t.getCategorie().equalsIgnoreCase(cat))
            .sorted()
            .collect(Collectors.toList());
    }

    public List<Tache> filtrerParPriorite(Priorite p) {
        return taches.stream().filter(t -> t.getPriorite() == p).collect(Collectors.toList());
    }

    public List<Tache> getTachesEnRetard() {
        return taches.stream().filter(Tache::isEnRetard).sorted().collect(Collectors.toList());
    }

    public List<Tache> rechercherParMot(String mot) {
        String recherche = mot.toLowerCase();
        return taches.stream()
            .filter(t -> t.getTitre().toLowerCase().contains(recherche)
                || t.getDescription().toLowerCase().contains(recherche))
            .collect(Collectors.toList());
    }

    public List<Tache> getToutesTaches() {
        return Collections.unmodifiableList(taches);
    }

    private void sauvegarder() {
        try (BufferedWriter w = Files.newBufferedWriter(Path.of(FICHIER))) {
            for (Tache t : taches) { w.write(t.toCSV()); w.newLine(); }
        } catch (IOException e) {
            System.err.println("Erreur de sauvegarde : " + e.getMessage());
        }
    }

    private void charger() {
        Path path = Path.of(FICHIER);
        if (!Files.exists(path)) return;
        try {
            taches = Files.readAllLines(path).stream()
                .filter(l -> !l.isBlank())
                .map(Tache::fromCSV)
                .collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            System.err.println("Erreur de chargement : " + e.getMessage());
        }
    }
}
```

### 14.3.5 StatistiquesService.java

```java
import java.util.*;
import java.util.stream.*;

public class StatistiquesService {
    private final GestionnaireTaches gestionnaire;

    public StatistiquesService(GestionnaireTaches g) { this.gestionnaire = g; }

    public void afficherStatistiques() {
        List<Tache> taches = gestionnaire.getToutesTaches();
        System.out.println("\n===== STATISTIQUES =====");
        System.out.println("Total tâches : " + taches.size());

        long terminees = taches.stream().filter(Tache::isTerminee).count();
        long enCours = taches.size() - terminees;
        long enRetard = taches.stream().filter(Tache::isEnRetard).count();

        System.out.println("Terminées : " + terminees);
        System.out.println("En cours : " + enCours);
        System.out.println("En retard : " + enRetard);

        if (!taches.isEmpty()) {
            System.out.printf("Taux complétion : %.1f%%%n", terminees * 100.0 / taches.size());
        }

        // Par catégorie
        System.out.println("\n--- Par catégorie ---");
        taches.stream()
            .collect(Collectors.groupingBy(Tache::getCategorie, Collectors.counting()))
            .forEach((cat, nb) -> System.out.println("  " + cat + " : " + nb));

        // Par priorité
        System.out.println("\n--- Par priorité ---");
        taches.stream()
            .collect(Collectors.groupingBy(Tache::getPriorite, Collectors.counting()))
            .forEach((p, nb) -> System.out.println("  " + p + " : " + nb));
        System.out.println("========================");
    }
}
```

### 14.3.6 Application.java - Le point d'entrée

```java
import java.time.LocalDate;
import java.util.*;

public class Application {
    private static final Scanner sc = new Scanner(System.in);
    private static final GestionnaireTaches gestionnaire = new GestionnaireTaches();
    private static final StatistiquesService stats = new StatistiquesService(gestionnaire);

    public static void main(String[] args) {
        int choix;
        do {
            afficherMenu();
            choix = lireEntier();
            switch (choix) {
                case 1 -> creerTache();
                case 2 -> afficherTaches();
                case 3 -> marquerTerminee();
                case 4 -> supprimerTache();
                case 5 -> rechercherTache();
                case 6 -> stats.afficherStatistiques();
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        } while (choix != 0);
    }

    static void afficherMenu() {
        System.out.println("\n==== GESTIONNAIRE DE TÂCHES ====");
        System.out.println("1. Créer une tâche");
        System.out.println("2. Afficher les tâches");
        System.out.println("3. Marquer comme terminée");
        System.out.println("4. Supprimer une tâche");
        System.out.println("5. Rechercher");
        System.out.println("6. Statistiques");
        System.out.println("0. Quitter");
        System.out.print("Choix : ");
    }

    static void creerTache() {
        System.out.print("Titre : "); String titre = sc.nextLine();
        System.out.print("Description : "); String desc = sc.nextLine();
        System.out.print("Catégorie : "); String cat = sc.nextLine();
        System.out.println("Priorité (1=Basse, 2=Moyenne, 3=Haute, 4=Critique) :");
        Priorite p = Priorite.values()[lireEntier() - 1];
        System.out.print("Échéance (AAAA-MM-JJ, vide si aucune) : ");
        String dateStr = sc.nextLine();
        LocalDate echeance = dateStr.isEmpty() ? null : LocalDate.parse(dateStr);
        gestionnaire.ajouter(new Tache(titre, desc, cat, p, echeance));
        System.out.println("Tâche créée !");
    }

    static void afficherTaches() {
        var taches = gestionnaire.getToutesTaches();
        if (taches.isEmpty()) { System.out.println("Aucune tâche."); return; }
        taches.forEach(System.out::println);
    }

    static void marquerTerminee() {
        System.out.print("ID de la tâche : ");
        try {
            Tache t = gestionnaire.trouverParId(lireEntier());
            t.setTerminee(true);
            System.out.println("Tâche marquée comme terminée !");
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

    static void supprimerTache() {
        System.out.print("ID de la tâche : ");
        try {
            gestionnaire.supprimer(lireEntier());
            System.out.println("Tâche supprimée !");
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

    static void rechercherTache() {
        System.out.print("Mot-clé : ");
        gestionnaire.rechercherParMot(sc.nextLine()).forEach(System.out::println);
    }

    static int lireEntier() {
        try { return Integer.parseInt(sc.nextLine().trim()); }
        catch (NumberFormatException e) { return -1; }
    }
}
```

## 14.4 Récapitulatif des notions utilisées

| Module | Notion | Où dans le projet |
|--------|--------|-------------------|
| **1-2** | Variables, types, opérateurs | Tous les fichiers |
| **3** | Structures de contrôle | Application.java (menu, switch) |
| **4** | Tableaux, Strings | Sérialisation CSV, manipulation texte |
| **5** | Méthodes | Toutes les méthodes du projet |
| **6** | POO (classes, encapsulation) | Tache.java, constructeurs, getters |
| **7** | Héritage, polymorphisme | Comparable dans Tache |
| **8** | Interfaces | Comparable\<Tache\> |
| **9** | Exceptions | TacheException, try-catch |
| **10** | Collections | ArrayList, Map dans statistiques |
| **11** | Fichiers I/O | Sauvegarde/chargement CSV |
| **12** | Génériques | List\<Tache\>, Map\<String, Long\> |
| **13** | Lambda, Streams | Filtres, statistiques, groupBy |

## 14.5 Pour aller plus loin

Voici des améliorations que vous pouvez apporter pour enrichir votre portfolio :

1. Ajouter une interface graphique avec JavaFX ou Swing
2. Connecter l'application à une base de données SQLite ou MySQL
3. Ajouter un système de sous-tâches (tâches imbriquées)
4. Implémenter un système de tags avec recherche multi-critères
5. Ajouter des rappels par date avec un système de notifications
6. Écrire des tests unitaires avec JUnit 5
7. Créer une API REST avec Spring Boot

---

## 🎉 FÉLICITATIONS !

**Vous avez terminé la formation Java complète.**

Vous maîtrisez les fondamentaux de Java : de la syntaxe de base à la programmation objet avancée, en passant par les collections, les fichiers, les génériques et les Streams. Le projet final est prêt à être présenté dans votre portfolio.

*Bonne continuation dans votre parcours de développeur Java !*
