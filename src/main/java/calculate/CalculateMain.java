package calculate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateMain {
    protected static Map<String, Calculate> calculateMap = new HashMap<>();

    static{
        calculateMap.put("+", new Plus());
        calculateMap.put("-", new Minus());
        calculateMap.put("*", new Multiply());
        calculateMap.put("/", new Divide());
    }

    public static void main(String[] args) {
        System.out.println("계산식을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

       execute(input);
    }

    public static void execute(String input){
        String[] splitStr = inputSplit(input);

        double result = toDouble(splitStr[0]);

        for(int i=1; i< splitStr.length; i+=2){

            double number = toDouble(splitStr[i+1]);
            String calculator = splitStr[i];
            result = operation(calculator, result, number);

        }
        System.out.println(result);
    }

    public static double operation(String calculator, double result, double number){
        Calculate calculate = calculateMap.get(calculator);
        if(calculate == null)
            throw new IllegalArgumentException();

        return calculate.calculate(result, number);
    }

    public static String[] inputSplit(String input){
        if(input == null || input.trim().length() == 0)
            throw new IllegalArgumentException();

        return input.split(" ");
    }

    public static double toDouble(String number){
        return Double.parseDouble(number);
    }
}
