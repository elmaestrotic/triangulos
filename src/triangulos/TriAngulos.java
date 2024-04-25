package triangulos;

public class TriAngulos {

    public static int tipoTriagulo(int l1, int l2, int l3) {
        int tipo = 0;
        if (l1 == l2 && l2 == l3 && l1 == l3) {

            tipo = 1;
        } else if (l1 == l2 && l1 != l3 || l2 == l3 && l2 != l1 || l1 == l3 && l1 != l2) {

            tipo = 2;
        } else {
          //if(l1!=l2 && l2!=l3 && l1!=l3){

            tipo = 3;
        }

        return tipo;
    }  //fin del método

    public static double hiPotenusa(int a, int b) {
        float h = (a * a) + (b * b);

//a=(h*h)-(b*b); a=Math.sqrt(a); a= (float) a;
//b=(h*h)-(a*a); b=Math.sqrt(b); b= (float) b;
        double hipo = Math.sqrt(h);

        return hipo;
    }  //fin de

    public static double catetoAdyacente(double h, int b) {
        double adyacente = Math.sqrt((h * h) - (b * b));

        return adyacente;
    }  //fin de

    public static double catetoOpuesto(double h, int a) {
        double opuesto = Math.sqrt((h * h) - (a * a));

        return opuesto;
    }  //fin de

}
