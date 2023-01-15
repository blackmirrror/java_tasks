package task24;

public class NumberFactory implements AbstractNumberFactory{
    @Override
    public Complex createComplexNumber() {
        return new Complex();
    }

    @Override
    public Complex createComplexNumber(int realNumber, int imageNumber) {
        return new Complex(realNumber, imageNumber);
    }

    @Override
    public Real createRealNumber() {
        return new Real();
    }

    @Override
    public Real createRealNumber(int realNumber) {
        return new Real(realNumber);
    }
}
