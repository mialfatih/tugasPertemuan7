import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        // Constructor default
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public void setCoefficients(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation();
        linearEquation.setCoefficients(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.println("x = " + linearEquation.getX());
            System.out.println("y = " + linearEquation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        input.close();
    }
}