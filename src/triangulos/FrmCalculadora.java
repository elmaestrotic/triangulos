package triangulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class FrmCalculadora extends JFrame {

    public JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    public JButton punto, suma, resta, multi, divi, igual, clear;
    public JTextField display, display1, txtRastreo;

    private AccionesButtons acciones;

    public FrmCalculadora() {
        setTitle("Calculadora");
        setSize(290, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        //intanciamos el objeto acciones de la clase AccioneButtons enviandole como 
        //   esta clase (objeto de esta clase this)    
        acciones = new AccionesButtons(this);

        poblarGui();

        setVisible(true);

    }

    public void verDisplay() {
        display1 = new JTextField(20);

        JPanel jp = new JPanel(new GridLayout(1, 1));
        jp.add(display1);
        jp.setBorder(BorderFactory.createLineBorder(Color.white));
        jp.setVisible(true);
        jp.setBounds(30, 20, 230, 30);
        getContentPane().add(jp);
    }

    public void poblarGui() {
        Container marco = getContentPane();

        txtRastreo = new JTextField();
        //txtRastreo.setBorder(null);
        txtRastreo.setBounds(30, 38, 230, 20);
        txtRastreo.setBorder(BorderFactory.createLineBorder(Color.white));
        txtRastreo.setFont(new Font("Arial", Font.BOLD, 16));
        txtRastreo.setHorizontalAlignment(JTextField.RIGHT);
        txtRastreo.setEditable(false);
        
        Font fuente = new Font("TimesRoman", Font.BOLD, 36);
        display = new JTextField("0");//display.setText("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBorder(BorderFactory.createLineBorder(Color.white));
        display.setFont(fuente);
        display.setBackground(Color.WHITE);
        //marco.setVisible(true);
        marco.setLayout(null);

        //verDisplay();
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
        siete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnSiete();
            }
        });
        multi.setBounds(210, 270, 50, 50);
        multi.setFont(new Font("Arial", Font.BOLD, 18));
        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnMulti();
            }
        });
        ocho.setBounds(90, 150, 50, 50);
        ocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnOcho();
            }
        });
        resta.setBounds(210, 210, 50, 50);
        resta.setFont(new Font("Arial", Font.BOLD, 18));
        resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnResta();
            }
        });
        nueve.setBounds(150, 150, 50, 50);
        nueve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnNueve();
            }
        });
        suma.setBounds(210, 150, 50, 50);
        suma.setFont(new Font("Arial", Font.BOLD, 18));
        suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnSuma();
            }
        });

        divi.setBounds(210, 330, 50, 50);
        divi.setFont(new Font("Arial", Font.BOLD, 18));
        divi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnDivi();
            }
        });
        clear.setBounds(30, 390, 230, 50);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnClear();
            }
        });

        seis.setBounds(30, 210, 50, 50);
        seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnSeis();
            }
        });
        cinco.setBounds(90, 210, 50, 50);
        cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnCinco();
            }
        });
        cuatro.setBounds(150, 210, 50, 50);
        cuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnCuatro();
            }
        });

        tres.setBounds(30, 270, 50, 50);
        tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnTres();
            }
        });

        dos.setBounds(90, 270, 50, 50);
        dos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnDos();
            }
        });

        uno.setBounds(150, 270, 50, 50);
        uno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnUno();
            }
        });

        cero.setBounds(30, 330, 50, 50);
        cero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnCero();
            }
        });
        punto.setBounds(90, 330, 50, 50);
        punto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnPunto();
            }
        });
        igual.setBounds(150, 330, 50, 50);
        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones.accionBtnIgual();
            }
        });
        display.setBounds(30, 50, 230, 70);
        display.setEditable(false);
        marco.add(txtRastreo);
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
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        new FrmCalculadora();

    }

}
