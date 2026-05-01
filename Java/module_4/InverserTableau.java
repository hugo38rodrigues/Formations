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
    

