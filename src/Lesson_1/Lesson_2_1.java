package Lesson_1;

public class Lesson_2_1 {

    public static void main(String[] args) {

        Move human = new Human(500, 2);
        Move robot = new Robot(5, 1);
        Move cat = new Cat(20, 3);

        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();

        Games games = new Games();
        games.setMovers(human, robot, cat);
        games.setBarriers(wall, treadmill);

        games.startGame();
    }
}
