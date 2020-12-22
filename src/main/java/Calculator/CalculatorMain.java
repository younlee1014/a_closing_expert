package Calculator;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        int firstNum;
        String symbol;
        int endNum;

        System.out.println("숫자를 입력하세요.");
        firstNum = sc.nextInt();

        System.out.println("연산식을 입력하세요.");
        symbol = sc.next();

        System.out.println("숫자를 입력하세요.");
        endNum = sc.nextInt();

        if (StringUtils.equals(symbol, "*")) {
            System.out.println(firstNum + symbol + endNum + " = " + cal.mul(firstNum, endNum) + " 입니다. ");
        }else if(StringUtils.equals(symbol, "/")){
            System.out.println(firstNum + symbol + endNum + " = " + cal.divide(firstNum, endNum) + " 입니다. ");
        }else if(StringUtils.equals(symbol, "+")){
            System.out.println(firstNum + symbol + endNum + " = " + cal.plus(firstNum, endNum) + " 입니다. ");
        }else if(StringUtils.equals(symbol, "-")){
            System.out.println(firstNum + symbol + endNum + " = " + cal.minus(firstNum, endNum) + " 입니다. ");
        }

    }
}
