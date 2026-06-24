#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "headers/aire.h"
#include "headers/array.h"
#include <string.h>

void nombresPairs(int* tab, int taille){
    for (int i = 0; i < taille; i++){
        if(tab[i]%2== 0){
            printf("Le nombre %d est paire\n", tab[i]);
        }
    }
}
int main(int argc, char *argv[]){   
    //First helloworld
    // printf("Hello world!\n");
    /* 
        Nombre signed
        contient des nombre positif et négatif
    */
    //-128 127
    // signed char a;
    // //-32768 32768
    // int b;
    // //-2 147 483 648 - 2 147 483 647
    // long c;
    // // 1.17549 x 10^-38 - 3.40282 x 10^+38
    // float d;
    // // 2.22507 x 10^-308 - 1.79769 x 10+308^
    // double e;    

    // /*  Nombre non signé 
    //     ne contient que des nombre positif
    // */
    // // 0 - 255
    // unsigned char f; 
    // // 0 - 65 535
    // unsigned int g;
    // //0 - 4 294 967295
    // unsigned long h; 

    /* 
        Déclaration et affectation
        int nombresDeVie;
        nombresDeVie = 5;
        nombresDeVie = 4;
        nombresDeVie = 3;
        // Déclaration et affectaton obligatoire
        int nombresDeVies = 5, niveau = 6;
        // Déclaration de constante
        const int NOMBRE_DE_VIES_INITIALES = 5;
        printf("Il vous reste %d vies", NOMBRE_DE_VIES_INITIALES);
        // afficher plusieurs variable
        printf("Vous avez %d vies et vous etes au niveau n° %d", nombresDeVies, niveau);
        printf("\n");
    */
    /*
        Saisi utilisateur avec Scanf
    
        int age = 0;
        printf("Quel age avez-vous ?");
        scanf("%d",&age);
        printf("Vous avez %d ans.", age);
    */
    /*  Opérations 

    // */
    // double resultat = 0;
    // // resultat = 5+3;
    // // printf("5+3=%lf", resultat); 
    // resultat = 5.0/2.0;
    // printf("5/2=%lf", resultat); 

    // int nombre1, nombre2, resultat = 0;
    // printf("nombre1: %d", nombre1);
    // printf("nombre2: %d", nombre2);
    // printf("resultat: %d", resultat);
    // printf("Donnez un chiffre pour le premier: \n");
    // scanf("%d", &nombre1);
    // printf("Donnez un chiffre pour le deuxieme: \n");
    // scanf("%d", &nombre2);
    // resultat = nombre1 + nombre2;
    // printf("Résultat de l'addition %d + %d =  %d", nombre1, nombre2, resultat);
    
    /* 
        Les Conditions
    
        //if else else if
        int age = 18;
        int argent= 100000001;
        if(age >= 18){
            printf("Vous etes majeur");
        }else if (age > 4 ){
            printf("Bon t'est pas trop jeune quand meme ...");
        }
        
        else {
            printf("Aga gaaa aga gaaa");
        }

        // logique 
        if(age > 18 || argent > 100000){
            printf("Bienvenue chez PicsouBanque");
        }
        else {
            printf("Hors de ma vue, misérable !");
        }
        // boolean 
    
        int majeur = 0;
        
        majeur = age >= 18;
        printf("Majeur vaut : %d\n", majeur);
   
    int choixMenu = 0;
    printf("=== Menu === \n");
    printf("1. Royal Cheese\n");
    printf("2. Mc Deluxe\n");
    printf("3. Mc Bacon\n");
    printf("4. Big Mac\n");
    printf("Votre choix: ");
    scanf("%d", &choixMenu);
    switch (choixMenu){
        case 1:
            printf("Vous avez choisi le Royal Cheese");
            break;
        case 2:
            printf("Vous avez choisi le Mc Deluxe");
            break;
        case 3:
            printf("Vous avez choisi le Mc Bacon");
            break;
        case 4:
            printf("Vous avez choisi le Big Mac");
            break;

        default:
            printf("Vous n'avez rien choisi...");
            break;
    }
    // ternaire
    age = (majeur) ? 18 : 17;
    */
   /* Les boucles
   int compteur = 0;
    while(compteur < 10){
        printf("La variable compteur vaut : %d\n", compteur);
        compteur++;
    }
    
    compteur = 0;
    do {
        printf("Bienvenue sur OpenClassrooms! \n");
        compteur++;
    }while (compteur <10);

    for(int compt = 0; compt < 10; compt++){
        printf("Le compteur vaut: %d\n", compt);
    }*/

    /*
        Fonctions
    
        int resultat = triple(10);
        printf("%d", resultat);
    */  
    // double resultat = 0;
    // resultat = aireRectangle(10,5);
    // printf("%f", resultat);
    // // `Mon premier pointeur`
    // int age = 10;
    // printf("La valeur de la variable est %d\n", age);
    // printf("L'adresse de la variable est %p\n", &age);
    // int *pointeur = NULL;
    // pointeur = &age;
    // printf("La valeur du pointeur est %p\n", pointeur);
    // printf("La valeur du contenue dans le pointeur est %d\n", *pointeur);

    // array
    // int tableaux[4] = {0,0,0,0}, i = 0;
    // // tableaux[0]= 10;
    // // tableaux[1]= 11;
    // // tableaux[2]= 12;
    // // tableaux[3]= 13;
    // printf("Case 1 : %d\n", tableaux[0]);
    // printf("Case 2 : %d\n", tableaux[1]);
    // printf("Case 3 : %d\n", tableaux[2]);
    // printf("Case 4 : %d\n", tableaux[3]);
    
    // for(i = 0; i < 4; i++){
    //     tableaux[i]=0;
    // }
    // for(i = 0 ; i < 4; i++){
    //     printf("Case %d : %d \n", i+1, tableaux[i]);
    // }
    // int tableaux[4]= {12,23,34,45};
    // nombresPairs(&tableaux, 4);
    // int tableaux[4]= {10,10,10,10};
    // int arraySomme = sommeTableaux(tableaux, 4);
    // printf("%d", arraySomme);
    // printf("La moyenne du tableaux est de %f",moyenneTableau(arraySomme, 4));

    // char chaine[] = "Texte de test", *suiteChaine = NULL;

    // suiteChaine = strchr(chaine, 'd');
    // if (suiteChaine != NULL) // Si on a trouvé quelque chose
    // {
    //     printf("Voici la fin de la chaine a partir du premier d : %s", suiteChaine);
    // }
    // printf("char : %d octets\n", sizeof(char));
    // printf("int : %d octets\n", sizeof(int));
    // printf("long : %d octets\n", sizeof(long));
    // printf("double : %d octets\n", sizeof(double));

    // int* memoireAllouee = NULL;

    // memoireAllouee = malloc(sizeof(int)); // Allocation de la mémoire
    // if (memoireAllouee == NULL)
    // {
    //     exit(0);
    // }

    // // Utilisation de la mémoire
    // printf("Quel age avez-vous ? ");
    // scanf("%d", memoireAllouee);
    // printf("Vous avez %d ans\n", *memoireAllouee);

    // free(memoireAllouee); // Libération de mémoire

    // int nombreDAmis = 0, i = 0;
    // int* ageAmis = NULL; // Ce pointeur va servir de tableau après l'appel du malloc

    // On demande le nombre d'amis à l'utilisateur
    // printf("Combien d'amis avez-vous ? ");
    // scanf("%d", &nombreDAmis);
    
    // if (nombreDAmis > 0) // Il faut qu'il ait au moins un ami (je le plains un peu sinon :p)
    // {
    //     ageAmis = malloc(nombreDAmis * sizeof(int)); // On alloue de la mémoire pour le tableau
    //     if (ageAmis == NULL) // On vérifie si l'allocation a marché ou non
    //     {
    //         exit(0); // On arrête tout
    //     }

    //     // On demande l'âge des amis un à un
    //     for (i = 0 ; i < nombreDAmis ; i++)
    //     {
    //         printf("Quel age a l'ami numero %d ? ", i + 1);
    //         scanf("%d", &ageAmis[i]);
    //     }

    //     // On affiche les âges stockés un à un
    //     printf("\n\nVos amis ont les ages suivants :\n");
    //     for (i = 0 ; i < nombreDAmis ; i++)
    //     {
    //         printf("%d ans\n", ageAmis[i]);
    //     }

    //     // On libère la mémoire allouée avec malloc, on n'en a plus besoin
    //     free(ageAmis);
    // }
    char nom[10];
 
    printf("Quel est votre nom ? ");
    fgets(nom, 10, stdin);
    printf("Ah ! Vous vous appelez donc %s !\n\n", nom);
    return 0;
}
