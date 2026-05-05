package weapons;

import entities.Player;
import entities.Enemy;

import java.util.ArrayList;

public class Staff extends Weapon {

    public Staff() {
        damage = 15;
    }

    @Override
    public void attack(Player player, ArrayList<Enemy> enemies) {
        System.out.println("Cast magic!");
    }
}