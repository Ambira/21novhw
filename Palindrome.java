import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while (true) {  // used for taking the program in an infinite loop not really required
            System.out.print("Enter a String: ");
            String input = sc.next();
            int x = input.length();
            String reverse = "";


            for (int i = x - 1; i >= 0; i--) {
                char rev = input.charAt(i);
                reverse += rev;
            }

            if (reverse.equals(input)) {
                System.out.println("It's a Palindrome");
            } else {
                System.out.println("It's not a Palindrome");
            }


        }
    }
