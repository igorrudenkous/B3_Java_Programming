package day07_relational_operators;
/*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample date:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        double  salary = 100_000, stateTaxRate = 0.08, federalTaxRate = 0.21, stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary + federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "Tax Rate Info: \n\tState Tax rate: " + stateTaxRate + "\n\tFederal tax rate: " + federalTaxRate + "\n\tbase salary (before tax): " + salary + "\nTax amount: " + stateTax + " is for state tax and tax amount " + federalTax + " is for federal tax.";

        System.out.println(taxReport);
        }

}
