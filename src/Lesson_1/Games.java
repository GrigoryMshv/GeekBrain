package Lesson_1;

public class Games {

    private Move[] movers;
    private Barrier[] barriers;

    public void setMovers(Move ... movers) {
        this.movers = movers;
    }
    public void setBarriers(Barrier ... barriers) {
        this.barriers = barriers;
    }

    public void startGame() {
        for(Move mover : movers) {
            boolean success = fullSuccess(mover);
            if(success) {
                System.out.println("Участник " + mover + " прошёл препятсвия.");
            } else {
                System.out.println("Участник " + mover + " не прошёл препятсвия.");
            }
            System.out.println();
        }
    }

    private boolean fullSuccess(Move mover) {
        for(Barrier barrier : barriers) {
            if(!barrier.barrierBy(mover)) {
                return false;
            }
        }
        return true;
    }
}

