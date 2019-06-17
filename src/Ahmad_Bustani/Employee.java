    package Ahmad_Bustani;

    /**
    *
    * @author Ahmad Bustani
    */
    public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    //constructor 3 args passing the main modifiers to other classes

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double calculatePay() {

        return -1;
    }
    //java.lang.Object tostring 

    @Override
    public String toString() {

        return "";
    }

    }
