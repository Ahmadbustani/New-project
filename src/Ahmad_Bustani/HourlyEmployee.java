package Ahmad_Bustani;

/**
 *
 * @author Ahmad Bustani
 */
//public class extends employee 
public class HourlyEmployee extends Employee {

    private final double numHour;
    private final double hourlyRate;
//five arg constructor holding the neede values for class hourly rate for the employee
    public HourlyEmployee(int id, String firstname, String lastname, double numHour, double hourlyRate) {
        super(firstname, lastname, id);
        this.numHour = numHour;
        this.hourlyRate = hourlyRate;

    }

    public double getNumHour() {
        return numHour;
    }

    public double getHourlyRate() {
        return hourlyRate;

    }
//override calculate the hourly payroll
    @Override
    public double calculatePay() {
        return numHour * hourlyRate;
    }
}
