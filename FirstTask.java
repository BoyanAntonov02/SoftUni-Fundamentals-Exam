package Fund.examMid;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float budget = Float.parseFloat(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        float priceFlour = Float.parseFloat(scanner.nextLine());
        float priceSingleEgg = Float.parseFloat(scanner.nextLine());
        float priceSingleApron = Float.parseFloat(scanner.nextLine());

        int freeFlour = students/5;
        float allFlour = students * priceFlour - (freeFlour * priceFlour);

        float allEggs = students * 10 * priceSingleEgg;
        int newStudents = (int) Math.ceil(students * 1.2);
        float allApron = newStudents * priceSingleApron;


        double sum = allFlour + allEggs + allApron;

        if(budget >= sum){
            System.out.printf("Items purchased for %.2f$.", sum);
        }else {
            double tmp = sum - budget;
            System.out.printf("%.2f$ more needed.", tmp);
        }
    }
}
