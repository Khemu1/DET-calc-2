package DET;

public class Main {
    public static void main(String[] args) {
        ICalculator2 calculator = new ICalculator2();
        calculator.add(5);
        calculator.sub(3);
        calculator.mul(2);
        System.out.println("Current Value: " + calculator.getCurrentValue());

        int negatedValue = calculator.negate();
        System.out.println("Negated Value: " + negatedValue);
    }
}
