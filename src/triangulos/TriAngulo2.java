package triangulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.event.ChangeListener;

public class TriAngulo2 extends JFrame implements ActionListener, ChangeListener {

    private JButton botón;
    private JButton botón2;
    private JPanel panel;
    private JSlider deslizable;
    private JSlider slider;
    private JLabel label;
    private JLabel lblAlto;
    private int ancho, alto;


   
       
    

    
    
    public static void main(String[] args) {
        TriAngulo2 marco2 = new TriAngulo2();
        marco2.setSize(800, 700);//tamaño de la ventanita o frame parametros(ancho y alto)
        marco2.crearGui();
        marco2.setVisible(true);
        marco2.setLocationRelativeTo(null);
        
    }

    
    
    
    
    
    private void crearGui() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();

        
        ventana.setLayout(null);

        label = new JLabel("Seleccione el ancho  que tendrá \n el triángulo");
 
        ventana.add(label);
        label.setBounds(280, 20, 300, 30);//x,y W , H
        
        slider = new JSlider(JSlider.HORIZONTAL, 50, 250, 50);
        slider.setInverted(false);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true);

        slider.addChangeListener(this);
        slider.setBounds(540, 0, 220, 80);
        ventana.add(slider);

        panel = new JPanel();
       // panel.setPreferredSize(new Dimension(650, 400));//tamaño de la hojita dónde dibujaremos ancho y alto
        panel.setBackground(Color.WHITE);
        panel.setBounds(30, 80,650, 450);
        this.getContentPane().add(panel);
        ventana.add(panel);

        lblAlto = new JLabel("Seleccione el Alto \n que tendrá  el triángulo");

        lblAlto.setBounds(460, 520, 300, 30);//x,y W , H
        ventana.add(lblAlto);

        deslizable = new JSlider(JSlider.VERTICAL, 50, 250, 50);
        deslizable.setPaintTicks(true);
        deslizable.setMajorTickSpacing(50);
        deslizable.setMinorTickSpacing(10);
        deslizable.setPaintLabels(true);
        deslizable.addChangeListener(this);
        deslizable.setBounds(680, 350, 100, 200);
        ventana.add(deslizable);

        botón = new JButton("Dibujar triángulo");
        botón.addActionListener(this);

        botón.setBounds(300, 550, 128, 30);// x,y,ancho,alto
        ventana.add(botón);

        botón2 = new JButton("Salir");
        botón2.setBounds(500, 550, 60, 30);

        botón2.addActionListener(this);
        ventana.add(botón2);

    }//fin GUI

    //método que escucha y ejecuta el evento realizado sobre el slider 
    public void stateChanged(javax.swing.event.ChangeEvent e) {
        label.setText("El ancho es: " + slider.getValue());
        ancho = slider.getValue();
        //trasmitimos el ancho con el objeto "deslizador"
        lblAlto.setText("El alto es: " + deslizable.getValue());
        alto = deslizable.getValue();

    }
    // }

    //class EscuchaBoton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botón) {
            setTitle("boton 1");
            Graphics hoja = panel.getGraphics();
            dibujarTriAngulo2(hoja, 200, 10, ancho, alto);//200 es el ancho y 160 la altura del triangulo
        }
        if (e.getSource() == botón2) {
            setTitle("boton 2");

            javax.swing.JOptionPane.showMessageDialog(null, "Gloria a D-os");
            System.exit(0);
        }

    }

    private void dibujarTriAngulo(Graphics marcoDibujo, int lugarX, int lugarY, int anchura, int altura) {
        marcoDibujo.drawLine(lugarX, lugarY, lugarX, lugarY + altura);
        marcoDibujo.drawLine(lugarX, lugarY + altura, lugarX + anchura, lugarY + altura);
        marcoDibujo.drawLine(lugarX, lugarY, lugarX + anchura, lugarY + altura);
    }

    private void impiarTriangulo(Graphics marcoDibujo, int lugarX, int lugarY, int anchura, int altura) {
        marcoDibujo.drawLine(lugarX, lugarY, lugarX, lugarY + altura);
        marcoDibujo.drawLine(lugarX, lugarY + altura, lugarX + anchura, lugarY + altura);
        marcoDibujo.drawLine(lugarX, lugarY, lugarX + anchura, lugarY + altura);
    }

    private void dibujarTriAngulo2(Graphics areaDibujo1, int lugarX, int lugarY, int anchura, int altura) {
        Font fuente = new Font("TimesRoman", Font.BOLD, 12);
        Graphics2D areaDibujo = (Graphics2D) areaDibujo1;//casting a 2D
        int esquinaDerechaX = lugarX + anchura;
        int esquinaDerechaY = lugarX + altura;
        areaDibujo.setColor(Color.blue);
        areaDibujo.setFont(fuente);

        areaDibujo.drawString("Cateto a " + altura, lugarX / 2, lugarX + esquinaDerechaY / 2);
        areaDibujo.setStroke(new BasicStroke(5));//grosor de la línea

        //trazamos Cáteto adyacente o vertical
        areaDibujo.drawLine(lugarX, lugarY, lugarX, esquinaDerechaY);

        areaDibujo.setColor(Color.GREEN);
        //trazamos Cáteto opuesto u Horizontal
        areaDibujo.drawLine(lugarX, esquinaDerechaY, esquinaDerechaX, esquinaDerechaX);
        areaDibujo.drawString("Cateto b " + anchura, lugarX * 2, esquinaDerechaY);

        areaDibujo.setColor(Color.orange);
        areaDibujo.setStroke(new BasicStroke(10));//grosor de la línea
        areaDibujo.drawString("Hipotenusa " + TriAngulos.hiPotenusa(altura, anchura), lugarX * 2, esquinaDerechaY / 2);
        //trazamos Hipotenusa
        areaDibujo.drawLine(lugarX, lugarY, esquinaDerechaX, esquinaDerechaY);

    }

}
