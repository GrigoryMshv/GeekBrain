package Lesson_1;

public class Cat implements Move {

    private int catRunLength;
    private int catJumpHeight;

    public Cat(int catRunLength, int catJumpHeight) {
        this.catRunLength = catRunLength;
        this.catJumpHeight = catJumpHeight;
    }

    @Override
    public int toRun() {
        System.out.println("Кот может пробежать " + catRunLength + " метров.");
        return catRunLength;
    }

    @Override
    public int toJump() {
        System.out.println("Кот может прыгать на " + catJumpHeight + " метра.");
        return catJumpHeight;
    }
}
