import java.util.Scanner;//import scanner
//create class discount
public class Discount {
    public static Double getDiscount(double amount) {
        double discount = 0.0;
        //state the condition
        if (amount > 5000) {
            discount = amount * 0.10;//10% for more than 5000
        } else if (amount > 1000 && amount <= 5000) {
            discount = amount * 0.05;//5% between 1000 and 5000
        }
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt the user to input amount
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        
        double discount = getDiscount(amount);
        //print the output
        System.out.println("The discount is: " + discount);
        
    }