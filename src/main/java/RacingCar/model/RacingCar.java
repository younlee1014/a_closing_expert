package racingcar.model;

public class RacingCar {
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
}
