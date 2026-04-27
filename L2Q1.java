import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 10;

        // Arrays to store employee data
        double[] oldSalaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        // Total counters
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonusPayout = 0;

        // Input Loop with Validation
        System.out.println("Enter details for " + numEmployees + " employees:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee #" + (i + 1));
            
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            
            System.out.print("Enter Years of Service: ");
            double years = scanner.nextDouble();

            // Validate inputs: cannot be negative
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input! Salary and years must be positive. Please re-enter.");
                i--; // Decrement index to repeat this specific employee entry
                continue; 
            }

            oldSalaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculation Loop
        for (int i = 0; i < numEmployees; i++) {
            double rate;
            
            // Determine bonus rate: 5% for > 5 years, else 2%
            if (yearsOfService[i] > 5) {
                rate = 0.05;
            } else {
                rate = 0.02;
            }

            // Calculations
            bonuses[i] = oldSalaries[i] * rate;
            newSalaries[i] = oldSalaries[i] + bonuses[i];

            // Accumulate totals
            totalOldSalary += oldSalaries[i];
            totalBonusPayout += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Final Output
        System.out.println("\n--- Zara Company Payroll Summary ---");
        System.out.printf("Total Old Salary:   $%.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: $%.2f\n", totalBonusPayout);
        System.out.printf("Total New Salary:   $%.2f\n", totalNewSalary);
        
        scanner.close();
    }
}