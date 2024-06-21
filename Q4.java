import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Y = sc.next();
        System.out.println("Please enter the name of the receiver");
        String letter = "Dear <|name|>, thanks a lot!";
        letter=letter.replace("<|name|>", Y);
        System.out.println(letter);
    }
    
}
