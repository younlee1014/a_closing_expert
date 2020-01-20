package calculate;

public class Plus implements Calculate{
    @Override
    public double calculate(double result, double number) {
        return result + number;
    }
}
