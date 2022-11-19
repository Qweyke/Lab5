import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        double min = 0, max = 0;
        System.out.println("Enter a-digit");
        a = scan.nextDouble();
        System.out.println("Enter b-digit");
        b = scan.nextDouble();
        System.out.println("Enter c-digit");
        c = scan.nextDouble();
        if (a > b) {
            max = a;
            min = b;
            if (b > c) {
                min = c;
            } else if (a < c) {
                max = c;
            }
        }
        else if (a < b) {
            max = b;
            min = a;
            if (a > c) {
                min = c;
            } else if (b < c) {
                max = c;
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }
}

