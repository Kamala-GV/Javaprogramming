package day31_Constructors.HomeTask;

public class Salary {


    public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;

    }

    public double stateTax() {
        return salary() * stateTaxRate / 100;

    }

    public double federalTax() {
        return salary() * federalTaxRate / 100;

    }

    public double salaryAfterTax() {
        return salary() - federalTax() - stateTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "salary = $" + salary() +
                ", stateTax = " + stateTax() +
                ", federalTax =" + federalTax() +
                ", salary after tax = $" + salaryAfterTax() +
                '}';
    }
}

    /*SalaryCalculator Task:
        1.1 Create a class named Salary calculator:
        Attributes:
        hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

        Add a constructor to set all the fields

        Actions:
        salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
        stateTax(): claculates the totalstateTax
        federalTax(): calculates the total federal tax
        salaryAfterTax(): calculates the salary after tax
        toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the */
