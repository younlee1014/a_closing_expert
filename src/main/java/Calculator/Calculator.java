package Calculator;

public class Calculator {
    static int calculator(int first, String symbol, int second) {
        int result = 0;
        if (symbol.equals("+")) {
            result = sum(first, second);
        } else if (symbol.equals("-")) {
            result = sub(first, second);
            System.out.println("빼기 : " + result);
        } else if (symbol.equals("*")) {
            result = first * second;
            System.out.println("곱하기 : " + result);
        } else if (symbol.equals("/")) {
            result = first / second;
            System.out.println("나누기 : " + result);
        } else {
            throw new IllegalArgumentException("연산자 입력 오류");
        }
        return result;
    }

    static int sum(int first, int second) {
        return first + second;
    }

    static int sub(int first, int second) {
        return first - second;
    }

    static int mul(int first, int second){
        return first * second;
    }

    static int div(int first, int second){
        return first / second;
    }
}
