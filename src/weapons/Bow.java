package weapons;

import entities.Player;
import entities.Enemy;

import java.util.ArrayList;

public class Bow extends Weapon {

    public Bow() {
        damage = 10;
    }

    @Override
    public void attack(Player player, ArrayList<Enemy> enemies) {
        System.out.println("Shoot arrow!");
    }
}