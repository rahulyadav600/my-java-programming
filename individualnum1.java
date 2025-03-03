// experiment 1.1
import java.util.*;

public class individualnum1 {
    
    public static void main(String[] args) {
        int n, mod;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number:");
        n = scn.nextInt();
        System.out.println("Individual digits of the number are: \n");
        List<Integer> digits = new ArrayList<>();
        while (n != 0) {
            mod = n % 10;
            n = n / 10;
            digits.add(mod);
        }
        Collections.reverse(digits);
        for (int digit : digits) {
            System.out.println(digit + "\n");
        }
        scn.close();
    }
}