import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value_> ");
        int val = sc.nextInt();
        System.out.print(val + "! = ");
        // it calculate factorial
        int factor = 1;
        while (val > 0) {
            factor = factor * val;
            if (val > 1) {
                System.out.print(val + " x ");
            } else {
                System.out.print(val + " = ");
            }
            val--;
        }
        System.out.print(factor + ".\n");
    }
}
