package DET;
class ICalculator {
    protected int currentValue;

    public ICalculator() {
        this.currentValue = 0;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int add(int value) {
        currentValue += value;
        return currentValue;
    }

    public int sub(int value) {
        currentValue -= value;
        return currentValue;
    }

    public int mul(int value) {
        currentValue *= value;
        return currentValue;
    }

    public int div(int value) {
        if (value != 0) {
            currentValue /= value;
        }
        return currentValue;
    }
}
