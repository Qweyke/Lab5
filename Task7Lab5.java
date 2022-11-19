import java.util.*;
import static java.lang.Math.*;

public class Task7Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls, enter any digit from the array of [-4;4]");
        double x = scan.nextDouble();
        if (x >= -4 & x <= 0) {
            do {
                System.out.println("x=" + x);
                System.out.println((cos(sin(cos((x * x) + 2 * x))) + PI * exp(1)));
                x = x + 1;
            } while (x <= 0);
        }
        else if (x > 0 & x<=4) {
            do {
                System.out.println("x=" + x);
                System.out.println(pow(exp(1), (pow(1 + ((2 * x) / (1 + (x * x))), 1 / 2d))));
                x = x + 1;
            } while (x<=4);
        }
        else {
            System.out.println("Pls, enter the meaning from the array");
        }
    }
}


