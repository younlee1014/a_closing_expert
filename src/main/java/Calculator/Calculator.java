package Calculator;

public class Calculator {
    static int calculator(int first, String symbol, int second) {
        if (symbol == null || symbol.isEmpty() || symbol.equals(" "))
            throw new IllegalArgumentException("that's illegal !");
        if (symbol.equals("+"))
            return add(first, second);
        if (symbol.equals("-"))
            return subtract(first, second);
        if (symbol.equals("*"))
            return multiply(first, second);
        if (symbol.equals("/"))
            return division(first, second);
        throw new IllegalArgumentException("that's illegal !!");
    }

    static int add(int first, int second) {
        return first + second;
    }

    static int subtract(int first, int second) {
        return first - second;
    }

    static int multiply(int first, int second) {
        return first * second;
    }

    static int division(int first, int second) {
        return first / second;
    }

}
