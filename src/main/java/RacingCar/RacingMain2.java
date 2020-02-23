package RacingCar;

import java.util.Random;

public class RacingMain2 {
    public static void main(String[] args) {
        int[] carPosition = {0, 0, 0};
        int num = 4;

        for (int i = 0; i < carPosition.length; i++) {
            //시도 횟수만큼 돌아야 함
            for (int j = 0; j < num; j++) {
                int random = randomTen();
                boolean ran = randomNumber(random);
                if(ran){
                    carPosition[i]++;
                }
            }
        }

        for(int h=0; h<carPosition.length; h++) {
            int p = carPosition[h];
            for (int f = 0; f < p; f++) {
                System.out.print('-');
            }
            System.out.println();
        }
    }

    //랜덤한 4 이상
    static boolean randomNumber(int randomInt) {
        if (randomInt >= 4) return true;
        return false;
    }

    //랜덤한 수 0~9
    static int randomTen() {
        Random random = new Random();
        int randomTen = random.nextInt(10);
        return randomTen;
    }

}
