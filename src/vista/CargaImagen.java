package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CargaImagen extends JFrame {

    public CargaImagen() {
        setSize(300, 300);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        Dimension dim = getSize();

        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/FondoAzul.png")).getImage());
        g.drawImage(img.getImage(), 0, 0, dim.width, dim.height, null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        new CargaImagen();
    }

}
