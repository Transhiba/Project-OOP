package levels;

import entities.*;
import java.util.ArrayList;

public class LevelManager {

    private ArrayList<Level> levels;
    private int currentLevelIndex = 0;

    public LevelManager() {
        levels = new ArrayList<>();
        loadLevels();
    }

    // LOAD ALL LEVELS
    private void loadLevels() {

        // LEVEL 1: melee + ranged
        ArrayList<Enemy> level1 = new ArrayList<>();
        level1.add(new MeleeEnemy(400, 500));
        level1.add(new RangedEnemy(600, 500));
        levels.add(new Level(level1));

        // LEVEL 2: + flying + tank
        ArrayList<Enemy> level2 = new ArrayList<>();
        level2.add(new MeleeEnemy(300, 500));
        level2.add(new RangedEnemy(500, 500));
        level2.add(new FlyingEnemy(400, 300));
        level2.add(new TankEnemy(700, 500));
        levels.add(new Level(level2));

        // LEVEL 3: boss only
        ArrayList<Enemy> level3 = new ArrayList<>();
        level3.add(new Boss(500, 400));
        levels.add(new Level(level3));
    }

    // GET CURRENT LEVEL ENEMIES
    public ArrayList<Enemy> getCurrentEnemies() {
        return levels.get(currentLevelIndex).getEnemies();
    }

    // CHECK LEVEL COMPLETE
    public boolean isLevelCleared() {
        return levels.get(currentLevelIndex).isCleared();
    }

    // MOVE TO NEXT LEVEL
    public void nextLevel() {
        if (currentLevelIndex < levels.size() - 1) {
            currentLevelIndex++;
            System.out.println("➡ Now entering Level " + (currentLevelIndex + 1));
        } else {
            System.out.println("🎉 Game Completed!");
        }
    }

    public void reset() {
        currentLevelIndex = 0;
        levels.clear();
        loadLevels();
    }

    public int getCurrentLevelNumber() {
        return currentLevelIndex + 1;
    }
}