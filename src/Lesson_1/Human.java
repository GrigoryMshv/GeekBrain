
package Lesson_1;

public class Human implements Move {

    private int humanRunLength;
    private int humanJumpHeight;

    Human(int humanRunLength, int humanJumpHeight) {
        this.humanRunLength = humanRunLength;
        this.humanJumpHeight = humanJumpHeight;
    }

    @Override
    public int toRun() {
        System.out.println("Человек может пробежать " + humanRunLength + " метров.");
        return humanRunLength;
    }

    @Override
    public int toJump() {
        System.out.println("Человек может прыгнуть на " + humanJumpHeight + " метра.");
        return humanJumpHeight;
    }
}

