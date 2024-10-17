package classes.task4;

public class ComputeSin {

    private double x;

    private double computeSin(double e) {
        double term = x;
        double sinX = term;
        int n = 1;

        while (Math.abs(term) >= e) {
            n += 2;
            term *= -x * x / (n * (n - 1));
            sinX += term;
        }

        return sinX;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void makeTable() {
        double precision = 0.0001;
        double step = 0.1;
        double x = 0.0;

        System.out.printf("%s\t\t%s\n", "x", "sin(x)");
        while (x <= Math.PI / 2) {
            setX(x);
            double sinVal = computeSin(precision);
            System.out.printf("%.4f\t\t%.4f\n", x, sinVal);
            x += step;
        }
    }

}

