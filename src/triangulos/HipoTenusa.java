package triangulos;

import java.text.DecimalFormat; 
import javax.swing.JOptionPane;
public class HipoTenusa {
    public static void main(String [] args){
        
 double a; //cateto opuesto
 double b;//Cateto adyacente
 double h;//hpotenusa
 double h2; //hipotenusa al cuadrado




String temp=JOptionPane.showInputDialog(null,"Digite el Cateto Opuesto");
a=Double.parseDouble(temp);
 double aTemp=a;

 temp=JOptionPane.showInputDialog(null,"Digite el Cateto Adyacente");
b=Double.parseDouble(temp);
 double bTemp=b;


h=(a*a) +(b*b);

a=(h*h)-(b*b); a=Math.sqrt(a); a= (float) a;


b=(h*h)-(a*a); b=Math.sqrt(b); b= (float) b;




JOptionPane.showMessageDialog (null,"EL cateto opuesto  o lado a calculado es = "+a);

JOptionPane.showMessageDialog (null,"EL cateto adyacente calculado es = "+b);

h2=Math.sqrt(h);

//float hipo=(float) 0.0;
float hipo=(float) h2;
//DecimalFormat df = new DecimalFormat("0.00");
//DecimalFormat df = new DecimalFormat("#,###,##0.00");
//df.format(hipo);
JOptionPane.showMessageDialog (null,"La Hipotenusa es = "+hipo);

double ladoA=(hipo *hipo) -(bTemp*bTemp);
ladoA= Math.sqrt(ladoA);
JOptionPane.showMessageDialog (null,"EL   lado A o cateto Adyacente es = "+ladoA + " el valor de b es "+ b);

double ladoB=(hipo *hipo) -(aTemp*aTemp);
ladoB= Math.sqrt(ladoB);
JOptionPane.showMessageDialog (null,"EL   lado B o cateto Opuesto es = "+ladoB + " el valor de a es "+ a);


    }
}

  /*double x=25.324178787878787878645454; 
DecimalFormat df = new DecimalFormat("0.00"); 
System.out.println(df.format(x));  */ 
   

