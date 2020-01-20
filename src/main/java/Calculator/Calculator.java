package Calculator;

public class Calculator {
    static int calculator(int first, String symbol, int second) {
        int result = 0;
        try {
            if (symbol.equals("+"))
                result = sum(first, second);
            System.out.println("더하기 : " + result);
            if (symbol.equals("-"))
                result = sub(first, second);
            System.out.println("빼기 : " + result);
            if (symbol.equals("*"))
                result = mul(first, second);
            System.out.println("곱하기 : " + result);
            if (symbol.equals("/"))
                result = div(first, second);
            System.out.println("나누기 : " + result);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return result;
    }

    static int sum(int first, int second) {
        return first + second;
    }

    static int sub(int first, int second) {
        return first - second;
    }

    static int mul(int first, int second) {
        return first * second;
    }

    static int div(int first, int second) {
        return first / second;
    }
}
