import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, k, l;
        System.out.println("Enter k");
        k = scan.nextInt();
        System.out.println("Enter l");
        l = scan.nextInt();
        System.out.println("Enter a");
        a = scan.nextInt();
        System.out.println("Enter b");
        b = scan.nextInt();
        System.out.println("Enter c");
        c = scan.nextInt();
        int suma = 0;
        int sumb = 0;
        int sumc = 0;
        if (a > k) {
            int anew = a;
            while (anew > 0) {
                int chisloa = anew % 10;
                anew = anew / 10;
                suma = suma + chisloa;
            }
        }
        if (b > k) {
            int bnew = b;
            while (bnew > 0) {
                int chislb = bnew % 10;
                bnew = bnew / 10;
                sumb = sumb + chislb;
            }
        }
        if (c > k) {
            int cnew = c;
            while (cnew > 0) {
                int chislc = cnew % 10;
                cnew = cnew / 10;
                sumc = sumc + chislc;
            }
        }
    if (suma > l) {
        System.out.println (a);
    }
    if (suma < l) {
        System.out.println("Number 'a' is too small");
    }
    if (sumb > l) {
        System.out.println (b);
    }
    if (sumb < l) {
        System.out.println("Number 'b' is too small");
    }
    if (sumc > l) {
        System.out.println (c);}
    if (sumc < l) {
        System.out.println("Number 'c' is too small");
    }
    }
}
