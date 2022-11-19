import java.util.Scanner;
import static java.lang.Math.*;

public class Task7Lab5prt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls, enter any digit from the array of [-4;4]");
        double x = scan.nextDouble();
        if (x >= -4 & x < 0) {
            do {
                System.out.println("x=" + x);
                System.out.println((tan(x)) + (cos(sqrt(1+(pow(x,2))))));
                x = x + 1;
            } while (x < 0);
        }

        else if (x>=0 & x<=1) {
            do {
                System.out.println("x=" + x);
                System.out.println(2 * pow(x, 6) + pow(x, 4) - (2 * cos(x) * pow(exp(1), (-2 * x))));
                    x = x + 1;
                } while (x <= 1);
            }
        else if (x > 1) {
            do {
                System.out.println("x=" + x);
                System.out.println((2 * sin(cos(x))) - ((x * x * x + x) / (2 * cos(x + 1) + 2)));
                x= x +1;
            } while (x<=4);
        }
        else {
            System.out.println("Pls, enter the meaning from the array");
        }
    }
}

