import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userResponce;

        do {
            System.out.print("Talk to Bob: ");
            userResponce = scanner.nextLine();

            if (userResponce.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (userResponce.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                continue;
            } else if (userResponce.endsWith("?")) {
                System.out.println("Sure.");
            } else {
                System.out.println("Whatever.");
            }

        } while (!userResponce.equals(""));
    }
}
