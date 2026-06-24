int sommeTableaux(int* tableaux, int tailleTableau){
    int somme = 0;
    for(int i=0; i< tailleTableau; i++){
        somme += tableaux[i];
    }
    return somme;
}

double moyenneTableau(int tableau, int tailleTableau){
    return (double)tableau / (double)tailleTableau;
}