package classes.task3;

public class Probability {

    public static void main(String[] args) {
        int allowedNumbers = 0;
        int divisibleBy12 = 0;
        for (int i = 0; i < 99999; i++) {
            int digit1 = (i / 10000) % 10;
            int digit2 = (i / 1000) % 10;
            int digit3 = (i / 100) % 10;
            int digit4 = (i / 10) % 10;
            int digit5 = i % 10;

            if (digit1 < 3 || digit2 < 2 || digit2 > 8 || digit3 < 4 || digit4 < 1 || digit4 > 6 || digit5 < 6) {
                continue;
            }

            allowedNumbers++;
            if (i % 12 == 0) {
                divisibleBy12++;
            }
        }

        double probability = divisibleBy12 * 1.0 / allowedNumbers;
        String coveringRequirements = String.format("Count of numbers with their digits covering the requirements: %d\n", allowedNumbers);
        String coveringRequirementsDivisibleBy12 = String.format("Count of numbers with their digits covering the requirements, divisible by 12: %d\n", divisibleBy12);
        String probabilityToBeDivisibleBy12 = String.format("Probability of a 5-digit number, to be divisible by 12: %.4f\n", probability);


        System.out.printf("%s%s%s", coveringRequirements, coveringRequirementsDivisibleBy12, probabilityToBeDivisibleBy12);
    }


}
