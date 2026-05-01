package module_3;

class NombresPremiers {
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