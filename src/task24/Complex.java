package task24;

public class Complex extends Real{
    //private int realNumber;
    private int imageNumber;

    public Complex() {
        realNumber = 0;
        imageNumber = 0;
    }

    public Complex(int realNumber, int imageNumber) {
        this.realNumber = realNumber;
        this.imageNumber = imageNumber;
    }

    public void SetImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }

    @Override
    public String toString() {
        return "Комплексное число: " +
                realNumber + " + " + imageNumber
                +  "*i";
    }
}
