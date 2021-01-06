package racingcar.model;

public class RacingCar {
    private final static int NUMBER_OF_MOVES = 4;
    private int position;

    public RacingCar() {
        position = 0;
    }

    public void move() {
        position++;
    }

    public String showMove(char hyphen) {
        StringBuffer track = new StringBuffer();
        for(int i=0; i<position; i++) {
            track.append(hyphen);
        }
        return track.toString();
    }

    public int getPosition() {
        return position;
    }

    public boolean isMove(int number) {
        if (number >= NUMBER_OF_MOVES) {
            return true;
        }
        return false;
    }
}
