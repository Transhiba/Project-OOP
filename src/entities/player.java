package entities;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

    private int speed = 5;

    // Jump + physics
    private int yVelocity = 0;
    private boolean inAir = false;
    private int gravity = 1;

    public Player(int x, int y) {
        super(x, y, 40, 40);
    }

    // Horizontal movement only
    public void move(int dx, int dy) {
        x += dx * speed;
    }

    // Jump
    public void jump() {
        if (!inAir) {
            yVelocity = -15; // jump strength
            inAir = true;
        }
    }

    @Override
    public void update() {

        // Apply gravity
        if (inAir) {
            y += yVelocity;
            yVelocity += gravity;

            // Ground check (temporary)
            if (y >= 500) {
                y = 500;
                inAir = false;
                yVelocity = 0;
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    // TEMP attack (for testing)
    public void attack() {
        System.out.println("Player attacked!");
    }
}