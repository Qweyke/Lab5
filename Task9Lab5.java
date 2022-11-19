
import java.util.*;
public class Task9Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the survey about Perm public catering establishments");
        System.out.println("Do you want to know what place you should visit this holidays? Enter 'y' if you want and" +
                "n if you don't");
        String yes = "y";
        String no = "n";
        String ans = scan.next();
        if (ans.equals (yes)) {
            System.out.println("Pls, enter the number of preferred cuisine: 1)'Mexican', 2)'French'," +
                    " 3)'Asian'");
            int cuisine = scan.nextInt();
            switch (cuisine) {
                case 1: {
                    System.out.println("Good choice, you really like a lot of spices, huh?");
                    System.out.println("Now pls, answer, how much can you spend on day-off for food?");
                    double inc = scan.nextDouble();
                    if (inc < 1000 & inc >= 500) {
                        System.out.println("Witch type of a rest do you like more? - 1)Active rest, 2)Calm friends meetings," +
                                " 3)Listening to a live music ");
                        int rest = scan.nextInt();
                        switch (rest) {
                            case 1 -> System.out.println("Your best choice is 'Nebar'!");
                            case 2 -> System.out.println("Your best choice is 'BUENO COFFEE & CAKE!");
                            case 3 -> System.out.println("Sorry, there is no such places, but you can try 'Nebar' with their DJ-s");
                            default -> System.out.println("Pls, choose the correct number");
                        }

                    } else if (inc >= 1000) {
                        System.out.println("Witch type of a rest do you like more? - 1)Active rest, 2)Calm friends meetings," +
                                " 3)Listening to a live music ");
                        int rest = scan.nextInt();
                        switch (rest) {
                            case 1 -> System.out.println("Your best choice is 'Nebar'!");
                            case 2 -> System.out.println("Your best choice is 'El Jefe'!");
                            case 3 -> System.out.println("Sorry, there is no such places, but you can try 'Nebar' with their DJ's music");
                            default -> System.out.println("Pls, choose the correct number");
                        }
                    } else {
                        System.out.println("Sorry, but there are no places for such prices");
                    }
                }
                break;
                case 2: {
                    System.out.println("You have a quiet exquisite taste, excellent!");
                    System.out.println("Now pls, answer, how much can you spend on day-off for food?");
                    double inc = scan.nextDouble();
                    if (inc <= 1000 & inc >= 500) {
                        System.out.println("Witch type of a rest do you like more? - 1)Active rest, 2)Calm friends meetings," +
                                " 3)Listening to a live music ");
                        int rest = scan.nextInt();
                        switch (rest) {
                            case 1 -> System.out.println("It will be very hard to find such place, but you can visit 'The friends' instead.");
                            case 2 -> System.out.println("Your best choice is 'PariParis'!");
                            case 3 -> System.out.println("");
                            default -> System.out.println("Pls, choose the correct number");
                        }

                    } else if (inc >= 1000 & inc <= 2000) {
                        System.out.println("Witch type of a rest do you like more? - 1)Active rest, 2)Calm friends meetings," +
                                " 3)Listening to a live music ");
                        int rest = scan.nextInt();
                        switch (rest) {
                            case 1 -> System.out.println("Do you really want some active rest with some delicacy in your right hand?");
                            case 2 -> System.out.println("'Parmesan' is your variant!");
                            case 3 -> System.out.println("'Les Marches' or 'Nolan Wine & Kitchen' will satisfy you, indeed!");
                            default -> System.out.println("Pls, choose the correct number");

                        }

                    } else {
                        System.out.println("Sorry, but there are no any places for such prices");
                    }
                }
                break;
                case 3: {
                    System.out.println("Asian cuisine is really popular this days.");
                    System.out.println("Now pls, answer, how much can you spend on day-off for food?");
                    double inc = scan.nextDouble();
                    if (inc < 1000 & inc >= 500) {
                        System.out.println("Witch type of a rest do you like more? - 1)Active rest, 2)Calm friends meetings," +
                                " 3)Listening to a live music ");
                        int rest = scan.nextInt();
                        switch (rest) {
                            case 1 -> System.out.println("Your best choice is 'The friends'!");
                            case 2 -> System.out.println("Your best choice is 'ПокеРамен'!");
                            case 3 -> System.out.println("Sorry, there is no such places, but you can try 'Nebar' or 'The friends'");
                            default -> System.out.println("Pls, choose the correct number");
                        }

                    } else if (inc >= 1000) {
                        System.out.println("Witch type of a rest do you like more? - 1)Active rest, 2)Calm friends meetings," +
                                " 3)Listening to a live music ");
                        int rest = scan.nextInt();
                        switch (rest) {
                            case 1 -> System.out.println("Your best choice is 'Nebar'!");
                            case 2 -> System.out.println("Your best choice is 'Тсуру'!");
                            case 3 -> System.out.println("'Улитка' should be your favourite place, then!");
                            default -> System.out.println("Pls, choose the correct number");
                        }
                    } else if (inc < 500 && inc >= 200) {
                        System.out.println("The only option in this case are some sushi-delivery shops, such as 'Суши Wok'");
                    } else {
                        System.out.println("Sorry, but there are no any places for such prices");
                    }
                }
            }
        }
        else if (ans.equals(no)) {
            System.out.println("Well, then thank you for your attention! And sorry for disturbing. ");
        }
        else {
            System.out.println("Choose the correct variant, pls");
        }
    }
}

