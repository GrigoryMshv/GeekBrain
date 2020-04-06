package Lesson_1;

public class Main {

    public static void main(String[] args) {

        Move human = new Human(500, 2);
        System.out.println(new Treadmill().doRun(human));
        System.out.println(new Wall().doJump(human));

        Move robot = new Robot(5, 1);
        System.out.println(new Treadmill().doRun(robot));
        System.out.println(new Wall().doJump(robot));

        Move cat = new Cat(20, 3);
        System.out.println(new Treadmill().doRun(cat));
        System.out.println(new Wall().doJump(cat));

        Move[] sportmens = new Move[3];
        sportmens[0] = human;
        sportmens[1] = robot;
        sportmens[2] = cat;
    }
}
