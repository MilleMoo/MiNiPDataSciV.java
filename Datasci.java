import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you use iPad or Tablet\n"+
                           "1.) iPad\n"+
                           "2.) Tablet\n"+
                           "3.) Not Have");
        System.out.print("Please input number: ");
        int userInput1 = scanner.nextInt();

        if (userInput1 == 1) {
            System.out.println("\nDo you change phone often\n"+
                               "1.) often\n"+
                               "2.) not");
            System.out.print("Please input number: ");
            userInput1 = scanner.nextInt();

            if (userInput1 == 2) {
                System.out.println("\nDo you prefer installments or paying cash\n"+
                                   "1.) pay off\n"+
                                   "2.) cash");
                System.out.print("Please input number: ");
                userInput1 = scanner.nextInt();

                if (userInput1 == 1) {
                    System.out.println("\nDo you like zoom camera\n"+
                                       "1.) like\n"+
                                       "2.) not");
                    System.out.print("Please input number: ");
                    userInput1 = scanner.nextInt();

                    if (userInput1 == 1) {
                        System.out.println("\nYou use Android");
                    } else if (userInput1 == 2) {
                        System.out.println("\nDo you like to use brandname or not\n"+
                                       "1.) like\n"+
                                       "2.) not");
                        System.out.print("Please input number: ");
                        userInput1 = scanner.nextInt();

                        if (userInput1 == 2) {
                            System.out.println("\nYou use Android");
                        } else if (userInput1 == 1) {
                            System.out.println("\nYou use IOS");
                        } else {
                            System.out.println("error");
                        }
                    }
                } else if (userInput1 == 2) {
                    System.out.println("\nYou use IOS");
                }
            } else if (userInput1 == 1) {
                System.out.println("\nDo you like zoom camera\n"+
                                       "1.) like\n"+
                                       "2.) not");
                System.out.print("Please input number: ");
                userInput1 = scanner.nextInt();

                if (userInput1 == 1) {
                    System.out.println("\nYou use IOS");
                } else if (userInput1 == 2) {
                    System.out.println("\nYou use Android");
                } else {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }
        } else if (userInput1 == 2) {
            System.out.println("\nYou use Android");
        } else if (userInput1 == 3) {
            System.out.println("\nDo you change phone often\n"+
                                       "1.) often\n"+
                                       "2.) not");
            System.out.print("Please input number: ");
            userInput1 = scanner.nextInt();

            if (userInput1 == 2) {
                System.out.println("\nYou use Android");
            } else if (userInput1 == 1) {
                System.out.println("\nYou use IOS");
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
