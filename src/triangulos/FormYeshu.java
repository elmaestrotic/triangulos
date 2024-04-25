package triangulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FormYeshu extends JFrame implements ActionListener {

    private JButton ok;
    private JButton salir;
    private JTextField display;
    
    private FormYeshu(){
             
      setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        FormYeshu ventana = new FormYeshu();
        ventana.setSize(700, 500);
        
       ventana.setResizable(false);
        
        ventana.setVisible(true);
        ventana.crearGui();

    }//fin del main

    public void actionPerformed(ActionEvent munde) {
        if (munde.getSource() == ok) {
            JOptionPane.showMessageDialog(null, "Gloria a D-os");

        } else {
            System.exit(0);
        }

    }

    public void crearGui() {

        Container marco = getContentPane();
        marco.setLayout(null);
        
        display =new JTextField();
        display.setBounds(100, 10, 100, 30);
        marco.add(display);

        ok = new JButton("ok");
        ok.setBounds(30, 30, 90, 20);
        ok.addActionListener(this);
        marco.add(ok);

        salir = new JButton("salir adios ya");
        salir.setBounds(60, 60, 90, 20);
        salir.addActionListener(this);
        marco.add(salir);

    }

}
