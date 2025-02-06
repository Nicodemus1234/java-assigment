import java.util.Scanner;
class Employee {
String name;
Double salary;
 Employee(String name, Double salary) {

    this.name = name;
    this.salary = salary;
 
}
void display() {
    System.out.println("name" +name);
    System.out.println("salary" +salary); 
 
}
}

class SalaryCalculator {
   double calculateBonus(double salary){
    return salary*0.1;
   }
}

public class Mainapp{
    public static void main(String[] args) {
        // Corrected Scanner initialization
        Scanner scanner = new Scanner(System.in); 
        
        // User input
        System.out.println("Enter employee's name:");
        String name = scanner.nextLine();  // Fixed typo
        
        System.out.println("Enter employee's salary:");
        double salary = scanner.nextDouble();  // Corrected to scanner.nextDouble()

        // Creating Employee object
        Employee employee = new Employee(name, salary);  // Fixed parameter order (name, salary)
        employee.display();
        
        // Calculate bonus
        SalaryCalculator calculator = new SalaryCalculator();
        double bonus = calculator.calculateBonus(salary);
        System.out.println("Bonus: " + bonus);
        
        scanner.close(); 
}

