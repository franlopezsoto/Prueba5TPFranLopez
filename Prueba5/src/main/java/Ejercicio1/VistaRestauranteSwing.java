package Ejercicio1;

import javax.swing.*;
import java.awt.*;

public class VistaRestauranteSwing {
    private JFrame frame;
    private JTextArea textArea;

    public VistaRestauranteSwing() {
        frame = new JFrame("Sistema de Gestión de Restaurantes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void imprimirEstructuraRestaurantes(String descripcion) {
        textArea.append(descripcion + "\n");
    }
}
