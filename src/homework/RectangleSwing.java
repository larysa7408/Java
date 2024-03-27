package homework;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #31
 *
 * @author Larysa Petrova
 * @version 27-Mart-24
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RectangleSwing extends JFrame {
    private int numRectangle = 100;
    private final Color[] COLORS = {
            Color.green,
            Color.CYAN,
            Color.blue,
            Color.MAGENTA,
            Color.pink,
            Color.orange,
            Color.yellow};


    public static void main(String[] args) {
        new RectangleSwing();
    }

    public RectangleSwing() {
        setTitle("Rectang");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        JButton draw = new JButton("Draw");
        JButton exit = new JButton("Exit");

        draw.addActionListener(e -> canvas.repaint());

        exit.addActionListener(e -> System.exit(0));

        Panel panel = new Panel();
        panel.setLayout(new GridLayout());
        panel.add(draw);
        panel.add(exit);

        add(panel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Random random = new Random();
            for (int i = 0; i < numRectangle; i++) {
                int x = random.nextInt(getWidth());
                int y = random.nextInt(getHeight());
                int width = random.nextInt(100);
                int height = random.nextInt(100);
                Color color = COLORS[random.nextInt(COLORS.length)];
                random.nextFloat();
                g.setColor(color);
                g.fillRect(x, y, width, height);
            }
        }
    }
}
