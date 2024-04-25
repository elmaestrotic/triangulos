package triangulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TriAngulo extends JFrame  implements ActionListener{
    
    private JButton botón;
    private JPanel panel;
    
    public static void main(String[] args) {
        TriAngulo marco = new TriAngulo();
        marco.setSize(350, 300);
        marco.crearGui();
        marco.setVisible(true);
    }


    private void crearGui() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);

        botón = new JButton("Dame clic");
        ventana.add(botón);
        botón.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        Graphics hoja = panel.getGraphics();
        dibujarLogo(hoja, 10, 20);
        dibujarLogo(hoja, 100, 100);
        dibujarTriAngulo(hoja, 100, 10, 40, 40);
        dibujarTriAngulo2(hoja, 10, 100, 20, 60);
    }

    private void dibujarLogo(Graphics marcoDibujo, int xPos, int yPos) {
        marcoDibujo.drawRect(xPos, yPos, 60, 60);
        marcoDibujo.drawRect(xPos, yPos, 40, 40);
        marcoDibujo.drawRect(xPos, yPos, 20, 20);
    }

    private void dibujarTriAngulo(Graphics marcoDibujo, int lugarX, int lugarY, int anchura, int altura) {

        marcoDibujo.drawLine(lugarX, lugarY, lugarX, lugarY + altura);
        marcoDibujo.drawLine(lugarX, lugarY + altura, lugarX + anchura, lugarY + altura);
        marcoDibujo.drawLine(lugarX, lugarY, lugarX + anchura, lugarY + altura);
    }
private void dibujarTriAngulo2(Graphics areaDibujo, int lugarX, int lugarY, int anchura, int altura) {
int esquinaDerechaX, esquinaDerechaY;

    esquinaDerechaX=lugarX +anchura;
    esquinaDerechaY=lugarX+ altura;
    
    
        areaDibujo.drawLine(lugarX, lugarY, lugarX, esquinaDerechaY);
        areaDibujo.drawLine(lugarX, esquinaDerechaY,esquinaDerechaX,esquinaDerechaY);
        areaDibujo.drawLine(lugarX, lugarY, esquinaDerechaX,esquinaDerechaY);
    }
    
}
