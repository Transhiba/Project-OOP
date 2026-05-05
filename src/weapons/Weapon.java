package weapons;

import entities.Player;
import entities.Enemy;
import java.util.ArrayList;

public abstract class Weapon {

    protected int damage;

    public abstract void attack(Player player, ArrayList<Enemy> enemies);
}