package Ahmad_Bustani;

/**
 *
 * @author Ahmad Bustani
 */
//public class extends Employee
public class CommissionEmployee extends Employee {

    private double rate;
    private double sales;
    //Constractor 3 arguments holding the neede datefields for commission employee

    public CommissionEmployee(int id, String firstName, String lastName, double rate, double sales) {
        super(firstName, lastName, id);
        this.rate = rate;
        this.sales = sales;
    }
    
    //modifier type double, returns the Rate of the employee sales
    public double getRate() {

        return rate;
    }

    //modifier type double, returns the employee sales
    public double getSales() {
        return sales;
    }

    /*@returns override from class Employee calculating the pay of the employee based on commission
    *
    */

    @Override
    public double calculatePay() { //
        double result = sales * (rate / 100);
        return result;
    }
}
