package triangulos;

import java.util.Scanner;

public class Operaciones {

    public static float suma(float n1, float n2) {

        return n1 + n2;
    }

    public static float resta(float n1, float n2) {
        return n1 - n2;
    }

    public static float multi(float n1, float n2) {
        return n1 * n2;
    }

    public static float divi(float n1, float n2) {
        do {
            Scanner coste = new Scanner(System.in);
            if (n2 <= 0) {
                System.out.println("digite otro # > 0");
                n2 = coste.nextFloat();
            }
        } while (n2 <= 0);
        return n1 / n2;
    }
}
