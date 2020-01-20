package Calculator;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void sumTest() {
        assertEquals(30, Calculator.sum(10, 20));
    }

    @Test
    public void subTest() {
        assertEquals(10, Calculator.sub(40, 30));
    }

    @Test
    public void mulTest() {
        assertEquals(25, Calculator.mul(5, 5));
    }

    @Test
    public void divTest(){
        assertEquals(5, Calculator.div(10, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산값 입력 : ");

        String value = scanner.nextLine();
        System.out.println("입력 값 : ");

        if (value.isEmpty()) {
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
        Output.print(result);
    }
}
