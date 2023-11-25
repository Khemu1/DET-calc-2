package DET;

public class ICalculator2 extends ICalculator  {
    public int negate() {
        currentValue = -currentValue;
        return currentValue;
    }
}
