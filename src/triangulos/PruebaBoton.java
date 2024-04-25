
package triangulos;
import java.awt.*;
import java.awt.event.*;
 
public class PruebaBoton{
    private Frame ventana;
    private Button boton1;
    private Button boton2;
 
    public PruebaBoton(){
        ventana = new Frame("Probando Button");
        ventana.setSize(120, 80);
        ventana.addWindowListener(new WindowListener(){
            public void windowOpened(WindowEvent e){}
            public void windowActivated(WindowEvent e){}
            public void windowDeactivated(WindowEvent e){}
            public void windowIconified(WindowEvent e){}
            public void windowDeiconified(WindowEvent e){}
            public void windowClosed(WindowEvent e){}
            public void windowClosing(WindowEvent e){
                ventana.dispose();
            }
        });
        boton1 = new Button("Boton 1");
        boton2 = new Button("Boton 2");
        EscuchaBoton eb = new EscuchaBoton();
        boton1.addActionListener(eb);
        boton2.addActionListener(eb);
        ventana.setLayout(new FlowLayout());
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.setVisible(true);
    }
 
    class EscuchaBoton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Button b = (Button)e.getSource();
            System.out.println("Boton presionado: " + b.getLabel());
            if (b == boton1)
                System.out.println("\tSI, definitivamente es el boton1");
            else if (b == boton2)
                System.out.println("\tSI, definitivamente es el boton2");
        }
    }
 
    public static void main(String[] args){
        PruebaBoton pb = new PruebaBoton();
    }
}