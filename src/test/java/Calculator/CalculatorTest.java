package Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산값 입력 : ");

        String value = scanner.nextLine();
        System.out.println("입력 값 : ");

        if(value.isEmpty()){
            throw new IllegalArgumentException("입력값이 없음");
        }

        String[] values = value.split(" ");

        int first = Integer.parseInt(values[0]);
        System.out.println("first : " + first);

        int result = first;
        for (int i = 1; i < values.length; i = i + 2) {
            String symbol = values[i];
            System.out.println("symbol : " + symbol);

            int second = Integer.parseInt(values[i + 1]);
            System.out.println("second : " + second);

            result = Calculator.calculator(result, symbol, second);
        }
        OutPut.print(result);
    }
}
