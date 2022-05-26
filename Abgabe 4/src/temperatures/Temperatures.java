package temperatures;

public class Temperatures {
    public static void main(String[] args) {
        int numberOfDays = 10;

        double[] minimaleTagesTemeraturen = new double[numberOfDays];
        double[] maximaleTagesTemeraturen = new double[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            minimaleTagesTemeraturen[i] = Math.random() * 10;
        }
        for (int i = 0; i < numberOfDays; i++) {
            maximaleTagesTemeraturen[i] = Math.random() * 15 + 5;
        }

        System.out.println("Unsortiert: ");
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Tag " + (i + 1) + ": "
                    + "Minimum = " + minimaleTagesTemeraturen[i] + ", Maximum = " + maximaleTagesTemeraturen[i]);
        }
        System.out.println("Sortiert: ");
        for (int i = 0; i < numberOfDays; i++) {
            if (minimaleTagesTemeraturen[i] > maximaleTagesTemeraturen[i]) {
                double tausch = maximaleTagesTemeraturen[i];
                maximaleTagesTemeraturen[i] = minimaleTagesTemeraturen[i];
                minimaleTagesTemeraturen[i] = tausch;
            }
            System.out.println("Tag " + (i + 1) + ": "
                    + "Minimum = " + minimaleTagesTemeraturen[i] + ", Maximum = " + maximaleTagesTemeraturen[i]);
        }
    }
}
