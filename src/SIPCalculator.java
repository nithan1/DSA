import java.util.Scanner;

public class SIPCalculator {
     static final double REGISTRATION_FEE = 150;
     static final double YEARLY_FEE = 50;

    public static double calculateSIPReturn(double principal, double rateOfInterest, int investmentPeriod) {
        double totalFee = REGISTRATION_FEE + (investmentPeriod - 1) * YEARLY_FEE;
        double totalInvestment = principal * investmentPeriod;
        double interest = (totalInvestment * rateOfInterest * investmentPeriod) / (2 * 100);
        return totalInvestment + interest - totalFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount, rate of interest, and investment period: ");
        double principal = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        int investmentPeriod = scanner.nextInt();

        double finalAmount = calculateSIPReturn(principal, interestRate, investmentPeriod);

        System.out.printf("Final amount after %d years: %.2f\n", investmentPeriod, finalAmount);
    }
}
