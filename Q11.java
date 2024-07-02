import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int Salary = sc.nextInt();
        if(Salary >= 20000){
            System.out.println("Congratulations! You Got a Bonus and your new salary is " + (Salary + 2000));
        }
        else{
            System.out.println("Sorry You are Not eligible for the Bonus");
        }
    }
    
}
