package calculate;

public class Multiply implements Calculate{
    @Override
    public double calculate(double result, double number) {
        return result * number;
    }
}
