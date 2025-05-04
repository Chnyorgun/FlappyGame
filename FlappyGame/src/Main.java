
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // JFrame oluşturuluyor
        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(360, 640);       // Pencere boyutunu ayarla
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Çıkış işlemi
        frame.setLocationRelativeTo(null); // Ekranın ortasına yerleştir
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon(Main.class.getResource("flappybird.png")).getImage());
          // Pencerenin boyutunu değiştirmeyi engelle
        

        // Doğrudan FlappyBird oyun panelini ekliyoruz
        FlappyBird game = new FlappyBird();
        frame.add(game);
        frame.revalidate(); // İçeriği yeniden doğrula
        frame.repaint();    // Yeniden çiz
        game.requestFocusInWindow(); // Klavye kontrolleri için

        // Frame'i görünür hale getiriyoruz
        frame.setVisible(true);
    }
}
