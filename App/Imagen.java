package project15;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen {

    private int width;
    private int height;

    public Imagen() {
        this.width = 0;
        this.height = 0;
    }

    private void mostrarImagen(String liga, JLabel dondeImprimir) {
        this.width = dondeImprimir.getWidth();
        this.height = dondeImprimir.getHeight();
        Image ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(liga).getScaledInstance(width, height, 0);
        ImageIcon ImagenEscalada = new ImageIcon(ImagenSeleccionada);
        dondeImprimir.setIcon(ImagenEscalada);
    }
}
