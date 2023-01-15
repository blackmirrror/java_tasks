package task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AbstractNumberFactory numberFactory = new NumberFactory();

        Real real = numberFactory.createRealNumber(74);
        System.out.println(real);

        Complex complex = numberFactory.createComplexNumber();
        complex.SetRealNumber(-2);
        complex.SetImageNumber(3);
        System.out.println(complex);
    }
}
