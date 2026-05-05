package weapons;

import entities.Player;
import entities.Enemy;

import java.util.ArrayList;

public class Sword extends Weapon {

    public Sword() {
        damage = 20;
    }

    @Override
    public void attack(Player player, ArrayList<Enemy> enemies) {

        for (Enemy e : enemies) {
            // simple range check (close combat)
            if (Math.abs(e.getX() - player.getX()) < 50 &&
                Math.abs(e.getY() - player.getY()) < 50) {

                System.out.println("Sword hit enemy!");
                // damage will be added later
            }
        }
    }
}