
import java.util.*;
import static java.lang.Math.*;

public class Task6Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter x-coordinate");
        Double x = scan.nextDouble();
        System.out.println("Pls enter y-coordinate");
        Double y = scan.nextDouble();
        if (36 >= (pow((x - 0), 2) + pow((y - 0), 2)) & y <= 0) {
            if (tri1(x, y) || tri2(x, y)) {
                System.out.println("Miss");
                System.out.println("Triangle");
            }
            else if (4 >= (pow((x - 0), 2) + pow((y + 4), 2))) {
                if (1 >= (pow((x - 0), 2) + pow((y + 4), 2))) {
                    System.out.println("Mel");
                    System.out.println("Hit");
                }
                else {
                    System.out.println("Miss");
                    System.out.println("Krup");
                }
            }
            else {
                System.out.println("Hit");
                System.out.println("Main");
            }
        }
        else {
            System.out.println("Miss");
            System.out.println("Vnikuda");
        }
    }
        public static double k(double x1, double y1, double x2, double y2) {
            return (y1 - y2) / (x1 - x2);
        }

        public static double b(double x1, double y1, double x2, double y2) {
            return y1 - x1 * k(x1, y1, x2, y2);
        }
        public static boolean tri1 (double x, double y) {
            if ((y > k(-3, -3, -4, 0) * x + b(-3, -3, -4, 0) &
                    (y > k(1, 0, -3, -3) * x + b(1, 0, -3, -3) &
                            (y < k(1, 0, -4, 0) * x + b(1, 0, -4, 0))))) {
              return true;
            }
            return false;
        }
        public static boolean tri2 (double x, double y) {
            if ((y > k(4, -3, 1, 0) * x + b(4, -3, 1, 0) &
                    (x<4) & (x>1))) {
                return true;
            }
            return false;
    }
}
