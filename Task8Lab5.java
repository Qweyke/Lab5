import java.util.Scanner;

public class Task8Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the required month");
        String month = scan.nextLine();
        switch (month) {
            case "January" -> System.out.println("Пресс качат");
            case "February" -> System.out.println("Бегит");
            case "March" -> System.out.println("Ажумания");
            case "April" -> System.out.println("Приседаня");
            case "May" -> System.out.println("Одых");
            case "June" -> System.out.println("Турник");
            case "July" -> System.out.println("Гантебли");
            case "August" -> System.out.println("Скокалка");
            case "September" -> System.out.println("Бурпи");
            case "October" -> System.out.println("Пиво");
            case "November" -> System.out.println("Шстанга");
            case "December" -> System.out.println("Лыжы");
            default -> System.out.println("Pls enter a month with a capital letter");
        }
    }
}
