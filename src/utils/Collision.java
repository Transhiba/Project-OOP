package utils;

import entities.GameObject;

import java.awt.Rectangle;

public class Collision {

    // 1. AABB collision
    public static boolean isColliding(GameObject a, GameObject b) {
        return a.getBounds().intersects(b.getBounds());
    }

    // 2. Manual rectangle collision
    public static boolean isColliding(int x1, int y1, int w1, int h1,
                                      int x2, int y2, int w2, int h2) {

        return x1 < x2 + w2 &&
               x1 + w1 > x2 &&
               y1 < y2 + h2 &&
               y1 + h1 > y2;
    }

    // 3. Distance check (optimized, no sqrt)
    public static boolean isInRange(GameObject a, GameObject b, int range) {
        int dx = a.getX() - b.getX();
        int dy = a.getY() - b.getY();

        return dx * dx + dy * dy <= range * range;
    }

    // 4. Get bounds
    public static Rectangle getBounds(GameObject obj) {
        return new Rectangle(obj.getX(), obj.getY(), obj.getWidth(), obj.getHeight());
    }

    // 5. Point inside object
    public static boolean containsPoint(GameObject obj, int px, int py) {
        return getBounds(obj).contains(px, py);
    }
}