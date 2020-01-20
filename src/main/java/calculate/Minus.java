package calculate;

public class Minus implements Calculate{
    @Override
    public double calculate(double result, double number) {
        return result - number;
    }
}
