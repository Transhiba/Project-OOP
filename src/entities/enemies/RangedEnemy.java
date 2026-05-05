package entities.enemies;

import entities.Player;

public class RangedEnemy extends Enemy {

    private int attackRange = 150;

    public RangedEnemy(int x, int y) {
        super(x, y);
        this.speed = 1; // slower
    }

    @Override
    public void update(Player player) {
        int dx = player.getX() - x;
        int dy = player.getY() - y;

        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance > attackRange) {
            // move closer if too far
            super.update(player);
        } else {
            // stop moving (simulate ranged attack)
            // you can add shooting logic later
        }
    }
}