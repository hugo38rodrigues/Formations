import java.util.Scanner;

public class SearchMinMaxUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Combient de nombre ? ");
        int n = sc.nextInt();

        int[] tab = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nombre "+ (i+1) + " : ");
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
