import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Usuario {
    public static String getSaludo(String nombre) {
        return ("¡Hola, " + nombre + "!");
    }
}

public class VentanaSaludo {
    public static void main(String[] args) {

        JFrame ventana = new JFrame ( " App de Saludo ICC490 " ) ;
        ventana . setSize (600 , 400) ;
        ventana . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE ) ;
        ventana . setLayout ( null ) ;
        ventana . getContentPane().setBackground(Color.decode("#FFB6C1"));
        JTextField campoTexto = new JTextField () ;
        campoTexto . setBounds (50 , 30 , 200 , 25) ;
        JButton botonSaludar = new JButton ( " Saludar " ) ;
        botonSaludar . setBounds (270 , 30 , 150 , 75) ;
        JLabel etiquetaSaludo = new JLabel ( " Aqui aparecera su saludo " ) ;
        etiquetaSaludo . setBounds (50 , 80 , 300 , 25) ;
        botonSaludar . addActionListener ( e -> {
            String nombre = campoTexto . getText () ;
            if (nombre.trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Por favor ingresa tu nombre.");
            } else {
                etiquetaSaludo.setText("¡Hola, " + nombre +"!");
            }
        }) ;


        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });


        ventana . add ( campoTexto ) ;
        ventana . add ( botonSaludar ) ;
        ventana . add ( etiquetaSaludo ) ;
        ventana . setLocationRelativeTo ( null ) ;
        ventana . setVisible ( true ) ;

    }
}