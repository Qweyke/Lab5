import static java.lang.Math.*;

public class Task3Lab5 {
    public static void main(String[] args) {
        double shag = 0.5;
        double x = -3.5;
        while (x < 3) {
            x = x+shag;
            System.out.println("x="+x);
            double f;
            if (x >= 0) {
                f = pow(x, 2) - 5;
            }
            else {
                f = -1*(x*x)+5;
            }
            System.out.println("f=" +f);
        }
    }
    }

