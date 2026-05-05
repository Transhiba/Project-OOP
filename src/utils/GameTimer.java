package utils;

public class GameTimer {

    private final long frameTime;

    public GameTimer(int fps) {
        this.frameTime = 1000 / fps;
    }

    public void sleep(long startTime) {
        long elapsed = System.currentTimeMillis() - startTime;
        long wait = frameTime - elapsed;

        if (wait > 0) {
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}