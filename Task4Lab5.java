import java.util.*;
import static java.lang.Math.*;
public class Task4Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls,enter an 'x-number'");
        double x = scan.nextDouble();
        double y=0;
        if (x<5) {
            y= pow(sin(2),pow(x,2));
        }
        else if (x>5 && x<10) {
            y = (cos(2*x))/(pow(sin(x),2));
        }
        else if (x>10) {
            y = tan(x+5*cos(PI));
        }
        else if (x==5 || x==10) {
            y = 1-x+5*pow(x,3);
        }
        System.out.println("f="+y);
    }
}
