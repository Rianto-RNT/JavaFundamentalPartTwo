import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectPartTwo {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayment = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1.000 and 1.000.000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualinterest = scanner.nextFloat();
            if (annualinterest >= 1 && annualinterest <= 30) {
                monthlyInterest = annualinterest / PERCENT / MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayment = years * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow (1 + monthlyInterest, numberOfPayment))
                / (Math.pow (1 + monthlyInterest, numberOfPayment) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
