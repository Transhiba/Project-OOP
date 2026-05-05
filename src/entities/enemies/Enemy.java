package entities.enemies;

import entities.GameObject;
import entities.Player;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends GameObject {

    protected int speed = 2;

    public Enemy(int x, int y) {
        super(x, y, 40, 40);
    }

    public void update(Player player) {
        // simple AI: follow player
        if (player.getX() < x) x -= speed;
        if (player.getX() > x) x += speed;

        if (player.getY() < y) y -= speed;
        if (player.getY() > y) y += speed;
    }

    @Override
    public void update() {
        // not used (we use update(player))
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
}