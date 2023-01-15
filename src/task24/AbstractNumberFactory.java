package task24;

public interface AbstractNumberFactory {
    Real createRealNumber();
    Real createRealNumber(int realNumber);
    Complex createComplexNumber();
    Complex createComplexNumber(int realNumber, int imageNumber);
}
