package lesson.lesson_31;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class HelloSwing extends JFrame {
    private Random random = new Random();

    final Color[] COLORS = {Color.green, Color.blue, Color.red, Color.CYAN, Color.MAGENTA};
    private int CIRCLE_COUNT = 100;
    private enum ShapeForm {CIRCLES, RESTANGLES, TRIANGLES};



    public static void main(String[] args) {
        new HelloSwing(); // создаём объект-окно
    }

    HelloSwing() {
        setTitle("Hello, Swing!");  // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
        setSize(500, 300); // размеры окна
        setLocationRelativeTo(null); // позиция на экране

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX()+". "+ e.getY());
                canvas.repaint();
            }
        });

        JButton btnDraw = new JButton("Draw"); // создаем кнопки
        JButton btnExit = new JButton("Exit");

        btnDraw.addActionListener(e -> {
            System.out.println("Draw!");
            canvas.repaint();
        });

        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());//создаем кнопочную панель
        btnPanel.add(btnDraw);// добавляем кнопки
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);// добавление кнопки справа
        add(canvas, BorderLayout.CENTER);// добавление кнопки слева

//        add(btnDraw, BorderLayout.NORTH);
//        add(btnExit, BorderLayout.SOUTH);
        setVisible(true); // сделать видимым
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < CIRCLE_COUNT; i++) {
                int d = random.nextInt(20) + 60;
                int x = random.nextInt(getWidth() - d);
                int y = random.nextInt(getHeight() - d);
                Color color = COLORS[random.nextInt(COLORS.length)];
                g.setColor(color);
                g.fillOval(x, y, d, d);
                g.setColor(Color.black);
                g.drawOval(x, y, d, d);
            }
        }
    }
}

