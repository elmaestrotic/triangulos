package triangulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class FrmCalculadora_1 extends JFrame implements ActionListener {

    private JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    private JButton punto, suma, resta, multi, divi, igual, clear;
    public JTextField display, display1;
    private String temp;
    private float temp1, temp2, temp3;
    private boolean sSuma, sResta, sMulti, sDivi, oSuma, oMulti, oResta, oDivi,sIgual = false;
    private   float resul = 0f;

    public void actionPerformed(ActionEvent e) {
       if (sSuma || sResta || sMulti  || sDivi) {
            temp = "";//display.getText();
        } else {
            temp = display.getText();
            resetSwiches();
        }

        //temp=display.getText();
        if (e.getSource() == cero && sSuma  || sResta  || sMulti  || sDivi ) {
            display.setText("0");
             
            resetSwiches();
        } else {
            if (e.getSource() == cero) {
                display.setText(temp + "0");
            }
        }

        if (e.getSource() == uno && sSuma || sResta  || sMulti || sDivi ) {
            display.setText("1");
      
            resetSwiches();
        } else {
            if (e.getSource() == uno) {
                display.setText(temp + "1");
            }
        }

        if (e.getSource() == dos && sSuma || sResta  || sMulti  || sDivi) {
            display.setText("2");
              
            resetSwiches();
        } else {
            if (e.getSource() == dos) {
                display.setText(temp + "2");
            }
        }

        if (e.getSource() == tres && sSuma  || sResta  || sMulti  || sDivi ) {
            display.setText("3");
              
            resetSwiches();
        } else {
            if (e.getSource() == tres) {
                 
                display.setText(temp + "3");
            }
        }

        if (e.getSource() == cuatro && sSuma  || sResta  || sMulti  || sDivi ) {
            display.setText("4");
              
            resetSwiches();
        } else {
            if (e.getSource() == cuatro) {
                display.setText(temp + "4");
            }
        }

        if (e.getSource() == cinco && sSuma  || sResta || sMulti  || sDivi ) {
            display.setText("5");
              
            resetSwiches();
        } else {
            if (e.getSource() == cinco) {
                display.setText(temp + "5");
            }
        }

        if (e.getSource() == seis && sSuma || sResta  || sMulti || sDivi ) {
            display.setText("6");
              
            resetSwiches();
        } else {
            if (e.getSource() == seis) {
                display.setText(temp + "6");
            }
        }

        if (e.getSource() == siete && sSuma || sResta  || sMulti  || sDivi) {
            display.setText("7");
              
            resetSwiches();
        } else {
            if (e.getSource() == siete) {
                display.setText(temp + "7");
            }
        }

        if (e.getSource() == ocho && sSuma  || sResta  || sMulti || sDivi) {
            display.setText("8");
              
            resetSwiches();
        } else {
            if (e.getSource() == ocho) {
                display.setText(temp + "8");
            }
        }

        if (e.getSource() == nueve && sSuma  || sResta || sMulti || sDivi ) {
            display.setText("9");
              
            resetSwiches();
        } else {
            if (e.getSource() == nueve) {
                display.setText(temp + "9");
            }
        }

        //vamos con los botones de las operaciones aritméticas     
        if (e.getSource() == suma) {
            
            //verificamos que no haya operacion en proceso, si la hay guardamos resultados parciales
            if (sResta)
                  temp2 = Float.parseFloat(display.getText());
                   verificarOpcion(3);
                  
            
            
            
            
            

            temp1 = Float.parseFloat(display.getText());
            /*oDivi = oResta = oMulti = false;
            //display.setText("");
            temp = "";*/
            sSuma = true;
            oSuma = true;

        }

        if (e.getSource() == resta) {

            temp1 = Float.parseFloat(display.getText());
            oDivi = oSuma = oMulti = false;
            /*//display.setText("");
           // temp = "";*/
            sResta = true;
            oResta = true;
        }

        if (e.getSource() == multi) {

           temp1 = Float.parseFloat(display.getText());
           oDivi = oSuma = oResta = false;
            /*//display.setText("");
           // temp = "";*/
            oMulti = true;
            sMulti = true;

        }

        if (e.getSource() == divi) {

           temp1 = Float.parseFloat(display.getText());
           oSuma = oResta = oMulti=false;
           // display1.setText(temp);

          /*  oSuma = oResta = oMulti = false;
           // temp = "";*/
            oDivi = true;
            sDivi = true;

        }

        if (e.getSource() == igual) {
            
          
            if (sSuma) {
                
                
                
                
                
                
                temp2 = Float.parseFloat(display.getText());
                verificarOpcion(1);
                resetSwiches();

            } else {
                if (sMulti) {
                    temp2 = Float.parseFloat(display.getText());
                    display1.setText(temp);
                    verificarOpcion(2);
                    resetSwiches();
                } else {
                    if (sResta) {
                        temp2 = Float.parseFloat(display.getText());
                        display1.setText(temp);
                        verificarOpcion(3);
                        resetSwiches();
                    } else {
                        if (sDivi) {
                            temp2 = Float.parseFloat(display.getText());
                            verificarOpcion(4);
                            resetSwiches();
                        } else {
                            if (sDivi) {
                             
                                resetSwiches();
                                Font fuente = new Font("TimesRoman", Font.BOLD, 14);
                                display.setFont(fuente);
                                display.setText("No se puede dividir entre cero");
                            }
                        }

                    }
                }
            }
            
            display.setText(Float.toString(resul));
            resetSwiches();
            oSuma = false;
            oMulti = false;
            oResta = false;
            oDivi = false;
        }

        if (e.getSource() == clear) {
            display.setText("0");
            temp = "";
            resetSwiches();
            oDivi = oSuma = oResta = oMulti = false;

        }
    }
    
    
    

    public void resetSwiches() {
        sSuma = sMulti = sDivi = sResta = false;
    }

    public void verificarOpcion(int opcion) {

      
        switch (opcion) {
            case 1:
                sMulti = sDivi = sResta = false;
                oDivi = oResta = oMulti = false;
                resul = Operaciones.suma(temp1, temp2);

                break;
            case 2:
                sSuma = sDivi = sResta = false;
                oDivi = oSuma = oResta = oDivi = false;
                resul = Operaciones.multi(temp1, temp2);

                break;
            case 3:
                sSuma = sDivi = sMulti = false;
                oSuma = oMulti = oDivi = false;
                resul = Operaciones.resta(temp1, temp2);

                break;
            case 4:
                sSuma = sResta = sMulti = false;
                oSuma = oResta = oMulti = oDivi = false;
                resul = Operaciones.divi(temp1, temp2);

                break;
        }

        resetSwiches();
       // display.setText(Float.toString(resul));
    }

    public void verDisplay() {
        display1 = new JTextField(20);

        JPanel jp = new JPanel(new GridLayout(1, 1));
        jp.add(display1);
        jp.setVisible(true);
        jp.setBounds(10, 10, 230, 30);
        getContentPane().add(jp);
    }

    public void poblarGui() {
        Container marco = getContentPane();
        Font fuente = new Font("TimesRoman", Font.BOLD, 36);
        display = new JTextField();//display.setText("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(fuente);
        display.setBackground(Color.WHITE);
        //marco.setVisible(true);
        marco.setLayout(null);

        verDisplay();

        siete = new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        cero = new JButton("0");
        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        punto = new JButton(".");
        igual = new JButton("=");
        clear = new JButton("Limpiar");
        suma = new JButton("+");
        resta = new JButton("-");
        multi = new JButton("*");
        divi = new JButton("/");
        //

        siete.setBounds(30, 150, 50, 50);
        siete.addActionListener(this);
        multi.setBounds(210, 270, 50, 50);
        multi.addActionListener(this);
        ocho.setBounds(90, 150, 50, 50);
        ocho.addActionListener(this);
        resta.setBounds(210, 210, 50, 50);
        resta.addActionListener(this);
        nueve.setBounds(150, 150, 50, 50);
        nueve.addActionListener(this);
        suma.setBounds(210, 150, 50, 50);
        suma.addActionListener(this);

        divi.setBounds(210, 330, 50, 50);
        divi.addActionListener(this);
        clear.setBounds(30, 390, 230, 50);
        clear.addActionListener(this);

        seis.setBounds(30, 210, 50, 50);
        seis.addActionListener(this);
        cinco.setBounds(90, 210, 50, 50);
        cinco.addActionListener(this);
        cuatro.setBounds(150, 210, 50, 50);
        cuatro.addActionListener(this);

        tres.setBounds(30, 270, 50, 50);
        tres.addActionListener(this);
        dos.setBounds(90, 270, 50, 50);
        dos.addActionListener(this);
        uno.setBounds(150, 270, 50, 50);
        uno.addActionListener(this);

        cero.setBounds(30, 330, 50, 50);
        cero.addActionListener(this);
        punto.setBounds(90, 330, 50, 50);
        punto.addActionListener(this);
        igual.setBounds(150, 330, 50, 50);
        igual.addActionListener(this);
        display.setBounds(30, 80, 230, 50);
        display.setEditable(false);

        marco.add(display);
        marco.add(siete);
        marco.add(ocho);
        marco.add(nueve);
        marco.add(suma);
        marco.add(seis);
        marco.add(cinco);
        marco.add(cuatro);
        marco.add(resta);
        marco.add(tres);
        marco.add(dos);
        marco.add(uno);
        marco.add(multi);
        marco.add(igual);
        marco.add(cero);
        marco.add(punto);
        marco.add(divi);
        marco.add(clear);
    }

    public static void main(String[] args) {
        //pequeña rutina para invocar Nimbus 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        FrmCalculadora ventana = new FrmCalculadora();
        ventana.setTitle("Calculadora");
        ventana.setSize(290, 500);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setLocationRelativeTo(null);

        ventana.poblarGui();

        ventana.setVisible(true);
    }

}
