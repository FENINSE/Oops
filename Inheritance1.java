public class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }
    // Getter
    public String getName() {

        return name;
    }

    // Setter
    public void setName(String name) {

        this.name = name;
    }
}
class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); // call constructor of Person
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice Johnson", 55000.0, 2015, "AB123456C");

        // Display employee details
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Modify some values
        emp.setAnnualSalary(60000.0);
        emp.setYearStarted(2014);

        // Display updated details
        System.out.println("\n--- After Update ---");
        System.out.println("Updated Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Updated Year Started: " + emp.getYearStarted());
    }
}


