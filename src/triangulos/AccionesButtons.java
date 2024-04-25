package triangulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

/**
 * Clase encargada de la Ejecución de la Operaciones de la Calculadora siendo la
 * instancia de la calculadora un objeto de la clase FrmCalculadora (d)
 *
 * @author asus
 */
public class AccionesButtons {

    private float temp1, temp2, temp3;
    private boolean sSuma, sResta, sMulti, sDivi, oSuma, oMulti, oResta, oDivi, sIgual, oPunto = false;
    private String temp="", operador="";
    private float resul = 0f;
    private int cO;

    //d es el representante de la clases FrmCalculadora
    private FrmCalculadora d;

    // Constructor de la clase
    public AccionesButtons(FrmCalculadora d) {
        //this, de la clase
        this.d = d;

    }

    public void accionBtnNueve() {

        if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("9");
          d.txtRastreo.setText(d.txtRastreo.getText()+operador+d.display.getText());
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "9");
        }
    }

    public void accionBtnOcho() {

   if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("8");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "8");
        }
    }

    public void accionBtnSiete() {

       if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("7");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "7");
        }
    }

    public void accionBtnSeis() {

      if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("6");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "6");
        }
    }

    public void accionBtnCinco() {

       if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("5");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "5");
        }
    }

    public void accionBtnCuatro() {

         if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("4");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "4");
        }
    }

    public void accionBtnTres() {

         if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("3");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "3");
        }
    }

    public void accionBtnDos() {

          if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("2");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "2");
        }//fin sino
    }//fin método accionBtnDos()

    public void accionBtnUno() {

         if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("1");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "1");
        }

    }

    public void accionBtnCero() {

          if (sSuma || sResta || sMulti || sDivi || d.display.getText().equals("0")) {
            d.display.setText("0");
            resetSwiches();
        } else {
            d.display.setText(d.display.getText() + "0");
        }
    }

    public void accionBtnResta() {
         d.resta.setForeground(Color.red);
         temp1 = Float.parseFloat(d.display.getText());
        operador="-";
         temp+=operador+d.display.getText();
        d.txtRastreo.setText(temp);
        if (oResta) {
            accionBtnIgual();
        }
        oResta = true;
        sResta = true;
       

    }

    public void accionBtnSuma() {
            cO++;
        
      d.suma.setForeground(Color.red);
      
       temp1 = Float.parseFloat(d.display.getText());
       operador="+";
       if(temp.isEmpty()){
         temp=d.display.getText();  
           d.txtRastreo.setText(temp);
       }else{
         temp+=operador+d.display.getText();
         
        d.txtRastreo.setText(temp);
       }
      
        if (oSuma) {
            accionBtnIgual();
        }
        oSuma = true;
        sSuma = true;
        temp1 = Float.parseFloat(d.display.getText());
    }

    

    public void accionBtnMulti() {
          d.multi.setForeground(Color.red);
          operador="*";
         temp+=operador+d.display.getText();
        d.txtRastreo.setText(temp);
        if (oMulti) {
            accionBtnIgual();
        }
        oMulti = true;
        sMulti = true;
        temp1 = Float.parseFloat(d.display.getText());
        
        
    }

  
 
    
    
    public void resetSwiches() {
        sSuma = sMulti = sDivi = sResta = false;
    }
    
    public void accionBtnDivi() {
          d.divi.setForeground(Color.red);
        operador="/";
         temp+=operador+d.display.getText();
         
        d.txtRastreo.setText(temp);
          
        if (oDivi) {
            accionBtnIgual();
        }
        oDivi = true;
        sDivi = true;
        temp1 = Float.parseFloat(d.display.getText());
    }

    public void accionBtnPunto() {

        d.display.setText(d.display.getText() + ".");

    }

    public void accionBtnIgual() {
       
      //  temp="";
         // d.txtRastreo.setText("");
        
        
        if (oSuma) {
         
            temp2 = Float.parseFloat(d.display.getText());

            d.display.setText(Float.toString(Operaciones.suma(temp1, temp2)));

            temp1 = Float.parseFloat(d.display.getText());

            resetSwiches();
            oSuma = oMulti = oResta = oDivi = oPunto = false;
            d.suma.setForeground(Color.black);
        }

        if (oResta) {
            temp2 = Float.parseFloat(d.display.getText());

            d.display.setText(Float.toString(Operaciones.resta(temp1, temp2)));

            temp1 = Float.parseFloat(d.display.getText());

            resetSwiches();
            oSuma = oMulti = oResta = oDivi = oPunto = false;
            d.resta.setForeground(Color.black);

        }
        
        if (oMulti) {
            temp2 = Float.parseFloat(d.display.getText());

            d.display.setText(Float.toString(Operaciones.multi(temp1, temp2)));

            temp1 = Float.parseFloat(d.display.getText());

            resetSwiches();
               oSuma = oMulti = oResta = oDivi = oPunto = false;
               d.multi.setForeground(Color.black);
        }
        
         if (oDivi) {
            temp2 = Float.parseFloat(d.display.getText());
if (temp2<=0){
    d.display.setText("No se puede dividir entre cero");
}else{
            d.display.setText(Float.toString(Operaciones.divi(temp1, temp2)));

            temp1 = Float.parseFloat(d.display.getText());

            resetSwiches();
               oSuma = oMulti = oResta = oDivi = oPunto = false;
               d.divi.setForeground(Color.black);
        }
        
        
         }
        

    }

    public void accionBtnClear() {

        temp2 = Float.parseFloat("0");

        d.display.setText("0");

        temp1 = Float.parseFloat("0");
        resetSwiches();
temp="";d.txtRastreo.setText(temp);
        oSuma = oResta = oMulti = oDivi = false;

    }

}
