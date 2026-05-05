package levels;

import entities.Enemy;
import java.util.ArrayList;

public class Level {

    private ArrayList<Enemy> enemies;

    public Level(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    // Check if level is cleared
    public boolean isCleared() {
        return enemies.isEmpty();
    }
}