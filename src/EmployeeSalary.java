/**
* @Author: Jiehang CAO
* @Description: This is a EmployeeSalary class including three params and some mehthods to calculate
* @Date: 6:25 PM 2018/10/13
*/
public class EmployeeSalary {
    private String employeeName;
    private double monthlyGrossSalary;
    private double taxRate;

    /**
     *
     * @param employeeName
     * @param monthlyGrossSalary
     * @param taxRate
     */
    public EmployeeSalary(String employeeName, double monthlyGrossSalary, double taxRate) {
        this.employeeName = employeeName;
        this.monthlyGrossSalary = monthlyGrossSalary;
        this.taxRate = taxRate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMonthlyGrossSalary() {
        return monthlyGrossSalary;
    }

    public void setMonthlyGrossSalary(double monthlyGrossSalary) {
        this.monthlyGrossSalary = monthlyGrossSalary;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    public double monthlyNetSalary() {
        return getMonthlyGrossSalary()*(1-(taxRate/100));
    }
    public void increaseSalary(double rate) {
        double newSalary = getMonthlyGrossSalary()*(1+(rate/100));
        setMonthlyGrossSalary(newSalary);
    }
    @Override
    public String toString() {
        return getEmployeeName()+" has a monthly gross salary of "+ "£"+getMonthlyGrossSalary()+","+
        " a taxrate of "+(getTaxRate()*100)+"%"+" and a monthly net salary of " +"£"+monthlyNetSalary();
    }
}
