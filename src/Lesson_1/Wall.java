package Lesson_1;

public class Wall {

    private static final int HEIGHT = 2;

    @Override
    public boolean barrierBy(Move mover) {
        if(mover.toJump() >= HEIGHT) {
            System.out.println(mover + " перепрыгнул " + HEIGHT + " метров.");
            return true;
        } else {
            System.out.println(mover + " не смог перепрыгнуть " + HEIGHT + " метров.");
            return false;
        }
    }
}
