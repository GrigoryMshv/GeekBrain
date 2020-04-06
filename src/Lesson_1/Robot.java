package Lesson_1;

public class Robot implements Move {

    private int robotRunLength;
    private int robotJumpHeight;

    Robot(int robotRunLength, int robotJumpHeight) {
        this.robotRunLength = robotRunLength;
        this.robotJumpHeight = robotJumpHeight;
    }

    @Override
    public int toRun() {
        System.out.println("Робот может пробежать " + robotRunLength + " метров.");
        return robotRunLength;
    }

    @Override
    public int toJump() {
        System.out.println("Робот может прыгать на " + robotJumpHeight + " метров.");
        return robotJumpHeight;
    }

    @Override
    public String toString() {
        return "Робот";
    }
}
