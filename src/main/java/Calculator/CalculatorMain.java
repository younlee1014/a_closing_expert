package Calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Input.getFirstValue(scanner);

        int result = first;

        while (true) {
            String symbol = Input.getSymbol(scanner);

            if (symbol.equals("quit")) {
                Output.print(result);
                break;
            }
            int second = Input.getSecondValue(scanner);
            result = Calculator.calculator(result, symbol, second);
            Output.print(result);
        }
    }
}
