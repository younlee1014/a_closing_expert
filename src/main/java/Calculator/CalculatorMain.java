package Calculator;

import static Calculator.Calculator.input;
import static Calculator.Calculator.makeResult;

public class CalculatorMain {
    public static void main(String[] args) {

        System.out.println("문자열을 입력 하세요.");
        int result = makeResult(input());
        System.out.println("결과 값 : " + result);

    }
}
