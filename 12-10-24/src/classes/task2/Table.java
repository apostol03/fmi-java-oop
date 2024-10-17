package classes.task2;

import java.util.Scanner;

public class Table {
    private double a;
    private double b;
    private int steps;

    public Table(int a, int b, int steps) {
        this.a = a;
        this.b = b;
        this.steps = steps;
    }

    public void makeTable() {
        Scanner input = new Scanner(System.in);

        int count = 1;
        double x = a;
        double size = (b - a) / steps;
        System.out.printf("%s\t\t%s", "X", "f(x)\n");

        for (int i = 1; i <= steps; i++) {
            double fx = Math.pow(Math.abs(x - 2), 2) / (x * x + 1);
            System.out.printf("%.4f\t\t%.4f\n", x, fx);
            x += size;
            count++;
            if (count == 20) {
                count = 0;
                System.out.println("Press return to continue...");
                input.nextLine();
            }
        }
    }
}
