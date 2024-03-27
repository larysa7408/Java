package homework.homework_31;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #31
 *
 * @author Larysa Petrova
 * @version 27-Mart-24
 **/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class FigureSwing extends JFrame {
    private final int SHAPE_COUNT = 100;
    private int shapeForm;
    private final Color[] COLORS = {
            Color.green,
            Color.CYAN,
            Color.blue,
            Color.MAGENTA,
            Color.pink,
            Color.orange,
            Color.yellow};


    public static void main(String[] args) {
        new FigureSwing();
    }

    public FigureSwing() {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        Random random = new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX() + "," + e.getY());
                canvas.repaint();
            }
        });

        JButton btnCircles = new JButton("Circles");
        JButton btnRectangles = new JButton("Rectangles");
        JButton btnTriangles = new JButton("Triangles");
        JButton btnExit = new JButton("Exit");

        btnCircles.addActionListener(e -> {
            shapeForm = 1;
            canvas.repaint();
        });

        btnRectangles.addActionListener(e -> {
            shapeForm = 2;
            canvas.repaint();
        });
        btnTriangles.addActionListener(e -> {
            shapeForm = 3;
            canvas.repaint();
        });

        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnCircles);
        btnPanel.add(btnRectangles);
        btnPanel.add(btnTriangles);
        btnPanel.add(btnExit);


        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Random random = new Random();
            for (int i = 0; i < SHAPE_COUNT; i++) {
                if (shapeForm == 1) {
                    int d = random.nextInt(20) + 60;
                    int x = random.nextInt(getWidth() - d);
                    int y = random.nextInt(getHeight() - d);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    random.nextFloat();
                    g.setColor(color);
                    g.fillOval(x, y, d, d);
                    g.setColor(Color.black);
                    g.drawOval(x, y, d, d);
                }
                if (shapeForm == 2) {
                    int width = random.nextInt(20) + 60;
                    int height = random.nextInt(20) + 60;
                    int x = random.nextInt(getWidth() - width);
                    int y = random.nextInt(getHeight() - height);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    random.nextFloat();
                    g.setColor(color);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.black);
                    g.drawRect(x, y, width, height);
                }
                if (shapeForm == 3){
                    int lenght = random.nextInt(20)+60;
                    int h = (int) (lenght*Math.sqrt(3)/2);
                    int x1 = random.nextInt(getWidth()-lenght);
                    int y1 = random.nextInt(getHeight()-lenght);
                    int x2 = x1 + lenght;
                    int y2 = y1;
                    int x3 = x2 / 2;
                    int y3 = y2 + h;
                    Color color = COLORS [random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.drawLine(x1,y1,x2,y2);
                    g.drawLine(x1,y1,x3,y3);
                    g.drawLine(x3,y3,x2,y2);
                }
            }
        }
    }
}
