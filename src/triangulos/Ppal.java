package triangulos;

import java.util.Scanner;

public class Ppal {

    public static void main(String[] args) {

        Scanner lados = new Scanner(System.in);

        System.out.println("Digte el valor de los 3 lados del triangulo");

        int a = lados.nextInt();
        int b = lados.nextInt();
        int c = lados.nextInt();

        int tipo = TriAngulos.tipoTriagulo(a, b, c);
        if (tipo == 1) {
            System.out.println("Equilatero");
        } else {
            if (tipo == 2) {
                System.out.println("Isóceles");
            } else {
                if (tipo == 3) {
                    System.out.println("Escaleno");
                }
            }
        }
    }//fin del método
}//fin de la clase

