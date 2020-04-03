package Lesson_1;

public class Treadmill {

    private static final int LENGTH = 100;

    @Override
    public boolean barrierBy(Move mover) {
        if(mover.toRun() >= LENGTH) {
            System.out.println(mover + " перепрыгнул " + LENGTH + " метров.");
            return true;
        } else {
            System.out.println(mover + " не смог перепрыгнуть " + LENGTH + " метров.");
            return false;
        }
    }
}
