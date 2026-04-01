import java.util.*;

// Abstract class (Parent class)
abstract class Empoloye {

    // private variables (Encapsulation)
    private String name;
    private int Id;

    // Constructor
    Empoloye(String name, int Id) {
        this.Id = Id;
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for Id
    public int getId() {
        return Id;
    }

    // Abstract method (must be implemented by child classes)
    abstract public int CalculateSalary();

    // toString method (used when printing object)
    @Override
    public String toString() {
        return "Empoloye{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", Salary=" + CalculateSalary() +
                '}';
    }
}


// Full Time Employee class (Child class)
class FullTimeEmpoloye extends Empoloye {

    // monthly salary variable
    int MonthleSalary;

    // constructor
    public FullTimeEmpoloye(String name, int Id, int MonthleSalary) {
        super(name, Id); // calling parent constructor
        this.MonthleSalary = MonthleSalary;
    }

    // implementing abstract method
    @Override
    public int CalculateSalary() {
        return MonthleSalary;
    }
}


// Part Time Employee class (Child class)
class PartTimeEmpoloye extends Empoloye {

    int NumberOfHours;
    int PaymentPerHours;

    // constructor
    PartTimeEmpoloye(String name, int Id, int NumberOfHours, int PaymentPerHours) {
        super(name, Id); // calling parent constructor
        this.NumberOfHours = NumberOfHours;
        this.PaymentPerHours = PaymentPerHours;
    }

    // implementing abstract method
    public int CalculateSalary() {
        return NumberOfHours * PaymentPerHours;
    }
}


// Payroll System class (Manages employees)
class PaymentPeroleSystem {

    // ArrayList to store employees
    ArrayList<Empoloye> EmployeList;

    // constructor
    public PaymentPeroleSystem() {
        EmployeList = new ArrayList<>();
    }

    // method to add employee
    public void addEmpoloye(Empoloye empoloye) {
        EmployeList.add(empoloye);
    }

    // method to remove employee using id
    public void removeEmpoloye(int id) {

        Empoloye empoloyetoremove = null;

        // for-each loop
        for (Empoloye empoloye : EmployeList) {

            // check id match
            if (empoloye.getId() == id) {
                empoloyetoremove = empoloye;
                break;
            }
        }

        // remove employee
        if (empoloyetoremove != null) {
            EmployeList.remove(empoloyetoremove);
        }
    }

    // method to show employees
    public void ShowEmpoloye() {

        // for-each loop
        for (Empoloye empoloye : EmployeList) {
            System.out.println(empoloye);
        }
    }
}



// Main class
public class main {

    public static void main(String[] args) {

        // creating payroll system object
        PaymentPeroleSystem paymentPeroleSystem = new PaymentPeroleSystem();

        // creating full time employee
        FullTimeEmpoloye fullTimeEmpoloye =
                new FullTimeEmpoloye("Mumtaz", 1, 70000);

        // creating part time employee
        PartTimeEmpoloye partTimeEmpoloye =
                new PartTimeEmpoloye("AmanLalawani", 2, 5, 3000);

        // adding employees
        paymentPeroleSystem.addEmpoloye(fullTimeEmpoloye);
        paymentPeroleSystem.addEmpoloye(partTimeEmpoloye);

        // show employees
        System.out.println("Initial Empoloye Details: ");
        paymentPeroleSystem.ShowEmpoloye();

        // remove employee
        System.out.println("Removing Empoloye");
        paymentPeroleSystem.removeEmpoloye(1);

        // show again
        System.out.println("After Removing:");
        paymentPeroleSystem.ShowEmpoloye();
    }
}