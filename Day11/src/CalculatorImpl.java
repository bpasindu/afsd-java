public class CalculatorImpl implements Calculator{
    @Override
    public double getSum(double num1, double num2) {
        return (num1 + num2);
    }

    @Override
    public double getSubtract(double num1, double num2) {
        return (num1 - num2);
    }

    @Override
    public double getMultiply(double num1, double num2) {
        return (num1 * num2);
    }

    @Override
    public double getDivision(double num1, double num2) {
        return (num1/num2);
    }
}
