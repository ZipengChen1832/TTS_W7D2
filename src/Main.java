import java.util.*;

public class Main {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Do you wish to continue with the interactive portion? \"yes\" or \"y\" to continue");
        String play = scanner.next();

        if(!play.equals("yes")&&!play.equals("y")){
            System.out.println("Thank you for your response. Please come back to complete the survey!");
        } else {
            String playAgain = "y";
            while(playAgain.equals("y")) {

                //Get user's response
                System.out.println("What's the name of your favorite pet?");
                String petName = scanner.next();
                System.out.println("What's the age of your favorite pet?");
                int petAge = scanner.nextInt();
                System.out.println("What's your lucky number?");
                int luckyNum = scanner.nextInt();
                System.out.println("Do you have a favorite quarterback? If so, what's their jersey number?");
                int jerseyNum = scanner.nextInt();
                System.out.println("What's the two-digit model of your car?");
                int carModel = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What's the first name of your favorite actor or actress?");
                String actorName = scanner.nextLine();
                System.out.println("Enter a random number between 1 and 50:");
                int randNum = scanner.nextInt();

                //Generate random numbers
                int num1 = petName.charAt(2);
                while (num1 > 65) num1 -= 65;
                int num2 = carModel + luckyNum;
                while (num2 > 65) num2 -= 65;
                int num3 = randNum - num1;
                while (num3 < 1) num3 += 65;
                int num4 = actorName.charAt(0);
                while (num4 > 65) num4 -= 65;
                int num5 = petAge + carModel;
                while (num5 > 65) num5 -= 65;
                int magic = luckyNum * num4;
                while (magic > 65) magic -= 65;

                System.out.println("Lottery numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " +
                        "Magic ball: " + magic);

                System.out.println("Do you want to play again? y for \"yes\"");
                playAgain = scanner.next();
            }
        }
        System.out.println("Thanks for playing!");


    }
}
