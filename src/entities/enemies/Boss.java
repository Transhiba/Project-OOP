package entities.enemies;

import entities.Player;

public class Boss extends Enemy {

    private int health = 500;
    private int phase = 1;

    public Boss(int x, int y) {
        super(x, y);
        this.speed = 2;
        this.width = 100;
        this.height = 100;
    }

    @Override
    public void update(Player player) {
        super.update(player);

        // change behavior based on health
        if (health < 300) {
            phase = 2;
            speed = 3;
        }

        if (health < 150) {
            phase = 3;
            speed = 4;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public int getPhase() {
        return phase;
    }
}