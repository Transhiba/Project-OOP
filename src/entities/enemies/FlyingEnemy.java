package entities.enemies;

import entities.Player;

public class FlyingEnemy extends Enemy {

    public FlyingEnemy(int x, int y) {
        super(x, y);
        this.speed = 4; // very fast
    }

    @Override
    public void update(Player player) {
        // ignores obstacles (same movement but faster)
        super.update(player);

        // small zig-zag effect
        y += Math.sin(System.currentTimeMillis() * 0.01) * 2;
    }
}