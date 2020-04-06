package Lesson_1;

public class Treadmill implements Barrier {

    private static final int LENGTH = 100;

    @Override
    public boolean barrierBy(Move mover) {
        if (mover.toRun() >= LENGTH) {
            System.out.println(mover + " пробежал " + LENGTH + " метров.");
            return true;
        } else {
            System.out.println(mover + " не смог пробежать " + LENGTH + " метров.");
            return false;
        }
    }
}
