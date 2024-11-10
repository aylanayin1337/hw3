public class HW3 {
    public static void main(String[] args) {
        double[] doubles = {2.8, 2.9, -3.0, 4.5, 5.2, 6.5, -7.0, -8.0, 9.8, 10.0, 11.4, 12.3, -13.0, -14.1, 15.2};

        boolean negative = false;
        double summation = 0;
        double numberOfDoubles = 0;

        for (double number : doubles) {
            if (number < 0) {
                negative = true;
            } else if (negative && number > 0) {
                summation = summation + number;
                numberOfDoubles = numberOfDoubles + 1;
            }
        }
        double average = summation / numberOfDoubles;
        System.out.println(average);
    }
}