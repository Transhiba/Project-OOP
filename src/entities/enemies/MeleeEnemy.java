package entities.enemies;

import entities.Player;

public class MeleeEnemy extends Enemy {

    public MeleeEnemy(int x, int y) {
        super(x, y);
        this.speed = 3; // faster than normal
    }

    @Override
    public void update(Player player) {
        // same as base but faster (melee = chase aggressively)
        super.update(player);
    }
}