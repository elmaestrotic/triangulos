package triangulos;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class PruebaCalc extends JFrame implements ActionListener {

    private JButton b1, b2, bsuma, bigual;
    private JTextField display;
    private boolean sSuma = false, oSuma = false;
    private Float temp1, temp2;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1 && sSuma == true) {
            display.setText("1");
            sSuma = false;
        } else {
            if (e.getSource() == b1) {
                display.setText(display.getText() + "1");

            }
        }

        if (e.getSource() == b2 && sSuma == true) {
            display.setText("2");
            sSuma = false;
        } else {
            if (e.getSource() == b2) {
                display.setText(display.getText() + "2");
            }
        }

        if (e.getSource() == bsuma) {
            sSuma = true;
            oSuma = true;
            temp1 = Float.parseFloat(display.getText());

        }

        if (e.getSource() == bigual) {
            if (oSuma) {
                temp2 = Float.parseFloat(display.getText());

                display.setText(Float.toString(Operaciones.suma(temp1, temp2)));

            }

        }

    }

    public void poblarGui() {
        Container marco = getContentPane();
        marco.setLayout(null);

        display = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        bsuma = new JButton("+");
        bigual = new JButton("=");

        display.setBounds(30, 10, 200, 40);
        b1.setBounds(30, 60, 50, 50);
        b2.setBounds(90, 60, 50, 50);
        bsuma.setBounds(30, 120, 50, 50);
        bigual.setBounds(90, 120, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        bsuma.addActionListener(this);
        bigual.addActionListener(this);

        marco.add(display);
        marco.add(b1);
        marco.add(b2);
        marco.add(bsuma);
        marco.add(bigual);

    }

    public static void main(String[] args) {
        PruebaCalc ventana = new PruebaCalc();
        ventana.setSize(290, 500);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        ventana.poblarGui();

        ventana.setVisible(true);

    }

}
