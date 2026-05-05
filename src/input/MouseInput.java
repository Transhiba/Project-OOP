package input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter {

    private boolean attack = false;

    @Override
    public void mousePressed(MouseEvent e) {
        attack = true;
    }

    public boolean isAttacking() {
        return attack;
    }

    public void reset() {
        attack = false;
    }
}