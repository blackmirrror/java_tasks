package task24;

public class Real {
    protected int realNumber;

    public Real() {
        realNumber = 0;
    }

    public Real(int realNumber) {
        this.realNumber = realNumber;
    }

    public void SetRealNumber(int realNumber) {
        this.realNumber = realNumber;
    }

    @Override
    public String toString() {
        return "Дествительное число: " +
                realNumber;
    }
}
