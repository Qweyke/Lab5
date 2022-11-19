import java.util.*;
import static java.lang.Math.*;
public class Task5Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x-coordinate");
        double x = scan.nextDouble();
        System.out.println("Enter the y-coordinate");
        double y = scan.nextDouble();
        System.out.println();

        if (figure1(x, y) || figure2(x, y) || figure3(x, y) || figure4(x, y) || figure5(x, y) || figure6(x, y) ||
                figure7(x, y) || figure8(x, y) || figure10(x, y)) {
            if (figure9(x, y)) {
                System.out.println("Miss");
            }
            else {System.out.println("Hit 1");
            }
        }
        else if (figure2_4(x, y) || figure2_5(x, y) || figure2_6(x, y) || figure2_7(x, y) || figure2_7(x, y) ||
                figure2_8(x, y) || figure2_9(x, y) ||figure2_10(x, y)) {
            if (figure2_1(x, y) || figure2_2(x, y) || figure2_3(x, y)) {
                System.out.println("Miss");
            } else System.out.println("Hit 2");
        }
            else {
            System.out.println("Miss");
        }
}


    public static double k(double x1, double y1, double x2, double y2) {
        return (y1 - y2) / (x1 - x2);
    }

    public static double b(double x1, double y1, double x2, double y2) {
        return y1 - x1 * k(x1, y1, x2, y2);
    }

    public static boolean figure1(double x, double y) {
        if (y >= k(-3, -1, 0, -3) * x + b(-3, -1, 0, -3)
                && y <= k(-3, -1, -1, 0) * x + b(-3, -1, -1, 0)
                && y <= k(0, -3, -1, 0) * x + b(0, -3, -1, 0)) {
            return true;
        }
        return false;
    }

    public static boolean figure2(double x, double y) {
        if (y >= k(-3, -1, -1, 0) * x + b(-3, -1, -1, 0)
                && y <= k(-3, -1, -2, 0) * x + b(-3, -1, -2, 0)
                && y <= k(-2, 0, -1, 0) * x + b(-2, 0, -1, 0)) {
            return true;
        }
        return false;
    }

    public static boolean figure3(double x, double y) {
        if (y <= k(-2, 0, -1, 1) * x + b(-2, 0, -1, 1)
                && y >= k(-2, 0, -1, 0) * x + b(-2, 0, -1, 0)
                && y >= k(-1, 1, -1, 0) * x + b(-1, 1, -1, 0)) {
            return true;
        }
        return false;
    }

    public static boolean figure4(double x, double y) {
        if (y <= k(-1, 0, -1, 1) * x + b(-1, 0, -1, 1)
                && y <= k(-1, 1, 1.5, 1.25) * x + b(-1, 1, 1.5, 1.25)
                && y >= k(-1, 0, 1.5, 1.25) * x + b(-1, 0, 1.5, 1.25)) {
            return true;
        }
        return false;
    }

    public static boolean figure5(double x, double y) {
        if (y <= k(-1, 1, 1, 3) * x + b(-1, 1, 1, 3)
                && y >= k(-1, 1, 1.5, 1.25) * x + b(-1, 1, 1.5, 1.25)
                && y <= k(1, 3, 1.5, 1.25) * x + b(1, 3, 1.5, 1.25)) {
            return true;
        }
        return false;
    }

    public static boolean figure6(double x, double y) {
        if (y <= k(1, 3, 3, 4) * x + b(1, 3, 3, 4)
                && y >= k(1, 3, 1.5, 1.25) * x + b(1, 3, 1.5, 1.25)
                && y >= k(1.5, 1.25, 3, 4) * x + b(1.5, 1.25, 3, 4)) {
            return true;
        }
        return false;
    }
    public static boolean figure7(double x, double y) {
        if (y <= k(-1, 1, 0, 5) * x + b(-1, 1, 0, 5)
                && y >= k(-1, 1, 1, 3) * x + b(-1, 1, 1, 3)
                && y <= k(0, 5, 1, 3) * x + b(0, 5, 1, 3)) {
            return true;
        }
        return false;
    }
    public static boolean figure8(double x, double y) {
        if (y >= k(-1, 1, -2, 3) * x + b(-1, 1, -2, 3)
                && y >= k(-1, 1, 0, 5) * x + b(-1, 1, 0, 5)
                && y <= k(-2, 3, 0, 5) * x + b(-2, 3, 0, 5)) {
            return true;
        }
        return false;
    }
    public static boolean figure9(double x, double y) {
        if (y <= k(-2, 3, -1, 5) * x + b(-2, 3, -1, 5)
                && y >= k(-2, 3, 0, 5) * x + b(-2, 3, 0, 5)
                && y <= k(-1, 5, 0, 5) * x + b(-1, 5, 0, 5)) {
            return true;
        }
        return false;
    }
    public static boolean figure10(double x, double y) {
        if (pow((y-3),2)+pow((x+1),2)<=pow(2,2)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_1(double x, double y) {
        if (y >= k(4, -2, 2, -1) * x + b(4, -2, 2, -1)
                && y >= k(2, -1, 2, 1) * x + b(2, -1, 2, 1)
                && y <= k(4, -2, 2, 1) * x + b(4, -2, 2, 1)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_2(double x, double y) {
        if (y >= k(5, -2, 2, 1) * x + b(5, -2, 2, 1)
                && y <= k(2, 1, 4, 3) * x + b(2, 1, 4, 3)
                && y <= k(5, -2, 4, 3) * x + b(5, -2, 4, 3)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_3(double x, double y) {
        if (y <= k(4, 3, 5, 5) * x + b(4, 3, 5, 5)
                && y >= k(6, 0, 4, 3) * x + b(6, 0, 4, 3)
                && y <= k(6, 0, 5, 5) * x + b(6, 0, 5, 5)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_4(double x, double y) {
        if (y >= k(5, -2, 4, 3) * x + b(5, -2, 4, 3)
                && y <= k(6, 0, 4, 3) * x + b(6, 0, 4, 3)
                && y >= k(5, -2, 6, 0) * x + b(6, 0, 5, 5)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_5(double x, double y) {
        if (y >= k(6, 0, 7, 0) * x + b(6, 0, 7, 0)
                && y >= k(6, 0, 5, 5) * x + b(6, 0, 5, 5)
                && y <= k(7, 0, 5, 5) * x + b(7, 0, 5, 5)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_6(double x, double y) {
        if (y <= k(5, -2, 6, 0) * x + b(6, -1, 6, 0)
                && y >= k(5, -2, 7, 0) * x + b(6, -1, 7, 0)
                && y <= k(6, 0, 7, 0) * x + b(6, 0, 7, 0)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_7(double x, double y) {
        if (y <= k(4, -3, 6, -1) * x + b(4, -3, 6, -1)
                && y >= k(4, -3, 7, -4) * x + b(4, -3, 7, -4)
                && y <= k(6, -1, 7, -4) * x + b(6, -1, 7, -4)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_8(double x, double y) {
        if (y <= k(2, -4, 4, -3) * x + b(2, -4, 4, -3)
                && y >= k(2, -4, 7, -4) * x + b(2, -4, 7, -4)
                && y <= k(4, -3, 7, -4) * x + b(4, -3, 7, -4)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_9(double x, double y) {
        if (y >= k(4, -2, 5, -2) * x + b(4, -2, 5, -2)
                && y >= k(4, -2, 2, 1) * x + b(4, -2, 2, 1)
                && y <= k(2, 1, 5, -2) * x + b(2, 1, 5, -2)) {
            return true;
        }
        return false;
    }
    public static boolean figure2_10(double x, double y) {
        if (pow((y+1),2)+pow((x-4),2)<=pow(2,2)) {
            return true;
        }
        return false;
    }
}

