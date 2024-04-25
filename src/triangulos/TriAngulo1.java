package triangulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class TriAngulo1 extends JFrame implements ActionListener, ChangeListener {

    private JButton botón;
    private JButton botón2;
    private JPanel panel;
    private JSlider deslizable;
    private JSlider slider;
    private JLabel label;
    private JLabel lblAlto;
    private int ancho, alto;
    private GridBagLayout esquema;

    public static void main(String[] args) {
        TriAngulo1 marco = new TriAngulo1();
        marco.setSize(1000, 700);//tamaño de la ventanita o frame parametros(ancho y alto)
        marco.crearGui();
        marco.setVisible(true);
    }

    private void crearGui() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();

        esquema = new GridBagLayout();
        //ventana.setLayout(esquema));
        ventana.setLayout(esquema);

        label = new JLabel("Seleccione el ancho  que tendrá \n el triángulo");
        // ventana.add(label, BorderLayout.NORTH);
        //ventana.add(label);
        // this.getContentPane().add (label);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 1; // La etiqueta ocupa 1 filas.
        constraints.weighty = 0.0; // La fila 0 debe estirarse, le ponemos un 1.0
        constraints.fill = GridBagConstraints.NORTHWEST; //la ubicamos arriba a la izquierda
        this.getContentPane().add(label, constraints);// la agregamos al contenedor
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;
        //label.reshape(50,40,420,40);

        slider = new JSlider(JSlider.HORIZONTAL, 50, 250, 50);
        slider.setInverted(false);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true);

        constraints.gridx = 2;// El slider empieza en la columna 1.
        constraints.gridy = 0;// El slider empieza en la fila 0
        constraints.gridwidth = 2;// La etiqueta ocupa dos columnas.
        constraints.gridheight = 1;// La etiqueta ocupa una fila.
        // El area de texto debe estirarse en ambos sentidos. Ponemos el campo fill.
        constraints.fill = GridBagConstraints.CENTER;
        constraints.weighty = 3.0;// La fila 0 debe estirarse, le ponemos un 1.0
        this.getContentPane().add(slider, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;
        slider.addChangeListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(650, 400));//tamaño de la hojita dónde dibujaremos ancho y alto
        panel.setBackground(Color.WHITE);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 4;//el Panel ocupa 4 columnas
        constraints.gridheight = 5;//el Panel ocupa 5 filas
        constraints.weighty = 5.0;//estiramos fila 
        constraints.fill = GridBagConstraints.CENTER;
        this.getContentPane().add(panel, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;

        lblAlto = new JLabel("Seleccione el Alto \n que tendrá  el triángulo");

        constraints.gridx = 5; // El área de texto empieza en la columna 5.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 1; // El área de texto ocupa 1 filas.
        constraints.weighty = 0.0; // La fila 0 debe estirarse, le ponemos un 1.0

        constraints.fill = GridBagConstraints.CENTER;
        this.getContentPane().add(lblAlto, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;

        deslizable = new JSlider(JSlider.VERTICAL, 50, 250, 50);
        deslizable.reshape(20, 90, 120, 40);
        deslizable.setPaintTicks(true);
        deslizable.setMajorTickSpacing(50);
        deslizable.setMinorTickSpacing(10);
        deslizable.setPaintLabels(true);
        //ventana.add(deslizable);

        constraints.gridx = 5;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.NORTHEAST;
        this.getContentPane().add(deslizable, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;
        deslizable.addChangeListener(this);

        botón = new JButton("Dibujar triángulo");
        //botón.reshape(20,90,120,40);// x,y,ancho,alto
        //ventana.add(botón);

        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add(botón, constraints);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;
        botón.addActionListener(this);

        botón2 = new JButton("Salir");
        constraints.gridx = 5;//columna 3
        constraints.gridy = 6;//fila 6
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        this.getContentPane().add(botón2, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;

        botón2.addActionListener(this);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.
        constraints.anchor = GridBagConstraints.CENTER;

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
        if (e.getSource()==botón) {
            setTitle("boton 1");
               Graphics hoja = panel.getGraphics();
             dibujarTriAngulo2(hoja, 80, 100, ancho, alto);//200 es el ancho y 160 la altura del triangulo
        }
        if (e.getSource()==botón2) {
            setTitle("boton 2");
              
            javax.swing.JOptionPane.showMessageDialog(null,"Gloria a D-os");
           System.exit(0);
        }
         
    }
   // }

    /*public void actionPerformed(ActionEvent e) {

        /* String puntoX = JOptionPane.showInputDialog("Digite las coordenadas del punto Xincicial, mínimo 30 - máximo 150\n"
         + "desde el cual se dibujara el triangulo");
         int inicialX = Integer.parseInt(puntoX);

         String puntoY = JOptionPane.showInputDialog("Digite la coordenada del punto Y incicial, mínimo 30 - máximo 150\n"
         + "para formar el punto inicial con X(" + inicialX + ",y)desde el cual se dibujara el triangulo,\n"
         + " (x,y) ejemplo 80, 100");
         int inicialY = Integer.parseInt(puntoY);*/
       ///Graphics hoja = panel.getGraphics();

        // dibujarTriAngulo(hoja, 100, 10, 40, 40);
        // dibujarTriAngulo(hoja, 10, 100, 20, 60);
        // dibujarTriAngulo2(hoja, inicialX, inicialY, ancho, alto);
        //                   80,100 son las coordnedas(x,y) del puntoinicial, desde donde empezaremos a dibujar el triangulo
       // dibujarTriAngulo2(hoja, 80, 100, ancho, alto);//200 es el ancho y 160 la altura del triangulo
    //}*/

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
