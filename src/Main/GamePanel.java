package main;

import javax.swing.JPanel;
import java.awt.Graphics;

public class GamePanel extends JPanel implements Runnable {

    private Thread gameThread;
    private boolean running = true;

    public GamePanel() {
        setFocusable(true);

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (running) {
            update();
            repaint();

            try {
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() {
        // game logic will go here later
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // temporary test drawing (optional)
        g.drawString("Game is running...", 300, 300);
    }
}