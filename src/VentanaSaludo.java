import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Usuario {
    public static String getSaludo(String nombre) {
        return ("¡Hola, " + nombre + "!");
    }
}

public class VentanaSaludo extends JFrame {
    private JTextField campoTexto;
    private JButton botonSaludar;
    private JLabel etiquetaSaludo;

    public VentanaSaludo() {
        setTitle("App de saludo ICC490");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#FFB6C1"));

        inicializarComponentes();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {

        campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 150, 75);

        etiquetaSaludo = new JLabel("Aqui aparecera su saludo");
        etiquetaSaludo.setBounds(50, 80, 300, 25);

        botonSaludar.addActionListener(e -> mostrarSaludo());

        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });

        add(campoTexto);
        add(botonSaludar);
        add(etiquetaSaludo);

    }

    public void mostrarSaludo() {
        String nombre = campoTexto.getText();
        if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Profavor ingresa un nombre valido.");
        } else {
            etiquetaSaludo.setText(Usuario.getSaludo(nombre));
        }
    }

    public static void main(String[] args) {

        new VentanaSaludo();
    }
}