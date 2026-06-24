public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.salaryMultiplier() method");
        return (daysSkipped >= 5) ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
        return (bonusMultiplier(productsSold) * productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
        double totalSalary = 1000.00 * salaryMultiplier(daysSkipped);
        totalSalary = totalSalary + bonusForProductsSold(productsSold);

        return (totalSalary > 2000) ? 2000 : totalSalary;
    } 
}
