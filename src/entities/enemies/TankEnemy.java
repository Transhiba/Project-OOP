package entities.enemies;

import entities.Player;

public class TankEnemy extends Enemy {

    private int health = 200;

    public TankEnemy(int x, int y) {
        super(x, y);
        this.speed = 1; // very slow
        this.width = 60;
        this.height = 60;
    }

    @Override
    public void update(Player player) {
        // slow but steady
        super.update(player);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isDead() {
        return health <= 0;
    }
}