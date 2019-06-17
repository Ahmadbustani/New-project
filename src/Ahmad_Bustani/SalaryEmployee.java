package Ahmad_Bustani;

/**
 *
 * @author Ahmad Bustani
 */
public class SalaryEmployee extends Employee {

    private double salary;

    public SalaryEmployee(int id, String lastName, String firstName, double salary) {
        super(lastName, firstName, id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculatePay() {
        return salary / 52;
    }

}
