package Ahmad_Bustani;

/* new changes
 * @author Ahmad Bustani
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ahmad_Bustani {

    /**
     * This Application is to help the user to store and calculate the
     * information of as many employees as the user wants. It can store the id
     * of the employee, first and last name, and the salary.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //
        ArrayList<Employee> employee = new ArrayList<>(); //Arraylist for Employee class to store the employees informaion
        System.out.println("How many employees to create?");
        int numberOfEmployees = enterInt();  
      
        
        while (numberOfEmployees < 0) {
            System.out.println("enter positive value");
            numberOfEmployees = enterInt();
        }
        
        /**
         * @looping pushing the information of the employee through a loop
         */
        for (int i = 0; i < numberOfEmployees; i++) { 
        
            
        boolean exit = true;
            while (exit) {
                exit = false;
                System.out.println("Employee data for " + (i + 1) + " of " + numberOfEmployees+":");
                System.out.print("Choose type of emplyee to add \n 1. Salaried \n 2. Hourly \n 3. Commission: ");//our data of options for the employees
                
                //
                int typeOfEmployee = enterInt();//

                
                
                switch (typeOfEmployee) {
                    case 1: // calls all the datafield methods those related to class Salary and ask the user to enter them safely
                        SalaryEmployee salaryEmployee = new SalaryEmployee(getId(), getFirstName(), getLastName(), getSalary());
                        employee.add(salaryEmployee);
                        System.out.println("");
                        break;

                    case 2: //
                        HourlyEmployee hourlyEmployee = new HourlyEmployee(getId(), getFirstName(), getLastName(), getNumHours(), getHourlyRate());
                        employee.add(hourlyEmployee);
                        System.out.println("");
                        break;

                    case 3:
                        CommissionEmployee commissionEmployee = new CommissionEmployee(getId(), getFirstName(), getLastName(), getCommissionRate(), getSales());
                        employee.add(commissionEmployee);
                        System.out.println("");
                        break;

                    default:
                        System.out.print("Please enter the correct option");
                        exit = true;
                        break;
                }
            }
        }
        
        /**
         * @Loop the list of the report and loop it until exiting the program
         */
        boolean checkReport = true;
        while (checkReport) { 
            System.out.println("Choose a Report please.");
            System.out.println("1. Employee listing");
            System.out.println("2. Payroll listing");
            System.out.println("3. Exit ");
            
            
            int chooseReport = enterInt();

            switch (chooseReport) {
                case 1:
                    displayEmployeeInfo(employee); /**@case_1 passing by user displayEmployeeInfo  */
                    break;
                case 2:
                    displayEmployeePayroll(employee);/** @case_2 on passing by user the method displayEmployeePayroll */
                    break;
                case 3:
                    checkReport = false;/** case_3 this will end the loop and close the Application */
                    break;

            }

        }
    }
    /**
    *@return  a method that returns and accepts integers, so the program doesnt break 
    * when the user tries to enter something else
    */
    public static int enterInt() {
        ArrayList<Employee> employee = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            
            System.out.println("invalid please use a number value");
            input.nextLine();
            
        }
        
        int integer = input.nextInt();
      
        return integer;
    }

    /**
    * @return a method that returns and accepts double, so the program doesnt break 
    *  when the user tries to enter something else
    */
    public static double enterDouble() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()) {
            System.out.println("invalid please use a number value");
            input.nextLine();
        }
        double acceptDouble = input.nextDouble();
        return acceptDouble;
    }

    /**
     *
     * @return it asks the user to enter the ID and it returns it with no problems
     */
    public static int getId() {
       
        
        System.out.print("Enter Empolyee's ID: ");
        int id = enterInt();

        while (id < 0) {
            System.out.println("Enter a positive value");
            id = enterInt();
        }
        
        return id;
    }    

    /**
     *
     * @return it asks the user to enter the first name of the employee and it returns it 
     */
    public static String getFirstName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee's First Name:");
        String firstName = input.nextLine();

        return firstName;

    }

    /**
     *
     * @return it asks the use to enter the last name of the employee and it returns it
     */
    public static String getLastName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee's Last Name:");
        String lastName = input.nextLine();

        return lastName;

    }

    /**
     *
     * @return it it asks the user to enter the salary and it returns the salary
     */
    public static double getSalary() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary:");
        double salary = enterDouble();
        

        while (salary < 0) {
            System.out.println("Enter a positive value");
            salary = enterDouble();
            
        }
        return salary;
        
    }

    /**
     *
     * @return it asks the user to enter the worked hours and it returns it
     */
    public static double getNumHours() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hours worked:");
        double numHours = enterDouble();

        while (numHours < 0) {
            System.out.println("Enter a positive value");
            numHours = enterDouble();

        }
        return numHours;
    }

    /**
     *
     * @return asks the user to enter the rate of the hourly pay and it returns it
     */
    public static double getHourlyRate() {
        System.out.print("Enter Hourly Rate:");
        double hourRate = enterDouble();

        while (hourRate < 0) {
            System.out.println("Enter a positive value");
            hourRate = enterDouble();

        }
        return hourRate;
    }

    /**
     *
     * @return asks the user to enter the rate of the commission and it returns it 
     */
    public static double getCommissionRate() {
        System.out.print("Enter Commission rate:");
        double commissionRate = enterDouble();

        while (commissionRate < 0) {
            System.out.println("Enter a positive value");
            commissionRate = enterDouble();

        }
        return commissionRate;
    }

    /**
     *
     * @return it asks the user to Enter the number of sales, checks if its >0 and it returns it
     */
    public static double getSales() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Sales:");
        double sales = enterDouble();

        while (sales < 0) {
            System.out.println("Enter a positive value");
            sales = enterDouble();

        }
        return sales;

    }
/**
 * 
 * @param it displays all the information of the employees and it calls them from all of the classes
 */
    private static void displayEmployeeInfo(ArrayList<Employee> employee) {
        employee.forEach((count) -> {
            if (count instanceof SalaryEmployee) {
                String formatSalary = "Employee %d: %s, %s\n\t Salary : $%.2f  \n \n";
                System.out.printf(formatSalary, count.getId(), count.getLastName(),count.getFirstName(), ((SalaryEmployee) count).getSalary());
                
            } else if (count instanceof HourlyEmployee) {
                String formatHourly = "Employee %d: %s, %s \n\t Hours: $%.1f\n\t Rate: $%.2f \n \n";
                System.out.printf(formatHourly, count.getId(), count.getLastName(),count.getFirstName(),  ((HourlyEmployee) count).getNumHour(), ((HourlyEmployee) count).getHourlyRate());
                
            } else if (count instanceof CommissionEmployee) {

                String formatCommission = "Employee %d: %s, %s \n\t Commission Rate : $%.1f \n\t Sales: $%.2f \n \n";
                System.out.printf(formatCommission, count.getId(), count.getLastName(),count.getFirstName(),  ((CommissionEmployee) count).getRate(), ((CommissionEmployee) count).getSales());
                
            }
        });
    }

    
    /**
     * 
     * @param it loops and prints the information of all the payroll of the employees
     */
    private static void displayEmployeePayroll(ArrayList<Employee> employee) {
        employee.forEach((count) -> {
            String format = "The Employee last and first name: %s, %s \n Employee ID number: %d The weekly pay for %s %s is: $%.2f \n \n";
            System.out.printf(format, count.getLastName(), count.getFirstName(), count.getId(),count.getFirstName(), count.getLastName(), count.calculatePay());
        });
        
    }
}

